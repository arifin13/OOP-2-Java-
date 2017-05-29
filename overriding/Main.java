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
public class Main {
    public static void main(String[] args){
        Hewan kura = new Hewan();
        KuraKura kurakura = new KuraKura();
        kura.makan();
        kurakura.makan();
    }
}
