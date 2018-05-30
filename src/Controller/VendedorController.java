package Controller;

import Model.Vendedor;
import java.util.Set;


public class VendedorController {
    private static Set<Vendedor> vendedores;

    public boolean cadastraVendedor(Vendedor v){
        if(v == null ||  vendedores.contains(v)){
            return false;
        }else{
            vendedores.add(v);
            return true;
        }
    }
    public boolean removerVendedor(Vendedor v){
        if(vendedores.contains(v)){
            vendedores.remove(v);
            return true;
        }else {
            return false;
        }
    }

    public Set<Vendedor> listaVendedores(){
        if(vendedores.isEmpty()==true){
            vendedores = null;
            return vendedores;
        } else{
            return vendedores;
        }
    }
}
