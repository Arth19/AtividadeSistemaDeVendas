package Model;


import java.util.Date;
import java.util.Objects;

public abstract class Pessoa {
    private String nome;
    private String email;
    private String senha;
    private Date dataNasc;

    public Pessoa(String nome, String email, String senha, Date dataNasc) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNasc = dataNasc;
    }

    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return  "Nome:" + nome + "\n" +
                "E-mail: " + email + "\n" +
                "Data de nascimento: " + dataNasc;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(getNome(), pessoa.getNome()) &&
                Objects.equals(getEmail(), pessoa.getEmail()) &&
                Objects.equals(getDataNasc(), pessoa.getDataNasc());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getEmail(), getDataNasc()) * 11 * 7 * 31;
    }
}
