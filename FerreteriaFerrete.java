package ferreteriaferrete;

import java.util.Scanner;

public class FerreteriaFerrete {

    /**
     * @param args the command line arguments
     * Debemos pedir el ancho y el largo de un terreno e informar cuantos metros
     * de alambre necesitamos para dar tres (3) vueltas de alambre.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int ancho;
        int largo;
        int total;
        
        System.out.println("Ingrese el ancho del terreno: ");
        ancho = entrada.nextInt();
        
        System.out.println("Ingrese el largo del terreno:  ");
        largo = entrada.nextInt();
        
        total = ancho*largo* 3;
        // si colo %d resive un int, %f= double, %s= String, %c= char 
        System.out.printf("Nececitamos: %d metros de alambre para dar 3 vueltas al terreno" 
        , total);
        
        
        
    }
    
    
}
