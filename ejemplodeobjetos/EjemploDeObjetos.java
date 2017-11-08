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
public class EjemploDeObjetos {

    /**
     * Necesito una lapicera con dos colores, rojo y azul
     * cada uno tiene una cantidad de 100
     * el metodo escribir recibe el color =escribir("rojo",100),
     * y la cantidad de tinta a utilizar,
     * de no tener la cantidad suficiente se muestra un mensaje
     * el metodo cargar tinta recibe el color cargar("rojo",180)
     * y la cantidad para cargar 
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Lapicera algunalapicera = new Lapicera();
        algunalapicera.escribir("rojo", 120);
        algunalapicera.cargar("azul", 50);
        algunalapicera.escribir("rojo", 90);
    }
    
}
