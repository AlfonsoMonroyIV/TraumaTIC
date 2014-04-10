/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aduana;
import java.util.ArrayList;
/**
 *
 * @author pcsidsub
 */
public class Aduana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto obj1 = new Producto("Uno", "dos", "tres",1.25);
        Producto obj2 = new Producto("Uno", "dos", "tres",15);
        ProductoCTRL objcp =new ProductoCTRL();
//        ArrayList<Producto> productos = new ArrayList<Producto>();
        
        objcp.addProducto(obj1);
        objcp.addProducto(obj2);
        
        double a=objcp.getTotal();
  //  productos=objcp.getProductos();
    System.out.println(a);
   // System.out.println(productos);
    }
}
