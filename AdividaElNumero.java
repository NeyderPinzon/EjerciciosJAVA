package adividaelnumero;

import java.util.Scanner;

public class AdividaElNumero {
/**
     * @param args the command line arguments
     * informar si:
     * a) si erro por un punto mensaje "casi, casi"
     * b) si eero por dos puntos "cerca"
     * c) si erro por tes puntos "ni cerca"
     * d) si erro por cuatro puntos "bine lejos"
     * para todos los demas "sos horrible en este juego"
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        Integer numero;
        Integer numeroIngresado;
        String dato;
        Integer distinto;
        //leemos la variable
        // parseamos
        Integer miNumeroSecreto = (int) (Math.random()* 10)+1;
        
        System.out.println("numero secreto "+ miNumeroSecreto);
        
        System.out.println("Ingrese un numero: ");       
        dato= entrada.next();
        numeroIngresado = Integer.parseInt(dato);
        
       /* switch (numeroIngresado){
            case 5 :
                System.out.println("Acertaste!!!");
                break;
            case 4 :
            case 6 :    
                System.out.println("casi casi");
                break;
            case 7 :
            case 3 :
                System.out.println("cerca");
                break;
            case 8 :
            case 2 :
                System.out.println("bien lejos");
                break;
            default  :
                System.out.println("sos horrible en este juego");
           */    
       if (numeroIngresado > miNumeroSecreto){
           distinto = numeroIngresado - miNumeroSecreto;                   
           }else {
           distinto = miNumeroSecreto - numeroIngresado;      
       } 
       if (numeroIngresado.equals(miNumeroSecreto))
               {
                   System.out.println("Acerto!!!");  
               }else {
                switch (distinto){
               case 1 : 
                   System.out.println("casi casi");
                   break;
               case 2 :
                   System.out.println("cerca");
                   break;
               case 3 :
                   System.out.println("ni cerca");
                   break;
               case 4 :
                   System.out.println("bien lejos");
                   break;
               default :  
                   System.out.println("sos horrible para este juego");    
            }                       
       }
    } 
        
        
}