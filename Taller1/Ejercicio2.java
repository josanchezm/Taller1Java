package Taller1;

import java.util.Scanner;

public class Ejercicio2 {
    // Realizar un programa el cual solicite su nombre, apellidos, edad y estatura.
    public static String nombres, apellidos;
    public static int edad;
    public static double estatura;
    
    public static void main(String[] args) {
        Scanner inputNombres = new Scanner(System.in);
        Scanner inputApellidos = new Scanner(System.in);
        Scanner inputEdad = new Scanner(System.in);
        Scanner inputEstatura = new Scanner(System.in);
        System.out.println("Ingrese sus nombres: ");
        nombres = inputNombres.nextLine();
        System.out.println("Ingrese sus apellidos: ");
        apellidos = inputApellidos.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = inputEdad.nextInt();
        System.out.println("Ingrese su estatura: ");
        estatura = inputEstatura.nextDouble();
        System.out.println("Nombre: "+nombres+"\n"+"Apellidos: "+apellidos+"\n"+"Edad: "+edad+"\n"+"Estatura: "+estatura+"\n");
    }   
}
