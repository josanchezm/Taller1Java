package Taller3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    private static String nombre, numero, organizacion; 
    public static boolean control = true;
    public static int opcion, opcionContacto, opcionBorrar, controlContacto = 1, i = 0;
    
    public static void main(String[] args) {
        ArrayList<Object> dqContactos = new ArrayList<Object>(3);
        String[] numeros = new String[3];
        numeros[1] = "";
        numeros[2] = " ";
        Scanner inputOpcion = new Scanner(System.in);
        Scanner inputOpcionContacto = new Scanner(System.in);
        Scanner inputOpcionBorrar = new Scanner(System.in);
        Scanner inputNombre = new Scanner(System.in);
        Scanner inputNumero = new Scanner(System.in);
        Scanner inputOrganizacion = new Scanner(System.in);
        Scanner inputControlContacto = new Scanner(System.in);
        System.out.println("Menu de usuario");
        
        while(control == true) {
            System.out.println("1. Añadir contactos");
            System.out.println("2. Buscar contactos");
            System.out.println("3. Eliminar contactos");
            System.out.println("4. Salir del sistema");
            opcion = inputOpcion.nextInt();
            if (opcion == 1) {
                controlContacto = 1;
            }
            
            switch(opcion) {
                case 1:
                    while(controlContacto == 1) {
                        System.out.println("Ingrese el nombre del contacto:");
                        nombre = inputNombre.nextLine();
                        System.out.println("Ingrese el numero del contacto:");
                        numero = inputNumero.nextLine();
                        numeros[i] = numero;
                        while(numeros[0].equals(numeros[1]) || numeros[1].equals(numeros[2]) || numeros[0].equals(numeros[2])) {
                            System.out.println("El numero que intenta ingresar ya esta registrado, pruebe con otro: ");
                            numero = inputNumero.nextLine();
                            numeros[i] = numero;
                        } 
                        System.out.println("Ingrese la organizacion del contacto:");
                        organizacion = inputOrganizacion.nextLine();
                        Contacto contacto = new Contacto(nombre,numero,organizacion);
                        dqContactos.add(contacto);
                        if(dqContactos.size() == 3  || i > 2) {
                            System.out.println("Ha llenado la lista de contactos");
                            controlContacto = 0;       
                        } else {
                            System.out.println("Si desea ingresar otro contacto ingrese 1, de lo contrario, ingrese 0");
                            controlContacto = inputControlContacto.nextInt();
                            i++;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Que contacto desea consultar?");
                    System.out.println("1. Primer contacto");
                    System.out.println("2. Segundo contacto");
                    System.out.println("3. Tercer contacto");
                    System.out.println("4. Todos los contactos");
                    opcionContacto = inputOpcionContacto.nextInt();
                    Object[] array2 = dqContactos.toArray();
                    switch(opcionContacto) {
                        case 1:
                            if(dqContactos.isEmpty()) {
                                System.out.println("El elemento que intenta consultar no ha sido definido, para hacerlo utilice la primera opcion del menu");
                            } else {
                                System.out.println(array2[0]);   
                            }
                            break;
                        case 2:
                            if(dqContactos.isEmpty()) {
                                System.out.println("El elemento que intenta consultar no ha sido definido, para hacerlo utilice la primera opcion del menu"); 
                            } else if(dqContactos.size() > 1) {
                                    System.out.println(array2[1]);
                            } else {
                                System.out.println("El elemento que intenta consultar no ha sido definido, para hacerlo utilice la primera opcion del menu");
                            }
                            break;
                        case 3:
                            if(dqContactos.isEmpty()) {
                                System.out.println("El elemento que intenta consultar no ha sido definido, para hacerlo utilice la primera opcion del menu"); 
                            } else if(dqContactos.size() == 3) {
                                    System.out.println(array2[2]);
                            } else {
                                System.out.println("El elemento que intenta consultar no ha sido definido, para hacerlo utilice la primera opcion del menu");
                            }
                            break;
                        case 4:
                            if(dqContactos.isEmpty()) {
                                System.out.println("Debe establecer al menos un contacto antes de utilizar esta opcion");
                            } else {
                                for (Object n : dqContactos) {
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
                    System.out.println("Elija el contacto a eliminar");
                    System.out.println("1. Primer contacto");
                    System.out.println("2. Segundo contacto");
                    System.out.println("3. Tercer contacto");
                    System.out.println("4. Todos los contactos");
                    opcionBorrar = inputOpcionBorrar.nextInt();
                    Object[] arrayString = dqContactos.toArray();
                    
                    switch(opcionBorrar) {
                        case 1:
                            if(dqContactos.isEmpty()) {
                                System.out.println("El elemento que intenta eliminar no ha sido definido, para hacerlo utilice la primera opcion del menu"); 
                            } else if(dqContactos.size() == 1) {
                                dqContactos.remove(0);
                                i = 0;
                                System.out.println("Se ha eliminado el contacto safisfactoriamente");
                            } else if(dqContactos.size() == 2) {
                                dqContactos.remove(0);
                                numeros[0] = numeros[1];
                                i = 1;
                                System.out.println("Se ha eliminado el contacto safisfactoriamente");
                            } else if(dqContactos.size() == 3) {
                                dqContactos.remove(0);
                                i = 2;
                                numeros[0] = numeros[1];
                                numeros[1] = numeros[2];
                                System.out.println("Se ha eliminado el contacto safisfactoriamente");
                            }
                            break;
                        case 2:
                            if(dqContactos.isEmpty()) {
                                System.out.println("El elemento que intenta eliminar no ha sido definido, para hacerlo utilice la primera opcion del menu");           
                            } else if(dqContactos.size() < 2) {
                                System.out.println("El elemento que intenta eliminar no ha sido definido, para hacerlo utilice la primera opcion del menu");      
                            } else if(dqContactos.size() == 2) {
                                dqContactos.remove(1);
                                i = 1;
                                System.out.println("Se ha eliminado el contacto safisfactoriamente");
                            } else if(dqContactos.size() == 3) {
                                dqContactos.remove(1);
                                i = 2;
                                numeros[1] = numeros[2];
                                System.out.println("Se ha eliminado el contacto safisfactoriamente");
                            }
                            break;
                        case 3:
                            if(dqContactos.isEmpty()) {
                                System.out.println("El elemento que intenta eliminar no ha sido definido, para hacerlo utilice la primera opcion del menu");   
                            } else if(dqContactos.size() < 3) {
                                System.out.println("El elemento que intenta eliminar no ha sido definido, para hacerlo utilice la primera opcion del menu");       
                            } else {
                                dqContactos.remove(2);
                                i = 2;
                                System.out.println("Se ha eliminado el contacto safisfactoriamente");
                            }
                            break;
                        case 4:
                            if(dqContactos.isEmpty()) {
                                System.out.println("El/los elementos que intenta eliminar no han sido definidos, para hacerlo utilice la primera opcion del menu");   
                            } else {
                                dqContactos.clear();
                                i = 0;
                                for( int i2 = 0; i2 < dqContactos.size(); i2++){
                                    String str = String.valueOf(i2);
                                    numeros[i2] = str;
                                }
                                System.out.println("Se han eliminado el/los contactos satisfactoriamente");
                            }
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

class Contacto {
    private String nombre;
    private String numero;
    private String organizacion;

    public Contacto(String nombre, String numero, String organizacion) {
        this.nombre = nombre;
        this.numero = numero;
        this.organizacion = organizacion;
    }
    @Override
    public String toString() {
        return "nombre: "+nombre+" numero: "+numero+" organizacion: "+organizacion;
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
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the organizacion
     */
    public String getOrganizacion() {
        return organizacion;
    }

    /**
     * @param organizacion the organizacion to set
     */
    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }
}

