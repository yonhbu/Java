package cjava.examples.com.view;

import cjava.examples.com.beans.Articulo;

public class Prueba05_Builder {

    public static void main(String[] args) {

        Articulo art = new Articulo.Builder().setCod("A01").setDescripcion("Televisor").setOrigen("Colombia").setPrecio(1000000).build();
        art.imprimir();


    }

}