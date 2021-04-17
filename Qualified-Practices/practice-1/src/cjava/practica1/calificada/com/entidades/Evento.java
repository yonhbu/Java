package cjava.practica1.calificada.com.entidades;


import cjava.practica1.calificada.com.util.MisConstantes;

import java.util.List;

public class Evento {

    private int idEvento;
    private String titulo;
    private String duracion;
    private List<String> listarAsistentes;
    private String expositor;
    private String h_ingreso;
    private String h_salida;
    private String temporada;
    private double costoEntrada;
    private String ubicacion;




    //Clase Builder
    public static class Builder {


        private int idEvento;
        private String titulo;
        private String duracion;
        private List<String> listarAsistentes;
        private String expositor;
        private String h_ingreso;
        private String h_salida;
        private String temporada;
        private double costoEntrada;
        private String ubicacion;



        public Evento.Builder setIdEvento(int idEvento) {
            this.idEvento = idEvento;
            return this;
        }

        public Evento.Builder setTitulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Evento.Builder setDuracion(String duracion) {
            this.duracion = duracion;
            return this;
        }

        public Evento.Builder setListarAsistentes (List<String> listarAsistentes) {
            this.listarAsistentes = listarAsistentes;
            return this;
        }

        public Evento.Builder setExpositor (String expositor) {
            this.expositor = expositor;
            return this;
        }


        public Evento.Builder setH_ingreso(String h_ingreso) {
            this.h_ingreso = h_ingreso;

            return this;
        }

        public Evento.Builder setH_salida(String h_salida) {
            this.h_salida = h_salida;

            return this;
        }

        public Evento.Builder setTemporada(String temporada) {
            this.temporada = temporada;

            return this;
        }

        public Evento.Builder setCostoEntrada(double costoEntrada) {
            this.costoEntrada = costoEntrada;
            return this;
        }

        public Evento.Builder setUbicacion(String ubicacion) {
            this.ubicacion = ubicacion;
            return this;
        }

        public Evento build () {
            return new Evento(this);
        }
    }


    //Instancia patron builder
    public Evento (Evento.Builder builder) {

        this.idEvento = builder.idEvento;
        this.titulo = builder.titulo;
        this.duracion = builder.duracion;
        this.listarAsistentes = builder.listarAsistentes;
        this.expositor = builder.expositor;
        this.h_ingreso = builder.h_ingreso;
        this.h_salida = builder.h_salida;
        this.temporada = builder.temporada;
        this.costoEntrada = builder.costoEntrada;
        this.ubicacion = builder.ubicacion;


    }

    public void imprimir () {

        System.out.println(" IdEvento: " + this.getIdEvento() + "\n");
        System.out.println(" Titulo: " + this.getTitulo() + "\n");
        System.out.println(" Nombre Expositor: " + this.getExpositor() + "\n");
        System.out.println(" Lista de Asistentes: " + this.getListar() + "\n");
        System.out.println(" Duracion: " + this.getDuracion() + "\n" );
        System.out.println(" Hora de Ingreso: " + this.getH_ingreso() + "\n" );
        System.out.println(" Hora de Salida: " + this.getH_salida() + "\n" );
        System.out.println(" Temporada: " + this.getTemporada() + "\n");
        System.out.println(" Costo Entrada " + this.getCostoEntrada() + "\n");
        System.out.println (" Ubicacion " + this.getUbicacion());
        System.out.println("*************************************");
        System.out.println("*************************************");

    }

    //Total Recaudado
    public void totalRecaudadoEvento1 () {
        List<String> asistentes = listarAsistentes;
        int cantidad = asistentes.size();
        double totalRecaudado = 0;
        for (int i = 1; i <= cantidad; i++) {
            if (getIdEvento() == 1) {
                totalRecaudado = totalRecaudado + this.getCostoEntrada();

            }
        }
        System.out.println("El total recaudado $" + totalRecaudado);

    }

    public void totalRecaudadoEvento2 () {
        List<String> asistentes = listarAsistentes;
        int cantidad = asistentes.size();
        double totalRecaudado = 0;
        for (int i = 1; i <= cantidad; i++) {
            if (getIdEvento() == 2) {
                totalRecaudado = totalRecaudado + this.getCostoEntrada();

            }
        }

        System.out.println("El total recaudado $" + totalRecaudado);
    }

    public void totalRecaudadoEvento3 () {
        List<String> asistentes = listarAsistentes;
        int cantidad = asistentes.size();
        double totalRecaudado = 0;
        for (int i = 1; i <= cantidad; i++) {
            if (getIdEvento() == 3) {
                totalRecaudado = totalRecaudado + this.getCostoEntrada();

            }
        }

        System.out.println("El total recaudado $" + totalRecaudado);
    }



    // Establecemos el valor a pagar al evento dependiendo del codigo del Asistente P,V,G

    public double costoIngreso () {
        Asistentes asistentes = new Asistentes();
        double result = 0;
        switch (asistentes.getPalco()) {
            case "PLATINUM" :
                result = MisConstantes.PLATINUM;
                break;
            case "GOLD":
                result = MisConstantes.GOLD;
                break;
            case "VIP":
                result = MisConstantes.VIP;
                break;
            default:
                System.out.println("Entrada no Valida");
                result = 0;
                break;
        }
        return result;

    }

    //Metodo que Calcula Monto total a pagar incluyendo el IGV

    public double montoTotalPagarConIGV() {
        double result = this.costoIngreso() * MisConstantes.IGV /100;
        return result;
    }


    //Metodo que Calcula Monto total a pagar cuando es temporada alta o baja, ya que tiene descuento

    public double montoDescuentoporTemporada() {
        double result = 0;
        if (this.getTemporada().equalsIgnoreCase("Alta")) {
            result = this.montoTotalPagarConIGV() * 0.5;
        }
        if (this.getTemporada().equalsIgnoreCase("Baja")) {
            result = this.montoTotalPagarConIGV() * 0.10;

        }
       return result;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public List<String> getListar() {
        return listarAsistentes;
    }

    public String getExpositor() {
        return expositor;
    }

    public String getH_ingreso() {
        return h_ingreso;
    }

    public String getH_salida() {
        return h_salida;
    }

    public String getTemporada() {
        return temporada;
    }

    public double getCostoEntrada() {
        return costoEntrada;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getIdEvento() {
        return idEvento;
    }


}
