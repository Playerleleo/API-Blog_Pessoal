package loja;


public class Produto {
    public String cod;
    public String nome;
    public String preco;
    public String quantidade;

    public Produto(String cod, String nome, String preco, String quantidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }


    /*
    public double valorEstoque() {
        return preco * quantidade;
    }
    public void adcProduto(int quantidade) {
        this.quantidade += quantidade;
    }
    public void removeProduto(int quantidade) {
        this.quantidade -= quantidade;
    }
    public String toString() {
        return cod +  ", " +nome
                    + ", R$ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, Total: R$ "
                + String.format("%.2f", valorEstoque());
    }
*/

}
