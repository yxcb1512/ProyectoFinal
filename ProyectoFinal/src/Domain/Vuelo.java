
package Domain;

import java.util.HashMap;
import java.util.Map;

public class Vuelo {

    private static Map<String, Integer> rutasCodigos = new HashMap<>();

    private String origen;
    private String destino;
    private String codigoVuelo;

    public Vuelo(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
        this.codigoVuelo = generarCodigo();
    }

    private String generarCodigo() {
        String ruta = origen + "-" + destino;

        if (rutasCodigos.containsKey(ruta)) {
            int num = rutasCodigos.get(ruta);
            return ruta + "-" + num;
        } else {
            int num = (int)(Math.random() * 900) + 100;
            rutasCodigos.put(ruta, num);
            return ruta + "-" + num;
        }
    }

    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public String getCodigoVuelo() { return codigoVuelo; }
}