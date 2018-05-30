package Model;

import java.util.Date;
import java.util.Objects;

public class Vendedor extends Pessoa {
    private int matricula = hashCode();
    private Date dataContratacao;

    public Vendedor(String nome, String email, String senha, Date dataNasc, Date dataContratacao) {

        super(nome, email, senha, dataNasc);
        this.dataContratacao = dataContratacao;
    }

    public int getMatricula(){ return matricula; }

    public Date getDataContratacao(){ return dataContratacao; }

    public void setDataContratacao(Date dataContratacao){ this.dataContratacao = dataContratacao; }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Vendedor)){
            return false;
        }
        Vendedor vendedor = (Vendedor) o;
        return super.equals(vendedor) && (vendedor.getMatricula() == this.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDataContratacao()) * 11 * super.hashCode();
    }

    @Override
    public String toString() {
        return  super.toString() + " \n" + "Vendedor: " +
                matricula + "\n" +
                "Início de contrato em: " + dataContratacao;
    }
}
