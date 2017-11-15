
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
       unProducto.SetterDescrip("fanta");
       unProducto.SetterPrecio(35);
       
       NuevaVenta.ELcliente = unCliente;
       NuevaVenta.Elempleado = unEmpleado;
       NuevaVenta.productoVendido = unProducto;
                  
            
       NuevaVenta.MostrarVenta();
        
    }
    
}
