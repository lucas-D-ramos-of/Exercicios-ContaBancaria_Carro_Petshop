package com.dio.java.banco;

import java.io.IOException;
import java.util.Scanner;

public class ControleClasse {

    public ControleClasse() {}
    public void main() {
        
        Scanner entrada = new Scanner(System.in);

        ControleBanco controle = new ControleBanco(Login());
        int escolha = 0;

        do {
            System.out.println("| Menu |");
            System.out.println("| 1- Consultar Saldo |");
            System.out.println("| 2 - Consultar Cheque Especial |");
            System.out.println("| 3 - Sacar Dinheiro |");
            System.out.println("| 4 - Pagar Boleto |");
            System.out.println("| 5 - Verificar se a conta está usando cheque especial |");
            System.out.println("| 6 - Adicionar Valor |");
            System.out.println("| 7 - Sair |");
            
            
            escolha = entrada.nextInt();

            switch (escolha){
                case 1: 
                    System.out.println("O saldo da conta é: "+ controle.ConsultarSaldo());
                break;

                case 2:
                    System.out.println("O valor do cheque especial é: "+controle.ConsultarChequeEspecial());
                break; 

                case 3: 
                    System.out.println("Digite o valor a ser sacado: ");
                    float saque = entrada.nextFloat();
                    try{
                        controle.SacarSaldo(saque);

                    } catch (IOException e){

                        System.out.println(e.getMessage());
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
                        System.out.println(e.getMessage());
                    }
                    
                break;

                case 5:
                    System.out.println(controle.contaUsandoChequeEspecial());
                break;

                case 6:
                    
                break;
                case 7:
                    System.out.println("Saindo da aplicação...");
                break;

                default:
                 System.out.println("Opção inválda! ");

            }
        } while (escolha != 7);
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