/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad6vectores;

import java.util.Scanner;

/**
 *
 * @author ferviu
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.println("Introduce 10 números: ");
        String[] vector = new String[10];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("introduce el valor " + (i + 1) + " del vector: ");
            vector[i] = tcl.nextLine();
        }

        System.out.println("Los caracteres alfanumericos que ocupan las posiciones pares del "
                + "vector son: ");
        for (int i = 0; i < vector.length; i++) {
            if (i % 2 == 0) {
                System.out.print(vector[i] + ", ");
            }
        }
        
        System.out.println();
        System.out.println("Los caracteres alfanumericos que ocupan las posiciones impares del "
                + "vector son: ");
        for (int i = 0; i < vector.length; i++) {
            if (i % 2 != 0) {
                System.out.print(vector[i] + ", ");
            }
        }
        System.out.println();
    }
}
