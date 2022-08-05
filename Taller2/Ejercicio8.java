package Taller2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ejercicio8 {
    public static String sabor, decoraciones, fecha, tortasDisponibles;
    public static int porciones, opcion;
    public static boolean control = true;
   
    public static void main(String[] args) {
        Deque<Object> dqPedidos = new ArrayDeque<Object>();
        Deque<String> dqTortasDisponibles = new ArrayDeque<String>();
        System.out.println("Bienvenido a la pasteleria");
        
        while(control == true) {
            Scanner inputOpcion = new Scanner(System.in);
            Scanner inputSaborTorta = new Scanner(System.in);
            Scanner inputPorcionesTorta = new Scanner(System.in);
            Scanner inputDecoracionesTorta = new Scanner(System.in);
            Scanner inputFechaTorta = new Scanner(System.in);
            Scanner inputTortasDisponibles = new Scanner(System.in);
            
            System.out.println("Escoja una opcion: ");
            System.out.println("1. Registrar un pedido");
            System.out.println("2. Registrar las tortas disponibles");
            System.out.println("3. Registro de las ventas diarias");
            System.out.println("4. Salir del programa");
            opcion = inputOpcion.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("Ingrese el sabor de la torta");
                    sabor = inputSaborTorta.nextLine();
                    System.out.println("Ingrese las porciones de la torta");
                    porciones = inputPorcionesTorta.nextInt();
                    System.out.println("Ingrese las decoraciones de la torta ");
                    decoraciones = inputDecoracionesTorta.nextLine();
                    System.out.println("Ingrese la fecha del pedido");
                    fecha = inputFechaTorta.nextLine();
                    System.out.println("La torta se ha registrado");
                    Torta torta = new Torta(sabor,decoraciones,fecha,porciones);
                    dqPedidos.add(torta);
                    break;
                case 2:
                    System.out.println("Ingrese las tortas disponibles, separadas por coma");
                    tortasDisponibles = inputTortasDisponibles.nextLine();
                    dqTortasDisponibles.add(tortasDisponibles);
                    System.out.println("Registro de tortas disponibles actualizado: ");
                    for (String n : dqTortasDisponibles) {
                        System.out.println(n);
                    }
                    break;
                case 3:
                    System.out.println("Registro de tortas vendidas");
                    for (Object n : dqPedidos) {
                        System.out.println(n);
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

class Torta {
    private String sabor;
    private String decoraciones;
    private String fecha;
    private int porciones;

    public Torta(String sabor, String decoraciones, String fecha, int porciones) {
        this.sabor = sabor;
        this.decoraciones = decoraciones;
        this.fecha = fecha;
        this.porciones = porciones;
    }
    @Override
    public String toString() {
        return "Sabor: "+sabor+" Decoraciones: "+decoraciones+" Fecha: "+fecha+" Porciones: "+porciones;
    }
    
    /**
     * @return the sabor
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @param sabor the sabor to set
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    /**
     * @return the decoraciones
     */
    public String getDecoraciones() {
        return decoraciones;
    }

    /**
     * @param decoraciones the decoraciones to set
     */
    public void setDecoraciones(String decoraciones) {
        this.decoraciones = decoraciones;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the porciones
     */
    public int getPorciones() {
        return porciones;
    }

    /**
     * @param porciones the porciones to set
     */
    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }
}
