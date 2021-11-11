
package controlador;

import static datos.Repositorio.clienteActual;
import static datos.Repositorio.clientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Usuario;
import vista.frmLogin;
import vista.frmMenuCliente;
import vista.frmMenuMecanico;
import vista.frmRegistroCliente;

public class LoginController {
    
    
    frmLogin fIngreso;

    public LoginController(frmLogin fIngreso) {
        this.fIngreso = fIngreso;
        this.fIngreso.btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                if(fIngreso.txtUser.getText().equals("percy.ñaccha") && fIngreso.txtPassword.getText().equals("123456")) {
                    frmMenuMecanico fMenu = new frmMenuMecanico();
                    MenuController controlador = new MenuController(fMenu);
                    fIngreso.dispose();
                    controlador.iniciar();
                }  
                
                
                
                else {
                    int pos = clientes.buscar(fIngreso.txtUser.getText(), fIngreso.txtPassword.getText());
                    if(pos != -1 ) {
                    fIngreso.dispose();
                    clienteActual = clientes.getCliente()[pos];
                    frmMenuCliente fMenuCliente = new frmMenuCliente();
                    MenuClienteControlador controlador = new MenuClienteControlador(fMenuCliente);
                    controlador.iniciar();
                    }
                    
                    else {
                    JOptionPane.showMessageDialog(fIngreso, "usuario y/o contraseña no valida");
                    }
                }
                
            }
        });
        this.fIngreso.enlaceRegistrar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                fIngreso.dispose();
                frmRegistroCliente fRegister = new frmRegistroCliente();
                RegisterController controlador = new RegisterController(fRegister, datos.Repositorio.clienteActual);
                controlador.iniciar();
            }

            @Override
            public void mousePressed(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        this.fIngreso.btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
    }
    
    public void iniciar() {
        this.fIngreso.setVisible(true);
    }
    
    
    
}
