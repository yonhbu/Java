package cjava.practica1.calificada.com.factory;

import cjava.practica1.calificada.com.dao.DaoAsistente;
import cjava.practica1.calificada.com.dao.DaoEvento;
import cjava.practica1.calificada.com.dao.DaoExpositores;
import cjava.practica1.calificada.com.interfaces.Asistente_Interface;
import cjava.practica1.calificada.com.interfaces.Evento_Interface;
import cjava.practica1.calificada.com.interfaces.Expositores_Interface;

public class DaoFactory {

    public static Evento_Interface construirInstanciaEvento () {
        return  new DaoEvento();
    }

    public static Asistente_Interface construirInstanciaAsistente () {
        return  new DaoAsistente();
    }

    public static Expositores_Interface construirInstanciaExpositor () {
        return  new DaoExpositores();
    }

}
