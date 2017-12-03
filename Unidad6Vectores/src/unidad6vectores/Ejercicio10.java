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
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Introduce 20 números: ");
        int[] vector = new int[20];
        int[] repetidos = new int [20];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*10 +1);
            System.out.println("Valores del vector: " + vector[i]
            + " Posición: " + i);
        }
        
        System.out.println("**************************");
        for (int i = 0; i < vector.length; i++){
            System.out.println("Valores del vector: " + vector[i]
            + " Posición " + i);
            for (int a = i+1; a < vector.length; a++) {
                if (vector[i] == vector[a] && vector[i] != repetidos[i]) { 
                repetidos[i] = vector[i];
                for (int b = i+1; b < vector.length;b++){
                if (vector[i] == vector[b])
                System.out.println("Coincidencia con: " + vector[a]+ " en la "
                        + "posición " + b);
                }
                System.out.println();        
                }
            }
        }
    }
}
