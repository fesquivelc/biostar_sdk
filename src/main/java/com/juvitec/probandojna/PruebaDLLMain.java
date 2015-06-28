/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juvitec.probandojna;

/**
 *
 * @author RyuujiMD
 */
public class PruebaDLLMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PruebaDLL dll = PruebaDLL.INSTANCE;
        
        int holi[] = new int[3];
        int a = 1;
        int b = 2;
        
        int extraer = dll.extraer(a, b, holi);
        
        System.out.println("extraer: "+extraer);
        for(int i = 0; i < holi.length; i++){
            System.out.println("HOLI "+i+": "+holi[i]);
        }
    }
    
}
