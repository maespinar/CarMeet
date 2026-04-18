
package Vehiculos;

import Vehiculos.Vehiculo;
import Interfaces.Auditable;
import Enums.Categoria;

public class AutoTuning extends Vehiculo implements Auditable{
    private int nivelModificacion;

    public AutoTuning(int nivelModificacion, String placa, String modelo, int anio, Categoria categoria) {
        super(placa, modelo, anio, categoria);
        this.nivelModificacion = nivelModificacion;
    }
    
    @Override
    public int calcularPuntajeExhibicion(Vehiculo carro) {
        int bonificacion = 0;
        if(carro.getAnio() > 2015){
            bonificacion = 15;
        }
        return nivelModificacion*5 + bonificacion;
    }

    @Override
    public boolean cumpleRequisitos() {
        if (nivelModificacion > 3) {
            return true;
        } else{
            return false;
        }
    }
}
