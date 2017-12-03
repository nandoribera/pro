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
public class Ejercicio4 {
    public static void main(String[] args) {

        System.out.println("Introduce 10 números: ");
        int[] vector = new int[10];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*100 +1);
        }
        
        System.out.println("****************************");
        System.out.println("Números pares y posición del vector que ocupan: ");
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0 && vector[i] != 0) {
                System.out.print(vector[i] + ", ");
                System.out.println("Posición " + cont);
                cont++;
            }
            else {
                cont++;
            }
        }
            
        System.out.println("Números impares y posición del vector que ocupan: ");
        int cont2 = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 != 0 && vector[i] != 0) {
                System.out.print(vector[i] + ", ");
                System.out.println("Posición " + cont2);
                cont2++;
            }
            else {
                cont2++;
            }
        }
    }
}
