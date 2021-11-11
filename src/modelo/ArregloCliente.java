/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author alex1
 */
public class ArregloCliente implements Serializable{
    
    Cliente cliente[];
    int posicion;
    
    public ArregloCliente() {
        cliente = new Cliente[10];
        posicion = 0;
    }
    
    public void agregar (Cliente cliente) {
        this.cliente[posicion] = cliente;
        this.posicion++;
    }
    
    public int buscar (String usuario, String contrasenhia) {
        for(int i=0; i<cliente.length; i++) {
            if(usuario.equals(cliente[i].getUsuario()) && contrasenhia.equals(cliente[i].getContrasenhia())) {
                return i;
            }
        }
        return -1;
    }

    public Cliente[] getCliente() {
        return cliente;
    }
    
    
}
