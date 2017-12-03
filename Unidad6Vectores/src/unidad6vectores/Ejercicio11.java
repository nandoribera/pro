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
public class Ejercicio11 {
    public static void main(String[] args) {
         System.out.println("Introduce 10 números: ");
        int[] P = new int[10];
        int[] V = new int [10];
        
        for (int i = 0; i < P.length; i++) {
            P[i] = (int)(Math.random()*20 +1);
            System.out.println("Valores del vector P: " + P[i]
            + " Posición: " + i);
        }
        
        System.out.println("**************************");
        for (int i = 0; i < P.length; i++){
            if(P[i] > 10){
                V[i] = P[i];
                System.out.println("Valores del vector V: " + P[i]
            + " Posición: " + i);
            }
        }
    }
}
