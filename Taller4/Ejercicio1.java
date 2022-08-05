package Taller4;

import java.util.Scanner;

public class Ejercicio1 {
    // Crear un vector de tipo Entero con 5 posiciones, llenarlo con información solicitada al usuario. Después de recoger toda la información, se requiere imprimir el índice de cada posición en el arreglo con su valor de la siguiente manera:
    
    public static int[] arr = new int[5];
    public static int numero;
    public static void main(String[] args) {
        Scanner numeroUsuario = new Scanner(System.in);
        for(int i=0;i<arr.length;i++) {
            System.out.println("Ingrese el numero "+(i+1)+":");
            numero = numeroUsuario.nextInt();
            arr[i] = numero;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println("["+i+"]"+" = "+arr[i]);
        }
    }
}
