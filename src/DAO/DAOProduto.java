package DAO;

import model.ModelProduto;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Gei Batista
 */
public class DAOProduto extends ConexaoMySql {

    /**
     * grava Produto
     *
     * @param pModelProduto
     * @return int
     */
    public int salvarProdutoDAO(ModelProduto pModelProduto) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_produto ("
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque"
                    + ") VALUES ("
                    + "'" + pModelProduto.getProNome() + "',"
                    + "'" + pModelProduto.getProValor() + "',"
                    + "'" + pModelProduto.getProEstoque() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Produto
     *
     * @param pIdProduto
     * @return ModelProduto
     */
    public ModelProduto getProdutoDAO(int pIdProduto) {
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_produto,"
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque"
                    + " FROM"
                    + " tbl_produto"
                    + " WHERE"
                    + " pk_id_produto = '" + pIdProduto + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProNome(this.getResultSet().getString(2));
                modelProduto.setProValor(this.getResultSet().getDouble(3));
                modelProduto.setProEstoque(this.getResultSet().getInt(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProduto;
    }

    /**
     * recupera Produto pelo Nome
     *
     * @param pNomeProduto
     * @return ModelProduto
     */
    public ModelProduto getProdutoDAO(String pNomeProduto) {
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_produto,"
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque"
                    + " FROM"
                    + " tbl_produto"
                    + " WHERE"
                    + " pro_nome = '" + pNomeProduto + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProNome(this.getResultSet().getString(2));
                modelProduto.setProValor(this.getResultSet().getDouble(3));
                modelProduto.setProEstoque(this.getResultSet().getInt(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProduto;
    }

    /**
     * recupera uma lista de Produto
     *
     * @return ArrayList
     */
    public ArrayList<ModelProduto> getListaProdutoDAO() {
        ArrayList<ModelProduto> listamodelProduto = new ArrayList();
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_produto,"
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque"
                    + " FROM"
                    + " tbl_produto"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProduto = new ModelProduto();
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProNome(this.getResultSet().getString(2));
                modelProduto.setProValor(this.getResultSet().getDouble(3));
                modelProduto.setProEstoque(this.getResultSet().getInt(4));
                listamodelProduto.add(modelProduto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelProduto;
    }

    /**
     * atualiza Produto
     *
     * @param pModelProduto
     * @return boolean
     */
    public boolean atualizarProdutoDAO(ModelProduto pModelProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET "
                    + "pk_id_produto = '" + pModelProduto.getIdProduto() + "',"
                    + "pro_nome = '" + pModelProduto.getProNome() + "',"
                    + "pro_valor = '" + pModelProduto.getProValor() + "',"
                    + "pro_estoque = '" + pModelProduto.getProEstoque() + "'"
                    + " WHERE "
                    + "pk_id_produto = '" + pModelProduto.getIdProduto() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Produto
     *
     * @param pIdProduto
     * @return boolean
     */
    public boolean excluirProdutoDAO(int pIdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_produto "
                    + " WHERE "
                    + "pk_id_produto = '" + pIdProduto + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Alterar estoque de produtos no banco
     * @param pListaModelProdutos
     * @return 
     */
    public boolean atualizarEstoqueProdutoDAO(ArrayList<ModelProduto> pListaModelProdutos) {
        try {
            this.conectar();
            for (int i = 0; i < pListaModelProdutos.size(); i++) {
                this.executarUpdateDeleteSQL(
                        "UPDATE tbl_produto SET "
                                + "pk_id_produto = '" + pListaModelProdutos.get(i).getIdProduto() + "',"
                        + "pro_estoque = '" + pListaModelProdutos.get(i).getProEstoque() + "'"
                        + " WHERE "
                        + "pk_id_produto = '" + pListaModelProdutos.get(i).getIdProduto() + "'"
                        + ";"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
