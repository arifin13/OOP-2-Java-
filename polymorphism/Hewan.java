/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.polymorphism;

/**
 *
 * @author user
 */
class Hewan {
    protected void jenis(){
        System.out.println("Nama Hewan");
    }
}
class KuraKura extends Hewan{
    @Override
    protected void jenis(){
        System.out.println("Jenis Kura - Kura");
    }
}

class Ikan extends Hewan{
    @Override
    protected void jenis(){
        System.out.println("jenis Ikan");
    }
}