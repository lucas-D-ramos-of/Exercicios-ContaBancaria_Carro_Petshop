package com.dio.java.banco;

import java.text.SimpleDateFormat;

public class ContaBanco {

    private String nome;
    private float saldo;
    private float chequeEspecial;
    private final float LIMITE_CHEQUE_ESPECIAL;

    public ContaBanco(String nome, float saldo){
        
        this.nome = nome;
        this.saldo = saldo;
        this.chequeEspecial = CalculaChequeEspecial(saldo);
        LIMITE_CHEQUE_ESPECIAL = this.chequeEspecial;
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


    public float getChequeEspecial() {return this.chequeEspecial; }

    public float getLIMITE_CHEQUE_ESPECIAL() { return this.LIMITE_CHEQUE_ESPECIAL; }

    
    // Setters da Classe

    public void setNome(String nome) { this.nome = nome; }

    public void setSaldo(float saldo) { this.saldo = saldo; }

    public void setChequeEspecial(float chequeEspecial) { this.chequeEspecial = chequeEspecial; }


}
