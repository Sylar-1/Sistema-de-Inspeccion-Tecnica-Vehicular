/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;
import modelo.Cliente;
import vista.frmLogin;
import vista.frmMenuMecanico;
import vista.frmRegistroCliente;
import vista.frmTablaClientes;

/**
 *
 * @author alex1
 */
public class MenuController {
    frmMenuMecanico fMenu;
    
    
    public MenuController(frmMenuMecanico fMenu) {
        this.fMenu = fMenu;
        this.fMenu.btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        this.fMenu.btnTomarPruebas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //JOptionPane.showMessageDialog(fMenu, );
                
                JOptionPane.showMessageDialog(fMenu, "Nombre: ");
            }
        });
        
        this.fMenu.btnLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmTablaClientes fTablaClientes = new frmTablaClientes();
                fTablaClientes.setVisible(true);
            }
        });
        
        this.fMenu.btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
             
            }
        });
        
    }
    
    public void iniciar() {
        fMenu.setVisible(true);
    }
    
    
}
