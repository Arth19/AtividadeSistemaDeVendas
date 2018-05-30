package Controller;

import Model.Cliente;

import java.util.Set;

public class ClienteController {
    private static Set<Cliente> clientes;


    public boolean cadastrarCliente(Cliente cliente){
        if(cliente == null || clientes.equals(cliente)|| clientes.contains(cliente)){
            return false;
        }else{
            clientes.add(cliente);
            return true;
        }
    }
    public boolean removeCliente(Cliente cliente){
        if(clientes.contains(cliente) || clientes.equals(cliente)){
            clientes.remove(cliente);
            return true;
        } else {
            return false;
        }
    }
    public Set<Cliente> listaCliente(){

        if(clientes.isEmpty()== true){
            clientes = null;
            return clientes;
        }else{
            return clientes;
        }
    }
}
