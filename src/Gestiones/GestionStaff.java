
package Gestiones;

import Interfaces.Gestiones;
import Personas.Staff;

public class GestionStaff implements Gestiones<Staff>{
    private Staff[] staffs;
    private int cantidadStaffs;

    public GestionStaff() {
        this.staffs = new Staff[10];
        this.cantidadStaffs = 0;
    }

    @Override
    public void agregar(Staff nuevoStaff) {
        if(cantidadStaffs < staffs.length) {
            staffs[cantidadStaffs] = nuevoStaff;
            cantidadStaffs++;
            System.out.println("Nuevo staff " + nuevoStaff.getNombre() + " agregado.");
        }
    }

    @Override
    public void eliminar(String dni) {
        for (int i = 0; i < cantidadStaffs; i++) {
            if(staffs[i].getDni().equals(dni)) {
                System.out.println("Expositor " + staffs[i].getNombre() + " eliminado.");
                for (int j = i; j < cantidadStaffs-1; ++j) {
                    staffs[j] = staffs[j+1];
                }
                staffs[cantidadStaffs-1] = null;
                cantidadStaffs--;
                break;
            }
        }
    }

    @Override
    public void modificar(String dni, Staff nuevosDatos) {
        for (int i = 0; i < cantidadStaffs; i++) {
            if(staffs[i].getDni().equals(dni)){
                staffs[i].setNombre(nuevosDatos.getNombre());
            }
        }
    }

    @Override
    public Staff buscar(String dni) {
        for (int i = 0; i < cantidadStaffs; i++) {
            if(staffs[i].getDni().equals(dni)){
                return staffs[i];
            }
        }
        return null;
    }

    @Override
    public Staff[] mostrar() {
        Staff[] listaFinal = new Staff[cantidadStaffs];
        for (int i = 0; i < cantidadStaffs; i++) {
            listaFinal[i] = staffs[i];
        }
        return listaFinal;
    }
    
    
}
