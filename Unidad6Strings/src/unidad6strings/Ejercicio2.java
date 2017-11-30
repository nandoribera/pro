/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad6strings;

import java.util.Scanner;

/**
 *
 * @author ferviu
 */
public class Ejercicio2 {
    
    public static void cadena2(){
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("Escribe una frase o palabra para sustituir las vocales por a: ");
        String cadena = tcl.nextLine();
        
        cadena = cadena.replace('e','a').replace('i','a')
            .replace('o','a').replace('u','a');
        
        System.out.println(cadena);
    }
}
