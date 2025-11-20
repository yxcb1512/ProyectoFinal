package Domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Reservacion {

    
    private Map<String, Avion> avionesPorRuta = new HashMap<>();

    public Tiquete reservar(Pasajero pasajero, String origen, String destino, String clase) {

        String ruta = origen + "-" + destino;

     
        avionesPorRuta.putIfAbsent(ruta, new Avion());

      
        Avion avion = avionesPorRuta.get(ruta);

      
        boolean reservado = avion.reservarAsiento(clase);

        if (!reservado) {
            return null;
        }

       
        Vuelo vuelo = new Vuelo(origen, destino);

        double precio = clase.equals("Ejecutiva") ? 85000 : 45000;
        String codigoTiquete = "TIC-" + (int)(Math.random() * 9000 + 1000);
        String fecha = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        return new Tiquete(codigoTiquete, pasajero, vuelo, clase, precio, fecha);
    }

    public Factura generarFactura(Tiquete tiquete) {
        String numeroFactura = "FAC-" + (int)(Math.random() * 9000 + 1000);
        return new Factura(tiquete, numeroFactura);
    }


    public String obtenerDisponibilidad(String origen, String destino) {
        String ruta = origen + "-" + destino;

    // Si la ruta nunca ha sido usada, crea un avión nuevo
    if (!avionesPorRuta.containsKey(ruta)) {
        avionesPorRuta.put(ruta, new Avion());
    }

    Avion avionRuta = avionesPorRuta.get(ruta);

    return  "Ruta: " + ruta + "\n"
            + "Ejecutiva disponibles: " + avionRuta.getDisponiblesEjecutiva() + "\n"
            + "Económica disponibles: " + avionRuta.getDisponiblesEconomica() + "\n";
    }
}
