
package Domain;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservacion {
      private final Avion avion;  

    public Reservacion(Avion avion) {
        this.avion = avion;
    }

    public Tiquete reservar(Pasajero pasajero, String origen, String destino, String clase) {

        // validar disponibilidad
        boolean reservado = avion.reservarAsiento(clase);

        if (!reservado) {
            return null;
        }

        Vuelo vuelo = new Vuelo(origen, destino);
        double precio = clase.equals("Ejecutiva") ? 85000.0 : 45000.0;
        String codigoTiquete = "TIC-" + (int) (Math.random() * 9000 + 1000);
        String fecha = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Tiquete tiquete = new Tiquete(codigoTiquete, pasajero, vuelo, clase, precio, fecha);

        return tiquete;
    }

    public Factura generarFactura(Tiquete tiquete) {
        String numeroFactura = "FAC-" + (int) (Math.random() * 9000 + 1000);
        return new Factura(tiquete, numeroFactura);
    }
}
