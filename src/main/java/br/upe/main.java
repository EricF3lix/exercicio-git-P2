package br.upe;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        
        Endereco endereco = new Endereco ("Rua Vicente de Lá", "201", "12563-587");
        Cliente cliente = new Cliente("Fulano de tal", "fulaninho01@gmail.com", endereco);
        
        System.out.println(cliente.exibirResumo());
    }
}
