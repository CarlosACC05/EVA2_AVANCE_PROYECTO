package Personas;

public class Vendedor extends Persona{
    private String claveVendedor;
    private String negocio;

   

    public Vendedor() {
        super();
        this.claveVendedor = "--------";
        this.negocio = "--------";
    }

    public Vendedor(int edad, String nombre, String apellido, String contraseña, String claveVendedor, String negocio, String correo) {
        super(edad, nombre, apellido, contraseña,correo);
        this.claveVendedor = claveVendedor;
        this.negocio = negocio;
    }

    // getter y setter para el atributo
    public String getClaveVendedor() {
        return claveVendedor;
    }

    public void setClaveVendedor(String claveVendedor) {
        this.claveVendedor = claveVendedor;
    }

    public String getNegocio() {
        return negocio;
    }

    public void setNegocio(String negocio) {
        this.negocio = negocio;
    }
    
}
