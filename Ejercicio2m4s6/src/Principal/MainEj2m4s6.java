package Principal;

import java.util.Scanner;
import PersonaEjer2m4s6.Persona2m4s6;

public class MainEj2m4s6 {

    public static void main(String[] args) {

        // Creamos la instancia y la guardamos en un arreglo
        Persona2m4s6[] personas = new Persona2m4s6[5];

        personas[0] = new Persona2m4s6("Marciano", "04031652");
        personas[1] = new Persona2m4s6("Lobo", "Lobo123");
        personas[2] = new Persona2m4s6("Chamelo", "mama");
        personas[3] = new Persona2m4s6("Torcuato", "admin85");
        personas[4] = new Persona2m4s6("Alejo", "123456");

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el Usuario: ");
        String usuarioIngresado = scan.nextLine();

        System.out.print("Ingrese el Password: ");
        String passwordIngresado = scan.nextLine();

        // Verificamos si el usuario y contraseña coinciden
        boolean accesoPermitido = false;

        // Verificamos si los datos ingresados coinciden
        for (Persona2m4s6 persona : personas) {
            if (persona.getUsuario().equals(usuarioIngresado) && persona.getPaswword().equals(passwordIngresado)) {
                accesoPermitido = true;
                break;
            }
        }

        // Si los datos son correctos, mostramos el menú
        if (accesoPermitido) {
            System.out.println("Acceso permitido. Bienvenido al menú: ");
            mostrarMenu(scan);
        } else {
            System.out.println("Acceso denegado. Usuario o contraseña incorrectos");
        }
    }

    // Función para mostrar el menú
    public static void mostrarMenu(Scanner scan) {
        int opcion;

        do {
            System.out.println("\nSeleccione una opción: ");
            System.out.println("1. Calcular la raíz cuadrada de un número ");
            System.out.println("2. Ver el valor de PI ");
            System.out.println("3. Calcular la potencia de un número");
            System.out.println("4. Salir");

            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un número para calcular la raíz cuadrada:");
                    double numero = scan.nextDouble();
                    System.out.println("La raíz cuadrada de " + numero + " es: " + Math.sqrt(numero));
                    break;

                case 2:
                    System.out.println("El valor de Pi es: " + Math.PI);
                    break;

                case 3:
                    // Aquí completamos la opción 3 para calcular la potencia
                    System.out.println("Ingrese la base: ");
                    double base = scan.nextDouble();
                    System.out.println("Ingrese el exponente: ");
                    double exponente = scan.nextDouble();
                    System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + Math.pow(base, exponente));
                    break;

                case 4:
                    System.out.println("Saliendo del menú...");
                    break;

                default:
                    System.out.println("Opción no válida, por favor, intente de nuevo.");
            }

        } while (opcion != 4);
    }
}
