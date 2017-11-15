/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofacturacion;

/**
 *
 * @author alumno
 */
public class Venta {
    
    public Persona ELcliente;
    public Persona Elempleado;
    public Producto productoVendido;
    
    public void MostrarVenta()
    {
        System.out.println("El empleado es: ");
        Elempleado.MostrarPersona();
        
        System.out.println("El cliente es: ");
        ELcliente.MostrarPersona();
        
        System.out.println("El producto es: ");
        productoVendido.MostrarProducto();
        
        float aux;
        aux = productoVendido.DamePrecioFinal();
        System.out.println("El importe a pagar es : "+aux);
        
    }
}
