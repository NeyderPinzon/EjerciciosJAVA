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
        
        // No olvidar utilizar el EQUALS para comprar la comparacion de texto
        if(Clave.equals("utn750")){
            System.out.println("Bienvenido");
        }else {
        System.out.println("Clave erronea");    
    }
            /**
             * 15) se ingresa un importe si supera los 100 pesos se le suma un 23%
             * si es menor a 100 pesos se le descuenta el 50% 
             * 16) se ingresa el importe de un pasaje de avion y el mes de viaje, si es Ener se le descuenta en 10% por temporada baja.
             */
    }
    
}
