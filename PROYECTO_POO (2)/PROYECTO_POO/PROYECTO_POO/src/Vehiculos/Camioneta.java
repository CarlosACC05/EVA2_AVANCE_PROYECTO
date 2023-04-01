package Vehiculos;

public class Camioneta extends Carro {

     
     private String tipoCamioneta;
     private boolean dobleRodada;
     
     public Camioneta() {
          super();
          this.tipoCamioneta = "------";
          this.dobleRodada = false;
     }
     public Camioneta(double precio, String color, String marca, String modelo, int año, double kilometraje,
               boolean estado, String tipoCombus, String tipoCambio, String potencia, int numeroVelocidades,
               String motor, int puertas, boolean quemacocos, boolean estereo, boolean aireCondi, String traccion,
               boolean convertible, int numAsientos, int torque, String tipoCamioneta, boolean dobleRodada) {
          super(precio, color, marca, modelo, año, kilometraje, estado, tipoCombus, tipoCambio, potencia,
                    numeroVelocidades, motor, puertas, quemacocos, estereo, aireCondi, traccion, convertible,
                    numAsientos, torque);
          this.tipoCamioneta = tipoCamioneta;
          this.dobleRodada = dobleRodada;
     }
     public String getTipoCamioneta() {
          return tipoCamioneta;
     }
     public void setTipoCamioneta(String tipoCamioneta) {
          this.tipoCamioneta = tipoCamioneta;
     }
     public boolean isDobleRodada() {
          return dobleRodada;
     }
     public void setDobleRodada(boolean dobleRodada) {
          this.dobleRodada = dobleRodada;
     }

   
   
     
}
