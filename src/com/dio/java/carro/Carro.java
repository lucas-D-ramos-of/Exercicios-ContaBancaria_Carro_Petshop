package com.dio.java.carro;

import java.io.IOException;

public class Carro {
    private boolean ligado;
    private int velocidade;
    private byte marcha;

    public Carro(){

        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;

    }

    public boolean getLigado(){ return this.ligado; }
    public int getVelocidade(){ return this.velocidade; }
    public byte getMarcha() {return this.marcha; }


    public void setLigado(boolean ligado) throws IOException{ 

        if (!ligado){
            if (this.velocidade != 0){
                throw new IOException("A velocidade precisa ser 0 Km para desligar o carro.");

            } else if (this.marcha != 0){
                 throw new IOException("O carro precisa estar no ponto morto.");

            }
        } else {
            this.ligado = ligado;
        }
    
    }
    public void setVelocidade(int velocidade) throws IOException{ 

        if (velocidade < 0){
            if (getVelocidade() == 0){
                throw new IOException("A velocidade não pode estar abaixo de 0.");

            } else {

                this.velocidade--;
                setMarcha(this.velocidade);
            }
        } else {
            if (getVelocidade() > 120){
                throw new IOException("A velocidade não pode estar acima de 120 Km.");
            } else {

                this.velocidade++;
                setMarcha(this.velocidade);
            }
        }

    }
    public void setMarcha(int velocidade){ 

        if (velocidade == 0){
            this.marcha = 0;

        } else if (velocidade < 21){
            this.marcha = 1;

        } else if (velocidade < 41){
            this.marcha = 2;

        } else if (velocidade < 61){
            this.marcha = 3;

        } else if (velocidade < 81){
            this.marcha = 4;

        } else if (velocidade < 101){
            this.marcha = 5;

        } else if (velocidade < 121){
            this.marcha = 6;
        }
    
    }

}
