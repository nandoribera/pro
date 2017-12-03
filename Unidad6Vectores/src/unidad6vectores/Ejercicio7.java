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
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Introduce 50 números: ");
        int[] vector = new int[50];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*100 +1);
            System.out.print("Valores del vector: " + vector[i]);
            System.out.println();
        }
        
        System.out.println("**************************");
        int cont = 0;
        for (int i = 0; i < vector.length; i++){
            if(vector[i] == 0){
                System.out.print("Hay un cero en la "
                        + "posición: " + cont);
                break;
            }
            if(vector[i] != 0) {
                cont++;
            }
            if (i+1 == vector.length){
            System.out.println("No hay ningn cero en el vector");
        
            }
        }
        System.out.println();
    }
    
}
