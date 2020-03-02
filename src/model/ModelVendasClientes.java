/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author geiba
 */
public class ModelVendasClientes {
    
    private ModelVendas modelVendas;
    private ModelCliente modelClientes;
    private ArrayList<ModelVendasClientes> listaModelVendasClientes;

    /**
     * @return the modelVendas
     */
    public ModelVendas getModelVendas() {
        return modelVendas;
    }

    /**
     * @param modelVendas the modelVendas to set
     */
    public void setModelVendas(ModelVendas modelVendas) {
        this.modelVendas = modelVendas;
    }

    /**
     * @return the modelClientes
     */
    public ModelCliente getModelClientes() {
        return modelClientes;
    }

    /**
     * @param modelClientes the modelClientes to set
     */
    public void setModelClientes(ModelCliente modelClientes) {
        this.modelClientes = modelClientes;
    }

    /**
     * @return the listaModelVendasClientes
     */
    public ArrayList<ModelVendasClientes> getListaModelVendasClientes() {
        return listaModelVendasClientes;
    }

    /**
     * @param listaModelVendasClientes the listaModelVendasClientes to set
     */
    public void setListaModelVendasClientes(ArrayList<ModelVendasClientes> listaModelVendasClientes) {
        this.listaModelVendasClientes = listaModelVendasClientes;
    }
    
    
    
}
