package Controller;

import Model.Cliente;

import java.util.List;
import java.util.ArrayList;

public class ClienteController {

    private static List<Cliente> clientes = new ArrayList<>();


    public static boolean cadastrarCliente(Cliente cliente){
        if(cliente == null || clientes.equals(cliente)|| clientes.contains(cliente)){
            return false;
        }else{
            clientes.add(cliente);
            return true;
        }
    }
    public static boolean removeCliente(Cliente cliente){
        if(clientes.contains(cliente) || clientes.equals(cliente)){
            clientes.remove(cliente);
            return true;
        } else {
            return false;
        }
    }
    public static List<Cliente> listaCliente(){

        if(clientes.isEmpty()== true){
            clientes = null;
            return clientes;
        }else{
            return clientes;
        }
    }
    public static Cliente buscaCliente(String email){
        Cliente d = null;
        for(Cliente c: clientes){
            if (c.getEmail().equalsIgnoreCase(email)){
                 d = c;
            } else{
                 d = null;
            }
        }
        return d;
    }
}
