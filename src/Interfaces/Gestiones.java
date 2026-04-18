
package Interfaces;

public interface Gestiones <T>{
    public void agregar(T objeto);
    public void eliminar(String dni);
    public void modificar(String id, T nuevosDatos);
    public T buscar(String id);
    public T[] mostrar();
}
