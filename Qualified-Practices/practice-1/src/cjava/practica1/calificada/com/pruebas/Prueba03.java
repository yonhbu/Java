package cjava.practica1.calificada.com.pruebas;

import cjava.practica1.calificada.com.entidades.Evento;
import cjava.practica1.calificada.com.factory.DaoFactory;
import cjava.practica1.calificada.com.interfaces.Evento_Interface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Prueba03 {

    public static void main(String[] args) {

        Evento_Interface eventos = DaoFactory.construirInstanciaEvento();
        List<Evento> lista = eventos.listar();

        //Imprimimos la Lista de eventos y el total recaudado por cada evento..


        Map<Integer, List<Evento>> mapa = new HashMap<>();
        mapa = lista.stream()
                .collect(Collectors.groupingBy(Evento::getIdEvento));


        mapa.forEach((evento, listaAgrupada) -> {
            System.out.println("Evento " + evento);
            listaAgrupada.forEach(Evento::totalRecaudadoEvento1);
            listaAgrupada.forEach(Evento::totalRecaudadoEvento2);
            listaAgrupada.forEach(Evento::totalRecaudadoEvento3);
        });

    }
}