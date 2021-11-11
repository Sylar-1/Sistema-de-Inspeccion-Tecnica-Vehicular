/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static datos.Repositorio.clienteActual;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.frmDatosCliente;
import vista.frmLogin;
import vista.frmMenuCliente;

/**
 *
 * @author alex1
 */
public class MenuClienteControlador {
    frmMenuCliente fMenuCliente;
    
    public MenuClienteControlador(frmMenuCliente fMenuCliente) {
        this.fMenuCliente = fMenuCliente;
        this.fMenuCliente.btnDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                fMenuCliente.dispose();
                frmDatosCliente fDatos = new frmDatosCliente();
                ControladorDatosCliente controlador = new ControladorDatosCliente(fDatos);
                controlador.iniciar();
            }
        });
        this.fMenuCliente.btnCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                fMenuCliente.dispose();
                frmLogin fLogin = new frmLogin();
                LoginController controlador = new LoginController(fLogin);
                controlador.iniciar();
            }
        });
        this.fMenuCliente.btnCertificado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(fMenuCliente, "No disponible");
            }
        });
    }
    
    public void iniciar() {
        fMenuCliente.setVisible(true);
        fMenuCliente.setLocationRelativeTo(null);
        fMenuCliente.setTitle("Menu Cliente");
    }
}
