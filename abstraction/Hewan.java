
package oop.abstraction;

public abstract class Hewan {
    protected String nama;
    protected String jenis;
    protected String makanan;
    
    protected void tinggaldiair(){
        System.out.println("Hewan ini habitatnya di Air");
    }
    protected abstract void air();
    
    protected abstract void darat();
    
    protected abstract void amfibi();

}
