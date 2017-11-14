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
public class Piloto {
    
    private String Nombre;
    private String Apellido;
    public Piloto()
    {
        this.Nombre="Natalia";
        this.Apellido="Natalia";
    
    }
    public void satterNombre(String nombre)
    {
        this.Nombre= nombre;
    
    }
    public void setterApellido (String Apellido)
    {
        this.Apellido= Apellido;
    
    }
    public String DameNombreCompletoMay()
    {
        String retorno="";
        
        
        retorno = this.Nombre + ""+this.Apellido;
        retorno = retorno.toUpperCase();
        
        
        
        return retorno;
    
    }

    void SetterApellido(String rogelio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void SetterNombre(String rogelio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}