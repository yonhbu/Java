package cjava.practica1.calificada.com.pruebas;


import cjava.practica1.calificada.com.entidades.Asistentes;
import cjava.practica1.calificada.com.factory.DaoFactory;
import cjava.practica1.calificada.com.interfaces.Asistente_Interface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Prueba04 {

    public static void main(String[] args) {

        // Muestre la lista asistentes que hayan pagado en Platinum, Gold y VIP.


        Asistente_Interface asistente_interface = DaoFactory.construirInstanciaAsistente();
        List<Asistentes> listaAsistente = asistente_interface.listar();

        Map<String, List<Asistentes>> map = new HashMap<>();

        Predicate<Asistentes> predicate = asistentes -> asistentes.getPalco().equalsIgnoreCase("PLATINUM");

        map =  listaAsistente.stream().filter(predicate).collect(Collectors.groupingBy(Asistentes::getPalco));

        map.forEach((entrada, listaActualPL) -> {
            System.out.println(entrada);
            listaActualPL.forEach(asistentes -> asistentes.imprimir());
        });

        Predicate<Asistentes> predicate2 = asistentes -> asistentes.getPalco().equalsIgnoreCase("VIP");

        map =  listaAsistente.stream().filter(predicate2).collect(Collectors.groupingBy(Asistentes::getPalco));

        map.forEach((entrada, listaActualVI) -> {
            System.out.println(entrada);
            listaActualVI.forEach(asistentes -> asistentes.imprimir());
        });


        Predicate<Asistentes> predicate3 = asistentes -> asistentes.getPalco().equalsIgnoreCase("GOLD");

        map =  listaAsistente.stream().filter(predicate3).collect(Collectors.groupingBy(Asistentes::getPalco));

        map.forEach((entrada, listaActualGOLD) -> {
            System.out.println(entrada);
            listaActualGOLD.forEach(asistentes -> asistentes.imprimir());
        });








    }
}
