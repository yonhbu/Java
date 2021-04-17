package cjava.practica1.calificada.com.pruebas;


import cjava.practica1.calificada.com.entidades.Evento;
import cjava.practica1.calificada.com.factory.DaoFactory;
import cjava.practica1.calificada.com.interfaces.Evento_Interface;

import java.util.*;
import java.util.stream.Collectors;

public class Prueba01 {

    public static void main(String[] args) {

        // Crear objetos del tipo evento, agregue valores a sus atributos y muestre un listado de los eventos ordenados
        //por titulo de manera descendente, el expositor y sus asistentes.

        Evento_Interface dao =  DaoFactory.construirInstanciaEvento();
        List<Evento> listadEventos = dao.listar();

        Map<String, List<Evento>> map = new HashMap<>();

        System.out.println("****ORDENADO DESCENDIENTE POR TITULO****");
        map = listadEventos.stream().sorted(Comparator.comparing(Evento::getTitulo).reversed())
                .collect(Collectors.groupingBy(Evento::getTitulo, LinkedHashMap::new, Collectors.toList()));

        map.forEach((titulo, listaEventosFiltrada) -> {
            System.out.println(titulo);
            listaEventosFiltrada.forEach(a -> a.imprimir());
        });





    }
}
