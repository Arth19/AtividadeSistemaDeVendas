package Model;

import java.util.Objects;

public class Produto {
    private String nome;
    private String tipo;
    private String marca;
    private double preco;

    public Produto() {
    }
    public Produto(String nome, String tipo, String marca, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Produto)) {
            return false;
        }

        Produto produto = (Produto) o;

        return Double.compare(produto.getPreco(), getPreco()) == 0 &&
                Objects.equals(getNome(), produto.getNome()) &&
                Objects.equals(getTipo(), produto.getTipo()) &&
                Objects.equals(getMarca(), produto.getMarca());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNome(), getTipo(), getMarca(), getPreco());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", preco=" + preco +
                '}';
    }
}
