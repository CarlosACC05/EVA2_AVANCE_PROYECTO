package Personas;

public class Cliente extends Persona {
    private String nombreUsuario;

    

    public Cliente() {
        super();
        this.nombreUsuario = "--------";
    }

    public Cliente(int edad, String nombre, String apellido, String contraseña, String nombreUsuario, String correo) {
        super(edad, nombre, apellido, contraseña,correo);
        this.nombreUsuario = nombreUsuario;
    }

    // getter y setter para el atributo
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
