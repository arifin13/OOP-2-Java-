
package oop.abstraction;

public class Kurakura extends Hewan{

    @Override
    protected void air() {
    System.out.println("Hewan ini dapat tinggal di Air");
    }

    @Override
    protected void darat() {
    System.out.println("Hewan ini dapat tinggal di darat");
    }

    @Override
    protected void amfibi() {
    System.out.println("Hewan ini dapat bertempat tinggal di 2 Alam");
    }
    
}
