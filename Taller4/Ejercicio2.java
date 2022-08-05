package Taller4;

public class Ejercicio2 {
   // Crear un arreglo de números enteros de 20 posiciones, el cual, debe ser llenado con números aleatorios entre 1 y 100; después de haber llenado dicho arreglo, se debe volver a recorrer utilizando un ciclo diferente al que se usó para llenarse e imprimir los números pares e impares.
    
    public static int numero;
    protected static int[] arr = new int[20];
    public static void main(String[] args) {
        int max = 100, min = 1, range = max - min + 1;
        for(int i=0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * range) + min;
            System.out.println("["+i+"]"+" = "+arr[i]);
        }
        System.out.print("Pares: ");
        for(int i=0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.println("");
        System.out.print("Impares: ");
        for(int i=0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                System.out.print(arr[i]+ " ");
            }
        }    
    }
}
