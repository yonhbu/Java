package cjava.examples.com.beans;

import java.math.BigDecimal;

public class Articulo {

    private String cod;
    private String descripcion;
    private long precio;
    private  String origen;


    public static class Builder {

        private String cod;
        private String descripcion;
        private long precio;
        private String origen;

        public Articulo.Builder setCod(String cod) {
            this.cod = cod;
            return this;
        }

        public Articulo.Builder setDescripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        public Articulo.Builder setPrecio(long precio) {
            this.precio = precio;
            return this;
        }

        public Articulo.Builder setOrigen(String origen) {
            this.origen = origen;
            return this;
        }


        public Articulo build () {
            return new Articulo (this);

        }

    }

    //Me creo un Constructor
    private Articulo (Articulo.Builder builder) {

        this.cod = builder.cod;
        this.descripcion = builder.descripcion;
        this.precio = builder.precio;
        this.origen = builder.origen;

    }


    public void  imprimir () {
        System.out.println("Codigo " + this.cod);
        System.out.println("Descripcion " + this.descripcion);
        System.out.println("Precio " + this.precio);
        System.out.println("Origen " + this.origen);
    }


    public String toString () {
     return  this.getCod() + "\t" + this.getDescripcion()  + "\t" + this.getPrecio()  + "\t" + this.getOrigen();

    }



    public String getCod() {
        return cod;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public long getPrecio() {
        return precio;
    }

    public String getOrigen() {
        return origen;
    }
}
