package ejerciciodiez;

import java.util.Scanner;

public class EjercicioDiez {
    /**
     * 
     * @param args
     *  se ingresa la cantidad de ganadores de la loteria nacional y el monto 
     * total del premio, informar cuanto dnero le corresponde a cada uno
     */

    public static void main(String[] args) {
        // TODO code application logic here
        String DatoAux;
        Integer montoTotal;
        Double porUno;
        Double total;
        Scanner entradaPorTeclado = new Scanner(System.in);
        
        System.out.println("Total de Ganadores: ");
        DatoAux = entradaPorTeclado.next();
        montoTotal = Integer.parseInt(DatoAux);
        
        System.out.println("Dinero total Ganado: ");
        DatoAux = entradaPorTeclado.next();
        porUno = Double.parseDouble(DatoAux);
        
        total= porUno/montoTotal;
        System.out.println("A cada Ganador le corresponde: " + total);
        // aprendiendo a parsear, debo estudiar bastante esto ya que se me dificulta bastante
        }
    
    
}
