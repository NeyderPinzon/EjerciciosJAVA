package ejerciciocuatro;

import java.util.Scanner;

public class EjercicioCuatro {

    /**
     * @param args the command line arguments
     * al ingresa el edad y nombre mostrar el siguiente mensaje:
     * "usted se llama xxxxx y tiene xx años de edad"
     */
    public static void main(String[] args) {
        // TODO code application logic here
            String nombre;
            int edad;
            Scanner entradaPorTeclado = new Scanner(System.in);
            System.out.println("Ingresa tu edad: ");
            edad = entradaPorTeclado.nextInt();//no me corre como esperaba, Noencontre el error
            System.out.println("Ingresa tu nombre: ");
            nombre = entradaPorTeclado.nextLine();
            System.out.println("Usted se llama: " + nombre + " y tiene: " + edad);
                        
         
    }
    
}
