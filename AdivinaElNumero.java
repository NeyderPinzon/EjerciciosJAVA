package adivinaelnumero;

import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Integer numero;
        Integer numeroIngresado;
        String dato;
        //leemos la variable
        // parseamos
        Integer miNumeroSecreto = (int) (Math.random()* 10)+1;
        
        //System.out.println("numero secreto "+ miNumeroSecreto);
        
        System.out.println("Ingrese un numero: ");       
        dato= entrada.next();
        numeroIngresado = Integer.parseInt(dato);
        
        if (miNumeroSecreto == numeroIngresado)
        {
            System.out.println("Gano");
        }else{
            if (numeroIngresado> miNumeroSecreto)
            {
                System.out.println("te pasaste!!");
            }else {
                System.out.println("te falto!!!");
            } 
        }
        
        
        
       
        
        
                
        
        
        
                
        
        
        
    }
    
}
