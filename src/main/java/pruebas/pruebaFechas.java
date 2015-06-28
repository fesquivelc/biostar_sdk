/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import com.personal.utiles.FechaUtil;
import java.util.Calendar;

/**
 *
 * @author RyuujiMD
 */
public class pruebaFechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar cal = Calendar.getInstance();
        long inicio = FechaUtil.soloFecha(cal.getTime()).getTime();
        long fin = FechaUtil.soloFecha(cal.getTime()).getTime();        
        int dias = (int)((fin - inicio) / (24 * 60 * 60 * 1000));
        dias ++;
    }
    
}
