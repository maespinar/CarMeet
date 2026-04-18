
package Personas;

import Personas.Persona;
import Vehiculos.Vehiculo;
import Enums.Zona;

public class Expositor extends Persona{
    private final Vehiculo carro;
    private Zona lugar;
    
    public Expositor(String nombre, String dni, Vehiculo carro, Zona lugar) {
        super(nombre, dni);
        this.carro = carro;
        this.lugar = lugar;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("---Datos del expositor---");
        super.mostrarDetalles();
        System.out.println("Zona asignada: " + this.lugar);
        System.out.println(this.carro.mostrarDetalles() + "\n");
    }

    public Zona getLugar() {
        return lugar;
    }

    public void setLugar(Zona lugar) {
        this.lugar = lugar;
    }

    public Vehiculo getCarro() {
        return carro;
    }
    
    
}
