package oop.interfaces;

public class PanasPower implements Socket{

    @Override
    public String getPower() {
    return "Ini tenaga Nuklir";   
    }

    @Override
    public void countPower() {
    System.out.println("ini tenaga Nuklir"); 
    }


}
