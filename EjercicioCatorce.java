package ejerciciocatorce;
import java.util.Scanner;

public class EjercicioCatorce {

    /**
     * @param args the command line arguments
     * se pide ingresar una clave, si es "utn750" se mostrara el mensaje bienvenido
     * de lo contrario el mensaje "Clave erronea" 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Clave;
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Ingrese su clave: ");
        Clave = entrada.next();
                
        if(Clave.equals("utn750")){
            System.out.println("Bienvenido");
        }else {
        System.out.println("Clave erronea");    
    }
            
    }
    
}
