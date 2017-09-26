package ferreteriaferrere;

import java.util.Scanner;

public class FerreteriaFerrere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
         
         int ancho, largo, metros;
         
         System.out.println("Ingrese el ancho del terreno: ");
         ancho = entrada.nextInt();
         
         System.out.println("Ingrese el largo del terreno: ");
         largo = entrada.nextInt();
         
         metros= ancho * largo * 3;
         
         System.out.printf("Necesitamos %d de alambre para dar 3 vueltas \n \n"
         , metros); 
         
        //Sabiendo que necesito 2 bolsas de cal y 3 de cemento para una pared de
        //1 metro cuadrado, se pide el alto y ancho y se informa la cantidad de 
        //cada material que necesito 
         
         int alto, anchoDos, material;
         
         System.out.println("Ingrese el alto de la pared: ");
         alto = entrada.nextInt();
         
         System.out.println("Ingrese el ancho de la pared:  ");
         anchoDos = entrada.nextInt();
         
         material = alto * anchoDos;
         System.out.printf("La superficie es %d "
         , material);  
         
         //Otra forma de concatenar %d
         //para escibir en otra linea \n
         //recordar todo para no olvidar, debo estudia en casa todo los dias si
         //es posible
         System.out.printf(" la cantidad de Cal que necesito es: %d \n"
                 + "la cantidad de cemento que necesito es: %d \n\n"
         , (material* 2),(material*3));
         
         
         //se pide una temperatura y se pide si se quiere pasar Celsius o 
         //Fahrenheit, hacer la cuenta y mostrar el resultado
         //formula para pasar a una temperatura :F = ºC x 1.8 + 32, 
         //ºC = (ºF-32) ÷ 1.8
            
         String temperatura;
         
         System.out.println("Ingrese una temperatura: ");
         temperatura = entrada.next();
         


// TERMINAR ESTO EN CASA
         temperatura = ((-32)/1.8);
        if (temperatura.equals(" "))         
        {
            System.out.println("la temperatura en centrigrados es:  "+ temperatura);
        }
             
               
    }
    
}
