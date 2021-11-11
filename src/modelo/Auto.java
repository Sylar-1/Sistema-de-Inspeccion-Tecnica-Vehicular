
package modelo;

public class Auto {
    
    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private String carrocería;
    private String motor;
    private String potencia;
    private String alto;
    private String ancho;
    private String largo;

    public Auto(String placa) {
        this.placa = placa;
    }
    
    
    
    public Auto(String placa, String marca, String modelo, String color, String carrocería, String motor, String potencia, String alto, String ancho, String largo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.carrocería = carrocería;
        this.motor = motor;
        this.potencia = potencia;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public Auto(String placa, String marca, String modelo, String color) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getCarrocería() {
        return carrocería;
    }

    public String getMotor() {
        return motor;
    }

    public String getPotencia() {
        return potencia;
    }

    public String getAlto() {
        return alto;
    }

    public String getAncho() {
        return ancho;
    }

    public String getLargo() {
        return largo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCarrocería(String carrocería) {
        this.carrocería = carrocería;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public void setAlto(String alto) {
        this.alto = alto;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }
    
    
    
    
}
