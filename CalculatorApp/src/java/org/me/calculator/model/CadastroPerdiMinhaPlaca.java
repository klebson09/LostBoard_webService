/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.calculator.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author klebson
 */
public class CadastroPerdiMinhaPlaca implements Serializable {

    protected Integer idCadastroPerdiMinhaPlaca;
    protected String nome;
    protected String telefone;
    protected String numeroPlaca;
    protected String cidadePlaca;
    protected String dataPerdaEncontro;
    protected String localPerdaEncontro;
    protected String observacao;
    protected String statusPerdaEncontro;

    public CadastroPerdiMinhaPlaca(String nome, String telefone, String numeroPlaca, String cidadePlaca, String dataPerdaEncontro, String localPerdaEncontro, String observacao, String statusPerdaEncontro) {
        this.nome = nome;
        this.telefone = telefone;
        this.numeroPlaca = numeroPlaca;
        this.cidadePlaca = cidadePlaca;
        this.dataPerdaEncontro = dataPerdaEncontro;
        this.localPerdaEncontro = localPerdaEncontro;
        this.observacao = observacao;
        this.statusPerdaEncontro = statusPerdaEncontro;
    }

    public CadastroPerdiMinhaPlaca() {
    }



    public CadastroPerdiMinhaPlaca(Integer idCadastroPerdiMinhaPlaca) {
        this.idCadastroPerdiMinhaPlaca = idCadastroPerdiMinhaPlaca;
    }

    public Integer getIdCadastroPerdiMinhaPlaca() {
        return idCadastroPerdiMinhaPlaca;
    }

    public void setIdCadastroPerdiMinhaPlaca(Integer idCadastroPerdiMinhaPlaca) {
        this.idCadastroPerdiMinhaPlaca = idCadastroPerdiMinhaPlaca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getCidadePlaca() {
        return cidadePlaca;
    }

    public void setCidadePlaca(String cidadePlaca) {
        this.cidadePlaca = cidadePlaca;
    }

    public String getDataPerdaEncontro() {
        return dataPerdaEncontro;
    }

    public void setDataPerdaEncontro(String dataPerdaEncontro) {
        this.dataPerdaEncontro = dataPerdaEncontro;
    }

    public String getLocalPerdaEncontro() {
        return localPerdaEncontro;
    }

    public void setLocalPerdaEncontro(String localPerdaEncontro) {
        this.localPerdaEncontro = localPerdaEncontro;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getStatusPerdaEncontro() {
        return statusPerdaEncontro;
    }

    public void setStatusPerdaEncontro(String statusPerdaEncontro) {
        this.statusPerdaEncontro = statusPerdaEncontro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCadastroPerdiMinhaPlaca != null ? idCadastroPerdiMinhaPlaca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadastroPerdiMinhaPlaca)) {
            return false;
        }
        CadastroPerdiMinhaPlaca other = (CadastroPerdiMinhaPlaca) object;
        if ((this.idCadastroPerdiMinhaPlaca == null && other.idCadastroPerdiMinhaPlaca != null) || (this.idCadastroPerdiMinhaPlaca != null && !this.idCadastroPerdiMinhaPlaca.equals(other.idCadastroPerdiMinhaPlaca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.me.calculator.dao.CadastroPerdiMinhaPlaca[ idCadastroPerdiMinhaPlaca=" + idCadastroPerdiMinhaPlaca + " ]";
    }
    
}
