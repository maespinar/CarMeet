
package Acciones;

import Gestiones.GestionExpositor;
import Interfaces.Auditable;
import Personas.Expositor;
import Personas.Staff;
import Vehiculos.Vehiculo;

public class EvaluacionVehiculos {
    
    public EvaluacionVehiculos() {}
    
    public void auditarLista(GestionExpositor gestorExpositores, Staff asesorEncargado) {
        for (int i = 0; i < gestorExpositores.getCantidadExpositores(); i++) {
            Expositor expositorActual = gestorExpositores.getExpositores()[i];
            Vehiculo autoActual = expositorActual.getCarro();
            if (autoActual instanceof Auditable) {
                Auditable autoAuditable = (Auditable) autoActual;
                
                if (autoAuditable.cumpleRequisitos()) {
                    System.out.println("\n" + "Felicidades! Vehiculo aceptado.");
                    asesorEncargado.aprobarPropietario();
                    expositorActual.mostrarDetalles();
                    System.out.println("Su puntaje de exhibicion es: " + expositorActual.getCarro().calcularPuntajeExhibicion(expositorActual.getCarro()) + "\n");
                } else {
                    System.out.println("\n" + "El vehiculo de placa " + expositorActual.getCarro().getPlaca() + " no cumple con los requisitos");
                    System.out.println("El expositor " + expositorActual.getNombre() + " ha sido descalificado");
                }
            }   
        }
    }
    
}
