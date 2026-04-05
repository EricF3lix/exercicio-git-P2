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

    }

    public void gerarRecibo(){

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
