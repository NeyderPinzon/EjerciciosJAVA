package ejercicionueve;

import java.util.Scanner;

public class EjercicioNueve {

    public static void main(String[] args) {
        // TODO code application logic here
        String datoAux;
        Integer cantidad;
        Double Precio;
        Double precioTotal;
        
        Scanner entradaPorTeclado = new Scanner(System.in);
        System.out.println("ingrese la cantidad de prendas de vestir que desea llevar: ");
        datoAux = entradaPorTeclado.next();
        cantidad = Integer.parseInt(datoAux);
        
        
        System.out.println("Ingrese el precio por unidad de cada prenda: ");
        datoAux = entradaPorTeclado.next();
        Precio = Double.parseDouble(datoAux);
        
        precioTotal = cantidad*Precio;
        System.out.println("el precio de la cantidad de prendas es: "+ precioTotal);
        
        
    }
    
}
