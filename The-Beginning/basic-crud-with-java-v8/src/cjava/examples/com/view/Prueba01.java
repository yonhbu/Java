package cjava.examples.com.view;

import cjava.examples.com.beans.Persona;
import cjava.examples.com.util.Genero;

public class Prueba01 {

    public static void main(String[] args) {

        Persona obj = new Persona();
        obj.setCedula("10204512");
        obj.setNombre("Juan Montoya");
        obj.setSueldo(20000);
        obj.setGenero(Genero.MASCULINO);
        obj.imprimir();


    }
}
