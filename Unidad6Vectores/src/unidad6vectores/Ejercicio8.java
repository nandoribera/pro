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
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Introduce 20 números: ");
        int[] vector = new int[20];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*100 +1);
            System.out.print("Valores del vector: " + vector[i]);
            System.out.println();
        }
        System.out.println("**************************");
        int cont = 0;
        int cant = 0;
        for (int i = 0; i < vector.length; i++){
            if (vector[i] > 10) {
                System.out.print(vector[i] + ", ");
                System.out.println("Posición " + cont);
                cant++;
                cont++;
            }
            else {
                cont++;
            }
        }
        System.out.println("Hay " + cant +" elementos mayores de 10.");
    }
}
