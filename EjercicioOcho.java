package ejercicioocho;

import java.util.Scanner;

public class EjercicioOcho {

    /**
     * @param args the command line arguments
     * Se pide el largo y el ancho de un terreno y se pide la superficie del mismo
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroUno;
        int numeroDos;
        int superficie;
        Scanner entradaPorTeclado = new Scanner(System.in);
        System.out.println("Ingrese el largo del terreno: ");
        numeroUno = entradaPorTeclado.nextInt();
        System.out.println("Ingrese el ancho del terreno: ");
        numeroDos = entradaPorTeclado.nextInt();
        superficie = numeroUno*numeroDos;
        System.out.println("la superficie del terreno es: "+superficie);
                
        
    }
    
}
