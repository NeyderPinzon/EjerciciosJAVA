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
public class FormularioUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carrera NuevaCarrera = new Carrera();
        
        NuevaCarrera.CorrerCarrera(5);
        
        Auto Ganador = NuevaCarrera.DameElGanador();
        
        Ganador.Mostrar();
        
    }
    
}
