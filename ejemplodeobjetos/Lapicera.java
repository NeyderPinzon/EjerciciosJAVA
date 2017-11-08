/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodeobjetos;

/**
 *
 * @author alumno
 */
public class Lapicera {
    private int rojo;//atributos de la clase
    private int azul;//atributos de la clase
    
    public void escribir (String color,int cantidad){
        
        if (color.equalsIgnoreCase("rojo")){
            
            if (cantidad < this.rojo){
                
                this.rojo = this.rojo - cantidad;
            }else{
                System.out.println("No hay rojo suficiente");
            }
        }
        if (color.equalsIgnoreCase("azul")){
            
            if (cantidad < this.azul){
                
                this.azul = this.azul - cantidad;
            }else{
                System.out.println("No hay azul suficiente");
            }
        }
    
    }  
    public void cargar (String color,int cantidad){
        
        if (color.equalsIgnoreCase("rojo")){
            
            this.rojo= this.rojo + cantidad;
            
        }
        if (color.equalsIgnoreCase("azul")){
            
            this.azul= this.azul + cantidad;
            
        }
        
    }
}
