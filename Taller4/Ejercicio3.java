package Taller4;

public class Ejercicio3 {
    public static int x, contador, control = 0, limite = 10000, numerosPrimos[] = new int[limite/4];
    public static void main(String[] args) {
        System.out.print("Numeros primos del 1 al "+limite+": ");
        for(int i = 1; i <= limite; i++) {
           x = 1;
           contador = 0;
           while(x<=i) {
               if(i % x == 0) {
                   contador ++;
               }
               x++;
           }
           if(contador == 2) {
               numerosPrimos[control] = i;
               System.out.print(numerosPrimos[control]+ " ");
               control++;
           }
        }
    }
}
