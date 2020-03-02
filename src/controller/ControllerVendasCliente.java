/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOVendasClientes;
import java.util.ArrayList;
import model.ModelVendasClientes;

/**
 *
 * @author geiba
 */
public class ControllerVendasCliente {

    private DAOVendasClientes daoVendasCliente = new DAOVendasClientes();

    public ArrayList<ModelVendasClientes> getListaVendasClienteController() {
        return this.daoVendasCliente.getListaVendasClientesDAO();
    }

}
