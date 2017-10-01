package ferreteriaferretelamparas;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class FerreteriaFerreteLamparas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String marca;
        Integer precio= 35;
        Integer cantidad;
        String AuxCantidad;
        Integer precioBruto;
        Double precioFinal= (double)0;
        
        System.out.println("Ingrese la marca: ");
        marca = entrada.next();
        
        System.out.println("ingrese cantidad");
        AuxCantidad =entrada.next();
        cantidad = Integer.parseInt(AuxCantidad);
        
        precioBruto = cantidad * precio;
        
        if (cantidad>5)
        { 
            precioFinal = precioBruto* 0.5;
        }else
        {
            //todos los menores a 5
            if(cantidad==5)
            {
                if(marca.equals("argentinaluz"))
                {
                    precioFinal = precioBruto* 0.6;
                }
                else
                {
                    precioFinal = precioBruto* 0.7;
                }    
                    
            }else
            {
                //todos los menores a 4
                if(cantidad==4)
                {
                    if(marca.equals("argentinaluz")|| marca.equals("felipelamparas"))
                    {
                        precioFinal = precioBruto* 0.75;
                    }else
                    {
                        precioFinal = precioBruto* 0.80;
                    }
                }else 
                {
                    if (cantidad==3)
                    {
                        if (marca.equals("argentinaluz"))
                            
                            precioFinal = precioBruto* 0.85;
                        
                    }else  if(marca.equals("felipelamparas")){
                            System.out.println(precioBruto);
                            precioFinal = precioBruto* 0.90;  
                    }
                    
            }             
            
        }    
        
        System.out.println("Debe pagar: " + precioFinal);
        
        }
    
    }
}

    

