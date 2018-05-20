package Model;

import java.util.Date;
import java.util.Objects;

public class Cliente extends Pessoa {
    private double saldo = 0.0;

    public Cliente(String nome, String cpf, String senha, Date dataNasc) {
        super(nome, cpf, senha, dataNasc);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (!(o instanceof Cliente)){
            return false;
        }

        Cliente cliente = (Cliente) o;

        return cliente.getCpf().equalsIgnoreCase(getCpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf(), getDataNasc(), getNome()) *  7;
    }

}
