package com.dio.java.banco;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.temporal.ChronoField;

public class ContaBanco {

    private String nome;
    private float saldo;
    private String data;
    private float chequeEspecial;

    public ContaBanco(String nome, float saldo){
        var formataData = DataAtual().format(new Date());
        
        this.nome = nome;
        this.saldo = saldo;
        this.data = formataData.toString();
        this.chequeEspecial = CalculaChequeEspecial(saldo);
    }

    private SimpleDateFormat DataAtual(){
        var formataData = new SimpleDateFormat("dd'/'MM'/'yyyy");

        return formataData;
    }

    private float CalculaChequeEspecial(float saldo){

            if (saldo <= 500){
                return 50;
            } else {
                return saldo/2;
            }

    }
    // Getters da Classe
    public String getNome(){ return this.nome; }

    public float getSaldo(){ return this.saldo; }

    public String getData(){ return this.data; }

    public float getChequeEspecial() {return this.chequeEspecial; }

    
    // Setters da Classe

    public void setNome(String nome) { this.nome = nome; }

    public void setSaldo(float saldo) { this.saldo = saldo; }

    public void setData(String data) { this.data = data; }

    public void setChequeEspecial(float chequeEspecial) { this.chequeEspecial = chequeEspecial; }


}
