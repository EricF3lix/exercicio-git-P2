package br.upe;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ItemPedido> itens = new ArrayList<>();

        Endereco endereco = new Endereco ("Rua Vicente de Lá", "201", "12563-587");
        Cliente cliente = new Cliente("Fulano de tal", "fulaninho01@gmail.com", endereco);

        Categoria categoria = new Categoria("Eletrônicos", "Celulares");
        
        Produto produto = new Produto("Smartphone", 1000, categoria );
        Produto produto2 = new Produto ("Notebook", 3000, categoria);
        
        ItemPedido itemPedido = new ItemPedido(produto, 2);
        ItemPedido itemPedido2 = new ItemPedido(produto2, 3);

        Pedido pedido = new Pedido(1, cliente, itens);
        
        pedido.adicionarItem(itemPedido);
        pedido.adicionarItem(itemPedido2);
        

        pedido.gerarRecibo();

       
    }
}
