package Taller2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ejercicio10 {
    // El banco "Su banco fiel" es un banco que inicia sus actividades financieras y necesita una aplicación para llevar las cuentas de sus usuarios; por lo tanto, se sugiere que la cuenta tenga los atributos titular y cantidad. Para cada cliente las cuentas permitirán realizar ingresos, retiros o consultas de valor. En los ingresos no se pueden insertar valores negativos y para los retiros el valor no puede ser mayor al valor que tiene en la cuenta.
    public static int opcion;
    public static String titular;
    public static double monto, ingresos = 0, egresos = 0;
    public static boolean control = true;
    
    public static void main(String[] args) {
        Scanner inputOpcion = new Scanner(System.in);
        Scanner inputTitular = new Scanner(System.in);
        Scanner inputMonto = new Scanner(System.in);
        Scanner inputIngresos = new Scanner(System.in);
        Scanner inputEgresos = new Scanner(System.in);
        Deque<Object> dqClientes = new ArrayDeque<>();
        
        System.out.println("Bienvenido a su banco fiel");
        System.out.println("Ingrese el nombre del titular de la cuenta:");
        titular = inputTitular.nextLine();
        System.out.println("Indique el monto que posee:");
        monto = inputMonto.nextDouble();
        
        while(control == true) {
            System.out.println("Elija una de las opciones");
            System.out.println("1. Realizar ingresos");
            System.out.println("2. Realizar retiros");
            System.out.println("3. Consultar movimientos");
            System.out.println("4. Registrar nuevo usuario");
            System.out.println("5. Salir del sistema");
            opcion = inputOpcion.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("Digite la cantidad a ingresar");
                    ingresos = inputIngresos.nextDouble();
                    if (ingresos > 0) {
                        monto += ingresos;
                        System.out.println("Ha ingresado $"+ingresos+" satisfactoriamente. Su nuevo monto es de $"+monto);
                    } else {
                        System.out.println("La cantidad a ingresar debe ser mayor a 0! Intenelo de nuevo");
                        ingresos = 0;
                    }
                    break;
                case 2:
                    System.out.println("Digite la cantidad a retirar:");
                    egresos = inputEgresos.nextDouble();
                    if(monto >= egresos) {
                        monto -= egresos;
                        System.out.println("Ha retirado $"+egresos+" satisfactoriamente. Su nuevo monto es de $"+monto);
                    } else {
                        System.out.println("La cantidad a retirar no puede ser superior al monto de la cuenta: $"+monto);
                        egresos = 0;
                    }
                    break;
                case 3:
                    if(dqClientes.isEmpty()) {
                        System.out.println("Al momento, no ha realizado movimientos. Titular: "+titular+" monto: $"+monto);
                    } else {
                        for (Object n : dqClientes) {
                            System.out.println(n);
                        }
                    }
                    break;
                case 4:
                    dqClientes.clear();
                    System.out.println("Ingrese el nombre del titular de la cuenta:");
                    titular = inputTitular.nextLine();
                    System.out.println("Indique el monto que posee:");
                    monto = inputMonto.nextDouble();
                    ingresos = 0;
                    egresos = 0;
                    break;
                case 5:
                    control = false;
                    break;
                default:
                    System.out.println("La opcion elegida no existe");
                    break;
            }
            Cliente cliente = new Cliente(titular,monto,ingresos,egresos);
            dqClientes.add(cliente);
        }
    }
}

class Cliente {
    private String titular; 
    private double monto;
    private double ingresos;
    private double egresos;

    public Cliente(String titular, double monto, double ingresos, double egresos) {
        this.titular = titular;
        this.monto = monto;
        this.ingresos = ingresos;
        this.egresos = egresos;
    }
    @Override
    public String toString() {
        return "titular: "+titular+" monto actual: $"+monto+" ultimo ingreso: $"+ingresos+" ultimo retiro: $"+egresos;
    }
    
    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the monto
     */
    public double getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }

    /**
     * @return the ingresos
     */
    public double getIngresos() {
        return ingresos;
    }

    /**
     * @param ingresos the ingresos to set
     */
    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    /**
     * @return the egresos
     */
    public double getEgresos() {
        return egresos;
    }

    /**
     * @param egresos the egresos to set
     */
    public void setEgresos(double egresos) {
        this.egresos = egresos;
    }
}
