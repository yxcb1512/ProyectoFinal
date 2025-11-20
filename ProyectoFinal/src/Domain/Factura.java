
package Domain;

import java.text.DecimalFormat;

public class Factura {

    private final double PORCENTAJE_IVA = 0.13;

    private final String numeroFactura;
    private final String numeroTiquete;
    private final String nombreCliente;
    private final String cedulaCliente;
    private final double montoBase;
    private final double montoIVA;
    private final double montoTotal;
    private final String claseAsiento;

    public Factura(Tiquete tiquete, String numeroFactura) {

        this.nombreCliente = tiquete.getPasajero().getNombre();
        this.cedulaCliente = tiquete.getPasajero().getCedula();
        this.numeroTiquete = tiquete.getCodigoTiquete();
        this.montoBase = tiquete.getPrecio();
        this.claseAsiento = tiquete.getClase();
        this.numeroFactura = numeroFactura;

        this.montoIVA = montoBase * PORCENTAJE_IVA;
        this.montoTotal = montoBase + montoIVA;
    }

    public double getPORCENTAJE_IVA() {
        return PORCENTAJE_IVA;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public String getNumeroTiquete() {
        return numeroTiquete;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public double getMontoBase() {
        return montoBase;
    }

    public double getMontoIVA() {
        return montoIVA;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public String getClaseAsiento() {
        return claseAsiento;
    }



    public void mostrarFactura() {
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("\n=============================================");
        System.out.println("          FACTURA DEL PASAJERO");
        System.out.println("Numero Factura: " + numeroFactura);
        System.out.println("Tiquete: " + numeroTiquete);
        System.out.println("---------------------------------------------");

        System.out.println("CLIENTE: " + nombreCliente);
        System.out.println("Identificación: " + cedulaCliente);
        System.out.println("Clase de Asiento: " + claseAsiento);
        System.out.println("---------------------------------------------");

        System.out.println("Costo Base (Sin Imp.): " + df.format(montoBase));
        System.out.println("IVA (" + (int) (PORCENTAJE_IVA * 100) + "%): " + df.format(montoIVA));
        System.out.println("---------------------------------------------");
        System.out.println("MONTO TOTAL PAGADO:    " + df.format(montoTotal));
        System.out.println("=============================================\n");
    }
}
