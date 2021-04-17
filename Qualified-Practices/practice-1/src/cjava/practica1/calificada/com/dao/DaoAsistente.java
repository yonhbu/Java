package cjava.practica1.calificada.com.dao;
import cjava.practica1.calificada.com.entidades.Asistentes;
import cjava.practica1.calificada.com.interfaces.Asistente_Interface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DaoAsistente implements Asistente_Interface {

    Asistentes juan = new Asistentes.Builder()
            .setCodAsistente("Platinum-01")
            .setNombre("Juan Antonio")
            .setApellido("Vargas Bustos")
            .setCorreo("vargasju78@gmail.com")
            .setdireccion("Manzana 56 calle 2")
            .setTelefono("300231533")
            .setEventoAsistir(1)
            .setPalco("PLATINUM")
            .build();


    Asistentes enrique = new Asistentes.Builder()
            .setCodAsistente("Platinum-02")
            .setNombre("Enrique de Jesus")
            .setApellido("Tuto Uhia")
            .setCorreo("entiqueTuto@gmail.com")
            .setdireccion("Carrera 30- 56 calle 2")
            .setTelefono("31120363")
            .setEventoAsistir(1)
            .setPalco("PLATINUM")
            .build();


    Asistentes carmen = new Asistentes.Builder()
            .setCodAsistente("Vip-01")
            .setNombre("Carmen Elisa")
            .setApellido("Gutierrez Mejia")
            .setCorreo("carmen89@gmail.com")
            .setdireccion("Manzana 11 calle 28")
            .setTelefono("32165478")
            .setEventoAsistir(2)
            .setPalco("VIP")
            .build();


    Asistentes fabian = new Asistentes.Builder()
            .setCodAsistente("Gold-01")
            .setNombre("Fabian Andres")
            .setApellido("Gonzalez Mejia")
            .setCorreo("fabi77@gmail.com")
            .setdireccion("ave 11 calle 28")
            .setTelefono("32012541")
            .setEventoAsistir(3)
            .setPalco("GOLD")
            .build();

    List<Asistentes> listAsistentes = Arrays.asList(juan,enrique,carmen,fabian);


    @Override
    public List<Asistentes> listar() {
        return listAsistentes;
    }


    public List<String> listarAsistentesxEvento1 () {
        List<String> listaCompletaAsistentes = new ArrayList<>();
        Asistentes asis;

        Iterator<Asistentes> continuar = listAsistentes.iterator();
        while (continuar.hasNext()) {
            asis = continuar.next();
            if ((asis.getEventoAsistir() == 1)) {
                listaCompletaAsistentes.add(" \nNombre: " + asis.getNombre());
            }
        }
        return listaCompletaAsistentes;
    }


    public List<String> listarAsistentesxEvento2 () {
        List<String> listaCompletaAsistentes = new ArrayList<>();
        Asistentes asis;

        Iterator<Asistentes> continuar = listAsistentes.iterator();
        while (continuar.hasNext()) {
            asis = continuar.next();
            if ((asis.getEventoAsistir() == 2)) {
                listaCompletaAsistentes.add(" \nNombre: " + asis.getNombre());
            }
        }
        return listaCompletaAsistentes;
    }


    public List<String> listarAsistentesxEvento3 () {
        List<String> listaCompletaAsistentes = new ArrayList<>();
        Asistentes asis;

        Iterator<Asistentes> continuar = listAsistentes.iterator();
        while (continuar.hasNext()) {
            asis = continuar.next();
            if ((asis.getEventoAsistir() == 3)) {
                listaCompletaAsistentes.add(" \nNombre: " + asis.getNombre());
            }
        }
        return listaCompletaAsistentes;
    }


    public List<String> listarAsistentesxEvento4 () {
        List<String> listaCompletaAsistentes = new ArrayList<>();
        Asistentes asis;

        Iterator<Asistentes> continuar = listAsistentes.iterator();
        while (continuar.hasNext()) {
            asis = continuar.next();
            if ((asis.getEventoAsistir() == 4)) {
                listaCompletaAsistentes.add(" \nNombre: " + asis.getNombre());
            }
        }
        return listaCompletaAsistentes;
    }

}
