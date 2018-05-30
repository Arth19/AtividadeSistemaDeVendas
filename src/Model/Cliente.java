package Model;

import java.util.Date;
import java.util.Objects;

public class Cliente extends Pessoa {
    private double saldo = 0.0;

    public Cliente(String nome, String email, String senha, Date dataNasc) {
        super(nome, email, senha, dataNasc);
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

        return cliente.getEmail().equalsIgnoreCase(getEmail());
    }

    @Override
    public int hashCode() {
        return super.hashCode() *  7;
    }

    @Override
    public String toString() {
        return "Cliente: " + "/n" +
                super.toString();
    }
}
