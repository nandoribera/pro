/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad6strings;

/**
 *
 * @author ferviu
 */
public class Ejercicio4 {
    public static void cadena4(){
        String cadena = "esto1234es5678bueno900";
        
        String replace = cadena.replaceAll("es", "por no");
        String nonum = cadena.replaceAll("\\d+" , "*");
        
        System.out.println(replace);
        System.out.println(nonum);
    }
}
