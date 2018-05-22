package Controller;

import Model.Produto;

import java.util.Set;

public class ProdutoController {
    private static Set<Produto> produtos;

    public boolean cadastrarProduto(Produto p){
        if(p==null || produtos.contains(p) || produtos.equals(p)){
            return false;
        }else{
            produtos.add(p);
            return true;
        }
    }
    public Set<Produto> listarProdutos(){
        if(produtos.isEmpty() == true){
            return null;
        }else{
            return produtos;
        }
    }


}
