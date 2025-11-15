/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author almi0
 */
public class Avion {
    
    
    private final int CAPACIDAD_EJECUTIVA = 1;
    private final int CAPACIDAD_ECONOMICA = 3;
    
    private int asientosOcupadosEjecutiva;
    private int asientosOcupadosEconomica;

    public Avion() {
       
        this.asientosOcupadosEjecutiva = 0;
        this.asientosOcupadosEconomica = 0;
    }
    
    private int getAsientosDisponibles(String clase) {
        if (clase.equals("Ejecutiva")) {
            return CAPACIDAD_EJECUTIVA - asientosOcupadosEjecutiva; 
        } else if (clase.equals("Economica")) {
            return CAPACIDAD_ECONOMICA - asientosOcupadosEconomica; 
        }
        return 0;
    }

    public int getDisponiblesEjecutiva() {
        return getAsientosDisponibles("Ejecutiva");
    }

    public int getDisponiblesEconomica() {
        return getAsientosDisponibles("Economica");
    }

    
    public boolean reservarAsiento(String clase) {

        if (clase.equals("Ejecutiva")) {
            if (getDisponiblesEjecutiva() > 0) {
                this.asientosOcupadosEjecutiva++; 
                return true;
            }
        } 
        
        else if (clase.equals("Economica")) {
            if (getDisponiblesEconomica() > 0) {
                this.asientosOcupadosEconomica++; 
                return true;
            }
        }
        
        return false;
    }

    
    public void mostrarEstado() {
        System.out.println("--- Disponibilidad del Avión ---");
        
        System.out.println("Ejecutiva: " + getDisponiblesEjecutiva() + 
                           " disponibles / " + asientosOcupadosEjecutiva + " ocupados (Total: " + CAPACIDAD_EJECUTIVA + ").");
                           
        System.out.println("Económica: " + getDisponiblesEconomica() + 
                           " disponibles / " + asientosOcupadosEconomica + " ocupados (Total: " + CAPACIDAD_ECONOMICA + ").");
    }
}

