package com.dio.java.banco;

import java.io.IOException;
import java.util.Scanner;

public class ControleClasse {

    public ControleClasse() {}
    public void main() {
        
        Scanner entrada = new Scanner(System.in);

        ControleBanco controle = new ControleBanco(Login());
        

        System.out.println("| Menu |");
        System.out.println("| 1- Consultar Saldo |");
        System.out.println("| 2 - Consultar Cheque Especial |");
        System.out.println("| 3 - Sacar Dinheiro |");
        System.out.println("| 4 - Pagar Boleto |");
        System.out.println("| 5 - Verificar se a conta está usando cheque especial |");
        System.out.println("| 6 - Sair |");
        
        int escolha = entrada.nextInt();

        do {
            switch (escolha){
                case 1: 
                    controle.ConsultarSaldo();
                break;

                case 2:
                    controle.ConsultarChequeEspecial();
                break; 

                case 3: 
                    System.out.println("Digite o valor a ser sacado: ");
                    float saque = entrada.nextFloat();
                    try{
                        controle.SacarSaldo(saque);
                    } catch (IOException e){
                        e.getMessage();
                    }
                    
                break;

                case 4:

                    System.out.println("Digite a data de vencimento do boleto (dd/MM/yyyy): ");
                    String data = entrada.next();

                    System.out.println("Digite o valor do boleto: ");
                    float boleto = entrada.nextFloat();

                    try {
                        controle.PagarBoleto(data, boleto);
                    } catch (IOException e){
                        e.getMessage();
                    }
                    

                break;

                case 5:
                break;

                case 6:
                    System.out.println("Saindo da aplicação...");
                break;

                default:
                 System.out.println("Opção inválda! ");

            }
        } while (escolha != 6);
        entrada.close();

    }

    private ContaBanco Login(){
        ContaBanco c;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite seu saldo: ");
        float saldo = entrada.nextFloat();

        c = new ContaBanco(nome, saldo);

        return c;
    }
}