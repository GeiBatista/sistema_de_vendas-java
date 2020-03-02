/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelProduto;
import model.ModelProdutosVendasProdutos;
import model.ModelVendasProdutos;

/**
 *
 * @author geiba
 */
public class DAOProdutosVendasProdutos extends ConexaoMySql {

    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosDAO(int pCodigoVenda) {
        ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutoses = new ArrayList<>();
        ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
        ModelProduto modelProdutos = new ModelProduto();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(" SELECT tbl_produto.pk_id_produto, "
                    + " tbl_produto.pro_nome, "
                    + " tbl_produto.pro_valor, "
                    + " tbl_produto.pro_estoque, "
                    + " tbl_vendas_produtos.pk_id_venda_produto, "
                    + " tbl_vendas_produtos.fk_produto, "
                    + " tbl_vendas_produtos.fk_vendas, "
                    + " tbl_vendas_produtos.ven_pro_valor, "
                    + " tbl_vendas_produtos.ven_pro_quantidade "
                    + " FROM tbl_vendas_produtos "
                    + " INNER JOIN tbl_produto ON tbl_produto.pk_id_produto =  tbl_vendas_produtos.fk_produto "
                    + " WHERE tbl_vendas_produtos.fk_vendas  = ' " + pCodigoVenda + " ' ; ");

            while (this.getResultSet().next()) {
                modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
                modelProdutos = new ModelProduto();
                modelVendasProdutos = new ModelVendasProdutos();

                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProNome(this.getResultSet().getString(2));
                modelProdutos.setProValor(this.getResultSet().getDouble(3));
                modelProdutos.setProEstoque(this.getResultSet().getInt(4));

                modelVendasProdutos.setIdVendaProduto(this.getResultSet().getInt(5));
                modelVendasProdutos.setProduto(this.getResultSet().getInt(6));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(7));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(8));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(9));

                modelProdutosVendasProdutos.setModelProdutos(modelProdutos);
                modelProdutosVendasProdutos.setModelVendasProdutos(modelVendasProdutos);

                listaModelProdutosVendasProdutoses.add(modelProdutosVendasProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelProdutosVendasProdutoses;
    }
}
