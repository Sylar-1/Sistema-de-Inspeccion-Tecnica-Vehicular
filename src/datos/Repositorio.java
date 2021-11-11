/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.ArregloAuto;
import modelo.ArregloCliente;
import modelo.Auto;
import modelo.Cliente;
import modelo.Usuario;

/**
 *
 * @author alex1
 */
public class Repositorio {
    
    public static ArregloCliente clientes = new ArregloCliente();
    public static Cliente clienteActual;
    public static ArregloAuto autos = new ArregloAuto();
    public static Auto autoActual;
}
