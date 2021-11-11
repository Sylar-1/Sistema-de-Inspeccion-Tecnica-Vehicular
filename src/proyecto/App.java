
package proyecto;

import controlador.LoginController;
import modelo.ArregloExpediente;
import modelo.Auto;
import modelo.Cliente;
import modelo.Expediente;
import modelo.PruebaLuces;
import modelo.Usuario;
import vista.frmLogin;

public class App {

    public static void main(String[] args) {
        
        
        // Primero registre 2 clientes
        // Usuario: percy.ñaccha  Contraseña: 123456
        
        frmLogin ventana = new frmLogin();
        LoginController controlador = new LoginController(ventana);
        controlador.iniciar();
        
        
        /*ArregloExpediente expedientes = new ArregloExpediente();
        Cliente clientes[] = new Cliente[3];
        clientes[0] = new Cliente("Percy", "Ñaccha", "78159254", "percy1998@gmail.com");
        clientes[1] = new Cliente("Juan", "Romero", "15894547", "juan2222@gmail.com");
        clientes[2] = new Cliente("Pedro", "Quispe", "84597184", "pedro84@gmail.com");
        
        Auto autos[] = new Auto[3];
        autos[0] = new Auto("DNH-546", "Audi", "Q5 2020", "Verde");
        autos[1] = new Auto("F2W-871", "Nissan", "Micra", "Rojo");
        autos[2] = new Auto("RDW-179", "Hyundai", "i20", "Blanco");
        
        PruebaLuces pruebaLuces[] = new PruebaLuces[3];
        pruebaLuces[0] = new PruebaLuces(4, 10, 26, 22, "A");
        pruebaLuces[1] = new PruebaLuces(5, 11, 27, 23, "B");
        pruebaLuces[2] = new PruebaLuces(3, 9, 25, 21, "C");
        
        for(int i = 0; i<clientes.length; i++ ){
            expedientes.agregar(new Expediente(clientes,autos,pruebaLuces));
        }
        
        System.out.println(expedientes.imprimir());*/
    }
        
        
    }

