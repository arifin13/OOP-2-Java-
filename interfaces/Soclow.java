package oop.interfaces;

public class Soclow extends Lowsocket {

    @Override
    protected void Soclow() {
    System.out.println("Tegangan Lagi turun");    
    }

    @Override
    public String getPower() {
        return "Ini Untuk Mendapatkan Power";
    }

    @Override
    public void countPower() {
        System.out.println("Ini Tegangan Nuklir");    
    }

    @Override
    protected void NuklirPower() {
        System.out.println("Ini Tegangan Nuklir Power"); 
    }

    @Override
    protected void PanasPower() {
        System.out.println("Ini Tegangan Panas Power"); 
    }
    
}
