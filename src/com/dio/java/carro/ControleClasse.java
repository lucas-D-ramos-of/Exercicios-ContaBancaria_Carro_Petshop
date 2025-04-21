package com.dio.java.carro;

import java.io.IOException;
import java.util.Scanner;

import com.dio.java.banco.ControleBanco;

public class ControleClasse {
    
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
        System.out.println("| 7 - Trocar a marcha |");
        System.out.println("| 8 - Sair |");
        
        int escolha = entrada.nextInt();

        do {
            switch (escolha){
                case 1: 
                    
                break;

                case 2:
                    
                break; 

                case 3: 

                break;

                case 4:
                    
                break;

                case 5:
                break;

                case 6:

                break;

                case 7:

                break;

                case 8:
                    System.out.println("Saindo do sistema");
                break;
                default:
                 System.out.println("Opção inválda! ");

            }
        } while (escolha != 8);
        entrada.close();
    }

}
