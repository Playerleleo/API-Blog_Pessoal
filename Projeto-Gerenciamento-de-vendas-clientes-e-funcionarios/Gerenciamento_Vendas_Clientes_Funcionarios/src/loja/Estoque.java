package loja;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> estoque;

    public Estoque() {
        this.estoque = new ArrayList<>();
    }


    public void adicionar(Produto produto) {
        estoque.add(produto);
    }

    public void listar() {
        for (Produto produto : estoque) {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println(
                    //String cod, String nome, String preco, String quantidade
                    "Código: " + produto.getCod() + "\n" +
                            "Nome: " + produto.getNome() + "\n" +
                            "Preço: " + produto.getPreco() + "\n" +
                            "Quantidade: " + produto.getQuantidade() + "\n"
            );
            System.out.println("-----------------------------------------------------------------------------");
        }

    }
}
