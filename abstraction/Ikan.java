
package oop.abstraction;

/**
 *
 * @author user
 */
public class Ikan extends Hewan{

    @Override
    protected void air() {
        System.out.println("Hewan ini tinggal di Air"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void darat() {
        System.out.println("Hewan ini tidak dapat tinggal di darat"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void amfibi() {
        System.out.println("Hewan ini hanya dapat bertempat tinggal di satu alam (Air)"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
