package loja;

import java.util.ArrayList;
import java.util.List;

public class ListaFuncionarios {
    private List<Funcionario> funcionarios;

    public ListaFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }


    public void adicionar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void listar() {
        //String nome, String cpf, String cargo, String dataAdmissao, String saida, String salario
        for (Funcionario funcionario : funcionarios) {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println(
                    "Nome: " + funcionario.getNome() + "\n" +
                            "CPF: " + funcionario.getCpf() + "\n" +
                            "Cargo: " + funcionario.getCargo() + "\n" +
                            "Data de Admissao: " + funcionario.getDataAdmissao() + "\n" +
                            "Data de Saída: " + funcionario.getSaida() + "\n" +
                            "Salário: R$ " + funcionario.getSalario() + "\n"
            );
            System.out.println("-----------------------------------------------------------------------------");
        }

    }
}
