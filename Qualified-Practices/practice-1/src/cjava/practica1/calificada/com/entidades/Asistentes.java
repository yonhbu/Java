package cjava.practica1.calificada.com.entidades;


import java.util.List;

public class Asistentes {

    private String codAsistente;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String direccion;
    private int eventoAsistir;
    private String palco;
    private List<String> listAsistentes;

    public Asistentes() {

    }

    public static class Builder {

        private String codAsistente;
        private String nombre;
        private String apellidos;
        private String correo;
        private String telefono;
        private String direccion;
        private int eventoAsistir;
        private String palco;
        private List<String> listAsistentes;


        public Asistentes.Builder setCodAsistente(String codAsistente) {
            this.codAsistente = codAsistente;
            return this;
        }

        public Asistentes.Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Asistentes.Builder setApellido(String apellidos) {
            this.apellidos = apellidos;
            return this;
        }

        public Asistentes.Builder setCorreo(String correo) {
            this.correo = correo;

            return this;
        }

        public Asistentes.Builder setTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }


        public Asistentes.Builder setdireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }


        public Asistentes.Builder setEventoAsistir(int evento) {
            this.eventoAsistir = evento;
            return this;
        }

        public Asistentes.Builder setPalco(String palco) {
            this.palco = palco;
            return this;
        }


        public Asistentes build() {
            return new Asistentes(this);

        }

    }

    public Asistentes(Asistentes.Builder builder) {

        this.codAsistente = builder.codAsistente;
        this.nombre = builder.nombre;
        this.apellidos = builder.apellidos;
        this.telefono = builder.telefono;
        this.direccion = builder.direccion;
        this.correo = builder.correo;
        this.eventoAsistir = builder.eventoAsistir;
        this.listAsistentes = builder.listAsistentes;
        this.palco = builder.palco;

    }

    public void imprimir() {

        System.out.println(" Codigo Asistente: " + this.getCodAsistente() + "\n");
        System.out.println(" Nombre: " + this.getNombre() + "\n");
        System.out.println(" Apellido: " + this.getApellidos() + "\n");
        System.out.println(" Correo: " + this.getCorreo() + "\n");
        System.out.println(" Telefono: " + this.getTelefono() + "\n");
        System.out.println(" Direccion: " + this.getDireccion() + "\n");
        System.out.println(" Evento Asistir: " + this.getEventoAsistir());
        System.out.println(" Palco: " + this.getPalco());
        System.out.println("*************************************");
        System.out.println("*************************************");

    }



    public String getCodAsistente() {
        return codAsistente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEventoAsistir() {
        return eventoAsistir;
    }

    public String getPalco() {
        return palco;
    }

    public List<String> getListAsistentes() {
        return listAsistentes;
    }
}

