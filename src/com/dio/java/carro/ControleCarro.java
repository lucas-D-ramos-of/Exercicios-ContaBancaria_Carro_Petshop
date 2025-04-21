package com.dio.java.carro;

import java.io.IOException;

public class ControleCarro {
    Carro carro = new Carro();

    public void ligarCarro(){
        if (carro.getLigado()){
            System.out.println("O carro está ligado");
        } else {
            try {
                carro.setLigado(true);
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
            
            System.out.println("Carro ligado");
        }
    }

    public void desligarCarro(){
        if (carro.getLigado()){
            System.out.println("O carro está desligado");
        } else {
            try {
                carro.setLigado(false);
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
            
            System.out.println("Carro desligado");
        }
    }
    
    public void acelerar(){
        try{
            carro.setVelocidade(1);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        
    }

    public void desacelerar(){
        try{
            carro.setVelocidade(-1);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void virarCarro(){
        if (carro.getVelocidade() > 1 && carro.getVelocidade() < 41){
            System.out.println("Virando o carro...");
        } else {
            System.out.println("O carro não está na velocidade habilitada para virar!");
        }
    }

    public void velocidade(){
        System.out.println("A velocidade do caro é de: "+ carro.getVelocidade() + " Km/h");
    }
}
