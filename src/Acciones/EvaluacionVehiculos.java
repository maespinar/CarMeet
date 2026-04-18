
package Acciones;

import Interfaces.Auditable;
import Personas.Expositor;
import Vehiculos.Vehiculo;

public class EvaluacionVehiculos {
    for (int i = 0; i < expositores.length(); i++) {
            Expositor expositorActual = listaExpositores.get(i);
            Vehiculo autoActual = expositorActual.getCarro();
            if (autoActual instanceof Auditable) {
                Auditable autoAuditable = (Auditable) autoActual;
                
                if (autoAuditable.cumpleRequisitos()) {
                    System.out.println("\n" + "Felicidades! Vehiculo aceptado.");
                    asesor1.aprobarPropietario();
                    expositorActual.mostrarDetalles();
                    System.out.println("Su puntaje de exhibicion es: " + expositorActual.getCarro().calcularPuntajeExhibicion(expositorActual.getCarro()) + "\n");
                } else {
                    System.out.println("\n" + "El vehiculo de placa " + expositorActual.getCarro().getPlaca() + " no cumple con los requisitos");
                    System.out.println("El expositor " + expositorActual.getNombre() + " ha sido descalificado");
                }
            }
            
    }
}
