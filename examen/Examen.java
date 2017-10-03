package examen;

import java.util.Scanner;

public class Examen {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Integer opcion;
        Scanner miEntrada = new Scanner(System.in);
        
        System.out.println("Que Ejercicio quiere probar???");
        String Dato = miEntrada.next();
        opcion = Integer.parseInt(Dato);
        
        
        switch(opcion){
        
            case 1: 
                GuiaInicial.saludar();
                break;
            case 2:
                GuiaInicial.HacerEjercicio1();
                break;
            case 3:
                GuiaInicial.Ejercicio2();
                break;
            case 4:
                GuiaInicial.Ejercicio3(); 
                break;
            case 5:
                GuiaInicial.Ejercicio4();
                break;
            case 6:
                GuiaInicial.Ejercicio5();
                break;
            case 7:
                GuiaIf.Ejercicio15();
                break;
            case 8:
                GuiaIf.Ejercicio16();
                break;
            case 9:
                GuiaIf.Ejercicio17();
                break;
                               
                
                
        }
        
        
    }
    
}

