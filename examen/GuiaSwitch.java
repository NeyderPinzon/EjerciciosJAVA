/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class GuiaSwitch {
    
    public static void Ejercicio14(){
        //Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje 
        //“Feliz verano” de lo contrario Informar “No es Verano”
        String mes;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un mes: ");
        mes = entrada.next();
        
        switch (mes){
            case ("enero"){
                System.out.println("feliz verano"); 
            }
        } 
    }
    
}
