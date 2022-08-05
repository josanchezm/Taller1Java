package Taller1;

import java.util.Scanner;

public class Ejercicio4 {
    // Realizar un programa el cual solicite el nombre de una ciudad capital y el país. Al finalizar debe imprimir en pantalla el siguiente mensaje "La ciudad [Nombre de la Ciudad], es la capital del país [Nombre del País]
    public static void main(String[] args) {
        String capital, pais;
        Scanner inputCapital = new Scanner(System.in);
        Scanner inputPais = new Scanner(System.in);
        System.out.println("Ingrese la ciudad capital: ");
        capital = inputCapital.nextLine();
        System.out.println("Ingrese el pais");
        pais = inputPais.nextLine();
        System.out.println("La ciudad "+capital+", es la capital del país "+pais); 
    }
}
