/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alex1
 */
public class ArregloAuto {
    
    Auto auto[];
    int posicion;
    
    public ArregloAuto() {
        auto = new Auto[10];
        posicion = 0;
    }
    
    public void agregar (Auto auto) {
        this.auto[posicion] = auto;
        this.posicion++;
    }
    
    

    public Auto[] getAuto() {
        return auto;
    }
    
}
