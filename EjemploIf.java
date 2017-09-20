package ejemploif;

import java.util.Scanner;

public class EjemploIf {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //Defino las variables        
        String nombre;
        String clave;
        
        //tomo datos
        System.out.println("Ingresse nombre: ");
        nombre = entrada.next();
        System.out.println("Ingresse clave: ");
        clave = entrada.next();
        
        if(nombre.equals("Admin")){
            System.out.println("Bienvenido Admin");
        }
        else{
            System.out.println("Bienvenido   "+ nombre); 
        }
        
    }
    
}
