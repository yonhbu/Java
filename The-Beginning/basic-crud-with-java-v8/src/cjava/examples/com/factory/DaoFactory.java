package cjava.examples.com.factory;


import cjava.examples.com.dao.ArticuloDao;
import cjava.examples.com.dao.PersonaDao;
import cjava.examples.com.interfaces.ArticuloInterface;
import cjava.examples.com.interfaces.PersonaInterface;

public class DaoFactory {

    public static PersonaInterface construirInstanciaPersona () {
        return new PersonaDao();
    }

    public static ArticuloInterface construirInstanciaArticulo () {
        return new ArticuloDao();
    }

}
