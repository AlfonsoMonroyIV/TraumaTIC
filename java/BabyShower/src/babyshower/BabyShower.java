/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package babyshower;

/**
 *
 * @author pcsidsub
 */
public class BabyShower {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Asistente objA = new Asistente("Al",1,1,1);
        int a=objA.preguntarEdad(objA);
        
        int b = objA.getEdad();
    System.out.println(a +" y "+  b);
    }
}
