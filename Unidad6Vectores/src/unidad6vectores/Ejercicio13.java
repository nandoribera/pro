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
public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Introduce 50 números: ");
        int[] V = new int[50];
        int[] P = new int [50];
        
        for (int i = 0; i < V.length; i++) {
            V[i] = (int)(Math.random()*50 +1);
            System.out.println("Valores del vector V: " + V[i]
            + " Posición: " + i);
        }
        
        System.out.println("**************************");
        for (int cont = 1; cont < 50;cont++) {
            for (int i = 0; i < V.length; i++) {
                P[i] = V[i] * cont;
                System.out.println("Valores del vector P" + cont
                + ": " + P[i]);
            }
            System.out.println("**************************");
        }
    }
}
