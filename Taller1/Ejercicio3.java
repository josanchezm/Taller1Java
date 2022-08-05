package Taller1;

import java.util.Scanner;

public class Ejercicio3 {
    // Realizar un programa el cual solicite su nombre y apellidos, también debe capturar nombre y apellidos de su padre y madre. Al finalizar debe imprimir en pantalla el siguiente mensaje "Yo [Nombre Completo], soy hijo de [Nombre de la Madre] y [Nombre del Padre].
    public static String nombres, nombresPadre, nombresMadre;
    
    public static void main(String[] args) {
        Scanner inputNombres = new Scanner(System.in);
        Scanner inputNombresPadre = new Scanner(System.in);
        Scanner inputNombresMadre = new Scanner(System.in);
        
        System.out.println("Ingrese sus nombres y apellidos: ");
        nombres = inputNombres.nextLine();
        System.out.println("Ingrese los nombres y apellidos de su padre: ");
        nombresPadre = inputNombresPadre.nextLine();
        System.out.println("Ingrese los nombres y apellidos de su madre: ");
        nombresMadre = inputNombresMadre.nextLine();
        System.out.println("Yo "+nombres+", soy hijo de "+nombresMadre+" y "+nombresPadre);
    }    
}
