package cjava.practica1.calificada.com.pruebas;

import cjava.practica1.calificada.com.entidades.Evento;
import cjava.practica1.calificada.com.factory.DaoFactory;
import cjava.practica1.calificada.com.interfaces.Evento_Interface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Prueba02 {

    public static void main(String[] args) {

        //Imprimir la Lista de Eventos  y sus precios, agrupados por ubicación.

        Evento_Interface eventos = DaoFactory.construirInstanciaEvento();
        List<Evento> lista = eventos.listar();


        Map<String, List<Evento>> mapa = new HashMap<>();
        mapa = lista.stream()
                .collect(Collectors.groupingBy(Evento::getUbicacion));

        mapa.forEach((ubicacion, listaAgrupada) -> {
            System.out.println(ubicacion);
            listaAgrupada.forEach(Evento::imprimir);
        });




    }

}