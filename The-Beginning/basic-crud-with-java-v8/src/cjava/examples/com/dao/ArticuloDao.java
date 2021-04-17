package cjava.examples.com.dao;

import cjava.examples.com.beans.Articulo;
import cjava.examples.com.beans.Persona;
import cjava.examples.com.interfaces.ArticuloInterface;
import cjava.examples.com.interfaces.PersonaInterface;

import java.util.ArrayList;
import java.util.List;

public class ArticuloDao implements ArticuloInterface {


    @Override
    public String grabar(Articulo obj) {
        return null;
    }

    @Override
    public String modificar(Articulo obj) {
        return null;
    }

    @Override
    public String eliminar(Object dni) {
        return null;
    }

    @Override
    public Articulo buscar(Object dni) {
        return null;
    }

    @Override
    public List<Articulo> listar() {

        List<Articulo> lista = new ArrayList<>();
        lista.add(new Articulo.Builder().setCod("A01").setDescripcion("Televisor").setOrigen("Colombia").setPrecio(1000000).build());
        lista.add(new Articulo.Builder().setCod("A20").setDescripcion("Motocicleta").setOrigen("Colombia").setPrecio(5000000).build());
        lista.add(new Articulo.Builder().setCod("A02").setDescripcion("Mesa").setOrigen("Chile").setPrecio(2000000).build());
        lista.add(new Articulo.Builder().setCod("A010").setDescripcion("NeveCom").setOrigen("Chile").setPrecio(6000000).build());
        lista.add(new Articulo.Builder().setCod("A03").setDescripcion("Computador").setOrigen("Japon").setPrecio(3000000).build());
        lista.add(new Articulo.Builder().setCod("A04").setDescripcion("Nevera").setOrigen("EE.UU").setPrecio(4000000).build());
        return lista;
    }
}

