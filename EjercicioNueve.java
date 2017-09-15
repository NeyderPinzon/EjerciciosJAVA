package ejercicionueve;

import java.util.Scanner;

public class EjercicioNueve {

    /**
     * @param args the command line arguments
     * se ingresa la cantidad y precio de un producto y se informa el total a pagar
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long cantidad;
        double precio;
        double total;
        Scanner entradaPorTeclado = new Scanner(System.in);
        System.out.println("ingrese la cantidad de prendas de vestir que desea llevar: ");
        cantidad = entradaPorTeclado.nextLong();
        System.out.println("Ingrese el precio por unidad de cada prenda: ");
        precio = entradaPorTeclado.nextDouble();
        total = cantidad * precio;
        System.out.println("el precio de la cantidad de prendas es: "+ total);
        
    }
    
}
