package oop.interfaces;

public abstract class Lowsocket implements Socket{  
    protected String low;
    
    protected void LowPanas(){
        System.out.println("Keadaan Panas Menurun");
    }
    protected abstract void Soclow();
    protected abstract void NuklirPower();
    protected abstract void PanasPower();
}
