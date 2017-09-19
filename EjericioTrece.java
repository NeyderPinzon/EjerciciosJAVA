package ejericiotrece;

import java.util.Scanner;

public class EjericioTrece {

    /**
     * @param args the command line arguments
     * Se ingresa una edad y se informa si es mayor de edad
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String DatoAux;
        Integer edad;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        DatoAux = entrada.next();
        edad = Integer.parseInt(DatoAux);
        
        if (edad > 17) 
        { 
        System.out.println(" usted es mayor"); 
            }              
       
    }
    
}
