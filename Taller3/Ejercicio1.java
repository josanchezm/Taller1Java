package Taller3;

public class Ejercicio1 {
    public static String figura = "*";
    
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(figura);
            figura += "*";
        }
    }
}
