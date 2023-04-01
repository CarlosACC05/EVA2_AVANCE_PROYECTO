package proyecto_poo;

import Personas.Cliente;
import Personas.Persona;
import Personas.Vendedor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class PROYECTO_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        // Creamos un arreglo de tipo Persona para guardar los clientes y vendedores
      ArrayList<Persona> personas = new ArrayList<Persona>();
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Desea registrarse como Cliente o Vendedor?");
        System.out.println("1. Cliente");
        System.out.println("2. Vendedor");

        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion == 1) {
            System.out.println("Ingrese su nombre:");
            String nombre = sc.nextLine();
            System.out.println("Ingrese su apellido:");
            String apellido = sc.nextLine();
            System.out.println("Ingrese su edad:");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese su correo electronico:");
            String correo = sc.nextLine();
            System.out.println("Ingrese su usuario:");
            String nombreUsuario = sc.nextLine();
            System.out.println("Ingrese su contraseña:");
            String contraseña = sc.nextLine();
            
            Cliente cliente = new Cliente(edad, nombre, apellido ,contraseña , nombreUsuario, correo);
            personas.add(cliente);

            System.out.println("¡Registro completado! Bienvenido, " + cliente.getNombre() + " (Cliente)");

        } else if (opcion == 2) {
            System.out.println("Ingrese su nombre:");
            String nombre = sc.nextLine();
            System.out.println("Ingrese su apellido:");
            String apellido = sc.nextLine();
            System.out.println("Ingrese su edad:");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese su correo electronico:");
            String correo = sc.nextLine();
            System.out.println("Ingrese el nombre de su negocio:");
            String negocio = sc.nextLine();
            System.out.println("Ingrese su clave de vendedor:");
            String claveVendedor = sc.nextLine();
            System.out.println("Ingrese su contraseña:");
            String contrasena = sc.nextLine();

            Vendedor vendedor = new Vendedor(edad ,nombre, apellido, contrasena , claveVendedor, negocio, correo);
            personas.add(vendedor);

            System.out.println("¡Registro completado! Bienvenido, " + vendedor.getNombre() + " (Vendedor)");

        } else {
            System.out.println("Opción inválida");
        }

        // Verificar si el usuario ya está registrado
        System.out.println("Ingrese su nombre de usuario o clave de vendedor:");
        String nombreUsuario = sc.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contrasena = sc.nextLine();

        Persona usuarioEncontrado = null;
        for (Persona persona : personas) {
            if (persona != null && persona.getNombre().equals(nombreUsuario) && persona.getContraseña().equals(contrasena)) {
                usuarioEncontrado = persona;
                break;
            }
        }

        if (usuarioEncontrado == null) {
            System.out.println("Usuario o contraseña incorrectos");
        } else if (usuarioEncontrado instanceof Cliente) {
            // Si el usuario es un cliente existente, lo saludamos
            System.out.println("¡Bienvenido, " + usuarioEncontrado.getNombre() + " (Cliente)!");
        } else if (usuarioEncontrado instanceof Vendedor) {
            // Si el usuario es un vendedor existente, lo saludamos
            System.out.println("¡Bienvenido, " + usuarioEncontrado.getNombre() + " (Vendedor)!");
        }

        sc.close();
    
        
    }
    
}


