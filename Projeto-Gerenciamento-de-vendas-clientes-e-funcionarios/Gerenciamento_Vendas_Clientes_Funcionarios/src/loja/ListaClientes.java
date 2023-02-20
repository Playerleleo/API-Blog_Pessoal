package loja;

import java.util.ArrayList;
import java.util.List;

public class ListaClientes {
    private List<Cliente> clientes;

    public ListaClientes() {
        this.clientes = new ArrayList<>();
    }


    public void adicionar(Cliente cliente) {
        clientes.add(cliente);
    }

    public void listar() {
        for (Cliente cliente : clientes) {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println(
                            "Nome: " + cliente.getNome() + "\n" +
                            "CPF: " + cliente.getCpf() + "\n" +
                            "Email: " + cliente.getEmail() + "\n" +
                            "Telefone: " + cliente.getTelefone() + "\n" +
                            "Endereco: " + cliente.getEndereco() + "\n"
            );
            System.out.println("-----------------------------------------------------------------------------");
        }

    }
}
