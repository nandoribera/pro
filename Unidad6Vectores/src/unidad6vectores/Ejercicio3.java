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
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.println("Introduce 20 números: ");
        int[] vector = new int[20];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("introduce el valor " + (i + 1) + " del vector: ");
            vector[i] = tcl.nextInt();
        }
        System.out.println("Vector dividido en bloques de cuatro números: ");
        int aux = 0;
        for (int i = 0; i < vector.length; i++) {
            if (i < aux + 4) {
                System.out.print(vector[i] + ", ");
            } else {
                System.out.println();
                aux = aux + 4;
            }
        }
        System.out.println();
    }
}
