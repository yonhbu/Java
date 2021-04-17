package com.co.poo.basic.lambdas;

public class PersonaSuerte implements  ICalculadoraFortuna {


    @Override
    public int calcularSuerte(String nombre) {
        int fortuna = nombre.length();
        return fortuna;
    }
}
