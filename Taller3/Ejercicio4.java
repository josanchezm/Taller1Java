package Taller3;

import java.util.Scanner;

public class Ejercicio4 {
    public static double numero, producto;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el numero del cual desea ver la tabla de multiplicar: ");
        numero = input.nextDouble();
        
        for(int i = 1; i <= 10; i++) {
            producto = numero * i;
            System.out.println(i+" X "+numero+" = "+producto);
        }
    }
}
