package Taller4;

public class Ejercicio4 {
   public static int fila, columna, numero = 0, numero2 = 1, numero3 = 11, numero4 = 16;
   public static String[][]matriz = new String[4][5], numeroString, numeroString2;
   public static String[][]matriz2 = new String[4][5];
   
    public static void main(String[] args) {
        // Asignacion de valores a la matriz dada:
        
        for(int i = 0; i < 5; i++) {
            String numeroString = Integer.toString(numero);
            String numeroString2 = Integer.toString(numero2);
            matriz[0][i] = numeroString+numeroString2;
            numero2++;
        }
        for(int i = 0; i < 5; i++) {
            String numeroString = Integer.toString(numero);
            String numeroString2 = Integer.toString(numero2);
            if(i < 4) {
                matriz[1][i] = numeroString+numeroString2;
            } else {
                matriz[1][i] = "10";
            }
            numero2++;
        }
        for(int i = 0; i < 5; i++) {
            matriz[2][i] = Integer.toString(numero3);
            numero3++;
        }  
        for(int i = 0; i < 5; i++) {
            matriz[3][i] = Integer.toString(numero4);
            numero4++;
        }
        
        // Construccion de la matriz dada:
        
        System.out.println("Matriz dada:");
        
        for(fila = 0; fila < 4; fila++) {
            for(columna = 0; columna < 5; columna++) {
                System.out.print(matriz[fila][columna]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        // Construccion matriz planteada a partir de la dada:
        
        System.out.println("Matriz Construida");
        
        for(fila = 0; fila < 1; fila++) {
            for(columna = 0; columna < 5; columna++) {
                matriz2[fila][columna] = matriz[fila][columna];
                System.out.print(matriz2[fila][columna]+" ");
            }
            System.out.println("");
        }
        for(fila = 1; fila < 2; fila++) {
            for(columna = 4; columna > -1; columna--) {
                matriz2[fila][columna] = matriz[fila][columna];
                System.out.print(matriz2[fila][columna]+" ");
            }
            System.out.println("");
        }
        for(fila = 2; fila < 3; fila++) {
            for(columna = 0; columna < 5; columna++) {
                matriz2[fila][columna] = matriz[fila][columna];
                System.out.print(matriz2[fila][columna]+" ");
            }
            System.out.println("");
        }
        for(fila = 3; fila < 4; fila++) {
            for(columna = 4; columna > -1; columna--) {
                matriz2[fila][columna] = matriz[fila][columna];
                System.out.print(matriz2[fila][columna]+" ");
            }
            System.out.println("");
        }
    }
}

