package cjava.examples.com.view;

import cjava.examples.com.beans.Articulo;
import cjava.examples.com.factory.DaoFactory;
import cjava.examples.com.interfaces.ArticuloInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Prueba06_Lambdas {

    public static void main(String[] args) {

        ArticuloInterface dao =  DaoFactory.construirInstanciaArticulo();
        List<Articulo> lista = dao.listar();

        System.out.printf("Imprimir con for de una forma la lista.");

        for (Articulo arg: lista) {
             arg.imprimir();
        }

        System.out.println("***********Lambda*****");
      lista.forEach(a -> a.imprimir());


        System.out.println("***********FILTRO*****");

        lista.stream()
                .filter(articulo -> articulo.getOrigen().equalsIgnoreCase("Chile") && articulo.getPrecio()>= 3000000)
                .forEach(articulo -> articulo.imprimir());

        System.out.println("***********AGRUPAR CON MAP Y COLLECTION*****");

        Map<String, List<Articulo>> mapaDatos = new HashMap<>();

        //Aqui Agrupamos
        mapaDatos = lista.stream()
                .collect(Collectors.groupingBy(Articulo::getOrigen));

        mapaDatos.forEach((origen, listaActual) -> {
            System.out.println(origen);
            listaActual.forEach( articulo -> articulo.imprimir());

        });

    }

}