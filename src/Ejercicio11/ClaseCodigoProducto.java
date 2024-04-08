package Ejercicio11;
import java.util.Scanner;
import java.util.ArrayList;

public class ClaseCodigoProducto {
    // ArrayList para almacenar los productos
    public static ArrayList<String> productos = new ArrayList<>();
    // Contador global para el identificador
    public static int contador = 1;

    public static String generaCodigo(String descripcion, String categoria) {
        // Permite generar un código único para cada producto basado en la descripción del producto y la categoria
        String codigo = "";
        if (descripcion != null && categoria != null && !descripcion.isEmpty() && !categoria.isEmpty()) {
            codigo += descripcion.trim().charAt(0);
            codigo = codigo.toUpperCase() + "-"+ categoria.trim().toUpperCase().charAt(0)+"-"+ contador;  // Añadir el contador al código
            contador++;  // Incrementar el contador global
        }
        return codigo;
    }

    public static void metodoPrincipal() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese la descripción del producto: ");
            String descripcion = sc.nextLine();
            System.out.println("Ingrese la categoría del producto: ");
            String categoria = sc.nextLine();

            // Generar y almacenar el código único
            String codigo = generaCodigo(descripcion, categoria);
            productos.add(codigo);

            // Mostrar el código generado
            System.out.println("Código generado para el producto: " + codigo);

            System.out.println("¿Desea ingresar otro producto? (s/n)");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                System.out.println("Códigos de los productos ingresados: ");
                for (String producto : productos) {
                    System.out.println(producto);
                }
                break;
            }
        } while (true);

        sc.close();
    }

}

