/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author eduardorocha
 */

public class Anuncio implements Serializable {
    private static final long serialVersionUID  = 1L;
    
    //  codAnuncio, bairro, cidade, descricao, vlrLocacao, dataIni, dataFim
    
    private Integer codAnuncio;
    private String  bairro;
    private String cidade;
    private String descricao;
    private BigDecimal vlrLocacao;
    private Date dataIni;
    private Date dataFim;
    
    public Anuncio() {
        
    }

    public Anuncio(Integer codAnuncio, String bairro, String cidade, String descricao, BigDecimal vlrLocacao, Date dataIni, Date dataFim) {
        this.codAnuncio = codAnuncio;
        this.bairro = bairro;
        this.cidade = cidade;
        this.descricao = descricao;
        this.vlrLocacao = vlrLocacao;
        this.dataIni = dataIni;
        this.dataFim = dataFim;
    }

    public Integer getCodAnuncio() {
        return codAnuncio;
    }

    public void setCodAnuncio(Integer codAnuncio) {
        this.codAnuncio = codAnuncio;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getVlrLocacao() {
        return vlrLocacao;
    }

    public void setVlrLocacao(BigDecimal vlrLocacao) {
        this.vlrLocacao = vlrLocacao;
    }

    public Date getDataIni() {
        return dataIni;
    }

    public void setDataIni(Date dataIni) {
        this.dataIni = dataIni;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "Anuncio{" + "bairro=" + bairro + ", cidade=" + cidade + ", vlrLocacao=" + vlrLocacao + ", dataIni=" + dataIni + ", dataFim=" + dataFim + '}';
    }
    
}
