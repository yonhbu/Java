package cjava.examples.com.interfaces;

import java.util.List;

public interface EntidadInterface<T> {

    public String grabar (T obj);
    public String modificar (T obj);
    public String eliminar (Object dni);
    public T buscar (Object dni);
    public List<T> listar ();


}
