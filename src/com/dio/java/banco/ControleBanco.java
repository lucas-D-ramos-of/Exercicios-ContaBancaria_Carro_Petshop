package com.dio.java.banco;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.LocalDate;
import java.time.Period;

public class ControleBanco {

    private ContaBanco conta = new ContaBanco(null, 0);

    public ContaBanco getConta(){ return this.conta; }
    public void setConta(ContaBanco conta){ this.conta = conta; } 

    public ControleBanco(ContaBanco conta){
        this.conta = conta;
    }

    public float ConsultarSaldo(){ return conta.getSaldo(); }
    public float ConsultarChequeEspecial( ) { return conta.getChequeEspecial(); }

    public void SacarSaldo(float saque) throws IOException{

        if (saque > conta.getSaldo()){
            if (saque > conta.getChequeEspecial()+conta.getSaldo()) {
                throw new IOException("O valor a ser sacado não pode ser maior que o cheque especial.");
            } else {
                if (conta.getSaldo() > 0){
                    saque -= conta.getSaldo();
                    conta.setSaldo(0);
                }
                System.out.println("Valor sacado do cheque especial");
                conta.setChequeEspecial(conta.getChequeEspecial()-saque);
            }
            
        } else {
            System.out.println("Valor sacado da conta!");
            conta.setSaldo(conta.getSaldo()-saque);
        }

    }

    public void PagarBoleto(String data, float boleto) throws IOException{

        if (boleto > conta.getSaldo()+conta.getChequeEspecial()){
            throw new IOException("Valor a ser pago é maior que o valor na conta.");

        } else if (CalculaDiferencaDatas(data) < 0){

            throw new IOException("Boleto já está vencido.");

        } else {
            SacarSaldo(boleto);
        }

    }

    private float CalculaDiferencaDatas(String data){
        String[] d = data.split("/");

        LocalDate dataAtual = LocalDate.now();

        int dia = dataAtual.getDayOfMonth();
        int mes = dataAtual.getMonthValue();
        int ano = dataAtual.getYear();

        LocalDate data1 = LocalDate.of(ano, mes, dia);
        LocalDate data2 = LocalDate.of(Integer.parseInt(d[2]), Integer.parseInt(d[1]), Integer.parseInt(d[0]));
        

        Period periodo = Period.between(data1, data2);

        if (periodo.getDays() > 0) {
            return 0;
        } else {
            return -1;
        }

    }


    public String contaUsandoChequeEspecial(){
        if (conta.getLIMITE_CHEQUE_ESPECIAL() != conta.getChequeEspecial()){
            return "A conta está usando o cheque especial.";
        } else {
            return "A conta não está usando o cheque especial.";
        }
    }

    public void adicionarSaldo(float adicionar){
        float usado = conta.getLIMITE_CHEQUE_ESPECIAL() - conta.getChequeEspecial();
        if (usado != 0){

                usado = usado * 1.2f;
                if (usado < conta.getSaldo()){
                    conta.setSaldo(conta.getSaldo()-usado);
                }

        } else {
            conta.setSaldo(conta.getSaldo()+adicionar);
        }
    }
}
