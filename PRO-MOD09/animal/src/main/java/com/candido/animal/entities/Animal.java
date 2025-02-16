package com.candido.animal.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;


/**
 * @author Douglas Candido
 * classe que representa entidade dos animais do abrigo (agora é possível adicionar outros animais além de gatos)
 */

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_animal")
    private Long id;

    @Column(nullable = false)
    private String nomeProvisorio;

    @Column(nullable = false)
    private String especie; //agora podemos adicionar gatos também

    @Column(nullable = false)
    private String raca;

    @Column(nullable = false)
    private String condicoesChegada;

    @Column(nullable = false)
    private String porte;

    @Column(nullable = false)
    private LocalDate dataEntrada;

    private LocalDate dataAdocao;

    private LocalDate dataObito;

    @Column(nullable = false)
    private String nomeRecebedor;

    public Long getId() {
        return id;
    }

    public String getNomeProvisorio() {
        return nomeProvisorio;
    }

    public void setNomeProvisorio(String nomeProvisorio) {
        this.nomeProvisorio = nomeProvisorio;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCondicoesChegada() {
        return condicoesChegada;
    }

    public void setCondicoesChegada(String condicoesChegada) {
        this.condicoesChegada = condicoesChegada;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(LocalDate dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public LocalDate getDataObito() {
        return dataObito;
    }

    public void setDataObito(LocalDate dataObito) {
        this.dataObito = dataObito;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }
}
