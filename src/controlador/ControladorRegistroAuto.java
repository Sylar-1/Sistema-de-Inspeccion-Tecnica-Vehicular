/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static datos.Repositorio.autos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Auto;
import vista.frmLogin;
import vista.frmRegistroAuto;

/**
 *
 * @author alex1
 */
public class ControladorRegistroAuto {
    
    frmRegistroAuto vista;
    Auto auto;
    
    public ControladorRegistroAuto (frmRegistroAuto vista, Auto auto) {
        this.vista = vista;
        this.auto = auto;
        this.vista.btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        this.vista.btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                
                if(validar()) {
                    Auto auto = new Auto(vista.txtPlaca.getText(), 
                            vista.txtMarca.getText(), 
                            vista.txtModelo.getText(), 
                            vista.txtColor.getText(), 
                            vista.txtCarroceria.getText(), 
                            vista.txtMotor.getText(), 
                            vista.txtPotencia.getText(),
                            vista.txtAlto.getText(),
                            vista.txtAncho.getText(),
                            vista.txtLargo.getText());
                    
                    
                    autos.agregar(auto);
                    
                    
                    JOptionPane.showMessageDialog(vista, "Se registro exitosamente");
                    vista.dispose();
                    frmLogin fLogin = new frmLogin();
                    LoginController controlador = new LoginController(fLogin);
                    controlador.iniciar();
                }
                else {
                    JOptionPane.showMessageDialog(vista, "Llene todos los campos");
                } 
                
            }
        });    
    }
    
    private boolean validar() {
        boolean resultado = false;
        if(this.vista.txtPlaca.getText().length()!=0 && 
                this.vista.txtMarca.getText().length()!=0 &&
                this.vista.txtModelo.getText().length()!=0 &&
                this.vista.txtColor.getText().length()!=0 &&
                this.vista.txtCarroceria.getText().length()!=0 &&
                this.vista.txtMotor.getText().length()!=0 &&
                this.vista.txtPotencia.getText().length()!=0 &&
                this.vista.txtAlto.getText().length()!=0 &&
                this.vista.txtAncho.getText().length()!=0 &&
                this.vista.txtLargo.getText().length()!=0){
            resultado = true;
        }
        return resultado;
    }
    
    public void iniciar() {
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.setTitle("Registro de los datos de su auto");
    }
    
    
    
}
