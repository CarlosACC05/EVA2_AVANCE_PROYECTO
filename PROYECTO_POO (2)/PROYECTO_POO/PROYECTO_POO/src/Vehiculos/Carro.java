package Vehiculos;

import Vehiculos.Automovil;

public abstract class Carro extends Automovil {
    private int puertas;
    private boolean quemacocos;
    private boolean estereo;
    private boolean aireCondi;
    private String traccion;
    private boolean convertible;
    private int numAsientos;
    private int torque;

    public Carro() {
        super();
        this.puertas = 0;
        this.quemacocos = false;
        this.estereo = false;
        this.aireCondi = false;
        this.traccion = "------";
        this.convertible = false;
        this.numAsientos = 0;
        this.torque = 0;
    }

    public Carro(double precio, String color, String marca, String modelo, int año, double kilometraje, boolean estado,
            String tipoCombus, String tipoCambio, String potencia, int numeroVelocidades, String motor, int puertas,
            boolean quemacocos, boolean estereo, boolean aireCondi, String traccion, boolean convertible,
            int numAsientos, int torque) {
        super(precio, color, marca, modelo, año, kilometraje, estado, tipoCombus, tipoCambio, potencia,
                numeroVelocidades, motor);
        this.puertas = puertas;
        this.quemacocos = quemacocos;
        this.estereo = estereo;
        this.aireCondi = aireCondi;
        this.traccion = traccion;
        this.convertible = convertible;
        this.numAsientos = numAsientos;
        this.torque = torque;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isQuemacocos() {
        return quemacocos;
    }

    public void setQuemacocos(boolean quemacocos) {
        this.quemacocos = quemacocos;
    }

    public boolean isEstereo() {
        return estereo;
    }

    public void setEstereo(boolean estereo) {
        this.estereo = estereo;
    }

    public boolean isAireCondi() {
        return aireCondi;
    }

    public void setAireCondi(boolean aireCondi) {
        this.aireCondi = aireCondi;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    
}
