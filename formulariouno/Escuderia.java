/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulariouno;

/**
 *
 * @author alumno
 */
public class Escuderia {
    
    public String pasi;
    public String nombre;
    public int AñoFundacion;
    
    
    public Escuderia(int Año, String pais, String nombre){
        this.pasi=pais;
        this.nombre=nombre;
        this.AñoFundacion=Año;
        
    
               
    }

    Escuderia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
