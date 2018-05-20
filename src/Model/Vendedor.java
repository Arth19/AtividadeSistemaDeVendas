package Model;

import java.util.Date;
import java.util.Objects;

public class Vendedor extends Pessoa {
    private double saldoVenda = 0.0;

    public Vendedor(String nome, String cpf, String senha, Date dataNasc) {
        super(nome, cpf, senha, dataNasc);
    }

    public double getSaldoVenda() {
        return saldoVenda;
    }

    public void setSaldoVenda(double saldoVenda) {
        this.saldoVenda = saldoVenda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Vendedor)){
            return false;
        }
        Vendedor vendedor = (Vendedor) o;
        return vendedor.getCpf().equalsIgnoreCase(getCpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf(), getDataNasc(), getNome()) * 11;
    }
}
