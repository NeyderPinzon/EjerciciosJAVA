
package ejemplofacturacion; 

/**
 *
 * @author alumno
 */
public class EjemploFacturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //se registra una venta
       
       Venta NuevaVenta ;
       NuevaVenta = new Venta();
       
       Persona unCliente = new Persona("Jose ", " Felix");
       Persona unEmpleado = new Persona("Martin " , "Fierro ");
       Producto unProducto = new Producto();
       unProducto.Settercantidad(3);
       unProducto.SetterDescrip("Fanta");
       unProducto.SetterPrecio(35);
       
       Producto unProducto2 = new Producto();
       unProducto2.Settercantidad(3);
       unProducto2.SetterDescrip("Sprite");
       unProducto2.SetterPrecio(40);
       
       Producto unProducto3 = new Producto();
       unProducto3.Settercantidad(3);
       unProducto3.SetterDescrip("Cocacola");
       unProducto3.SetterPrecio(45);
       
       NuevaVenta.ELcliente = unCliente;
       NuevaVenta.Elempleado = unEmpleado;
       //NuevaVenta.productoVendido = unProducto;
       NuevaVenta.ListadoDeProductos[0] = unProducto;
       NuevaVenta.ListadoDeProductos[1] = unProducto2;
       NuevaVenta.ListadoDeProductos[2] = unProducto3;
            
       NuevaVenta.MostrarVenta(); 
        
    }
    
}
