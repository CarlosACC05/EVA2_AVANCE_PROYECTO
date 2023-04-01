package Vehiculos;

public class CarroDeportivo extends Carro {

    private boolean aleron;
    private String tipoLlanta;
    private String tipoCompetencia;

    public CarroDeportivo() {
        super();
        this.aleron = false;
        this.tipoLlanta = "------";
        this.tipoCompetencia = "------";
    }

    public CarroDeportivo(double precio, String color, String marca, String modelo, int año, double kilometraje,
            boolean estado, String tipoCombus, String tipoCambio, String potencia, int numeroVelocidades, String motor,
            int puertas, boolean quemacocos, boolean estereo, boolean aireCondi, String traccion, boolean convertible,
            int numAsientos, int torque, boolean aleron, String tipoLlanta, String tipoCompetencia) {
        super(precio, color, marca, modelo, año, kilometraje, estado, tipoCombus, tipoCambio, potencia,
                numeroVelocidades,
                motor, puertas, quemacocos, estereo, aireCondi, traccion, convertible, numAsientos, torque);
        this.aleron = aleron;
        this.tipoLlanta = tipoLlanta;
        this.tipoCompetencia = tipoCompetencia;
    }

    public boolean isAleron() {
        return aleron;
    }

    public void setAleron(boolean aleron) {
        this.aleron = aleron;
    }

    public String getTipoLlanta() {
        return tipoLlanta;
    }

    public void setTipoLlanta(String tipoLlanta) {
        this.tipoLlanta = tipoLlanta;
    }

    public String getTipoCompetencia() {
        return tipoCompetencia;
    }

    public void setTipoCompetencia(String tipoCompetencia) {
        this.tipoCompetencia = tipoCompetencia;
    }

}