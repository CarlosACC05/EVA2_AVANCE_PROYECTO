package Vehiculos;

/**
 *
 * @author You
 */
public abstract class Automovil {
    private double precio;
    private String color;
    private String marca;
    private String modelo;
    private int año;
    private double kilometraje;
    private boolean estado;// si es nuevo o usado
    private String tipoCombus; // Tipo de combustible que
    private String tipoCambio;// Tipo de cambio de velocidades
    private String potencia; // caballos de fuerza
    private int numeroVelocidades;
    private String motor;

    public Automovil() {
        this.precio = 0;
        this.color = "----";
        this.marca = "----";
        this.modelo = "----";
        this.año = 0;
        this.kilometraje = 0.0;
        this.estado = false;
        this.tipoCombus = "-------";
        this.tipoCambio = "------";
        this.numeroVelocidades = 0;
        this.motor = "------";
    }

    public Automovil(double precio, String color, String marca, String modelo, int año, double kilometraje,
            boolean estado, String tipoCombus, String tipoCambio, String potencia, int numeroVelocidades,
            String motor) {

        this.precio = precio;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
        this.estado = estado;
        this.tipoCombus = tipoCombus;
        this.tipoCambio = tipoCambio;
        this.potencia = potencia;
        this.numeroVelocidades = numeroVelocidades;
        this.motor = motor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTipoCombus() {
        return tipoCombus;
    }

    public void setTipoCombus(String tipoCombustion) {
        this.tipoCombus = tipoCombustion;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public int getNumeroVelocidades() {
        return numeroVelocidades;
    }

    public void setNumeroVelocidades(int numeroVelocidades) {
        this.numeroVelocidades = numeroVelocidades;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

}
