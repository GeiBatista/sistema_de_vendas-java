package controller;

import model.ModelProduto;
import DAO.DAOProduto;
import java.util.ArrayList;

/**
*
* @author Gei Batista
*/
public class ControllerProduto {

    private DAOProduto daoProduto = new DAOProduto();

    /**
    * grava Produto
    * @param pModelProduto
    * @return int
    */
    public int salvarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.salvarProdutoDAO(pModelProduto);
    }

    /**
    * recupera Produto
    * @param pIdProduto
    * @return ModelProduto
    */
    public ModelProduto getProdutoController(int pIdProduto){
        return this.daoProduto.getProdutoDAO(pIdProduto);
    }

    /**
    * recupera Produto pelo nome
    * @param pIdProduto
    * @return ModelProduto
    */
    public ModelProduto getProdutoController(String pNomeProduto){
        return this.daoProduto.getProdutoDAO(pNomeProduto);
    }
    /**
    * recupera uma lista deProduto
    * @param pIdProduto
    * @return ArrayList
    */
    public ArrayList<ModelProduto> getListaProdutoController(){
        return this.daoProduto.getListaProdutoDAO();
    }

    /**
    * atualiza Produto
    * @param pModelProduto
    * @return boolean
    */
    public boolean atualizarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.atualizarProdutoDAO(pModelProduto);
    }

    /**
    * exclui Produto
    * @param pIdProduto
    * @return boolean
    */
    public boolean excluirProdutoController(int pIdProduto){
        return this.daoProduto.excluirProdutoDAO(pIdProduto);
    }

    /**
     * Alterar lista de produtos no banco
     * @param pListaModelProdutos
     * @return  boolean
     */
    public boolean atualizarEstoqueProdutoController(ArrayList<ModelProduto> pListaModelProdutos) {
      return this.daoProduto.atualizarEstoqueProdutoDAO(pListaModelProdutos);
    }
}