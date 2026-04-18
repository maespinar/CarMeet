
package Personas;

import Personas.Persona;

public class Staff extends Persona{
    private final String codigoAsesor;
    private int propietariosAprobados;

    public Staff(String nombre, String dni, String codigoAsesor) {
        super(nombre, dni);
        this.codigoAsesor = codigoAsesor;
        this.propietariosAprobados = 0;
    }
    
    public void aprobarPropietario() {
        this.propietariosAprobados++;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("---Datos del staff---");
        super.mostrarDetalles();
        System.out.println("Codigo de staff: " + this.codigoAsesor + "\n"
        + "Numero de expositores aprobados: " + this.propietariosAprobados + "\n"
        + "----------------------");
    }    
    
    
}
