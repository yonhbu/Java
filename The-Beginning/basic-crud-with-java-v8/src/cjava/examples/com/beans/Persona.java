package cjava.examples.com.beans;

import cjava.examples.com.util.Genero;
import cjava.examples.com.util.Utilitarios;

public class Persona {

    private String cedula;
    private String nombre;
    private double sueldo;
    private Genero genero;


    public void imprimir () {

                System.out.println(" CEDULA " + this.getCedula());
                System.out.println (" NOMBRE " + this.getNombre());
                System.out.println (" SUELDO " + this.getSueldo());
                System.out.println  ("GENERO " + this.getGenero());
                System.out.println (" DESCUENTO " + this.getPension());
                System.out.println (" SUELDO NETO CON DESCUENTO PENSION " + this.getSueldoNeto());

    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getPension () {
        return this.getSueldo() * Utilitarios.DESCUENTO_PENSION;
    }

    public double getSueldoNeto () {
        double neto = 0;
        if (this.getGenero() == Genero.MASCULINO) {
            neto = this.getSueldo() - this.getPension();
        } else {
            neto = this.getSueldo();
        }
        return neto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
