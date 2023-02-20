package loja;

public class Funcionario extends Pessoa{

    public String cargo;
    public String dataAdmissao;
    public String saida;
    public String salario = "1200";

    public Funcionario(String nome, String cpf, String cargo, String dataAdmissao, String saida, String salario) {
        super(nome, cpf);
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.saida = saida;
        this.salario = salario;
    }



    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    public void visualizar(){

        System.out.println("************************ FUNCIONÁRIO CADASTRADO ************************ ");
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Data de admissão: " + getDataAdmissao());
        System.out.println("Salário: " + getSalario());
        System.out.println("************************************************************************* ");
        System.out.println("\n");
    }
}
