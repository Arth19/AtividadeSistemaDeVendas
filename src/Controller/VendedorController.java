package Controller;

import Model.Vendedor;
import java.util.Set;


public class VendedorController {
    private static Set<Vendedor> vendedores;

    public static boolean cadastraVendedor(Vendedor v){
        if(v == null ||  vendedores.contains(v)){
            return false;
        }else{
            vendedores.add(v);
            return true;
        }
    }
    public static boolean removerVendedor(Vendedor v){
        if(vendedores.contains(v)){
            vendedores.remove(v);
            return true;
        }else {
            return false;
        }
    }

    public static Set<Vendedor> listaVendedores(){
        if(vendedores.isEmpty()==true){
            vendedores = null;
            return vendedores;
        } else{
            return vendedores;
        }
    }

    public static Vendedor buscaVendedor(String emailVend) {
        Vendedor vendedor=null;
        for(Vendedor v: vendedores){
            if(v.getEmail().equalsIgnoreCase(emailVend)){
                vendedor=v;
            }else{
                vendedor=null;
            }
        }
        return vendedor;
    }
}
