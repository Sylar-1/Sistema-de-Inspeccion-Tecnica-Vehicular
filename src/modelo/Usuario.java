
package modelo;

public class Usuario {
    
    String user;
    String password;
    boolean activo;

    public Usuario(String user, String password) {
        this.user = user;
        this.password = password;
        this.activo = false;
    }

    public String getUser() {
        return user;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public boolean ingresar(String user, String password) {
        boolean result = false;
        if(this.user.equalsIgnoreCase(user) && this.password.equals(password) && !this.activo) {
            this.activo = true;
            result = true;
        }
        return result;
    }
    
    public boolean salir() {
        boolean result = false;
        if(this.activo) {
            this.activo = false;
            result = true;
        }
        return result;
    }
    
    
    
    
}
