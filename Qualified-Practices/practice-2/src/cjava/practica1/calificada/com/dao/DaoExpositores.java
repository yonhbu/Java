package cjava.practica1.calificada.com.dao;


import cjava.practica1.calificada.com.entidades.Expositores;
import cjava.practica1.calificada.com.interfaces.Expositores_Interface;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class DaoExpositores implements Expositores_Interface {

    Expositores expositor1 = new Expositores.Builder()
            .setIdExpositores("Platinum-Exp-01")
            .setNombre("Barack")
            .setApellido("Obama")
            .setCorreo("bobama@gmail.com")
            .setSueldo(5000000) // 5 Millones de pesos colombianos
            .setEventoExponer(1)
            .build();


    Expositores expositor2 = new Expositores.Builder()
            .setIdExpositores("Gold-Exp-01")
            .setNombre("Daddy")
            .setApellido("Yankee")
            .setCorreo("dyankee@gmail.com")
            .setSueldo(2500000) // 2.5 Millones de pesos colombianos
            .setEventoExponer(2)
            .build();

    Expositores expositor3 = new Expositores.Builder()
            .setIdExpositores("Vip-Exp-01")
            .setNombre("Steve")
            .setApellido("Harvey")
            .setCorreo("sarvey@gmail.com")
            .setSueldo(1500000) // 1.5 Millones de pesos colombianos
            .setEventoExponer(3)
            .build();

    Expositores expositor4 = new Expositores.Builder()
            .setIdExpositores("Vip-Exp-02")
            .setNombre("Bladimir")
            .setApellido("Puttin")
            .setCorreo("bputtin@gmail.com")
            .setSueldo(8500000) // 8.5 Millones de pesos colombianos
            .setEventoExponer(3)
            .build();


    List<Expositores> listaExpositor = Arrays.asList(expositor1, expositor2, expositor3,expositor4);


    @Override
    public List<Expositores> listar() {
        return listaExpositor;
    }


    public String nombreExpositorEvento1 () {
        String nombreExpositor = "";
        Expositores exp;

        Iterator<Expositores> continuar = listaExpositor.iterator();
        while (continuar.hasNext()) {
            exp = continuar.next();
            if ((exp.getEvento() == 1)) {
                nombreExpositor = (" \nNombre: " + exp.getNombre() + " " +  exp.getApellidos());
            }
        }
        return nombreExpositor;
    }

    public String nombreExpositorEvento2 () {
        String nombreExpositor = "";
        Expositores exp;

        Iterator<Expositores> continuar = listaExpositor.iterator();
        while (continuar.hasNext()) {
            exp = continuar.next();
            if ((exp.getEvento() == 2)) {
                nombreExpositor = (" \nNombre: " + exp.getNombre() + " " +  exp.getApellidos());
            }
        }
        return nombreExpositor;
    }

    public String nombreExpositorEvento3 () {
        String nombreExpositor = "";
        Expositores exp;

        Iterator<Expositores> continuar = listaExpositor.iterator();
        while (continuar.hasNext()) {
            exp = continuar.next();
            if ((exp.getEvento() == 3)) {
                nombreExpositor = (" \nNombre: " + exp.getNombre() + " " +  exp.getApellidos());
            }
        }
        return nombreExpositor;
    }

    public String nombreExpositorEvento4 () {
        String nombreExpositor = "";
        Expositores exp;

        Iterator<Expositores> continuar = listaExpositor.iterator();
        while (continuar.hasNext()) {
            exp = continuar.next();
            if ((exp.getEvento() == 2)) {
                nombreExpositor = (" \nNombre: " + exp.getNombre() + " " +  exp.getApellidos());
            }
        }
        return nombreExpositor;
    }

}