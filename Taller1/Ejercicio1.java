/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Taller1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {
    // Realizar un programa el cual solicite su nombre y apellidos.
    public static String nombres, apellidos;

    public static void main(String[] args) {
        Scanner inputNombres = new Scanner(System.in);
        Scanner inputApellidos = new Scanner(System.in);
        System.out.println("Ingrese sus nombres: ");
        nombres = inputNombres.nextLine();
        System.out.println("Ingrese sus apellidos: ");
        apellidos = inputApellidos.nextLine();
        System.out.println("Su nombre es: "+nombres+" "+apellidos);
    }
}
