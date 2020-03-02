package model;
/**
*
* @author Gei Batista
*/
public class ModelProduto {

    private int idProduto;
    private String proNome;
    private double proValor;
    private int proEstoque;

    /**
    * Construtor
    */
    public ModelProduto(){}

    /**
    * seta o valor de idProduto
    * @param pIdProduto
    */
    public void setIdProduto(int pIdProduto){
        this.idProduto = pIdProduto;
    }
    /**
    * @return pk_idProduto
    */
    public int getIdProduto(){
        return this.idProduto;
    }

    /**
    * seta o valor de proNome
    * @param pProNome
    */
    public void setProNome(String pProNome){
        this.proNome = pProNome;
    }
    /**
    * @return proNome
    */
    public String getProNome(){
        return this.proNome;
    }

    /**
    * seta o valor de proValor
    * @param pProValor
    */
    public void setProValor(double pProValor){
        this.proValor = pProValor;
    }
    /**
    * @return proValor
    */
    public double getProValor(){
        return this.proValor;
    }

    /**
    * seta o valor de proEstoque
    * @param pProEstoque
    */
    public void setProEstoque(int pProEstoque){
        this.proEstoque = pProEstoque;
    }
    /**
    * @return proEstoque
    */
    public int getProEstoque(){
        return this.proEstoque;
    }

    @Override
    public String toString(){
        return "ModelProduto {" + "::idProduto = " + this.idProduto + "::proNome = " + this.proNome + "::proValor = " + this.proValor + "::proEstoque = " + this.proEstoque +  "}";
    }
}