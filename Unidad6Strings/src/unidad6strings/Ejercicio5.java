/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad6strings;

/**
 *
 * @author nando
 */
public class Ejercicio5 {
    public static void cadena5() {
        String cadena = "En un lugar de la Mancha, de cuyo nombre no puedo acordarme";
        String[] palabra = cadena.split(" ");
        
        int cont = 0;
        for (String palabra1 : palabra) {
            if (palabra1.endsWith("o")) {
                cont++;
            }
        }
        System.out.println(cont);
    }
}
