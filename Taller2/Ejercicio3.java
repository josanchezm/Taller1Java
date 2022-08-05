package Taller2;

import java.util.Scanner;

public class Ejercicio3 {
    // Realizar un programa en el cual se solicite el nombre, apellidos y edad de la persona. Si la persona es mayor o igual a 18 años, entonces se deberá imprimir en pantalla [Nombre completo] usted es mayor de edad, por lo tanto puede entrar a la fiesta. Si la edad de la persona es menor que 18 años, entonces, deberá imprimirse el siguiente mensaje: [Nombre completo] usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.
    
    public static void main(String[] args) {
        String nombres;
        int edad;
        Scanner inputNombres = new Scanner(System.in);
        Scanner inputEdad = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo: ");
        nombres = inputNombres.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = inputEdad.nextInt();
        
        if(edad >= 18) {
            System.out.println(nombres+" usted es mayor de edad, por lo tanto puede entrar a la fiesta");
        } else if(edad < 18 && edad >= 0) {
            System.out.println(nombres+ " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa");
        } else {
            System.out.println("Debe ingresar una edad valida");
        }
    }
}
