package Model;

import java.util.Objects;

public class Produto {
    private String nome;
    private double preco;
    private double peso;
    private int estoque;

    public Produto(String nome, double preco, double peso) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return Double.compare(produto.getPreco(), getPreco()) == 0 &&
                Double.compare(produto.getPeso(), getPeso()) == 0 &&
                getEstoque() == produto.getEstoque() &&
                Objects.equals(getNome(), produto.getNome());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNome(), getPreco(), getPeso(), getEstoque());
    }

    @Override
    public String toString() {
        return "Produto: " + nome + "\n" +
                "Preço: R$" + preco +
                "Peso(kg): " + peso +
                "Quantidade em estoque: " + estoque;
    }
}
