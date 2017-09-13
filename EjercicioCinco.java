package ejerciciocinco;

import java.util.Scanner;

public class EjercicioCinco {

    /**
     * @param args the command line arguments
     * se necesita pedir dos numeros y sumarlos, mostrar el resultado
     */
    public static void main(String[] args) {
        int numeroUno;
        int numeroDos;
        int suma;
        
        Scanner entradaPorTeclado= new Scanner(System.in);
        System.out.println("Ingrese el Primer Numero");
        numeroUno= entradaPorTeclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        numeroDos= entradaPorTeclado.nextInt();
        suma = numeroUno + numeroDos;
        System.out.println("El resultado es: " + suma);
              
      
               
        
    }
    
}
