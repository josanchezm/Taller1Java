package Taller2;

import java.util.Scanner;

public class Ejercicio2 {
    // Realizar un programa en el cual se solicite la edad de una persona. Si la persona es menor a 18 años, deberá mostrar en pantalla: Usted aún es un niño(a).
    protected static int edad;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();
        if(edad < 18 && edad >=0) {
            System.out.println("Usted aún es un niño(a)");
        } else if(edad < 0) {
            System.out.println("Debe ingresar una edad valida");
        }
    }
}
