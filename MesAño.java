package mesaño;

import java.util.Scanner;

public class MesAño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        String mesDelAño;
        String Vacaciones;
        int edad;
        //si paso los 80 años y va de vacaciones en invierno debe mostar
        //vacunate contra la gripe
        
        System.out.println("Ingrese mes del año");
        mesDelAño = entrada.next();
        System.out.println("Vas de vacaciones?");
        Vacaciones = entrada.next();
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
                     
        //aprendiendo a utilizar switch, replazando If....Else
        if (Vacaciones.equals("si"))
        {
            switch (mesDelAño)
            {
            case "enero" :
            case "febrero" :   
                System.out.println("Lindo Veranito!!!");
                break;
            case "julio" :
                System.out.println("Lindo Invierno!!!");
                if (edad > 80)
                {
                    System.out.println("Vacunate contra la gripe!!!");
                }
                break;
            //para mostrar el mismo mensaje no es necesario colocar otro case 
            //porque ya lo lee asi que ahorro codigo
            default: 
                System.out.println("No es verano!!!");
                break;            
            }       
        }
        
    }
    
}
