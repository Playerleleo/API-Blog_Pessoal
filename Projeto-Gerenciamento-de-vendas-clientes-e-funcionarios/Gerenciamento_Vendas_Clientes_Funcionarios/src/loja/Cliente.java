package loja;

import java.util.Scanner;

public class Cliente extends Pessoa{
    private String telefone;
    private String endereco;
    private String email;

    Scanner ler = new Scanner(System.in);

    public Cliente( String nome, String cpf, String telefone, String endereco, String email) {
        super(nome, cpf);
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /*
    public void visualizar(){


        System.out.println("************************ CLIENTE CADASTRADO ************************ ");
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("telefone: " + getTelefone());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Email: " + getEmail());
        System.out.println("******************************************************************** ");
        System.out.println("\n");
    }
     */

}
