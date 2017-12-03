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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.println("Introduce 10 números: ");
        int[] vector = new int [10];
        
        for (int i = 0; i < vector.length ;i++){
            System.out.print("introduce el valor "+ (i+1) +" del vector: ");
            vector[i] = tcl.nextInt();
        }
        System.out.print("Los valores del vector son ");
        for (int i = 0; i < vector.length; i++)
            if (i == vector.length -1){
                System.out.println(vector[i]);
            }
            else{
            System.out.print(vector[i]+ ", ");
            }
    }
}
