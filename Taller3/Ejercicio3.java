package Taller3;

public class Ejercicio3 {
    public static int contador = 0, espacios = 12, cEspacios = 1;
    public static String signo = "*", tab = "";
    
    public static void main(String[] args) {
        System.out.println("             *");
        for(int i = 1; i <= 12; i++) {
            while(contador <= i) {
                signo += "*";
                contador += 1;
            }
            while(cEspacios <= espacios) {
                tab += " ";
                cEspacios += 1;
            }
            System.out.println(tab+signo);
            contador -= 1;
            espacios -= 1;
            cEspacios = 1;
            tab = "";
        }
        System.out.println("            ***"); 
        System.out.println("            ***");
        System.out.println("           *****");
        System.out.println("          *******");
    }
}
