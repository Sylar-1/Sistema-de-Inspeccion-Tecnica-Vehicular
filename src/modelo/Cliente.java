
package modelo;

import java.io.Serializable;

public class Cliente  {
    
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String telefono;
    private String usuario;
    private String contrasenhia;

    public Cliente(String nombre, String apellido, String dni, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
    }

    public Cliente(String nombre, String apellido, String dni, String email, String telefono, String usuario, String contrasenhia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contrasenhia = contrasenhia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenhia() {
        return contrasenhia;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String toString () {
        return "Nombre: "+nombre;
    }
    
    
    
}
