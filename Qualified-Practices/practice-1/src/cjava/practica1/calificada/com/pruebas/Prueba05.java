package cjava.practica1.calificada.com.pruebas;


import cjava.practica1.calificada.com.entidades.Asistentes;
import cjava.practica1.calificada.com.entidades.Expositores;
import cjava.practica1.calificada.com.factory.DaoFactory;
import cjava.practica1.calificada.com.interfaces.Asistente_Interface;
import cjava.practica1.calificada.com.interfaces.Expositores_Interface;

import java.util.List;

public class Prueba05 {

    public static void main(String[] args) {

        // Muestre el sueldo a apagar a todos los expositores que dieron charlas en VIP.

        Expositores_Interface expositoresInterface = DaoFactory.construirInstanciaExpositor();
        List<Expositores> listaExpositores = expositoresInterface.listar();


        listaExpositores.stream().filter(a -> a.getEvento() == 3).forEach(a -> a.imprimirSueldo());




    }
}
