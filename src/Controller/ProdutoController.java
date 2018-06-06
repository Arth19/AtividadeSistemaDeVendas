package Controller;

import Model.Produto;

import java.util.List;
import java.util.ArrayList;

public class ProdutoController {
    private static List<Produto> produtos = new ArrayList<>();

    public static boolean cadastrarProduto(Produto p){
        if(p==null || produtos.contains(p) || produtos.equals(p)){
            produtos.add(p);
            return false;
        }else{
            int novo = p.getEstoque();
            novo++;
            p.setEstoque(novo);
            return true;
        }
    }
    public static boolean removerProduto(Produto p){

        if(produtos.contains(p)){
            int novo = p.getEstoque();
            novo--;
            p.setEstoque(novo);
            return true;
        }else{
            return false;
        }

    }
    public static List<Produto> listarProdutos(){
        if(produtos.isEmpty() == true){
            produtos = null;
            return produtos;
        }else{
            return produtos;
        }
    }


    public static Produto buscaProduto(String nomeProd) {
        Produto prod = null;
        for (Produto p: produtos){
            if(p.getNome().equalsIgnoreCase(nomeProd)){
                prod = p;
            }else{
                prod = null;
            }
        }
        return prod;
    }
}
