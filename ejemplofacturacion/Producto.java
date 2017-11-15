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
public class Producto { 
    
    private String _descripcion;
    private float _precio;
    private float _cantidad;
    
    public void SetterDescrip(String des)
    {
        this._descripcion = des;
    }
    public void SetterPrecio(float precio )
    {
        this._precio = precio;
    }
    public void Settercantidad(float cant)
    {
        this._cantidad = cant;
    }
    public void MostrarProducto()
    {
        System.out.println("El producto es: "+ this._descripcion);
        System.out.println("El precio es: "+ this._precio);
        System.out.println("La cantidad es: "+ this._cantidad);
    }
    public float DamePrecioFinal()
    {
        float retorno;
        
        retorno = this._precio * this._cantidad;
        
        return retorno;
    }
}
