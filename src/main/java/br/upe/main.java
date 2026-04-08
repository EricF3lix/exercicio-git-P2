package br.upe;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        ArrayList<ItemPedido> itens = new ArrayList<ItemPedido>();

        Endereco endereco = new Endereco ("Rua Vicente de Lá", "201", "12563-587");
        Cliente cliente = new Cliente("Fulano de tal", "fulaninho01@gmail.com", endereco);

        Categoria categoria = new Categoria("Eletrônicos", "Celulares");
        Produto produto = new Produto("Smartphone", 1000, categoria );

        ItemPedido itemPedido = new ItemPedido(produto, 2);


        Pedido pedido = new Pedido(1, cliente, itens);

        pedido.adicionarItem(itemPedido);
        
        pedido.gerarRecibo();

       
    }
}
