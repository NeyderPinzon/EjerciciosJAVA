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
public class GuiaIf {
    
    public static void HacerEjercicio13 (){
        String color;
        String localidad;
        Scanner Miteclado = new Scanner(System.in);
        
        System.out.println("Ingrese un color: ");
        color = Miteclado.next();
        System.out.println("Ingrese una localidad: ");
        localidad = Miteclado.next();
        
        if(color.equals("rojo")){
            if (localidad.equals("avellaneda")){
                System.out.println("sos hincha de Independiente");
            }
            if (localidad.equals("lanus")){
                System.out.println("sos hincha de Independiente");
            }
        }
        
    }
    public static void Ejercicio15 (){
       String nombre, sexo, localidad;
       Scanner entrada = new Scanner(System.in);
      
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese su genero sexual: ");
        sexo = entrada.next();
        System.out.println("Ingrese su localidad: ");
        localidad = entrada.next();
        
        if (nombre.equals("Jose")|| nombre.equals("Maria"))&& sexo.equals("m")&& localidad.equals("moron"){
            System.out.println("Sos de Moron");
        } 
             
        
      
    }
    public static void Ejercicio16(){
        // me falta terminarlo
        Integer edad;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        
        if (edad>17){
            System.out.println("mayor de edad");
        }else if (edad<13){
            System.out.println("es niño");
        }else{
            System.out.println("es adolecente");
    }
}   
    public static void Ejercicio17(){
        //se ingresa un importe, si supera los 100 pesos se  le suma un impuesto
        //del 23%, si no se les descuenta el 50%
        String DatoAux;
        Integer Importe;
        int suma;
        int resta;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su importe: ");
        DatoAux = entrada.next();
        Importe = Integer.parseInt(DatoAux);
        
        suma = Importe+ 23*100/100;
        if (Importe.equals ("100"));
        {System.out.println("El importe es menor que 100");
        }            
     
    }
    
}
    
