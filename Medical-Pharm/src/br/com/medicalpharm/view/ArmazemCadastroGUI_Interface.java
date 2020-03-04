/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medicalpharm.view;

import br.com.medicalpharm.model.ArmazemModel;
import br.com.medicalpharm.model.ProdutoModel;

/**
 *
 * @author ALENCAR
 */
public interface ArmazemCadastroGUI_Interface {
    public void carregaProduto(ProdutoModel produto);
    public void carregaDestino(ArmazemModel armazem);
    public void setStatusTela(boolean status);
    
}
