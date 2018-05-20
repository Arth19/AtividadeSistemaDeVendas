package Controller;

import Model.Cliente;

import java.util.Collection;

public class ClienteController {
    private static Collection<Cliente> clientes;

    public boolean cadastrarCliente(Cliente cliente){
        if(cliente == null || clientes.equals(cliente)|| clientes.contains(cliente)){
            return false;
        }else{
            clientes.add(cliente);
            return false;
        }
    }
    public Collection<Cliente> listaCliente(){

        if(clientes.isEmpty()== true){
            return null;
        }else{
            return clientes;
        }
    }
}
