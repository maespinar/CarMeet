
package Vehiculos;

import Enums.Categoria;

public abstract class Vehiculo {
    private String placa;
    private String modelo;
    private int anio;
    private Categoria categoria;

    public Vehiculo(String placa, String modelo, int anio, Categoria categoria) {
        this.placa = placa;
        this.modelo = modelo;
        this.setAnio(anio);
        this.categoria = categoria;
    }
    
    public abstract int calcularPuntajeExhibicion(Vehiculo carro);
    
    public String mostrarDetalles() {
        return "Placa del vehiculo: " + this.placa + "\n"
        + "Marca y modelo: " + this.modelo + "\n"
        + "Anio del vehiculo: " + this.anio + "\n"
        + "Categoria: " + this.categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio < 1900) {
            System.out.println("No puedes registrar un vehiculo anterior al anio 1990");
        } else{
            this.anio = anio;
        }
    }
    
}
