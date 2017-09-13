package ejerciciodos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDos {

    /**
     * @param args the command line arguments
     * Se debe pedir un nombre y se debe mostra el mismo nombre
     */
    public static void main(String[] args) {
        
        String nombre;
        //Los comandos para variables deben ser escritos en mayuscula 
        Scanner miEscarnernuevo = new Scanner (System.in);
        //Asi se crea un Scanner
        System.out.println("Por favor ingrese su nombre: ");
        nombre = miEscarnernuevo.nextLine(); 
        //este Scanner es el que acabamos de crear
        System.out.println("El nombre ingresado es: " + nombre);
                        
    }
    
}
