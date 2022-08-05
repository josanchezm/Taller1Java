package Taller2;

import java.util.Scanner;

public class Ejercicio5 {
    // La Droguería Mi Salud presta sus servicios en la localidad de Suba y requiere una aplicación para poder facturar los productos que vende a sus clientes y para ello, los productos tienen unas características que deben indicársele al cliente para que pueda escoger el producto a comprar. Para cada cliente, se tienen las opciones de compra de producto, consulta de precios por producto y devoluciones en caso de que se presenten.
    public static int opcion;
    public static String producto, devolucion;
    
    public static void main(String[] args) {
        String[] productos = new String[4];
        productos[0] = "Acetaminofen (Analgesico para el dolor en general)";
        productos[1] = "Jarabe de miel (Efectivo para los sintomas de la tos)";
        productos[2] = "Shampoo (Para cabellos grasos)";
        productos[3] = "Pedialyte (Para sintomas de deshidratacion)";
        
        Scanner inputOpcion = new Scanner(System.in);
        Scanner productoEscogido = new Scanner(System.in);
        Scanner productoDevuelto = new Scanner(System.in);
        
        System.out.println("Bienvenido a la Drogeria Mi Salud!");
        System.out.println("Elija una de las siguientes opciones");
        System.out.println("1. Escoger un producto");
        System.out.println("2. Consulta de precios");
        System.out.println("3. Devolucion de productos");
        opcion = inputOpcion.nextInt();
        
        switch(opcion) {
            case 1: 
                System.out.println("A continuacion, se enlistan los productos disponibles: ");
                for(int i = 0; i < productos.length; i++) {
                    System.out.println(productos[i]);
                }
                System.out.println("Elija el producto deseado: ");
                producto = productoEscogido.nextLine();
                if ("Acetaminofen".equals(producto) || "Jarabe de miel".equals(producto) || "Shampoo".equals(producto) || "Pedialyte".equals(producto)) {
                    System.out.println("Usted ha comprado el producto "+producto+". Vuelva pronto");
                } else {
                    System.out.println("El producto que ha escogido no se encuentra disponible. Revise la lista de productos");
                }
                break;
            case 2:
                System.out.println("A continuacion, se listan los precios de los productos: ");
                System.out.println("Acetaminofen: $200");
                System.out.println("Jarabe de Miel: $1000");
                System.out.println("Shampoo: $1200");
                System.out.println("Pedialyte: $1500");
                break;
            case 3:
                System.out.println("Indique el producto a deolver: ");
                devolucion = productoDevuelto.nextLine();
                if ("Acetaminofen".equals(devolucion) || "Jarabe de miel".equals(devolucion) || "Shampoo".equals(devolucion) || "Pedialyte".equals(devolucion)) {
                    System.out.println("Se ha procesado su solicitud para la devolucion de "+devolucion+". Si la razon de esta es valida, se hara efectiva");
                } else {
                    System.out.println("El producto que intenta devolver no existe");
                }
                break;
            default:
                System.out.println("La opcion elegida no existe");
                break;  
        }   
    } 
}
