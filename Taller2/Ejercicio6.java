package Taller2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    // El taller de motos "El Maquinista" recibe motocicletas de alto cilindraje para realizar las respectivas revisiones y requiere una aplicación que le permita registrar los servicios generados a sus clientes. Para cada motocicleta se debe tener registro del ingreso al taller y las observaciones por parte del cliente. También debe existir registro de salida del taller con las novedades y otra de arreglos hechos por el mecánico en caso de que se requiera inventariar cambios repuestos en la motocicleta al entregarla.
    public static String placa, modelo, annio, fechaIngreso, observacionesCliente, fechaEgreso, observacionesMecanico;
    public static boolean control = true;
    public static int opcion;
    
    public static void main(String[] args) {
        ArrayList<Object> li = new ArrayList<>();
        ArrayList<String> placas = new ArrayList<String>();
        
        Scanner inputOpcion = new Scanner(System.in);
        Scanner inputPlaca = new Scanner(System.in);
        Scanner inputModelo = new Scanner(System.in);
        Scanner inputAnnio = new Scanner(System.in);
        Scanner inputFechaIngreso = new Scanner(System.in);
        Scanner inputObsCliente = new Scanner(System.in);
        Scanner inputFechaEgreso = new Scanner(System.in);
        Scanner inputObsMecanico = new Scanner(System.in);
       
        
        System.out.println("Taller de motos El Maquinista");
        
        while(control == true) {
            System.out.println("Primero registre el vehiculo y despues sus procedimientos");
            System.out.println("Elija una opcion: ");
            System.out.println("1. Registro de nuevo vehiculo");
            System.out.println("2. Limpieza del vehiculo");
            System.out.println("3. Nivelacion de presion de llantas");
            System.out.println("4. Pintura");
            System.out.println("5. Arreglo de abolladuras");
            System.out.println("6. Registro de vehiculos");
            System.out.println("7. Salir del programa");
            opcion = inputOpcion.nextInt();
            switch(opcion) {
                case 1: 
                    System.out.println("Ingrese la placa del vehiculo: ");
                    placa = inputPlaca.nextLine();
                    while(placas.contains(placa)) {
                        System.out.println("La placa que intenta ingresar ya esta registrada. Intentelo de nuevo: ");
                        placa = inputPlaca.nextLine();
                    }
                    placas.add(placa);
                    System.out.println("Ingrese el modelo del vehiculo: ");
                    modelo = inputModelo.nextLine();
                    System.out.println("Ingrese el año del vehiculo: ");
                    annio = inputAnnio.nextLine();
                    System.out.println("Ingrese la fecha de ingreso del vehiculo: ");
                    fechaIngreso = inputFechaIngreso.nextLine();
                    System.out.println("Indique las observaciones del cliente acerca del estado del vehiculo: ");
                    observacionesCliente = inputObsCliente.nextLine();
                    break;
                case 2:
                    System.out.println("La limpieza se ha completado");
                    System.out.println("Ingrese la fecha de salida del vehiculo: ");
                    fechaEgreso = inputFechaEgreso.nextLine();
                    System.out.println("Observaciones acerca del procedimiento: ");
                    observacionesMecanico = inputObsMecanico.nextLine();
                    Vehiculo vehiculo = new Vehiculo(placa, modelo, annio, fechaIngreso, observacionesCliente, fechaEgreso, observacionesMecanico);
                    li.add(vehiculo);
                    System.out.println("El vehiculo de placas "+vehiculo.getPlaca()+" modelo "+vehiculo.getModelo()+ " año "+vehiculo.getAnnio()+" ingreso en la fecha "+vehiculo.getFechaIngreso()+ " con las siguientes observaciones: "+vehiculo.getObservacionesCliente()+". Salio en la fecha "+vehiculo.getFechaEgreso()+".\n"+"Observaciones del mecanico: "+vehiculo.getObservacionesMecanico());
                    break;
                case 3:
                    System.out.println("La nivelacion de presion de llantas se ha completado");
                    System.out.println("Ingrese la fecha de salida del vehiculo: ");
                    fechaEgreso = inputFechaEgreso.nextLine();
                    System.out.println("Observaciones acerca del procedimiento: ");
                    observacionesMecanico = inputObsMecanico.nextLine();
                    Vehiculo vehiculo2 = new Vehiculo(placa, modelo, annio, fechaIngreso, observacionesCliente, fechaEgreso, observacionesMecanico);
                    li.add(vehiculo2);
                    System.out.println("El vehiculo de placas "+vehiculo2.getPlaca()+" modelo "+vehiculo2.getModelo()+ " año "+vehiculo2.getAnnio()+" ingreso en la fecha "+vehiculo2.getFechaIngreso()+ " con las siguientes observaciones: "+vehiculo2.getObservacionesCliente()+". Salio en la fecha "+vehiculo2.getFechaEgreso()+".\n"+"Observaciones del mecanico: "+vehiculo2.getObservacionesMecanico());
                    break;
                case 4:
                    System.out.println("La pintura se ha completado");
                    System.out.println("Ingrese la fecha de salida del vehiculo: ");
                    fechaEgreso = inputFechaEgreso.nextLine();
                    System.out.println("Observaciones acerca del procedimiento: ");
                    observacionesMecanico = inputObsMecanico.nextLine();
                    Vehiculo vehiculo3 = new Vehiculo(placa, modelo, annio, fechaIngreso, observacionesCliente, fechaEgreso, observacionesMecanico);
                    li.add(vehiculo3);
                    System.out.println("El vehiculo de placas "+vehiculo3.getPlaca()+" modelo "+vehiculo3.getModelo()+ " año "+vehiculo3.getAnnio()+" ingreso en la fecha "+vehiculo3.getFechaIngreso()+ " con las siguientes observaciones: "+vehiculo3.getObservacionesCliente()+". Salio en la fecha "+vehiculo3.getFechaEgreso()+".\n"+"Observaciones del mecanico: "+vehiculo3.getObservacionesMecanico());
                    break;
                case 5:
                    System.out.println("El arreglo de abolladuras se ha completado");
                    System.out.println("Ingrese la fecha de salida del vehiculo: ");
                    fechaEgreso = inputFechaEgreso.nextLine();
                    System.out.println("Observaciones acerca del procedimiento: ");
                    observacionesMecanico = inputObsMecanico.nextLine();
                    Vehiculo vehiculo4 = new Vehiculo(placa, modelo, annio, fechaIngreso, observacionesCliente, fechaEgreso, observacionesMecanico);
                    li.add(vehiculo4);
                    System.out.println("El vehiculo de placas "+vehiculo4.getPlaca()+" modelo "+vehiculo4.getModelo()+ " año "+vehiculo4.getAnnio()+" ingreso en la fecha "+vehiculo4.getFechaIngreso()+ " con las siguientes observaciones: "+vehiculo4.getObservacionesCliente()+". Salio en la fecha "+vehiculo4.getFechaEgreso()+".\n"+"Observaciones del mecanico: "+vehiculo4.getObservacionesMecanico());
                    break;
                case 6:
                    if(li.isEmpty()) {
                        System.out.println("Debe completar el registro de los vehiculos con sus procedimientos aplicados para generarlo");
                    } else {
                        System.out.println("Vehiculos ingresados a la fecha:");
                        for(Object n : li) {
                            System.out.println(n);
                        }
                    }
                    break;
                case 7:
                    control = false;
                    break;
                default:
                    System.out.println("La opcion ingresada no existe");
                    break;
            }
        }
    }
}

