package oop.encapsulaton;

public class Ecapsulation {
    private String hewan = "Kura - Kura";
    private String Jenis = "Amfibi";
    private int Kaki = 4 ;
    
    //getter
    public String getNamahewan(){
        return hewan;
    }
    public String getJenis(){
        return Jenis;
    }
    public int getKaki(){
        return Kaki;
    }
    
    //setter
    public void setNamahewan(String hewan){
        this.hewan = hewan;
    }
    public void setJenis(String Jenis){
        this.Jenis =  Jenis;
    }
    public void setKaki(int Kaki){
        this.Kaki =  Kaki;
    }
}
