/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medicalpharm.model;

import java.util.Date;

/**
 *
 * @author ALENCAR
 */
public class SaidaArmazemModel {

    private Integer idArmazem;
    private Date dataMovimento;
    private String motivo;
    private ArmazemModel destino;

    /**
     * @return the idArmazem
     */
    public Integer getIdArmazem() {
        return idArmazem;
    }

    /**
     * @param idArmazem the idArmazem to set
     */
    public void setIdArmazem(Integer idArmazem) {
        this.idArmazem = idArmazem;
    }

    /**
     * @return the dataMovimento
     */
    public Date getDataMovimento() {
        return dataMovimento;
    }

    /**
     * @param dataMovimento the dataMovimento to set
     */
    public void setDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * @return the destino
     */
    public ArmazemModel getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(ArmazemModel destino) {
        this.destino = destino;
    }
}
