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
public class Main {
    public static void main(String[] args){
        Hewan hewan = new Hewan();
        Hewan kurakura = new KuraKura();
        Hewan ikan = new Ikan();
        hewan.jenis();
        kurakura.jenis();
        ikan.jenis();
    }
}
