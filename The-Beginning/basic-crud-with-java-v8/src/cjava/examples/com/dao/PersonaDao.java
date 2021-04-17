package cjava.examples.com.dao;

import cjava.examples.com.beans.Persona;
import cjava.examples.com.interfaces.PersonaInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class PersonaDao implements PersonaInterface {

    private List<Persona> persona = new ArrayList<Persona>();


    @Override
    public String grabar(Persona obj) {

        String result = null;

        try {
            persona.add(obj);
            result = "Guardado Exitoso";
        }catch (Exception e) {
           result = e.getMessage();
        }

        return result;
    }

    @Override
    public String modificar(Persona obj) {

        String result = null;

        try {

            for (int i = 0; i < persona.size(); i++) {

                Persona p = persona.get(i);

                if (p.getCedula().equalsIgnoreCase(obj.getCedula())) {

                    persona.set(i,obj);
                }

            }
            result = "Modificacion Exitoso";

        }catch (Exception e) {
            result = e.getMessage();
        }

        return result;
    }


    @Override
    public String eliminar(Object dni) {
        String result = null;
        try {
            for (int i = 0; i < persona.size(); i++) {
                Persona p = persona.get(i);
                if (p.getCedula().equalsIgnoreCase(String.valueOf(dni))) {
                    persona.remove(i);
                }
            }
            result = "Eliminacion Exitoso";
        }catch (Exception e) {
            result = e.getMessage();
        }
        return result;
    }

    @Override
    public Persona buscar(Object dni) {
        Persona personaResult = null;
            for (int i = 0; i < persona.size(); i++) {
                 Persona p = persona.get(i);
                if (p.getCedula().equalsIgnoreCase(String.valueOf(dni))) {
                    personaResult = persona.get(i);
                }
            }
            return personaResult;
    }

    @Override
    public List<Persona> listar() {
        return persona;
    }
}
