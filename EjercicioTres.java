package ejerciciotres;

import java.util.Scanner;

public class EjercicioTres {

    /**
     * @param args the command line arguments
     * se debe pedir el nombre y el apellido, luego mostrarlo en el siguiente mensaje: 
     * "su nombre es xxxxx y xxxxx es su apellido
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
        String apellido;
        Scanner entradaPorTeclado = new Scanner(System.in);//creacion del Scanner
        System.out.println("Por favor ingrese su Nombre: ");
        nombre = entradaPorTeclado.nextLine();//definiendo variable 1
        System.out.println("Por favor ingrese su Apellido: ");
        apellido = entradaPorTeclado.nextLine();//definiendo variable 2
        System.out.println("Su Nombre es: " + nombre +  " y su apellido es: "+ apellido);
        
        /**
         * System.out.println ("Su nombre " + nombre + "y su apellido es "+ apellido);
         * APRENDIENDO A CONCATENAR, SE ME DIFICULTA UN POCO, TUVE QUE BUSCAR
         * EL EJEMPLO EN INTERNET.
         */
        
        
        
        
        
        
        
        
    }
    
}
