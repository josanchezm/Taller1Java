package Taller2;

import java.util.Scanner;

public class Ejercicio7 {
    // La Secretaría de Salud Municipal requiere de una aplicación que le permita calcular el IMC (Índice de masa corporal) y requiere los datos peso en kilogramos y estatura en metros Para cada persona encuestada adicional a los datos suministrados, debe mostrar el resultado para cada uno y establecer en qué rango se encuentra (bajo peso, normal, sobrepeso y obeso).
    public static double peso, estatura;
    
    public static void main(String[] args) {
        double IMC;
        Scanner inputPeso = new Scanner(System.in);
        Scanner inputEstatura = new Scanner(System.in);
        System.out.println("Bienvenido a la aplicacion de calculo de IMC");
        System.out.println("Ingrese su peso(kg)");
        peso = inputPeso.nextDouble();
        System.out.println("Ingrese su estatura(m)");
        estatura = inputEstatura.nextDouble();
        IMC = peso/Math.pow(estatura,2);
        System.out.println("Peso: "+peso+"\n"+"Estatura: "+estatura);
        if(IMC < 18.5) {
            System.out.println("Su IMC es de "+IMC+". Su nivel de peso es bajo");
        } else if(IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Su IMC es de "+IMC+". Su nivel de peso es normal");
        } else if(IMC >= 25 && IMC <= 29.9) {
            System.out.println("Su IMC es de "+IMC+". Usted presenta sobrepeso");
        } else if(IMC >= 30) {
            System.out.println("Su IMC es de "+IMC+". Usted presenta obesidad");
        }
    }
}
