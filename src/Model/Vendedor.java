package Model;

import java.util.Date;
import java.util.Objects;

public class Vendedor extends Pessoa {
    private String matricula;
    private Date dataContratacao;

    public Vendedor(String nome, String cpf, String senha, Date dataNasc, String matricula, Date dataContratacao) {

        super(nome, cpf, senha, dataNasc);
        this.matricula = matricula;
        this.dataContratacao = dataContratacao;
    }

    public String getMatricula(){ return matricula; }

    public void setMatricula(String matricula){ this.matricula = matricula; }

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
        return super.equals(vendedor) && vendedor.getMatricula().equalsIgnoreCase(getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail(), getDataNasc()) * 11 * super.hashCode();
    }

    @Override
    public String toString() {
        return  super.toString() + " \n" + "Vendedor: " +
                matricula + "\n" +
                "Início de contrato em: " + dataContratacao;
    }
}
