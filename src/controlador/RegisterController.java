
package controlador;

import static datos.Repositorio.clientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import modelo.Auto;
import modelo.Cliente;
import modelo.Usuario;
import vista.frmLogin;
import vista.frmRegistroAuto;
import vista.frmRegistroCliente;

public class RegisterController {
    
    
    frmRegistroCliente fRegister;
    Cliente cliente;
    
    public RegisterController (frmRegistroCliente fRegister, Cliente cliente) {
        this.fRegister = fRegister;
        this.cliente = cliente;
        this.fRegister.btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        this.fRegister.btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                
                if(validar()) {
                    Cliente cliente = new Cliente(fRegister.txtName.getText(), 
                            fRegister.txtSurname.getText(), 
                            fRegister.txtDni.getText(), 
                            fRegister.txtEmail.getText(), 
                            fRegister.txtPhone.getText(), 
                            fRegister.txtUsuario.getText(), 
                            fRegister.txtPassword.getText());
                    
                    
                    clientes.agregar(cliente);
                    
                    
                    JOptionPane.showMessageDialog(fRegister, "Se registro exitosamente");
                    fRegister.dispose();
                    /*frmLogin fLogin = new frmLogin();
                    LoginController controlador = new LoginController(fLogin);
                    controlador.iniciar();*/
                    frmRegistroAuto vista = new frmRegistroAuto();
                    
                    ControladorRegistroAuto controlador = new ControladorRegistroAuto(vista, datos.Repositorio.autoActual);
                    controlador.iniciar();
                }
                else {
                    JOptionPane.showMessageDialog(fRegister, "Llene todos los campos");
                } 
                
            }
        });    
    }
    
    private boolean validar() {
        boolean resultado = false;
        if(this.fRegister.txtName.getText().length()!=0 && 
                this.fRegister.txtSurname.getText().length()!=0 &&
                this.fRegister.txtDni.getText().length()!=0 &&
                this.fRegister.txtPhone.getText().length()!=0 &&
                this.fRegister.txtEmail.getText().length()!=0 &&
                this.fRegister.txtUsuario.getText().length()!=0 &&
                this.fRegister.txtPassword.getText().length()!=0){
            resultado = true;
        }
        return resultado;
    }
    
    public void iniciar() {
        fRegister.setVisible(true);
    }
}
