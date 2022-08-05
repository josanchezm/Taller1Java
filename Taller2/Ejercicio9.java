package Taller2;

import java.util.Scanner;

public class Ejercicio9 {
    // El profesor de geometría está explicando a sus estudiantes las fórmulas para calcular el área de diferentes figuras geométricas, para ello requiere una aplicación que le facilite el ejercicio solicitándole los valores al estudiante. La aplicación debe permitir que el estudiante seleccione si desea calcular el área de un rectángulo, triángulo o trapecio. No olvide solicitar los datos necesarios para realizar cada cálculo y mostrar su respectivo resultado.
    public static double areaRectangulo, areaTriangulo, areaTrapecio, baseRectangulo, alturaRectangulo, baseTriangulo, alturaTriangulo, baseMayorTrapecio, baseMenorTrapecio, alturaTrapecio;
    public static int opcion;
    public static String unidad;
    public static boolean control = true;
    
    public static void main(String[] args) {
        Scanner inputOpcion = new Scanner(System.in);
        Scanner inputBaseRectangulo = new Scanner(System.in);
        Scanner inputAlturaRectangulo = new Scanner(System.in);
        Scanner inputMedida = new Scanner(System.in);
        Scanner inputBaseTriangulo = new Scanner(System.in);
        Scanner inputAlturaTriangulo = new Scanner(System.in);
        Scanner inputBaseMayTrapecio = new Scanner(System.in);
        Scanner inputBaseMenTrapecio = new Scanner(System.in);
        Scanner inputAlturaTrapecio = new Scanner(System.in);
        
        System.out.println("Bienvenido a la calculadora de figuras geometricas");
        
        while(control == true) {
            System.out.println("Elija una opcion");
            System.out.println("1. Calcular el area de un rectangulo");
            System.out.println("2. Calcular el area de un triangulo");
            System.out.println("3. Calcular el area de un trapecio");
            System.out.println("4. Salir del programa");
            opcion = inputOpcion.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("Ingrese la base del rectangulo:");
                    baseRectangulo = inputBaseRectangulo.nextDouble();
                    System.out.println("Ingrese la altura del rectangulo:");
                    alturaRectangulo = inputAlturaRectangulo.nextDouble();
                    System.out.println("Ingrese la unidad de medida:");
                    unidad = inputMedida.nextLine();
                    areaRectangulo = baseRectangulo * alturaRectangulo;
                    System.out.println("El area del rectangulo es: "+areaRectangulo+" "+unidad+"^2");
                    break;
                case 2:
                    System.out.println("Ingrese la base del triangulo:");
                    baseTriangulo = inputBaseTriangulo.nextDouble();
                    System.out.println("Ingrese la altura del triangulo:");
                    alturaTriangulo = inputAlturaTriangulo.nextDouble();
                    System.out.println("Ingrese la unidad de medida:");
                    unidad = inputMedida.nextLine();
                    areaTriangulo = baseTriangulo * alturaTriangulo/2;
                    System.out.println("El area del triangulo es: "+areaTriangulo+" "+unidad+"^2");
                    break;
                case 3:
                    System.out.println("Ingrese la base mayor del trapecio:");
                    baseMayorTrapecio = inputBaseMayTrapecio.nextDouble();
                    System.out.println("Ingrese la base menor del trapecio:");
                    baseMenorTrapecio = inputBaseMenTrapecio.nextDouble();
                    if (baseMayorTrapecio > baseMenorTrapecio) {
                        System.out.println("Ingrese la altura del trapecio:");
                        alturaTrapecio = inputAlturaTrapecio.nextDouble();
                        System.out.println("Ingrese la unidad de medida:");
                        unidad = inputMedida.nextLine();
                        areaTrapecio = (baseMayorTrapecio + baseMenorTrapecio) * alturaTrapecio/2;
                        System.out.println("El area del trapecio es: "+areaTrapecio+" "+unidad+"^2");
                    } else {
                        System.out.println("La base menor no puede ser mas grande que la mayor. Intentelo de nuevo");
                    }
                    break;
                case 4:
                    control = false;
                    break;
                default:
                    System.out.println("La opcion elegida no existe");
                    break;
            }
        }
    
    }
}
