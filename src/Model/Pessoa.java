package Model;


import java.util.Date;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String senha;
    private Date dataNasc;

    public Pessoa(String nome, String cpf, String senha, Date dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
}
