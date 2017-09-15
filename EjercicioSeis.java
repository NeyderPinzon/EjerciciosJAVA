package ejercicioseis;

import java.util.Scanner;

public class EjercicioSeis {

    /**
     * @param args the command line arguments
     * se piden tres numeros y se informa cual es el promedio
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int primerNumero;
        int segundoNumero;
        int tercerNumero;
        int suma;
        double promedio; //variable para numeros dables o decimales
        Scanner entradaPorTeclado = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        primerNumero = entradaPorTeclado.nextInt();
        System.out.println("Ingrese otro valor: ");
        segundoNumero = entradaPorTeclado.nextInt();     //"TENER EN CUENTA TODOS LOS PASOS QUE SEGUI EN ESTE EJERCICIO"
        System.out.println("Ingrese un tercer valor");
        tercerNumero = entradaPorTeclado.nextInt();
        suma = primerNumero+segundoNumero+tercerNumero;//sumar las distintas variables
        promedio= suma/3;//promedio de las distintas variables
        System.out.println("el Promedio de los tres valores es: "+ promedio);
        
        
        
        
    }
    
}
