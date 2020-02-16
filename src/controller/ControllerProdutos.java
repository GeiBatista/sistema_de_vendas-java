/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DaoProdutos;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 *
 * @author geiba
 */
public class ControllerProdutos {
    
    private  DaoProdutos daoProdutos = new DaoProdutos();
    
    /**
     * Salvar produtos controller
     * @param pModelProdutos
     * @return int
     */
    public int salvrProdutosController(ModelProdutos pModelProdutos){
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);        
    }
    
    /**
     * Excluir prudutos pelo código
     * @param pCodigo
     * @return boolean
     */
    public boolean excluirProdutoController(int pCodigo){
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }
    
    /**
     * Alterar um  produto 
     * @param pModelProdutos
     * @return boolean
     */
    public boolean alterarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }
    
    /**
     * retornar produto pelo codigo
     * @param pCodigo
     * @return model produto
     */
    public ModelProdutos retonarProdutoController(int pCodigo){
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }
    
    /**
     * retornar uma lista de produtos
     * @return 
     */
    public ArrayList<ModelProdutos> retornarListaProdutoController(){
        return this.daoProdutos.retornaListaProdutosDAO();
    }
}
