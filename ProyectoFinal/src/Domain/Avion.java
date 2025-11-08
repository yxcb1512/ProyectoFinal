
package Domain;


public class Avion {

    private final String codigoVuelo;

    private final int CAPACIDAD_EJECUTIVA = 1;
    private final int CAPACIDAD_ECONOMICA = 3;
 
    private int asientosOcupadosEjecutiva;
    private int asientosOcupadosEconomica;

    public Avion(String codigo) {
    this.codigoVuelo = codigo;
    this.asientosOcupadosEjecutiva = 0;
    this.asientosOcupadosEconomica = 0;
    }

    public String getCodigoVuelo() {
        return this.codigoVuelo;
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
            if (getAsientosDisponibles(clase) > 0) {
                asientosOcupadosEjecutiva++;
                return true;
            }
        } else if (clase.equals("Economica")) {
            if (getAsientosDisponibles(clase) > 0) {
                asientosOcupadosEconomica++;
                return true;
            }
        }

        return false;
    }

    public void mostrarEstado() {
    System.out.println("--- Vuelo " + codigoVuelo + " - Disponibilidad Actual ---");
    System.out.println("Ejecutiva: " + getDisponiblesEjecutiva() + " disponibles (de " + CAPACIDAD_EJECUTIVA + ")");
    System.out.println("Económica: " + getDisponiblesEconomica() + " disponibles (de " + CAPACIDAD_ECONOMICA + ")");
    }

}
