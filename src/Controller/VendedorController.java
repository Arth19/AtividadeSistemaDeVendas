package Controller;

import Model.Vendedor;
import java.util.List;
import java.util.ArrayList;


public class VendedorController {
    private static List<Vendedor> vendedores = new ArrayList<>();

    public static boolean cadastraVendedor(Vendedor v){
        if(vendedores.contains(v)){

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

    public static List<Vendedor> listaVendedores(){
//        if(vendedores.isEmpty()==true){
            vendedores = null;
  //          return vendedores;
    //    } else{
            return vendedores;
      //  }
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
