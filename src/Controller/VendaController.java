package Controller;

import Model.Venda;

import java.util.List;
import java.util.ArrayList;

public class VendaController {
    private static List<Venda> vendas;

    public static boolean registrarVenda(Venda v){
        if (v==null || vendas.contains(v) || vendas.equals(v)){
            return false;
        }else{
            vendas.add(v);
            return true;
        }
    }

    public static List<Venda> relatorioVendas(){
        if(vendas.isEmpty()==true){
            vendas = null;
            return vendas;
        }else {
            return vendas;
        }
    }
}
