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
        Scanner miEscarnernuevo = new Scanner (System.in);
        System.out.println("Por favor ingrese su nombre: ");
        nombre = miEscarnernuevo.nextLine();
        System.out.println("El nombre ingresado es: " + nombre);
                
    }
    
}
