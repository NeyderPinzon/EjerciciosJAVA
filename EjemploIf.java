package ejemploif;

import java.util.Scanner;

public class EjemploIf {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //Defino las variables        
        String nombre;
        String clave;
        String sexo;
        
        //tomo datos
        System.out.println("Ingresse nombre: ");
        nombre = entrada.next();
        
        System.out.println("Ingresse clave: ");
        clave = entrada.next();
        
        System.out.println("Ingrese sexo: ");
        sexo = entrada.next();
        
        //Instruccion if-else
        if(nombre.equals("Admin")){
            System.out.println("Bienvenido Admin");
        }
        else{
            System.out.println("Bienvenido   "+ nombre);
            
        }        
        //Ingresa M para masculino, F para femenino
        if (sexo.equals("f")){
            System.out.println("Feliz dia de la mujer");
        }
        
        
        
    }
    
}
