package com.dio.java.petshop;

import java.util.Scanner;

public class ControleClassePetshop {
    
    ControlePetshop controle = new ControlePetshop();
    public void main(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("| Menu |");
        System.out.println("| 1- Dar banho no pet |");
        System.out.println("| 2 - Abastecer com água |");
        System.out.println("| 3 - Abastecer com shampoo |");
        System.out.println("| 4 - Verificar nivel de água |");
        System.out.println("| 5 - Verificar nivel de shampoo |");
        System.out.println("| 6 - Verificar se tem pet no banho |");
        System.out.println("| 7 - Colocar pet na maquina |");
        System.out.println("| 8 - Retirar pet da máquina |");
        System.out.println("| 9 - Limpar maquina |");
        System.out.println("| 10 - Sair |");
        
        int escolha = entrada.nextInt();

        do {
            switch (escolha){
                case 1: 
                    controle.darBanho();
                break;

                case 2:
                    controle.abastecerAgua();
                break; 

                case 3: 
                    controle.abastecerShampoo();
                break;

                case 4:
                    controle.nivelAgua();
                break;

                case 5:
                    controle.nivelShampoo();
                break;

                case 6:
                   controle.petBanhando();
                break;

                case 7:
                   
                break;
                case 8:
                   
                break;

                case 9:
                   
                break;

                case 10:
                    System.out.println("Saindo do sistema");
                break;

                default:
                 System.out.println("Opção inválda! ");

            }
        } while (escolha != 10);
        entrada.close();
    }
}
