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
        System.out.println("===== TIQUETE AÉREO ====="
                + "Codigo del tiquete: " + codigoTiquete
                + "Pasajero: " + pasajero.getNombre()
                + "Vuelo: " + vuelo.getCodigoVuelo()
                + "Origen: " + vuelo.getOrigen()
                + "Destino: " + vuelo.getDestino()
                + "Clase: " + clase
                + "Precio: ₡" + precio
                + "Fecha de emision: " + fechaEmision
                + "==========================");
    }

   
    @Override
    public String toString() {
        return "Tiquete:" +"\n"+
                "CodigoTiquete: " + codigoTiquete + '\'' +"\n"+
                "Pasajero: " + pasajero.getNombre() +"\n"+
                "Vuelo: " + vuelo.getCodigoVuelo() +"\n"+
                "Clase: " + clase + '\'' +"\n"+
                "Precio: " + precio +"\n"+
                "Fecha de Emision: " + fechaEmision + '\'';
    }
    
}
