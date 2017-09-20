package proyectodiecisiete;

import java.util.Scanner;

public class ProyectoDiecisiete {

    /**
     * @param args the command line arguments
     * se pide una edad y se informa si es niño adolencente o mayor de edad
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String datosAux;
        Integer edad;
              
        System.out.println("Ingrese su edad: ");
        datosAux = entrada.next();
        edad = Integer.parseInt(datosAux);
        
        if (edad>17)
        {
            System.out.println("mayor de edad");
        }else{
        // son menores a 18
        if (edad<13)
        {
            System.out.println("es niño");
        }else
        {
            System.out.println("es adolecente");
         }
    
   } 
    
    //Ejemplo del profe
    //Integer edad;
    //scanner
    //
    //edad = 99;// esto se muestra por pantalla scanner
    
    
}
