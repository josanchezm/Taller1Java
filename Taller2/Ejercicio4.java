package Taller2;

import java.util.Scanner;

public class Ejercicio4 {
    // La video tienda que presta sus servicios de alquiler de películas a los usuarios del barrio el Porvenir, requiere de una aplicación que permita registrar el alquiler de las películas que adquieren sus usuarios. Para cada usuario se debe permitir la opción de alquilar película, consultar películas disponibles y recibir película en la video tienda con la opción de realizar anotaciones sobre estas si se llegan a presentar daños u otra novedad sobre la película.
    protected static int opcion, reporte;
    public static String pelicula, estadoPelicula;
    private static boolean novedades;
    
    public static void main(String[] args) {
        String[] peliculas = new String[3];
        peliculas[0] = "Jurassic Park";
        peliculas[1] = "El Aro";
        peliculas[2] = "Tiburon";
        
        Scanner opcionUsuario = new Scanner(System.in);
        Scanner opcionPelicula = new Scanner(System.in);
        Scanner reportePelicula = new Scanner(System.in);
        Scanner inputEstadoPelicula = new Scanner(System.in);
        
        
        System.out.println("Bienvenido a la video tienda");
        System.out.println("Elija alguna de las opciones");
        System.out.println("1. Alquilar pelicula");
        System.out.println("2. Consultar peliculas disponibles");
        System.out.println("3. Recibir pelicula en la video tienda");
        opcion = opcionUsuario.nextInt();
        
        if(opcion == 1) {
            System.out.println("Cual pelicula desea alquilar?");
            pelicula = opcionPelicula.nextLine();
            if (peliculas[0].equals(pelicula) || peliculas[1].equals(pelicula) || peliculas[2].equals(pelicula)) {
                System.out.println("Ha alquilado la pelicula "+pelicula+" satisfactoriamente");
            } else {
                System.out.println("La pelicula que intenta alquilar no esta disponible, por favor consulte de nuevo la segunda opcion");
            }
        } else if (opcion == 2) {
            System.out.println("Peliculas disponibles: ");
            for(int i = 0; i < peliculas.length; i++) {
                System.out.println(peliculas[i]);
            }
        } else if (opcion == 3) {
            System.out.println("Usted recibira la pelicula que desee en la video tienda");
            System.out.println("Si necesita reportar alguna novedad acerca de la pelicula, digite 1, de lo contrario, digite 0");
            reporte = reportePelicula.nextInt();
            if (reporte == 1) {
                novedades = true;
            } else {
                novedades = false;
            }
            if (novedades) {
                System.out.println("Por favor indique sus observaciones acerca de la pelicula");
                estadoPelicula = inputEstadoPelicula.nextLine();
                System.out.println("Gracias por su colaboracion, tendremos en cuenta sus comentarios para mejorar nuestro servicio");
            } else {
                System.out.println("Gracias por su compra, vuelva pronto");
            }
        } else {
            System.out.println("La opcion elegida no existe"); 
        }
    }
}
