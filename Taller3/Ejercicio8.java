package Taller3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    // La escuela automovilística "El Maestro" requiere una aplicación que permita registrar a sus clientes en los cursos de enseñanza automovilística y establecer quienes lo han aprobado para continuar con el trámite de adquirir la licencia de conducción. Para cada usuario se debe permitir registrar su ingreso al curso, consultar usuarios que hayan presentado el curso y resultados de la prueba del curso (si fueron aprobados o no). Recuerde que el sistema debe terminar cuando el usuario así lo indique. Tenga presente que la escuela tiene capacidad máxima de gestionar 8 usuarios en su totalidad.
    public static String idCliente, nombreCliente, aprobado;
    public static boolean control = true, controlCliente = true;
    public static int opcion, opcionRegistro, opcionCalificacion, opcionConsulta, opcionEliminar, otroCliente;
    public static double calificacion;
    
    public static void main(String[] args) {
        Scanner inputOpcion = new Scanner(System.in);
        Scanner inputOpcionConsulta = new Scanner(System.in);
        Scanner inputOpcionEliminar = new Scanner(System.in);
        Scanner inputIdCliente = new Scanner(System.in);
        Scanner inputCliente = new Scanner(System.in);
        Scanner inputCalificacion = new Scanner(System.in);
        Scanner inputControlCliente = new Scanner(System.in);
        ArrayList<String> identificaciones = new ArrayList<String>(8);
        ArrayList<Object> clientes = new ArrayList<Object>(8);
        ArrayList<Object> aprobados = new ArrayList<Object>(8);

        
        
        while(control == true) {
            System.out.println("Bienvenido a la escuela automovilistica El Maestro");
            System.out.println("Elija una opcion:");
            System.out.println("1. Registrar clientes");
            System.out.println("2. Consultar clientes");
            System.out.println("3. Eliminar clientes");
            System.out.println("4. Salir del sistema");
            opcion = inputOpcion.nextInt();
            
            switch(opcion) {
                case 1:
                    while(controlCliente == true) {
                        System.out.println("Ingrese la identificacion del cliente");
                        idCliente = inputIdCliente.nextLine();
                        while(identificaciones.contains(idCliente)) {
                            System.out.println("La identificacion que intenta ingresar ya pertenece a otro cliente, intentelo de nuevo:");
                            idCliente = inputIdCliente.nextLine();
                        }
                        identificaciones.add(idCliente);
                        System.out.println("Ingrese el nombre del cliente");
                        nombreCliente = inputCliente.nextLine();
                        System.out.println("Ingrese la calificacion del cliente (entre 0 y 5): ");
                        calificacion = inputCalificacion.nextDouble();
                        while(calificacion < 0 || calificacion > 5) {
                            System.out.println("La calificacion debe estar comprendida entre 0 y 5. Intentelo de nuevo: ");  
                            calificacion = inputCalificacion.nextDouble();
                        }
                        if(calificacion >= 3) {
                            aprobado = "Si";
                        } else {
                            aprobado = "No";
                        }
                        Cliente cliente = new Cliente(idCliente,nombreCliente,calificacion,aprobado);
                        clientes.add(cliente);
                        if(aprobado == "Si") {
                            aprobados.add(cliente);
                        }
                        if(clientes.size() == 8) {
                            System.out.println("Se ha llenado el registro de clientes");
                            controlCliente = false;
                        } else {
                            System.out.println("El cliente ha sido registrado. Si desea registrar otro, digite 1, de lo contrario, digite 0");
                            otroCliente = inputControlCliente.nextInt();
                            if(otroCliente == 0) {
                                controlCliente = false;
                            }
                        }   
                    }
                    break;
                case 2:
                    System.out.println("Elija el cliente a consultar");
                    System.out.println("1. Primer cliente");
                    System.out.println("2. Segundo cliente");
                    System.out.println("3. Tercer cliente");
                    System.out.println("4. Cuarto cliente");
                    System.out.println("5. Quinto cliente");
                    System.out.println("6. Sexto cliente");
                    System.out.println("7. Septimo cliente");
                    System.out.println("8. Octavo cliente");
                    System.out.println("9. Todos los clientes registrados");
                    opcionConsulta = inputOpcionConsulta.nextInt();
                    Object[]arrayClientes = clientes.toArray();
                            
                    switch(opcionConsulta) {
                        case 1:
                            if(clientes.isEmpty()) {
                                System.out.println("El cliente que intenta consultar no ha sido registrado aun");
                            } else {
                                System.out.println("1. "+arrayClientes[0]);
                            }
                            break;
                        case 2: 
                            if(clientes.isEmpty()) {
                                System.out.println("El cliente que intenta consultar no ha sido registrado aun");
                            } else if(clientes.size() < 2) {
                                System.out.println("El cliente que intenta consultar no ha sido registrado aun");
                            } else {
                                System.out.println("2. "+arrayClientes[1]);
                            }
                            break;
                        case 3: 
                            if(clientes.isEmpty()) {
                                System.out.println("El cliente que intenta consultar no ha sido registrado aun");
                            } else if(clientes.size() < 3) {
                                System.out.println("El cliente que intenta consultar no ha sido registrado aun");
                            } else {
                                System.out.println("3. "+arrayClientes[2]);
                            }
                            break;
                        case 4: 
                            if(clientes.isEmpty()) {
                                System.out.println("El cliente que intenta consultar no ha sido registrado aun");
                            } else if(clientes.size() < 4) {
                                System.out.println("El cliente que intenta consultar no ha sido registrado aun");
                            } else {
                                System.out.println("4. "+arrayClientes[3]);
                            }
                            break;
                        case 5: 
                            if(clientes.isEmpty()) {
                                System.out.println("El cliente que intenta consultar no ha sido registrado aun");
                            } else if(clientes.size() < 5) {
                                System.out.println("El cliente que intenta consultar no ha sido registrado aun");
                            } else {
                                System.out.println("5. "+arrayClientes[4]);
                            }
                            break;
                        case 6: 
                            if(clientes.isEmpty()) {
                                System.out.println("El cliente que intenta consultar no ha sido registrado aun");
                            } else if(clientes.size() < 6) {
                                System.out.println("El cliente que intenta consultar no ha sido registrado aun");
                            } else {
                                System.out.println("6. "+arrayClientes[5]);
                            }
                            break;
                        case 7: 
                            if(clientes.isEmpty()) {
                                System.out.println("El cliente que intenta consultar no ha sido registrado aun");
                            } else if(clientes.size() < 7) {
                                System.out.println("El cliente que intenta consultar no ha sido registrado aun");
                            } else {
                                System.out.println("7. "+arrayClientes[6]);
                            }
                            break;
                        case 8: 
                            if(clientes.isEmpty()) {
                                System.out.println("El cliente que intenta consultar no ha sido registrado aun");
                            } else if(clientes.size() < 8) {
                                System.out.println("El cliente que intenta consultar no ha sido registrado aun");
                            } else {
                                System.out.println("8. "+arrayClientes[7]);
                            }
                            break;
                        case 9:
                            if(clientes.isEmpty()) {
                                System.out.println("No hay registros por consultar aun");
                            } else {
                                for(Object n : clientes) {
                                    System.out.println(n);
                                }
                            }
                            break;
                        default:
                            System.out.println("La opcion elegida no existe");
                            break; 
                    }
                break;        
                case 3:
                    System.out.println("Elija una opcion: ");
                    System.out.println("1. Eliminar primer cliente");
                    System.out.println("2. Eliminar segundo cliente");
                    System.out.println("3. Eliminar tercer cliente");
                    System.out.println("4. Eliminar cuarto cliente");
                    System.out.println("5. Eliminar quinto cliente");
                    System.out.println("6. Eliminar sexto cliente");
                    System.out.println("7. Eliminar septimo cliente");
                    System.out.println("8. Eliminar octavo cliente");
                    System.out.println("9. Eliminar todos los clientes");
                    opcionEliminar = inputOpcionEliminar.nextInt();
                    
                    switch(opcionEliminar) {
                        case 1:
                            if(clientes.isEmpty()) {
                                System.out.println("El registro que intenta eliminar no se ha hecho");
                            } else {
                                clientes.remove(0);
                                System.out.println("Registro eliminado satisfactoriamente");
                            }
                            break;
                        case 2:
                            if(clientes.isEmpty()) {
                                System.out.println("El registro que intenta eliminar no se ha hecho");
                            } else if(clientes.size() < 2) {
                                System.out.println("El registro que intenta eliminar no se ha hecho");
                            } else {
                                clientes.remove(1);
                                System.out.println("Registro eliminado satisfactoriamente");
                            }
                            break;
                        case 3:
                            if(clientes.isEmpty()) {
                                System.out.println("El registro que intenta eliminar no se ha hecho");
                            } else if(clientes.size() < 3) {
                                System.out.println("El registro que intenta eliminar no se ha hecho");
                            } else {
                                clientes.remove(2);
                                System.out.println("Registro eliminado satisfactoriamente");
                            }
                            break;
                        case 4:
                            if(clientes.isEmpty()) {
                                System.out.println("El registro que intenta eliminar no se ha hecho");
                            } else if(clientes.size() < 4) {
                                System.out.println("El registro que intenta eliminar no se ha hecho");
                            } else {
                                clientes.remove(3);
                                System.out.println("Registro eliminado satisfactoriamente");
                            }
                            break;
                        case 5:
                            if(clientes.isEmpty()) {
                                System.out.println("El registro que intenta eliminar no se ha hecho");
                            } else if(clientes.size() < 5) {
                                System.out.println("El registro que intenta eliminar no se ha hecho");
                            } else {
                                clientes.remove(4);
                                System.out.println("Registro eliminado satisfactoriamente");
                            }
                            break;
                        case 6:
                            if(clientes.isEmpty()) {
                                System.out.println("El registro que intenta eliminar no se ha hecho");
                            } else if(clientes.size() < 6) {
                                System.out.println("El registro que intenta eliminar no se ha hecho");
                            } else {
                                clientes.remove(5);
                                System.out.println("Registro eliminado satisfactoriamente");
                            }
                            break;
                        case 7:
                            if(clientes.isEmpty()) {
                                System.out.println("El registro que intenta eliminar no se ha hecho");
                            } else if(clientes.size() < 7) {
                                System.out.println("El registro que intenta eliminar no se ha hecho");
                            } else {
                                clientes.remove(6);
                                System.out.println("Registro eliminado satisfactoriamente");
                            }
                            break;
                        case 8:
                            if(clientes.isEmpty()) {
                                System.out.println("El registro que intenta eliminar no se ha hecho");
                            } else if(clientes.size() < 8) {
                                System.out.println("El registro que intenta eliminar no se ha hecho");
                            } else {
                                clientes.remove(7);
                                System.out.println("Registro eliminado satisfactoriamente");
                            }
                            break;
                        case 9:
                            if(clientes.isEmpty()) {
                                System.out.println("No puede eliminar registros si no los ha hecho");
                            } else {
                                clientes.clear();
                                System.out.println("Se han eliminado los registros satisfactoriamente");
                            }
                            break;
                        default:
                            System.out.println("La opcion elegida no existe");
                            break;
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

class Cliente {
    private String idCliente;
    private String cliente;
    private Double calificacion;
    private String aprobado; 

    public Cliente(String idCliente, String cliente, Double calificacion, String aprobado) {
        this.idCliente = idCliente;
        this.cliente = cliente;
        this.calificacion = calificacion;
        this.aprobado = aprobado;
    }
    
    @Override
    public String toString() {
        return "Id cliente: "+idCliente+" Cliente: "+cliente+" Calificacion: "+calificacion+" Aprobado: "+aprobado;
    }
    
    /**
     * @return the idCliente
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the calificacion
     */
    public Double getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * @return the aprobado
     */
    public String getAprobado() {
        return aprobado;
    }

    /**
     * @param aprobado the aprobado to set
     */
    public void setAprobado(String aprobado) {
        this.aprobado = aprobado;
    }
}