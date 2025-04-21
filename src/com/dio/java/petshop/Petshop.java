package com.dio.java.petshop;

public class Petshop {
    private int agua;
    private int shampoo;
    private boolean petBanhando;
    private boolean maquinaLimpa;

    public Petshop(){
        this.agua = 30;
        this.shampoo = 10;
        this.petBanhando = false;
        this.maquinaLimpa = true;
    }

    public int getAgua() { return this.agua; }
    public int getShampoo() {return this.shampoo; }
    public boolean getPetBanhando() { return this.petBanhando; }
    public boolean getMaquinaLimpa() { return this.maquinaLimpa; }

    public void setAgua(int agua) { 
        if (agua > 1 ){
            if (this.agua == 30){
                System.out.println("O volume de água está no máximo!");
            } 
            
            if (this.agua+agua > 30){
                this.agua = 30;

            } else {

                this.agua += agua;
            }
        } else {

            if (this.agua-agua < 0){

                this.agua = 0;
            } else {

                this.agua -= agua;
            }
        }
    }

    public void setShampoo(int shampoo){
        if (shampoo > 1 ){
            if (this.shampoo == 10){
                System.out.println("O volume de shampoo está no máximo!");
            } 
            
            if (this.shampoo+shampoo > 10){
                this.shampoo = 10;

            } else {

                this.shampoo += shampoo;
            }
        } else {

            if (this.shampoo-shampoo < 0){

                this.shampoo = 0;
            } else {

                this.shampoo -= shampoo;
            }
        }
    }

    public void setPetBanhando(){
        this.petBanhando = !this.petBanhando;
    }

    public void setMaquinaLimpa(){
        this.maquinaLimpa = !this.maquinaLimpa;
    }
}
