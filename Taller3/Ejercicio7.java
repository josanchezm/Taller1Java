package Taller3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    // El parqueadero "El guardián" presta sus servicios de parqueadero nocturno para los usuarios del barrio y requiere una aplicación que permita registrar los vehículos que se cuidan en estas instalaciones. Se sugiere que el parqueadero tenga los atributos del vehículo como son, placa y marca, y los datos del cliente como son nombre completo y número de teléfono. Para cada vehículo se debe permitir la opción de ingresar al parqueadero, retirar del parqueadero y consultar si un vehículo se encuentra en el parqueadero. Recuerde que el sistema debe terminar cuando el usuario así lo indique. Tenga en presente que el parqueadero solo puede almacenar máximo 5 vehículos.
    
    public static String placa, marca, nombre, telefono;
    public static int opcion, opcionEliminar, opcionConsultar, otroRegistro, iClientes = 0; 
    public static boolean control = true, controlContactos = true;
    
    public static void main(String[] args) {
        Scanner inputOpcion = new Scanner(System.in);
        Scanner inputOpcionEliminar = new Scanner(System.in);
        Scanner inputOpcionBuscar = new Scanner(System.in);
        Scanner inputPlaca = new Scanner(System.in);
        Scanner inputMarca = new Scanner(System.in);
        Scanner inputNombre = new Scanner(System.in);
        Scanner inputTelefono = new Scanner(System.in);
        Scanner inputOtroRegistro = new Scanner(System.in);
        ArrayList<String> placas = new ArrayList<String>(5);
        ArrayList<String> telefonos = new ArrayList<String>(5);
        ArrayList<Object> vehiculos = new ArrayList<Object>(5);
        
        while (control != false) {
            System.out.println("Bienvenido al parqueadero El Guardian");
            System.out.println("Elija una opcion: ");
            System.out.println("1. Ingresar vehiculos al parqueadero");
            System.out.println("2. Retirar vehiculos del parqueadero");
            System.out.println("3. Consultar vehiculo");
            System.out.println("4. Salir del programa");
            opcion = inputOpcion.nextInt();
            if(opcion == 1) {
                controlContactos = true;
            }
            switch(opcion) {
                case 1:
                    while (controlContactos == true) {
                        System.out.println("Ingrese la placa del vehiculo:");
                        placa = inputPlaca.nextLine();
                        while(placa.length() != 6) {
                            System.out.println("Las placas cuentan con 6 digitos, tres numeros y tres letras. Intentelo de nuevo: ");
                            placa = inputPlaca.nextLine();
                        }
                        while(placas.contains(placa)) {
                            System.out.println("La placa que intenta ingresar pertenece a otro vehiculo alojado en el parqueadero. Intentelo de nuevo: ");
                            placa = inputPlaca.nextLine();
                            while(placa.length() != 6) {
                                System.out.println("Las placas cuentan con 6 digitos, tres numeros y tres letras. Intentelo de nuevo: ");
                                placa = inputPlaca.nextLine();
                            }
                        }
                        placas.add(placa);
                        System.out.println("Ingrese la marca del vehiculo:");
                        marca = inputMarca.nextLine();
                        System.out.println("Ingrese su nombre:");
                        nombre = inputNombre.nextLine();
                        System.out.println("Ingrese su telefono:");
                        telefono = inputTelefono.nextLine();
                        while(telefonos.contains(telefono)) {
                            System.out.println("El telefono que intenta ingresar pertenece a otro vehiculo alojado en el parqueadero. Intentelo de nuevo:");
                            telefono = inputTelefono.nextLine();
                        }
                        telefonos.add(telefono);
                        Vehiculo vehiculo = new Vehiculo(placa,marca,nombre,telefono);
                        vehiculos.add(vehiculo);
                        if(vehiculos.size() == 5) {
                            System.out.println("El registro esta lleno");
                            controlContactos = false;
                        } else {
                            System.out.println("El vehiculo ha sido registrado. Para registrar otro, digite 1, de lo contrario, digite 0");
                            otroRegistro = inputOtroRegistro.nextInt();
                            if(otroRegistro == 0) {
                                controlContactos = false;
                            }
                        }      
                    }
                    break;
                case 2:
                    System.out.println("Elija el vehiculo a retirar:");
                    System.out.println("1. Primer vehiculo");
                    System.out.println("2. Segundo vehiculo");
                    System.out.println("3. Tercer vehiculo");
                    System.out.println("4. Cuarto vehiculo");
                    System.out.println("5. Quinto vehiculo");
                    System.out.println("6. Todos los vehiculos");
                    opcionEliminar = inputOpcionEliminar.nextInt();
                    
                    switch(opcionEliminar) {
                        case 1:
                            if(vehiculos.isEmpty()) {
                                System.out.println("El vehiculo que intenta retirar no ha sido registrado");
                            } else {
                                vehiculos.remove(0);
                                placas.remove(0);
                                telefonos.remove(0);
                                System.out.println("Se ha retirado el vehiculo del registro");
                            }
                            break;
                        case 2:
                            if(vehiculos.isEmpty() || vehiculos.size() < 2) {
                                System.out.println("El vehiculo que intenta retirar no ha sido registrado");
                            } else {
                                vehiculos.remove(1);
                                placas.remove(1);
                                telefonos.remove(1);
                                System.out.println("Se ha retirado el vehiculo del registro");
                            }
                            break;
                        case 3:
                            if(vehiculos.isEmpty() || vehiculos.size() < 3) {
                                System.out.println("El vehiculo que intenta retirar no ha sido registrado");
                            } else {
                                vehiculos.remove(2);
                                placas.remove(2);
                                telefonos.remove(2);
                                System.out.println("Se ha retirado el vehiculo del registro");
                            }
                            break;
                        case 4:
                            if(vehiculos.isEmpty() || vehiculos.size() < 4) {
                                System.out.println("El vehiculo que intenta retirar no ha sido registrado");
                            } else {
                                vehiculos.remove(3);
                                placas.remove(3);
                                telefonos.remove(3);
                                System.out.println("Se ha retirado el vehiculo del registro");
                            }
                            break;
                        case 5:
                            if(vehiculos.isEmpty() || vehiculos.size() < 5) {
                                System.out.println("El vehiculo que intenta retirar no ha sido registrado");
                            } else {
                                vehiculos.remove(4);
                                placas.remove(4);
                                telefonos.remove(4);
                                System.out.println("Se ha retirado el vehiculo del registro");
                            }
                            break;
                        case 6:
                            if(vehiculos.isEmpty()) {
                                System.out.println("No hay ningun registro de vehiculos por eliminar");
                            } else {
                                vehiculos.clear();
                                placas.clear();
                                telefonos.clear();
                                System.out.println("Se han retirado todos los vehiculos");
                            }
                            break;
                        default:
                            System.out.println("La opcion elegida no existe");
                            break;       
                    }
                break;
                case 3:
                    System.out.println("Elija el vehiculo a consultar:");
                    System.out.println("1. Primer vehiculo");
                    System.out.println("2. Segundo vehiculo");
                    System.out.println("3. Tercer vehiculo");
                    System.out.println("4. Cuarto vehiculo");
                    System.out.println("5. Quinto vehiculo");
                    System.out.println("6. Todos los vehiculos");
                    opcionConsultar = inputOpcionBuscar.nextInt();
                    Object[] arrayVehiculos = vehiculos.toArray();
                    
                    switch(opcionConsultar) {
                        case 1:
                            if(vehiculos.isEmpty()) {
                                System.out.println("El vehiculo que intenta consultar no se encuentra registrado");
                            } else {
                                System.out.println(arrayVehiculos[0]);
                            }
                            break;
                        case 2:
                            if(vehiculos.isEmpty() || vehiculos.size() < 2) {
                                System.out.println("El vehiculo que intenta consultar no se encuentra registrado");
                            } else {
                               System.out.println(arrayVehiculos[1]); 
                            }
                            break;
                        case 3:
                            if(vehiculos.isEmpty() || vehiculos.size() < 3) {
                                System.out.println("El vehiculo que intenta consultar no se encuentra registrado");
                            } else {
                               System.out.println(arrayVehiculos[2]); 
                            }
                            break;
                        case 4:
                            if(vehiculos.isEmpty() || vehiculos.size() < 4) {
                                System.out.println("El vehiculo que intenta consultar no se encuentra registrado");
                            } else {
                               System.out.println(arrayVehiculos[3]); 
                            }
                            break;
                        case 5:
                            if(vehiculos.isEmpty() || vehiculos.size() < 5) {
                                System.out.println("El vehiculo que intenta consultar no se encuentra registrado");
                            } else {
                               System.out.println(arrayVehiculos[4]); 
                            }
                            break;
                        case 6:
                            if(vehiculos.isEmpty()) {
                                System.out.println("No hay ningun registro de vehiculos para consultar");
                            } else {
                               for (Object n : vehiculos) {
                                System.out.println(n);
                                } 
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

class Vehiculo {
    private String placa;
    private String marca;
    private String nombre;
    private String telefono;

    public Vehiculo(String placa, String marca, String nombre, String telefono) {
        this.placa = placa;
        this.marca = marca;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    @Override
    public String toString() {
        return "placa: "+placa+" marca: "+marca+" nombre: "+nombre+" telefono: "+telefono;
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
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }   
}