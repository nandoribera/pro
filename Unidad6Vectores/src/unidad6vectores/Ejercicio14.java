/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad6vectores;

/**
 *
 * @author nando
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        int[] V = new int[50];
        int[] P = new int[50];

        for (int i = 0; i < V.length; i++) {
            V[i] = (int) (Math.random() *50 +1);
            System.out.println("Valores del vector V: " + V[i]
                    + " Posición: " + i);
        }
        System.out.println("**************************");
        int cont = 0;
        for (int i = 0; i < V.length; i++) {
            if (V[i] % 2 == 0 && V[i] != 0) {
                P[i] = V[i];
                cont++;
            }
        }
        if (cont == 0){
            System.out.println("No hay números pares en V");
        }
        else {
        for (int i = 0; i < P.length; i++) {
            if (P[i] == 0) {

            } else {
                System.out.println("Valores del vector V pares: "
                        + P[i]);
            }
        }
        }
    }
}
