package ejercicioquince;

import java.util.Scanner;

public class EjercicioQuince {

    /**
     * @param args the command line arguments
     * se ingresa un importe, si supera los 100 pesos se le suma un 23%
     * si es menor a 100 pesos se le descuenta el 50%
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String DatoAux;
        Integer Importe;
        int suma;
        int resta;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su importe: ");
        DatoAux = entrada.next();
        Importe = Integer.parseInt(DatoAux);
        
        suma = Importe+ 23*100/100;
        if (Importe.equals ("100"));
        {System.out.println("El importe es menor que 100");
        }           
            
        }
    
}
