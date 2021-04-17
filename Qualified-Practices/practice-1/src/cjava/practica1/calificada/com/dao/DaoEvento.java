package cjava.practica1.calificada.com.dao;


import cjava.practica1.calificada.com.entidades.Evento;
import cjava.practica1.calificada.com.interfaces.Evento_Interface;
import java.util.*;


public class DaoEvento implements Evento_Interface {


    Evento evento1 = new Evento.Builder()
            .setIdEvento(1)
            .setExpositor(expositorEvento1())
            .setListarAsistentes(listaDeAsistentesXEvento1())
            .setTitulo("Catedra para Hablar en Publico")
            .setDuracion(" 1 Hora")
            .setH_ingreso("6 pm")
            .setH_salida("7 pm")
            .setTemporada("Baja")
            .setCostoEntrada(100000)
            .setUbicacion("Platinum")
            .build();


    Evento evento2 = new Evento.Builder()
            .setIdEvento(2)
            .setTitulo("Concierto por la Paz")
            .setExpositor(expositorEvento2())
            .setListarAsistentes(listaDeAsistentesXEvento2())
            .setDuracion(" 6 HoraS")
            .setH_ingreso("4 pm")
            .setH_salida("10 pm")
            .setTemporada("Alta")
            .setCostoEntrada(200000)
            .setUbicacion("Gold")
            .build();

    Evento evento3 = new Evento.Builder()
            .setIdEvento(3)
            .setTitulo("Reinado Mis Universo")
            .setExpositor(expositorEvento3())
            .setListarAsistentes(listaDeAsistentesXEvento3())
            .setDuracion("4 Hora")
            .setH_ingreso("2 pm")
            .setH_salida("6 pm")
            .setTemporada("Alta")
            .setCostoEntrada(300000)
            .setUbicacion("Vip")
            .build();

    Evento evento4 = new Evento.Builder()
            .setIdEvento(3)
            .setTitulo("Lideres del G11")
            .setExpositor(expositorEvento4())
            .setListarAsistentes(listaDeAsistentesXEvento4())
            .setDuracion("4 Hora")
            .setH_ingreso("8 Am")
            .setH_salida("12 pm")
            .setTemporada("Alta")
            .setCostoEntrada(400000)
            .setUbicacion("Vip")
            .build();

    List<Evento> lista = Arrays.asList(evento1, evento2, evento3, evento4);

    @Override
    public List<Evento> listar() {
        return lista;
    }


    public List<String> listaDeAsistentesXEvento1() {
        DaoAsistente d = new DaoAsistente();
        List<String> nombres = d.listarAsistentesxEvento1();
        return nombres;
    }

    public List<String> listaDeAsistentesXEvento2() {
        DaoAsistente d = new DaoAsistente();
        List<String> nombres = d.listarAsistentesxEvento2();
        return nombres;
    }

    public List<String> listaDeAsistentesXEvento3() {
        DaoAsistente d = new DaoAsistente();
        List<String> nombres = d.listarAsistentesxEvento3();
        return nombres;
    }

    public List<String> listaDeAsistentesXEvento4() {
        DaoAsistente d = new DaoAsistente();
        List<String> nombres = d.listarAsistentesxEvento4();
        return nombres;
    }

    public String expositorEvento1() {
        DaoExpositores d = new DaoExpositores();
        String nombre = d.nombreExpositorEvento1();
        return nombre;
    }

    public String expositorEvento2() {
        DaoExpositores d = new DaoExpositores();
        String nombre = d.nombreExpositorEvento2();
        return nombre;
    }

    public String expositorEvento3() {
        DaoExpositores d = new DaoExpositores();
        String nombre = d.nombreExpositorEvento3();
        return nombre;
    }

    public String expositorEvento4() {

        DaoExpositores d = new DaoExpositores();
        String nombre = d.nombreExpositorEvento4();
        return nombre;

    }



}







