package EmpresaElectrodomesticos;

import java.util.Scanner;

/**
 * Clase utilitaria para validar entradas del usuario.
 */
public class Validacion {
    private static final Scanner sc = new Scanner(System.in);

    /**
     * Lee un número entero con validación.
     */
    public static int leerEntero(String mensaje) {
        int valor;
        while (true) {
            try {
                System.out.print(mensaje);
                valor = Integer.parseInt(sc.nextLine());
                if (valor < 0) {
                    System.out.println("El número debe ser positivo.");
                    continue;
                }
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Debe ser un número entero.");
            }
        }
    }

    /**
     * Lee un número decimal (double) con validación.
     */
    public static double leerDouble(String mensaje) {
        double valor;
        while (true) {
            try {
                System.out.print(mensaje);
                valor = Double.parseDouble(sc.nextLine());
                if (valor < 0) {
                    System.out.println("El número debe ser positivo.");
                    continue;
                }
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Debe ser un número decimal.");
            }
        }
    }

    /**
     * Lee una cadena de texto, validando que no esté vacía.
     */
    public static String leerTexto(String mensaje) {
        String texto;
        do {
            System.out.print(mensaje);
            texto = sc.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.println("Este campo no puede estar vacío.");
            }
        } while (texto.isEmpty());
        return texto;
    }
}

