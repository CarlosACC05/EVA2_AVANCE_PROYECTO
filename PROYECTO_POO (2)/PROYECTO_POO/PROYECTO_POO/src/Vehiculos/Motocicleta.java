package Vehiculos;

import Vehiculos.Automovil;

public class Motocicleta extends Automovil{
    // cv
    private int cilindraje; //125cc, 150cc, etc
    private String tipoMoto;

    public Motocicleta() {
        super();
        this.cilindraje = 0;
        this.tipoMoto = "------";
    }
    public Motocicleta(double precio, String color, String marca, String modelo, int año, double kilometraje,
            boolean estado, String tipoCombus, String tipoCambio, String potencia, int numeroVelocidades, String motor,
            int cilindraje, String tipoMoto) {
        super(precio, color, marca, modelo, año, kilometraje, estado, tipoCombus, tipoCambio, potencia,
                numeroVelocidades, motor);
        this.cilindraje = cilindraje;
        this.tipoMoto = tipoMoto;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    public String getTipoMoto() {
        return tipoMoto;
    }
    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }
    
    
}
