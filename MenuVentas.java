package EmpresaElectrodomesticos;

import java.util.Scanner;

/**
 * Menú principal para gestionar el sistema de ventas de electrodomésticos.
 */
public class MenuVentas {
    public static void main(String[] args) {
         try (Scanner pv = new Scanner(System.in)) {
            int opcion;

            do {
                System.out.println("\n--- Menú Ventas ---");
                System.out.println("[1] Ingresar Artículo");
                System.out.println("[2] Vender Artículo");
                System.out.println("[3] Modificar Artículo");
                System.out.println("[4] Eliminar Artículo");
                System.out.println("[5] Listar Todos los Artículos");
                System.out.println("[0] Salir");
                opcion = Integer.parseInt(pv.nextLine());

                switch (opcion) {
                    case 1 -> ServicioVenta.ingresarArticulo();
                    case 2 -> ServicioVenta.venderArticulo();
                    case 3 -> ServicioVenta.modificarArticulo();
                    case 4 -> ServicioVenta.eliminarArticulo();
                    case 5 -> ServicioVenta.listarArticulos();
                    case 0 -> System.out.println("Saliendo del sistema de ventas...");
                    default -> System.out.println("Opción inválida.");
                }
            } while (opcion != 0);
         } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
    }
}