package Controller;

import Model.Vendedor;

import java.util.Collection;

public class VendedorController {
    private static Collection<Vendedor> vendedores;

    public boolean cadastraVendedor(Vendedor v){
        if(v == null || vendedores.equals(v)  || vendedores.contains(v)){
            return false;
        }else{
            vendedores.add(v);
            return true;
        }
    }

    public Collection<Vendedor> listaVendedores(){
        if(vendedores.isEmpty()==true){
            return null;
        } else{
            return vendedores;
        }
    }
}
