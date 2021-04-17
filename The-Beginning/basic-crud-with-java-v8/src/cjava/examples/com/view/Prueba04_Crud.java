package cjava.examples.com.view;

import cjava.examples.com.beans.Persona;
import cjava.examples.com.factory.DaoFactory;
import cjava.examples.com.interfaces.PersonaInterface;
import cjava.examples.com.util.Genero;
import javax.swing.*;
import java.util.List;

public class Prueba04_Crud {

    public static PersonaInterface dao =  DaoFactory.construirInstanciaPersona();

    public static void main(String[] args) {
        int opc = 0;

        do  {
       opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Opcion : \n1. -Grabar\n2. -Modificar\n3. -Eliminar\n4. -Buscar\n5. -Listar\n0. -Salir"));

           switch (opc) {
               case 1: grabar();break;
               case 2: modificar();break;
               case 3: eliminar();break;
               case 4: buscar();break;
               case 5: listar();break;
           }

        } while (opc != 0);
    }

    public static void grabar () {

        Persona obj = new Persona();
        obj.setNombre(JOptionPane.showInputDialog("Ingrese Nombre"));
        obj.setCedula(JOptionPane.showInputDialog("Ingrese Cedula"));
        obj.setSueldo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese Sueldo")));
        String genero = (JOptionPane.showInputDialog("Ingrese Genero: F, M"));
        if (genero.equalsIgnoreCase("F"))obj.setGenero(Genero.FEMENINO);
        else obj.setGenero(Genero.MASCULINO);
        JOptionPane.showMessageDialog(null, dao.grabar(obj));




    }

    public static void modificar () {

        Persona obj = new Persona();
        obj.setCedula(JOptionPane.showInputDialog("Ingrese Cedula para Actualizar Datos"));
        obj.setNombre(JOptionPane.showInputDialog("Actualice su Nombre"));
        obj.setSueldo(Double.parseDouble(JOptionPane.showInputDialog("Actualice su Sueldo")));
        String genero = (JOptionPane.showInputDialog("Ingrese Genero: F, M"));
        if (genero.equalsIgnoreCase("F"))obj.setGenero(Genero.FEMENINO);
        else obj.setGenero(Genero.MASCULINO);
        JOptionPane.showMessageDialog(null, dao.modificar(obj));

    }

    public static void eliminar () {

        String cedula = (JOptionPane.showInputDialog("Ingrese Cedula para Eliminar Datos"));
        JOptionPane.showMessageDialog(null, dao.eliminar(cedula));

    }

    public static void buscar () {
        System.out.println("Estoy en el metodO Buscar");
        Persona p = new Persona();
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cedula a Buscar"));
        p =  dao.buscar(cedula);
        p.imprimir();


    }

    public static void listar () {
        List<Persona> lista = dao.listar();
        for (Persona p: lista) {
            p.imprimir();
        }
            {

        }


    }

}