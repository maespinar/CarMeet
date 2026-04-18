
package Gestiones;

import Interfaces.Gestiones;
import Personas.Expositor;

public class GestionExpositor implements Gestiones<Expositor>{
    private Expositor[] expositores;
    private int cantidadExpositores;

    public GestionExpositor() {
        this.expositores = new Expositor[30]; 
        this.cantidadExpositores = 0;
    }
    
    @Override
    public void agregar(Expositor nuevoExpositor) {
        if(cantidadExpositores < expositores.length) {
            expositores[cantidadExpositores] = nuevoExpositor;
            cantidadExpositores++;
            System.out.println("Nuevo expositor " + nuevoExpositor.getNombre() + " agregado.");
        }
    }
    
    @Override
    public void eliminar(String dni) {
        for (int i = 0; i < cantidadExpositores; i++) {
            if (expositores[i].getDni().equals(dni)){
                System.out.println("Expositor " + expositores[i].getNombre() + " eliminado.");
                for (int j=i; j<cantidadExpositores-1; ++j){
                    expositores[j] = expositores[j+1];
                }
                expositores[cantidadExpositores-1] = null;
                cantidadExpositores--; 
                break;
            }
        }
    }
        
    @Override
    public void modificar(String dni, Expositor nuevosDatos) {
        for (int i = 0; i < cantidadExpositores; i++) {
            if(expositores[i].getDni().equals(dni)) {
                expositores[i].setNombre(nuevosDatos.getNombre());
                expositores[i].setLugar(nuevosDatos.getLugar());            
            }
        }
    }
    
    @Override
    public Expositor buscar(String dni) {
        for (int i = 0; i < cantidadExpositores; i++) {
            if(expositores[i].getDni().equals(dni)) {
                return expositores[i];
            }
        }
        return null;
    }
    
    @Override
    public Expositor[] mostrar() {
        Expositor[] listaFinal = new Expositor[cantidadExpositores];
        for (int i = 0; i < cantidadExpositores; i++) {
            listaFinal[i] = expositores[i];
        }
        return listaFinal;
    }

    
}
