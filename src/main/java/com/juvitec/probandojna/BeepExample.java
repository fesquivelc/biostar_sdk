/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juvitec.probandojna;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 *
 * @author RyuujiMD
 */
public class BeepExample {

    public interface Kernel32 extends Library {
       // FREQUENCY is expressed in hertz and ranges from 37 to 32767
        // DURATION is expressed in milliseconds

        public boolean Beep(int FREQUENCY, int DURATION);

        public void Sleep(int DURATION);
    }

    public static void main(String[] args) {
        Kernel32 lib = (Kernel32) Native.loadLibrary("kernel32",
                Kernel32.class);
        for (int i = 0; i < 4; i++) {
            lib.Beep(900, 500);
            lib.Sleep(500);
            lib.Beep(1800, 500);
            lib.Sleep(200);
        }
    }
}
