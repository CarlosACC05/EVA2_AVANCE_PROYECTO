package Personas;

public abstract class Persona {
    private int edad;
    private String nombre;
    private String apellido;
    private String contraseña;
    private String correo;

    public Persona() {
        this.edad = 0;
        this.nombre = "-------";
        this.apellido = "-------";
        this.contraseña = "-------";
        this.correo = "-------";
    }

    public Persona(int edad, String nombre, String apellido, String contraseña, String correo) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
