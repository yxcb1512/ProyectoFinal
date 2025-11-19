/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author josha
 */
public class Tiquete {
    private String codigoTiquete;     
    private Pasajero pasajero;        
    private Vuelo vuelo;              
    private String clase;             
    private double precio;           
    private String fechaEmision;      

    //  Constructor
    public Tiquete(String codigoTiquete, Pasajero pasajero, Vuelo vuelo, String clase, double precio, String fechaEmision) {
        this.codigoTiquete = codigoTiquete;
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.clase = clase;
        this.precio = precio;
        this.fechaEmision = fechaEmision;
    }

    //  Get y Set
    public String getCodigoTiquete() {
        return codigoTiquete;
    }

    public void setCodigoTiquete(String codigoTiquete) {
        this.codigoTiquete = codigoTiquete;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    //   para mostrar la información del tiquete
    public void mostrarTiquete() {
        System.out.println("===== TIQUETE AÉREO =====");
        System.out.println("Codigo del tiquete: " + codigoTiquete);
        System.out.println("Pasajero: " + pasajero.getNombre());
        System.out.println("Vuelo: " + vuelo.getCodigoVuelo());
        System.out.println("Origen: " + vuelo.getOrigen());
        System.out.println("Destino: " + vuelo.getDestino());
        System.out.println("Clase: " + clase);
        System.out.println("Precio: ₡" + precio);
        System.out.println("Fecha de emision: " + fechaEmision);
        System.out.println("==========================");
    }

   
    @Override
    public String toString() {
        return "Tiquete{" +
                "codigoTiquete='" + codigoTiquete + '\'' +
                ", pasajero=" + pasajero.getNombre() +
                ", vuelo=" + vuelo.getCodigoVuelo() +
                ", clase='" + clase + '\'' +
                ", precio=" + precio +
                ", fechaEmision='" + fechaEmision + '\'' +
                '}';
    }
    
}
