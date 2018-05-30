package Controller;

import Model.Produto;

import java.util.Set;

public class ProdutoController {
    private static Set<Produto> produtos;

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
    public static Set<Produto> listarProdutos(){
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
