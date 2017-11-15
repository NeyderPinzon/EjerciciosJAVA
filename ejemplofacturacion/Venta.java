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
    //public Producto productoVendido;
    public Producto[] ListadoDeProductos;
    
    public Venta()
    {
        this.ListadoDeProductos = new Producto[3];
    }
    
    
    
    public void MostrarVenta()
    {
        System.out.println("El empleado es: ");
        Elempleado.MostrarPersona();
        
        System.out.println("El cliente es: ");
        ELcliente.MostrarPersona();
        
        System.out.println("El producto es: ");
        //productoVendido.MostrarProducto();
        for (int i = 0; i < this.ListadoDeProductos.length; i++)
        {
           this.ListadoDeProductos[i].MostrarProducto();
        }
        
        float aux=0;
        //aux = productoVendido.DamePrecioFinal();
        //aux = this.ListadoDeProductos[0].DamePrecioFinal()+this.ListadoDeProductos[1].DamePrecioFinal()+this.ListadoDeProductos[2].DamePrecioFinal();
        for (int i = 0; i < this.ListadoDeProductos.length; i++)
        {
            aux = aux + this.ListadoDeProductos[1].DamePrecioFinal();
        }
        
        System.out.println("El importe a pagar es : "+aux);
        
    }
}
