
package modelo;

public class PruebaLuces {
    
    private double bajaIzquierda;
    private double bajaDerecha;
    private double altaIzquierda;
    private double altaDerecha;
    private String resultado;

    public PruebaLuces(double bajaIzquierda, double bajaDerecha, double altaIzquierda, double altaDerecha, String resultado) {
        this.bajaIzquierda = bajaIzquierda;
        this.bajaDerecha = bajaDerecha;
        this.altaIzquierda = altaIzquierda;
        this.altaDerecha = altaDerecha;
        this.resultado = resultado;
    }

    public double getBajaIzquierda() {
        return bajaIzquierda;
    }

    public double getBajaDerecha() {
        return bajaDerecha;
    }

    public double getAltaIzquierda() {
        return altaIzquierda;
    }

    public double getAltaDerecha() {
        return altaDerecha;
    }

    public String getResultado() {
        return resultado;
    }
    
    
    
    
}
