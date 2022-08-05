package Taller1;

import java.util.Scanner;

public class Ejercicio5 {
    // Realizar un programa el cual solicite el nombre de su mascota, edad de la mascota, el tipo de mascota y su nombre completo. Al finalizar el sistema debe e imprimir en pantalla el siguiente mensaje: [Nombre de Mascota] es un(a) [Tipo de Mascota], el cual, tiene [Edad de la Mascota] años de edad y [Nombre Completo] es actualmente su dueño(a).
    public static void main(String[] args) {
        String mascota, tipoMascota, nombre;
        int edadMascota;
        Scanner inputMascota = new Scanner(System.in);
        Scanner inputTipoMascota = new Scanner(System.in);
        Scanner inputEdadMascota = new Scanner(System.in);
        Scanner inputNombre = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su mascota: ");
        mascota = inputMascota.nextLine();
        System.out.println("Ingrese la edad de su mascota: ");
        edadMascota = inputEdadMascota.nextInt();
        System.out.println("Ingrese el tipo de la mascota: ");
        tipoMascota = inputTipoMascota.nextLine();
        System.out.println("Ingrese su nombre completo");
        nombre = inputNombre.nextLine();
        System.out.println(mascota+" es un(a) "+tipoMascota+", el cual, tiene "+edadMascota+" años de edad y "+nombre+" es actualmente su dueño(a)");
    }
}
