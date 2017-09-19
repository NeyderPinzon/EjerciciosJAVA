package ejercicioonce;

import java.util.Scanner;

public class EjercicioOnce {

    /**
     * @param args the command line arguments.
     * Se ingresa el importe de un producto importado y se le debe agregar el 35% 
     * de impuestos internos
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String DatoAux;
        Integer valor;
        int Porcentaje;
        Scanner entradaPorTeclado = new Scanner(System.in);
        
        System.out.println("Importe del producto : ");
        DatoAux = entradaPorTeclado.next();
        valor = Integer.parseInt(DatoAux);
        Porcentaje = valor* 35/ 100 ;
        System.out.println("Impuestos: "+ Porcentaje); 
      
    }
    
}
