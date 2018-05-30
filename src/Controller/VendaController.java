package Controller;

import Model.Venda;

import java.util.Set;

public class VendaController {
    private static Set<Venda> vendas;

    public boolean registrarVenda(Venda v){
        if (v==null || vendas.contains(v) || vendas.equals(v)){
            return false;
        }else{
            vendas.add(v);
            return true;
        }
    }

    public Set<Venda> relatorioVendas(){
        if(vendas.isEmpty()==true){
            vendas = null;
            return vendas;
        }else {
            return vendas;
        }
    }
}
