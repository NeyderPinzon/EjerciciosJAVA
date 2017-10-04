package iteraciones;

import java.util.Scanner;

/**
 *
 * @author alumno
 * 
 */
public class GuiaWhile {
    
    public static void SacarCantidadDeMayores(){
    /*
        pedir cinco edades e informar cuantos mayores a 18 hay
        */
    Integer contador=0;
    String aux;
    Integer edad;
    Integer cantidadDeMayores=0;
    Scanner entrada = new Scanner(System.in);
        
        while (contador<5)
        {
            contador=contador+1;
            System.out.println("Ingrese su edad: "+contador);
            aux = entrada.next();
            edad = Integer.parseInt(aux);
            if (edad>17){
                cantidadDeMayores = cantidadDeMayores+1;
                
            }
        }
        System.out.println("cantidad de mayoes: "+cantidadDeMayores); 
        
    }
    public static void Ejercicio1(){
        //sacar cantidad de positivos
    Integer contador=0;
    String aux;
    Integer numeros;
    Integer numerosPares=9;
    Scanner entrada = new Scanner(System.in);
        
        while (contador<=10)
        {
            contador=contador+1;
            System.out.println("Ingrese numeros al azar: "+contador);
            aux = entrada.next();
            numeros = Integer.parseInt(aux);
            
            if (numeros%2==0){
                numerosPares = numerosPares+1;
                
            }
        }
        System.out.println("numeros pares: "+numerosPares); 
        
    
    }
    public static void Ejercicio2(){
        //sacar cantidad de pares
    }
    public static void Ejercicio3(){
        //(pido nombre)sacar cantidad de Marias
    }
    public static void CuentaRegresiva(){
    //Cuenta regresiva
        Integer contador=10;
                
        while (contador>0){
            System.out.println("Numeros "+contador);
        contador--;
        }
    }
    public static void Cantidad(){
        //Promedio
        Integer contador=0;
        Integer sumador=0;
        Integer cantidad;
        Integer Promedio=0;
        Integer numero;
        cantidad=10;
        Scanner entrada = new Scanner(System.in);
        
        while (contador<cantidad){
            contador++;
            System.out.println("numero: "+ contador);
            numero = entrada.nextInt();
            sumador = sumador+contador;
        }
        Promedio = sumador/cantidad;
        System.out.println("resultado "+Promedio);
    }
    public static void HayAlguien(){
        String respuesta;
        Integer contador=0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("hay alguien para la edad???");
        respuesta = entrada.next();
        
        
        while(respuesta.equals("si")){
            //tomo datos
            contador++;
            
            
            System.out.println("hay alguien mas???");
            respuesta = entrada.next();
        }
        
        
    }
    public static void Promedio(){
        String respuesta;
        Integer contador=0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("hay alguien para la edad???");
        respuesta = entrada.next();
        
        
        while(respuesta.equals("si")){
            //tomo datos
            contador++;
            
            
            System.out.println("hay alguien mas???");
            respuesta = entrada.next();
        }
        
        
    }
         
    }
}
    

