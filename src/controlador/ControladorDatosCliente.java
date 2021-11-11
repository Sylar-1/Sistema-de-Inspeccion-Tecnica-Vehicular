/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static datos.Repositorio.clienteActual;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.frmDatosAuto;
import vista.frmDatosCliente;
import vista.frmLogin;
import vista.frmMenuCliente;

/**
 *
 * @author alex1
 */
public class ControladorDatosCliente {
    
    frmDatosCliente fDatos;
    
    public ControladorDatosCliente (frmDatosCliente fDatos) {
        this.fDatos = fDatos;
        this.fDatos.btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        this.fDatos.btnCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                fDatos.dispose();
                frmLogin fLogin = new frmLogin();
                LoginController controlador = new LoginController(fLogin);
                controlador.iniciar();
            }
        });
        this.fDatos.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                fDatos.dispose();
                frmMenuCliente fMenuCliente = new frmMenuCliente();
                MenuClienteControlador controlador = new MenuClienteControlador(fMenuCliente);
                controlador.iniciar();
            }
        });
        
        
        
        fDatos.labelNombres.setText(clienteActual.getNombre());
        fDatos.labelApellidos.setText(clienteActual.getApellido());
        fDatos.labelDni.setText(clienteActual.getDni());
        fDatos.labelCorreo.setText(clienteActual.getEmail());
        fDatos.labelTelefono.setText(clienteActual.getTelefono());
        
        
    }
    
    public void iniciar() {
        fDatos.setVisible(true);
        fDatos.setLocationRelativeTo(null);
        fDatos.setTitle("Datos del cliente");
    }
    
}
