/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medicalpharm.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ALENCAR
 */
public class SaidaModel {

    public Integer getIdsaida() {
        return idsaida;
    }

    public void setIdsaida(Integer idsaida) {
        this.idsaida = idsaida;
    }
    private Integer idsaida;
    private ArmazemModel destino;
    private Date dataSaida;
    private List<SaidaItemModel> itensSaida;
    private Integer idrequisitante;
    private String NomeRequisitante;
    private Integer codigoVeiculo;
    private String descricaoVeiculo;

    public String getDescricaoVeiculo() {
        return descricaoVeiculo;
    }

    public void setDescricaoVeiculo(String descricaoVeiculo) {
        this.descricaoVeiculo = descricaoVeiculo;
    }

    public Integer getCodigoVeiculo() {
        return codigoVeiculo;
    }

    public void setCodigoVeiculo(Integer codigoVeiculo) {
        this.codigoVeiculo = codigoVeiculo;
    }

    public String getNomeRequisitante() {
        return NomeRequisitante;
    }

    public void setNomeRequisitante(String NomeRequisitante) {
        this.NomeRequisitante = NomeRequisitante;
    }

    public Integer getIdrequisitante() {
        return idrequisitante;
    }

    public void setIdrequisitante(Integer idrequisitante) {
        this.idrequisitante = idrequisitante;
    }

    public List<SaidaItemModel> getItensSaida() {
        return itensSaida;
    }

    public void setItensSaida(List<SaidaItemModel> itensSaida) {
        this.itensSaida = itensSaida;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public ArmazemModel getDestino() {
        return destino;
    }

    public void setDestino(ArmazemModel destino) {
        this.destino = destino;
    }
}
