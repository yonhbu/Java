package cjava.examples.com.view;

import cjava.examples.com.beans.Persona;
import cjava.examples.com.util.Genero;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Prueba02_List {

    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<Persona>();
        Persona obj;
        Persona modificado;

        obj = new Persona();
        obj.setCedula("10204512");
        obj.setNombre("Juan Montoya");
        obj.setSueldo(20000);
        obj.setGenero(Genero.MASCULINO);
        lista.add(obj);


        obj = new Persona();
        obj.setCedula("10206398");
        obj.setNombre("Ledy Alzate");
        obj.setSueldo(50000);
        obj.setGenero(Genero.FEMENINO);
        lista.add(obj);

        obj = new Persona();
        obj.setCedula("10207845");
        obj.setNombre("Thaliana Mejia");
        obj.setSueldo(100000);
        obj.setGenero(Genero.FEMENINO);
        lista.add(obj);


        // Recorrer la Lista y Sacar el Sueldo Mayor Forma Imperactiva
        double sueldoMayor = 0;
        Persona sueldoPersonaMayor = null;

        for (Persona p: lista) {
           p.imprimir();
            if (p.getSueldoNeto() >= sueldoMayor) {
                sueldoMayor = p.getSueldoNeto();
                sueldoPersonaMayor = p;
            }
        }
        System.out.println("El sueldo mayor es " + sueldoMayor + " Y Pertenece a " + sueldoPersonaMayor.getNombre());


        //Modificar la Lista con un  nuevo Objeto

        modificado = new Persona();
        modificado.setCedula("500024692");
        modificado.setNombre("Armando Casas");
        modificado.setSueldo(500000);
        modificado.setGenero(Genero.MASCULINO);
        lista.set(0,modificado);

        for (Persona p: lista) p.imprimir();


        System.out.println("Modificar Sueldo a Todas las Chicas... descontarles un 30%");


        for (int i = 0; i < lista.size(); i++) {

            Persona f = lista.get(i);
            if (f.getGenero() == Genero.FEMENINO) {
                f.setSueldo(f.getSueldo() - (f.getSueldo() * 0.10));
                lista.set(i,f);
            }

        }

        for (Persona f: lista ) f.imprimir();



        System.out.println("Para Eliminar");

        lista.remove(0);
        for (Persona p: lista) p.imprimir();


        System.out.println("Para Eliminar Ingresando DNI");

        String dni = JOptionPane.showInputDialog("Ingrese DNI");

        for (int i = 0; i < lista.size(); i++) {

            Persona r = lista.get(i);
            if (r.getCedula().equalsIgnoreCase(dni)) {
                lista.remove(i);
            }

        }

        for (Persona p: lista) p.imprimir();
















    }
}
