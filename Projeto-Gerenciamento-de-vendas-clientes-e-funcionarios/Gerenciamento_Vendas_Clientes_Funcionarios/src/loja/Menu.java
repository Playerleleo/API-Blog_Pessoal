package loja;

import util.Cores;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int opcao;
        String ver;
        String finalizar = null;

        ListaClientes listaClientes = new ListaClientes();
        Estoque estoque = new Estoque();
        ListaFuncionarios listaFuncionarios = new ListaFuncionarios();

        System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_BLUE_BACKGROUND +
                """
                *****************************************************
                                       MENU                         \s
                *****************************************************
                                                                    \s
                               1 - Cadastro de Cliente              \s
                               2 - Cadastro de Produtos             \s
                               3 - Cadastro de Funcionários         \s
                               4 - Controle de Vendas               \s
                               5 - Sair                             \s
                *****************************************************
                """);

        opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                do {
                    System.out.println("Cadastrar Cliente\n");

                    //String nome, String cpf, String telefone, String endereco, String email
                    System.out.println("Nome: ");
                    String nome = ler.next();
                    System.out.println("CPF: ");
                    String cpf = ler.next();
                    System.out.println("Email: ");
                    String email = ler.next();
                    System.out.println("Telefone: ");
                    String telefone = ler.next();
                    System.out.println("Endereço: ");
                    String endereco = ler.next();

                    Cliente cliente = new Cliente(nome, cpf, telefone, endereco, email);
                    listaClientes.adicionar(cliente);
                    System.out.println("Deseja cadastrar outro cliente? S/N");
                    finalizar = ler.next().toUpperCase();
                } while (finalizar.equals("S"));
                System.out.println("Deseja ver o Cadastro dos Clientes? S/N ");
                ver = ler.next().toUpperCase();
                if (ver.equals("S")) {

                    System.out.println("LISTA DE CLIENTES:");
                    listaClientes.listar();
                }

                break;
            case 2:

                System.out.println("Cadastrar Produto\n");

                do {
                    //String cod, String nome, String preco, String quantidade
                    System.out.println("Código: ");
                    String codigo = ler.next();
                    System.out.println("Nome: ");
                    String nome = ler.next();
                    System.out.println("Preço: ");
                    String preco = ler.next();
                    System.out.println("Quantidade: ");
                    String quantidade = ler.next();

                    Produto produto = new Produto(codigo, nome, preco, quantidade);
                    estoque.adicionar(produto);
                    System.out.println("Deseja cadastrar outro produto? S/N");
                    finalizar = ler.next().toUpperCase();
                } while (finalizar.equals("S"));
                System.out.println("Deseja ver o Cadastro dos Produtos? S/N ");
                ver = ler.next().toUpperCase();
                if (ver.equals("S")) {

                    System.out.println("ESTOQUE:");
                    estoque.listar();
                }

                break;
            case 3:
                System.out.println("Cadastrar Funcionário\n");

                do {
                    //String nome, String cpf, String cargo, String dataAdimissao, String saida, String salario
                    System.out.println("Nome: ");
                    String nome = ler.next();
                    System.out.println("CPF: ");
                    String cpf = ler.next();
                    System.out.println("Cargo: ");
                    String cargo = ler.next();
                    System.out.println("Data de Admissao: ");
                    String dataAdmissao = ler.next();
                    System.out.println("Data de Saída: ");
                    String dataSaida = ler.next();
                    System.out.println("Salário: R$ ");
                    String salario = ler.next();

                    Funcionario funcionario = new Funcionario(nome, cpf, cargo, dataAdmissao, dataSaida, salario);
                    listaFuncionarios.adicionar(funcionario);
                    System.out.println("Deseja cadastrar outro funcionário? S/N");
                    finalizar = ler.next().toUpperCase();
                } while (finalizar.equals("S"));
                System.out.println("Deseja ver o Cadastro dos Funcionários? S/N ");
                ver = ler.next().toUpperCase();
                if (ver.equals("S")) {

                    System.out.println("LISTA DE FUNCIONÁRIOS:");
                    listaFuncionarios.listar();
                }


                break;
            case 4:
                System.out.println("Caixa:\n");

                estoque.listar();

                System.out.println("Digite o código do produto: ");
                String codP = ler.next();
                System.out.println("Digite o nome do produto: ");
                String nomeP = ler.next();
                System.out.println("Digite o preço do produto: ");
                double precoP = ler.nextDouble();
                System.out.println("Digite a quantidade de produtos: ");
                int quantidadeP = ler.nextInt();
                double total = precoP * quantidadeP;
                System.out.println("\nO total a pagar é de: " + "R$ " + total);

                break;

            case 5:
                System.out.println("\nEncerrando...");
                ler.close();
                System.exit(0);
            default:
                System.out.println("\nOpção Inválida!\n");
                break;
        }

    }


}
