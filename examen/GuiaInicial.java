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
public class GuiaInicial {
    
    public static void saludar() {
        // TODO code application logic here
        //public: cualquiera la puede ver
        //static: estaticco
        //void: no retorna ningun valor
        
        System.out.println("Buenas tardes"); 
        
    }
    public static void HacerEjercicio1 (){
        System.out.println("Esto funciona de maravilla");
    }
    public static void Ejercicio2 (){
        String nombre;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
    }
    public static void Ejercicio3(){
        String nombre;
        String apellido;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese su apellido: ");
        apellido = entrada.next();
        
        System.out.println("Su nomnbre es: "+nombre);
        System.out.println("y su apellido es: "+apellido);
        
    }
    public static void Ejercicio4(){
        Integer edad;
        String nombre;
        String Dato;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("ingrese su edad: ");
        Dato = entrada.next();
        edad = Integer.parseInt(Dato);
        
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
        
        System.out.println("Usted se llama: "+nombre);
        System.out.println("y su edad es: "+edad);
        
        
    }
    public static void Ejercicio5(){
        Integer num1, num2, resultado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = entrada.nextInt();
        
        resultado = num1+num2;
        
        System.out.println("la suma de los numero es: "+resultado);
     
    }
    public static void Ejercicio6(){ 
        
    }
}
    

