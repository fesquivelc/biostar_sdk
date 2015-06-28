/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juvitec.probandojna;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

/**
 *
 * @author RyuujiMD
 */
public interface PruebaDLL extends Library{
    PruebaDLL INSTANCE = (PruebaDLL) Native.loadLibrary((Platform.isWindows() ? "pruebaDLL" : "c"),
                PruebaDLL.class);
    int extraer(int a, int b, int[] holi);
}
