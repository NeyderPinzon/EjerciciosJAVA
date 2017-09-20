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
        String localidad;
        String colorFavorito;        
        
        //tomo datos
        System.out.println("Ingresse nombre: ");
        nombre = entrada.next();
        
        //System.out.println("Ingresse clave: ");
        //clave = entrada.next();
                      
        System.out.println("Ingrese su localidad: ");
        localidad = entrada.next();
        
        System.out.println("Ingrese su color favorito: ");
        colorFavorito = entrada.next();
        
        System.out.println("Ingrese sexo: ");
        sexo = entrada.next();
        
        
       /**
 * si es masculino que viva en lanus o avellaneda y que su color favorito sea el rojo,
 * mostrar el mensaje sos de Independiente
 * si el nombre es Andrea la localidad es moron y el color favorito es verde o azul 
 * debe salir el mensaje feliz primavera 
 */        
        if (nombre.equals("Andrea")&& localidad.equals("moron")&& colorFavorito.equals("verde")|| colorFavorito.equals("azul"))
        {
            System.out.println("Feliz Primavera");}
        
        if (sexo.equals("M")&& localidad.equals("lanus")|| localidad.equals("avellaneda")&& colorFavorito.equals("rojo"))
        {
            System.out.println("Eres de Independiente");    
        }
                   
        
//Instruccion if-else
//if(nombre.equals("Admin")){
//System.out.println("Bienvenido Admin");
//}
//else{
//System.out.println("Bienvenido   "+ nombre);
//}        
//Ingresa M para masculino, F para femenino
//if (sexo.equals("f")){
//System.out.println("Feliz dia de la mujer");
//if (localidad.equals("Lanus")){
//System.out.println("bienvenida");
//}
//if (sexo.equals("f")&& localidad.equals("lanus")){
//System.out.println("Bienvenida");
//}
//if (colorFavorito.equals("celeste")|| colorFavorito.equals("blanco"))
//{
//System.out.println("Patriota");

//}  
//}  

    }         