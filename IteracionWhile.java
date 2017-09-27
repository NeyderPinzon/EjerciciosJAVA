package iteracionwhile;

import java.util.Scanner;

public class IteracionWhile {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String Clave;
        
        
        System.out.println("Ingrese clave");
        Clave= entrada.next();
        
      while (!Clave.equals("1234"))
      {
        System.out.println("Error!!! \nIngrese clave");
        Clave= entrada.next();
      }
        System.out.println("bienvenido");
    }
}    
    

