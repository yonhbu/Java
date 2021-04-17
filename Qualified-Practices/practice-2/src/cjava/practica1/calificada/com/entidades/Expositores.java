package cjava.practica1.calificada.com.entidades;

public class Expositores  {

    private String idExpositores;
    private String nombre;
    private String apellidos;
    private double sueldo;
    private String correo;
    private int evento;


    public static class Builder {

        private String idExpositores;
        private String nombre;
        private String apellidos;
        private double sueldo;
        private String correo;
        private int evento;

        public Expositores.Builder setIdExpositores(String idExpositores) {
            this.idExpositores = idExpositores;
            return this;
        }

        public Expositores.Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Expositores.Builder setApellido(String apellidos) {
            this.apellidos = apellidos;
            return this;
        }


        public Expositores.Builder setSueldo(double sueldo) {
            this.sueldo = sueldo;
            return this;
        }


        public Expositores.Builder setCorreo(String correo) {
            this.correo = correo;

            return this;
        }

        public Expositores.Builder setEventoExponer (int evento) {
            this.evento = evento;
            return this;
        }

        public Expositores build () {
            return new Expositores(this);
        }

    }

    public Expositores (Expositores.Builder builder) {
            this.idExpositores = builder.idExpositores;
            this.nombre = builder.nombre;
            this.apellidos = builder.apellidos;
            this.correo = builder.correo;
            this.sueldo = builder.sueldo;
            this.evento = builder.evento;
    }

    public Expositores () {

    }


    //Imprimimos datos

    public void imprimir () {
        System.out.println(" idExpositores: " + this.getIdExpositores() + "\n");
        System.out.println(" Nombre Expositor: " + this.getNombre() + "\n");
        System.out.println(" Apellido: " +  this.getApellidos() + "\n" );
        System.out.println(" Sueldo: " + this.getSueldo() + "\n" );
        System.out.println(" Correo: " + this.getCorreo() + "\n");
        System.out.println(" Evento a Exponer: " + this.getEvento() + "\n");
        System.out.println("*************************************");
        System.out.println("*************************************");

    }

    public void imprimirSueldo () {
        System.out.println(" idExpositores: " + this.getIdExpositores() + "\n");
        System.out.println(" Nombre Expositor: " + this.getNombre() + "\n");
        System.out.println(" Sueldo: " + this.getSueldo() + "\n" );
        System.out.println("*************************************");
        System.out.println("*************************************");
    }


    public String getIdExpositores() {
        return idExpositores;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEvento() {
        return evento;
    }
}
