package ejerciciodieciseis;

import java.util.Scanner;

public class EjercicioDieciseis {

    /**
     * @param args the command line arguments
     * se ingresa el importe de un pasaje de avión y el mes de viaje,
     * si es Ener se le descuenta en 10% por temporada baja.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String datoAux;
        Integer dinero;
        String mes;       
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Pasaje de Avion: ");
        datoAux = entrada.next();
        dinero = Integer.parseInt(datoAux);
        
        
        System.out.println("Ingrese el mes en el que desea vajar: ");
        mes = entrada.next();
        
        
        if (mes.equals("enero")){
        System.out.println("tendra un 10% de descuento en su vuelo: ");
        }
        }
    }
    

