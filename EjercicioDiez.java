package ejerciciodiez;

import java.util.Scanner;

public class EjercicioDiez {

    /**
     * @param args the command line arguments
     * se ingresa la cantidad de ganadores de la loteria nacional y el monto 
     * total del premio, informar cuanto dnero le corresponde a cada uno
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ganadores;
        int montoTotal;
        int porUno;
        Scanner entradaPorTeclado = new Scanner(System.in);
        System.out.println("Total de ganadores: ");
        ganadores = entradaPorTeclado.nextInt();
        System.out.println("Cantidad total de la loteria: ");
        montoTotal = entradaPorTeclado.nextInt();
        porUno = montoTotal/ganadores;//tener cuidado de escribir las expreciones bien, como es y no alreves
        System.out.println("A cada ganador le corresponde un monto de: "+porUno);
        
        
        //System.out.println("La división es " + numero1 + " / " + numero2 + " = " + resultado);
        
    }
    
}
