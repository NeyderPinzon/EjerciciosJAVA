package ejemfelizdia;

import java.util.Scanner;

public class EjemFelizDia {

    /**
     * @param args the command line arguments
     * Se pide el sexo y el nombre, si es “f” de femenino,
     * se muestra el mensaje” feliz dia XXXXX”,
     * donde XXXX es el nombre
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        String sexo;
        String nombre;
        
        System.out.println("Ingrese su genero sexual: ");
        sexo = entrada.next();
        
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
        
        if(sexo.equals("f")){
            System.out.println("Feliz Dia " + nombre);
        } else{
            System.out.println("Solo Mujeres Por favor");
        } 
    }
}
    
            
          
    
                
                
     

        