/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static datos.Repositorio.autoActual;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.frmDatosAuto;
import vista.frmLogin;

/**
 *
 * @author alex1
 */
public class ControladorDatosAuto {
    
    frmDatosAuto vista;
    
    public ControladorDatosAuto(frmDatosAuto vista) {
        this.vista = vista;
        this.vista.btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        this.vista.btnCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                vista.dispose();
                frmLogin fLogin = new frmLogin();
                LoginController controlador = new LoginController(fLogin);
                controlador.iniciar();
            }
        });
        
        vista.txtPlaca.setText(autoActual.getPlaca());
        vista.txtMarca.setText(autoActual.getMarca());
        vista.txtModelo.setText(autoActual.getModelo());
        vista.txtColor.setText(autoActual.getColor());
        vista.txtCarroceria.setText(autoActual.getCarrocería());
        vista.txtMotor.setText(autoActual.getMotor());
        vista.txtPotencia.setText(autoActual.getPotencia());
        vista.txtAlto.setText(autoActual.getAlto());
        vista.txtAncho.setText(autoActual.getAncho());
        vista.txtLargo.setText(autoActual.getLargo());
    }
    
    public void iniciar() {
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
    
}
