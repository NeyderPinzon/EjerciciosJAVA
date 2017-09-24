package ejemindependiente;

import java.util.Scanner;

public class EjemIndependiente {

    /**
     * @param args the command line arguments
     * Se ingresa un color y una localidad,
     * si es avellaneda o Lanús y el color es rojo,
     * mostrar el mensaje “sos de independiente
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        String color;
        String localidad;
        
        System.out.println("Ingrese un color: ");
        color = entrada.next();
        
        System.out.println("Ingrese localidad: ");
        localidad = entrada.next();
        
        if(color.equals("rojo")&& localidad.equals("avellaneda") || localidad.equals("lanus"));
        {
            System.out.println("Sos de Independiente");
        }
                
                
                
    }
    
}
