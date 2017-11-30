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
public class Ejercicio3 {
    public static void cadena3() {
        String cadena = "Hola que tal";
        String cadena2 = "Adiós";
        
        System.out.println("Mitad de cadenas: ");
        System.out.print("Mitad de " + cadena + " : "); 
        for(int i = 0; i < cadena.length()/2; i++){
            System.out.print(cadena.charAt(i));
        }
        
        System.out.println();
        System.out.print("Mitad de " + cadena2 + " : "); 
        for(int i = 0; i < cadena2.length()/2; i++){
            System.out.print(cadena2.charAt(i));
        }
        System.out.println();
    }
}
