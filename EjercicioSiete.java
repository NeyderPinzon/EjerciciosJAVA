package ejerciciosiete;

import java.util.Scanner;

public class EjercicioSiete {

    /**
     * @param args the command line arguments
     * se pide base de un cuadrado y se informa el perimetro
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int multi;
        Scanner entradaPorTeclado = new Scanner(System.in);
        System.out.println("Escriba la base de un cuadrado: ");
        numero = entradaPorTeclado.nextInt();
        multi=  numero * 4 ;// tener en cuenta no olvidar 
        System.out.println("el preimetro es el siguiente: " + multi);// no olvida concatenar
        
        
        
    }
    
}
