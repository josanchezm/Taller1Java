package Taller3;

public class Ejercicio2 {
    public static int fila = 1, columna, i = 10;
    
    public static void main(String[] args) {
        while(fila<=10) {
           columna = 1;
           while (columna<=10) {
               if(columna == i) {
                   System.out.print("*");
                   i -= 1;
               } else {
                   if(columna>i) {
                       System.out.print("*");
                   } else {
                       System.out.print(" ");
                   }
               }
               columna += 1;
           }
            System.out.println("");
            fila += 1;
        }
    }
}
