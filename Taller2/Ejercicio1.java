package Taller2;

import java.util.Scanner;

public class Ejercicio1 {
    // Realizar un programa en el cual se solicite la edad de una persona. Si la persona es mayor o igual a 18 años, deberá mostrar en pantalla: Usted es mayor de edad.
    private static int edad;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();
        if(edad >= 18) {
            System.out.println("Usted es mayor de edad");
        } else if(edad < 0) {
            System.out.println("Debe ingresar una edad valida");
        }
    }
}
