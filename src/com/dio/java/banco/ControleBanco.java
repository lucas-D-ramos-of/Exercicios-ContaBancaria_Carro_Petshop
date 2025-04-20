package com.dio.java.banco;

import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.ChronoField;

public class ControleBanco {

    private ContaBanco conta;

    public ContaBanco getConta(){ return this.conta; }
    public void setConta(ContaBanco conta){ this.conta = conta; } 

    public ControleBanco(ContaBanco conta){
        this.conta = conta;
    }

    public float ConsultarSaldo(){ return conta.getSaldo(); }
    public float ConsultarChequeEspecial( ) { return conta.getChequeEspecial(); }

    public void SacarSaldo(float saque) throws IOException{

        if (saque > conta.getSaldo()){
            throw new IOException("O valor a ser sacado não pode ser maior que o saldo da conta.");
        } else {
            System.out.println("Valor sacado da conta!");
            conta.setSaldo(conta.getSaldo()-saque);
        }

    }

    public void PagarBoleto(String data, float boleto) throws IOException{

        if (boleto > conta.getSaldo()){
            throw new IOException("Valor a ser pago é maior que o valor na conta.");

        } else if (CalculaDiferencaDatas(data) < 0){

            throw new IOException("");
        }

    }

    private float CalculaDiferencaDatas(String data){
        String[] d = data.split("/");


        LocalDate dataInicio = LocalDate.of(Integer.parseInt(d[2]), Integer.parseInt(d[1]), Integer.parseInt(d[0]));
        //LocalDate dataFim = LocalDate.of(conta.getData().get(ChronoField.YEAR), conta.getData().format("MMMM"), conta.getData().format("dd"));

        //long diasEntre = ChronoUnit.DAYS.between(dataInicio, dataFim);
        return 0;
    }

}
