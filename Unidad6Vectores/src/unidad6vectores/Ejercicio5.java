/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad6vectores;

/**
 *
 * @author ferviu
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Introduce 50 números: ");
        int[] vector = new int[50];
        int[] pares = new int[50];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 50 + 1);
        }

        System.out.println("Los números pares del "
                + "vector son: ");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0 && vector[i] != 0) {
                for (int a = 0; a < pares.length; a++) {
                    pares[a] = vector[i];
                }
            }
            System.out.print(pares[i] + ", ");
            System.out.println();
        }

        int sum = 0;
        for (int b = 0; b < pares.length; b++) {
            sum = sum + pares[b];
        }
        System.out.println("La suma de los numéros pares del vector es: " + sum);
    }
}
