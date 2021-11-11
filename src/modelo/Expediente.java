
package modelo;

import java.util.Date;

public class Expediente {
    
    private int numero;
    private Date fechaInspeccion;
    private Date fechaProxInspección;
    private Cliente cliente[];
    private Auto auto[];
    private PruebaLuces pruebaLuces[];
    
    
    private static int num_expediente;    
    
    public Expediente(Cliente cliente[], Auto auto[], PruebaLuces pruebaLuces[]) {
        this.fechaInspeccion = new Date();
        this.cliente = cliente;
        this.auto = auto;
        this.pruebaLuces = pruebaLuces;
        this.numero = ++num_expediente;
    }
    

    public int getNumero() {
        return numero;
    }

    public Date getFechaInspeccion() {
        return fechaInspeccion;
    }

    public Date getFechaProxInspección() {
        return fechaProxInspección;
    }

    public void setFechaProxInspección(Date fechaProxInspección) {
        this.fechaProxInspección = fechaProxInspección;
    }
    
    public String imprimir() {
        String result="NUMERO\tNOMBRES\t\tAPELLIDOS\tEMAIL\t\t\tDNI\t\tPLACA\t\tMARCA\t\tMODELO\t\tCOLOR\t\tPRUEBA DE LUCES\n";
        for(int i=0; i<this.cliente.length; i++) {
            result = result + (i+1)+"\t"+ 
                    this.cliente[i].getNombre()+"\t\t"+
                    this.cliente[i].getApellido()+"\t\t"+
                    this.cliente[i].getEmail()+"\t"+
                    this.cliente[i].getDni()+"\t"+
                    this.auto[i].getPlaca()+"\t\t"+
                    this.auto[i].getMarca()+"\t\t"+
                    this.auto[i].getModelo()+"\t\t"+
                    this.auto[i].getColor()+"\t\t\t"+
                    this.pruebaLuces[i].getResultado()+"\n";
                    
        }
        return result;
    }
    
}
