package Taller3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner inputOpcion = new Scanner(System.in);
        Scanner inputNombre = new Scanner(System.in);
        boolean control = true; 
        int opcion;
        String nombre = "";
        
        do {
            System.out.println("Menu de usario");
            System.out.println("1. Captura de nombre");
            System.out.println("2. Saludar persona");
            System.out.println("3. Salir del sistema");
            opcion = inputOpcion.nextInt();
            switch(opcion) {
            case 1:
                System.out.println("Ingrese su nombre:");
                nombre = inputNombre.nextLine();
                break;
            case 2:
                if(nombre == "") {
                    System.out.println("Debe capturar su nombre en primer lugar para saludarlo");
                } else {
                    System.out.println("Saludos, "+nombre+"!");
                }
                break;
            case 3:
                control = false;
                break;
            default:
                System.out.println("La opcion elegida no existe");
                break;
            }     
        } while (control == true);
    }
}
