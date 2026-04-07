package br.upe;

import java.util.ArrayList;

public class Pedido {
    private int numero;
    private Cliente cliente;
    private ArrayList<ItemPedido> itens;

    public Pedido (int numero, Cliente cliente, ArrayList<ItemPedido> itens){
        this.numero = numero;
        this.cliente = cliente;
        this.itens = itens;
    }
    public  void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item: itens){
            total += item.calcularSubtotal();
            
        }
        return total;
        

    }

    public void gerarRecibo() {
    if (itens == null || itens.size() == 0) {
        System.out.println("Não há itens");
    } else {
        System.out.println(cliente.exibirResumo());
        
        for (ItemPedido item : itens) {
            System.out.println(
                "Item: " + item.getProduto().getNome() + " Preço total: " + item.calcularSubtotal());
        }
        
        System.out.println("Total: " + calcularTotal());
    }
}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }

    
}
