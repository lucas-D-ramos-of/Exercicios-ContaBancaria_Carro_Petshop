package com.dio.java.petshop;

public class ControlePetshop {
    Petshop petshop = new Petshop();

    public void darBanho(){
        if (petshop.getPetBanhando()){
            System.out.println("Já existem um animal tomando banho!");
            return;
        } 

        if (petshop.getAgua() < 10){
            System.out.println("Nível da água está baixo para banho!");
            return;
        } 
        if (petshop.getShampoo() < 2){
            System.out.println("Nível de shampoo está baixo para dar banho!");
            return;
        }

        petshop.setAgua(-10);
        petshop.setShampoo(-2);
        petshop.setPetBanhando();
    }

    public void abastecerAgua(){

        petshop.setAgua(2);
    }

    public void abastecerShampoo(){

        petshop.setShampoo(2);
    }

    public void nivelAgua(){

        petshop.getAgua();
    }

    public void nivelShampoo() {

        petshop.getShampoo();
    }

    public void petBanhando(){
        if (petshop.getPetBanhando()){
            System.out.println("Um pet está tomando banho!");

        } else {

            System.out.println("Não tem pet tomando banho!");
        }
    }
}
