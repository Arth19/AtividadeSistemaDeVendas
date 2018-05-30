package Model;

import java.util.Date;
import java.util.Objects;

public class Venda {
    private Date dataDaVenda;
    private Produto produto;
    private int qtd;
    private Cliente cliente;
    private Vendedor vendedor;

    public Venda(Date dataDaVenda, Produto produto, int qtd, Cliente cliente, Vendedor vendedor) {
        this.dataDaVenda = dataDaVenda;
        this.produto = produto;
        this.qtd = qtd;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public Date getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(Date dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Venda)) return false;
        Venda venda = (Venda) o;
        return getQtd() == venda.getQtd() &&
                Objects.equals(getDataDaVenda(), venda.getDataDaVenda()) &&
                Objects.equals(getProduto(), venda.getProduto()) &&
                Objects.equals(getCliente(), venda.getCliente()) &&
                Objects.equals(getVendedor(), venda.getVendedor());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDataDaVenda(), getProduto(), getQtd(), getCliente(), getVendedor()) * 11 * 7 * 31;
    }

    @Override
    public String toString() {
        return "######Venda######" +
                "#Data:" + dataDaVenda +" \n" +
                "#Item: " + produto +" \n" +
                "#Quantidade: " + qtd +" \n" +
                "#Cliente: " + cliente +" \n" +
                "#Vendedor: " + vendedor;
    }
}
