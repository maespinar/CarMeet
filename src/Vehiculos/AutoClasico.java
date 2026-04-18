
package Vehiculos;

import Vehiculos.Vehiculo;
import Interfaces.Auditable;
import Enums.Categoria;

public class AutoClasico extends Vehiculo implements Auditable{
    private int porcentajeOriginalidad;

    public AutoClasico(int porcentajeOriginalidad, String placa, String modelo, int anio, Categoria categoria) {
        super(placa, modelo, anio, categoria);
        this.porcentajeOriginalidad = porcentajeOriginalidad;
    }
    
    @Override
    public int calcularPuntajeExhibicion(Vehiculo carro) {
        return this.porcentajeOriginalidad;
    }

    @Override
    public boolean cumpleRequisitos() {
        if (porcentajeOriginalidad > 50) {
            return true;
        } else{
            return false;
        }
    }
}
