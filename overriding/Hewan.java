/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.overriding;

/**
 *
 * @author user
 */
class Hewan {
    public void makan(){
        System.out.println("Makanan Hewan Ini Ganggang");
    }
}
class KuraKura extends Hewan{
    @Override
    public void makan(){
        System.out.println("Kura - Kura memakan ganggang");
        super.makan();
    }
}