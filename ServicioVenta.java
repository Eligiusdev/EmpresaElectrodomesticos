package EmpresaElectrodomesticos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Contiene la lógica para gestionar artículos en el sistema de ventas.
 */
public class ServicioVenta {
    private static ArrayList<Articulo> articulos = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    /**
     * Registra un nuevo artículo.
     */
    public static void ingresarArticulo() {
        System.out.println("\n--- Ingreso de Artículo ---");
        String ref = Validacion.leerTexto("Referencia: ");
        String marca = Validacion.leerTexto("Marca: ");
        double precio = Validacion.leerDouble("Precio: $");
        int cantidad = Validacion.leerEntero("Cantidad: ");
        String nombre = Validacion.leerTexto("Nombre Usuario: ");
        String cedula = Validacion.leerTexto("Cédula Usuario: ");

        articulos.add(new Articulo(ref, marca, precio, cantidad, nombre, cedula));
        System.out.println("Artículo registrado exitosamente.\n");
    }

    /**
     * Realiza una venta, aplicando descuento si el total supera la venta promedio.
     */
    public static void venderArticulo() {
        System.out.println("\n--- Venta de Artículo ---");
        String ref = Validacion.leerTexto("Referencia del artículo: ");
        double ventaPromedio = Validacion.leerDouble("Venta promedio esperada: $");

        for (Articulo a : articulos) {
            if (a.getReferencia().equalsIgnoreCase(ref)) {
                int cantidadVenta = Validacion.leerEntero("Cantidad a vender: ");
                if (cantidadVenta > a.getCantidad()) {
                    System.out.println("No hay suficiente stock.\n");
                    return;
                }
                double total = a.getPrecio() * cantidadVenta;
                if (total > ventaPromedio) {
                    total *= 0.9;
                    System.out.println("Descuento aplicado del 10%.");
                }
                a.setCantidad(a.getCantidad() - cantidadVenta);
                System.out.printf("Venta realizada. Total: $%.2f\n\n", total);
                return;
            }
        }
        System.out.println("Artículo no encontrado.\n");
    }

    /**
     * Modifica el precio de un artículo. Si supera la venta promedio, aplica descuento.
     */
    public static void modificarArticulo() {
        System.out.println("\n--- Modificar Artículo ---");
        String ref = Validacion.leerTexto("Referencia del artículo: ");
        double ventaPromedio = Validacion.leerDouble("Venta promedio esperada: $");

        for (Articulo a : articulos) {
            if (a.getReferencia().equalsIgnoreCase(ref)) {
                double nuevoPrecio = Validacion.leerDouble("Nuevo precio: $");
                if (nuevoPrecio > ventaPromedio) {
                    nuevoPrecio *= 0.9;
                    System.out.println("Descuento aplicado automáticamente.\n");
                }
                a.setPrecio(nuevoPrecio);
                System.out.println("Artículo actualizado exitosamente.\n");
                return;
            }
        }
        System.out.println("Artículo no encontrado.\n");
    }

    /**
     * Elimina un artículo por referencia.
     */
    public static void eliminarArticulo() {
        System.out.println("\n--- Eliminar Artículo ---");
        String ref = Validacion.leerTexto("Referencia del artículo a eliminar: ");
        Iterator<Articulo> it = articulos.iterator();
        while (it.hasNext()) {
            if (it.next().getReferencia().equalsIgnoreCase(ref)) {
                it.remove();
                System.out.println("Artículo eliminado.\n");
                return;
            }
        }
        System.out.println("Artículo no encontrado.\n");
    }

    /**
     * Lista todos los artículos.
     */
    public static void listarArticulos() {
        System.out.println("\n--- Lista de Artículos ---");
        if (articulos.isEmpty()) {
            System.out.println("No hay artículos registrados.\n");
            return;
        }
        for (Articulo a : articulos) {
            System.out.println(a);
        }
        System.out.println();
    }
}