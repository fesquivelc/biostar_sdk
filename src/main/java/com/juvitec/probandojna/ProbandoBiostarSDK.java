/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juvitec.probandojna;

import com.juvitec.probandojna.BiostarSDK.BSSDK;
import com.sun.jna.ptr.IntByReference;

/**
 *
 * @author RyuujiMD
 */
public class ProbandoBiostarSDK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int MAX_DEVICE = 128;
        IntByReference mHandle = new IntByReference(-1);
        IntByReference numOfDevice = new IntByReference(0);
        
        int[] m_DeviceID = new int[MAX_DEVICE];
        int[] m_DeviceTypes = new int[MAX_DEVICE];
        int[] m_DeviceAddr = new int[MAX_DEVICE];
        
        BSSDK sdk = BSSDK.INSTANCE;
        int resultado = sdk.BS_InitSDK();
        if(resultado == BiostarSDK.BS_SUCCESS){
            System.out.println("SE LOGRÓ INICIALIZAR BIOSTAR SDK");
        }else{
            System.out.println("NO SE LOGRÓ INICIALIZAR BISOTAR SDK");
        }
        
        String ipAddr = "192.168.0.15";        
        resultado = sdk.BS_OpenSocket(ipAddr, 1471, mHandle);
        
        System.out.println("RESULTADO: "+resultado+" HANDLE "+mHandle.getValue());
        
        resultado = sdk.BS_OpenInternalUDP(mHandle);
        if(resultado == BiostarSDK.BS_SUCCESS){
            System.out.println("SE LOGRÓ ABRIR INTERNAL UDP");
        }else{
            System.out.println("NO SE LOGRÓ ABRIR INTERNAL UDP");
        }
        resultado = sdk.BS_SearchDeviceInLAN(mHandle.getValue(), numOfDevice, m_DeviceID, m_DeviceTypes, m_DeviceAddr);
        
        if(resultado == BiostarSDK.BS_SUCCESS){
            System.out.println("ES POSIBLE ENCONTRAR EQUIPOS, NRO: "+numOfDevice.getValue());
        }else{
            System.out.println("NO ES POSIBLE ENCONTRAR EQUIPOS");
        }
        
    }
}