class Vehiculo {
    private String placa, modelo, annio, fechaIngreso, observacionesCliente, fechaEgreso, observacionesMecanico;

    public Vehiculo(String placa, String modelo, String annio, String fechaIngreso, String observacionesCliente, String fechaEgreso, String observacionesMecanico) {
        this.placa = placa;
        this.modelo = modelo;
        this.annio = annio;
        this.fechaIngreso = fechaIngreso;
        this.observacionesCliente = observacionesCliente;
        this.fechaEgreso = fechaEgreso;
        this.observacionesMecanico = observacionesMecanico;
    }
    @Override
    public String toString() {
        return "Placa: "+placa+" Modelo: "+modelo+" Año: "+annio+" Fecha ingreso: "+fechaIngreso+" Observaciones cliente: "+observacionesCliente+" Fecha egreso: "+fechaEgreso+" Observaciones mecanico: "+observacionesMecanico;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the annio
     */
    public String getAnnio() {
        return annio;
    }

    /**
     * @param annio the annio to set
     */
    public void setAnnio(String annio) {
        this.annio = annio;
    }

    /**
     * @return the fechaIngreso
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @return the observacionesCliente
     */
    public String getObservacionesCliente() {
        return observacionesCliente;
    }

    /**
     * @param observacionesCliente the observacionesCliente to set
     */
    public void setObservacionesCliente(String observacionesCliente) {
        this.observacionesCliente = observacionesCliente;
    }

    /**
     * @return the fechaEgreso
     */
    public String getFechaEgreso() {
        return fechaEgreso;
    }

    /**
     * @param fechaEgreso the fechaEgreso to set
     */
    public void setFechaEgreso(String fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    /**
     * @return the observacionesMecanico
     */
    public String getObservacionesMecanico() {
        return observacionesMecanico;
    }

    /**
     * @param observacionesMecanico the observacionesMecanico to set
     */
    public void setObservacionesMecanico(String observacionesMecanico) {
        this.observacionesMecanico = observacionesMecanico;
    }
}