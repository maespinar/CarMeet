
package carmeet;

import Acciones.EvaluacionVehiculos;
import Gestiones.GestionExpositor;
import Enums.Zona;
import Enums.Categoria;
import Vehiculos.AutoTuning;
import Vehiculos.AutoClasico;
import Personas.Staff;
import Personas.Expositor;

public class CarMeet {

    public static void main(String[] args) {
        Staff asesor1 = new Staff("Matias", "60928108", "0001");
        asesor1.mostrarDetalles();
        
        GestionExpositor gestorExpositores = new GestionExpositor();
        
        AutoTuning auto1 = new AutoTuning(7, "V7N-614", "Mazda RX-7", 2015, Categoria.JDM);
        AutoTuning auto2 = new AutoTuning(9, "F5G-224", "Mazdaspeed3", 2014, Categoria.JDM);
        AutoClasico auto3 = new AutoClasico(45, "JHW-791", "Ford T", 1908, Categoria.EURO);
        
        Expositor expositor1 = new Expositor("Luis", "18182358", auto1, Zona.ESCENARIO);
        Expositor expositor2 = new Expositor("Raquel", "41069493", auto2, Zona.ESCENARIO);
        Expositor expositor3 = new Expositor("Jared", "74696938", auto3, Zona.ESCENARIO);
        
        gestorExpositores.agregar(expositor1);
        gestorExpositores.agregar(expositor2);
        gestorExpositores.agregar(expositor3);
        
        EvaluacionVehiculos evaluacion = new EvaluacionVehiculos();
        
        evaluacion.auditarLista(gestorExpositores, asesor1);
    }
}
