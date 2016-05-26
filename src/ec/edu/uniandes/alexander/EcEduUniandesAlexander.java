/*
 *   UNIANDES - PUYO
 *   Octavo Semestre
 *   Alexander Ulloa
 *   23/05/2016
 */
package ec.edu.uniandes.alexander;

import java.util.ArrayList;

public class EcEduUniandesAlexander {

    public static void main(String[] args) {
       ArrayList<clsProducto> producto = new ArrayList<clsProducto>();
        
        clsProducto p0= new clsProducto(1,"clavo",20,clsProducto.unidad.Libras);
         clsProducto p1= new clsProducto(2,"tornillos",20,clsProducto.unidad.Libras);
          clsProducto p2= new clsProducto(3,"pernos",20,clsProducto.unidad.Libras);
          
          producto.add(p0);
            producto.add(p1);
              producto.add(p2);
              imprimir(producto);
    }
              
               public static void imprimir(ArrayList<clsProducto> p)
            {
                for(clsProducto persona : p){
                    System.out.println("***********************");
                    System.out.println("  ID: " + persona.ID());
                    System.out.println("  NOMBRE: " + persona.Nombres());
                    System.out.println("  VALOR: " + persona.Valor());
                    System.out.println("  UNIDAD: " + persona.Unidad());
                               
                }
          
      
        
    }
    
}
