package cjava.examples.com.view;

import cjava.examples.com.beans.Articulo;
import cjava.examples.com.factory.DaoFactory;
import cjava.examples.com.interfaces.ArticuloInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Prueba07_Lambdas2 {

    public static void main(String[] args) {

        ArticuloInterface dao =  DaoFactory.construirInstanciaArticulo();
        List<Articulo> lista = dao.listar();

        System.out.println("*******SIN FUNCIONES**************");
        for (Articulo a: lista){
            if (a.getPrecio() > 5000000) {
               a.imprimir();
            }
        }

        System.out.println("********CON FUNCIONES*************");

        for (Articulo a: lista){
            if (isPrecio(a)) {
                a.imprimir();
            }
        }



        System.out.println("*********PREDICADO************");

        Predicate<Articulo> predicado = a -> a.getPrecio() > 5000000 ;
        for (Articulo ar: lista) {
            if (predicado.test(ar))
                ar.imprimir();
        }


        System.out.println("*********PREDICADO CON FILTRO************");

        lista.stream().filter(predicado).forEach(f -> f.imprimir());

    }

    public static boolean isPrecio (Articulo a ) {
       return a.getPrecio() > 5000000;
    }

}