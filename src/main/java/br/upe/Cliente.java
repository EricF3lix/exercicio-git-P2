package br.upe;

public class Cliente {
    private String nome;
    private String email;
    private Endereco endereco;

    public Cliente (String nome, String email, Endereco endereco){
        this.nome = nome;
        this.email = email;
        this.endereco  = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
    public String exibirResumo(){
        String informacoes = "Nome: " + this.nome + "Email: " + this.email + "Endereço: " + this.endereco;
        return informacoes;
    }


}
