package cjava.examples.com.view;

import cjava.examples.com.beans.Persona;
import cjava.examples.com.factory.DaoFactory;
import cjava.examples.com.interfaces.PersonaInterface;
import cjava.examples.com.util.Genero;

import java.util.ArrayList;
import java.util.List;

public class Prueba03_EjemploDao {

    public static void main(String[] args) {

        PersonaInterface crearInstancia = DaoFactory.construirInstanciaPersona();

        Persona obj = new Persona();
        obj.setCedula("10204512");
        obj.setNombre("Juan Montoya");
        obj.setSueldo(20000);
        obj.setGenero(Genero.MASCULINO);
        String msg = crearInstancia.grabar(obj);
        System.out.println(msg);

        obj = new Persona();
        obj.setCedula("10206398");
        obj.setNombre("Ledy Alzate");
        obj.setSueldo(50000);
        obj.setGenero(Genero.FEMENINO);
        msg = crearInstancia.grabar(obj);
        System.out.println(msg);

        List<Persona> lista = crearInstancia.listar();

        for (Persona p: lista) p.imprimir();

    }
}
