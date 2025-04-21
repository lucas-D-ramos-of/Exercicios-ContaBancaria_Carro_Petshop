package com.dio.java.carro;

import java.util.Scanner;



public class ControleClasseCarro {
    
    ControleCarro controle;

    public void main(){
        controle = new ControleCarro();

        Scanner entrada = new Scanner(System.in);

        

        System.out.println("| Menu |");
        System.out.println("| 1- Ligar o carro |");
        System.out.println("| 2 - Desligar o carro |");
        System.out.println("| 3 - Acelerar |");
        System.out.println("| 4 - Desacelerar |");
        System.out.println("| 5 - Virar para esquerda/direita |");
        System.out.println("| 6 - Verificar Velocidade |");
        System.out.println("| 7 - Sair |");
        
        int escolha = entrada.nextInt();

        do {
            switch (escolha){
                case 1: 
                    controle.ligarCarro();
                break;

                case 2:
                    controle.desligarCarro();
                break; 

                case 3: 
                    controle.acelerar();
                break;

                case 4:
                    controle.desacelerar();
                break;

                case 5:
                controle.virarCarro();
                break;

                case 6:
                    controle.velocidade();
                break;

                case 7:
                    System.out.println("Saindo do sistema");
                break;

                default:
                 System.out.println("Opção inválda! ");

            }
        } while (escolha != 7);
        entrada.close();
    }

}
