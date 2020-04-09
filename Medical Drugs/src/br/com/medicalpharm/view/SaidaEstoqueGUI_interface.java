/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.medicalpharm.view;

import br.com.medicalpharm.model.ArmazemModel;
import br.com.medicalpharm.model.ProdutoModel;
import br.com.medicalpharm.model.UsuarioRequisitanteModel;

/**
 *
 * @author ALENCAR
 */
public interface SaidaEstoqueGUI_interface {
    public void carregaProduto(ProdutoModel produto);
    public void carregaDestino(ArmazemModel destino);
    public void carregarUsuarioRequisitante(UsuarioRequisitanteModel requisitante);
    public void statusTela(boolean status);
}
