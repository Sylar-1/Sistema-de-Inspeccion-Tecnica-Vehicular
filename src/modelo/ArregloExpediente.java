
package modelo;

public class ArregloExpediente {
    
    Expediente expediente[];
    int posicion;
    
    public ArregloExpediente() {
        expediente = new Expediente[3];
        posicion = 0;
    }
    
    public void agregar( Expediente expediente){
        this.expediente[posicion] = expediente;
        this.posicion++;
    }
    
    public String imprimir(){
        String resultado="";
            resultado += expediente[0].imprimir() + "\n";
        return resultado;
    }
    
}