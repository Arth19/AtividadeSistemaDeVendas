package Controller;

import Model.Cliente;

import java.util.Set;

public class ClienteController {
    private static Set<Cliente> clientes;


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
    public static Set<Cliente> listaCliente(){

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
