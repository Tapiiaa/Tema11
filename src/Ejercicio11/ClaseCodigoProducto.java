package Ejercicio11;
import java.util.Scanner;
import java.util.ArrayList;
public class ClaseCodigoProducto {
//ArrayList para almacenar los productos
    public static ArrayList<String> productos = new ArrayList<>();
    public static String generaCodigo(String descripcion, String categoria) {
        //Permite generar un código único para cada producto basado en la descripción del producto y la categoria
        String codigo = "";
        if (descripcion != null && categoria != null && !descripcion.isEmpty() && !categoria.isEmpty()) {
            String[] palabras = descripcion.split(" ");
            for (String palabra : palabras) {
                if (!palabra.isEmpty()) {
                    codigo += palabra.charAt(0);
                }
            }
            codigo = codigo.toUpperCase();
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
            String codigo = ClaseCodigoProducto.generaCodigo(descripcion, categoria);
            //Se genera un código para el producto desde 1 hasta 999

            System.out.println("El código del producto es: " + codigo);
            //Recorrer un for para añadir un codigo que vaya aumentandose en 1 para cada producto





        }
        while (true);

    }

}


