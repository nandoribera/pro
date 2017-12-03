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
public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Introduce 20 números: ");
        int[] vector = new int[20];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*100 +1);   
        }
        
        int var = 0;
        int cont = 0;
        int aux = 0;
        for(int i = 0; i < vector.length; i++){
            if (vector[i] > var){
                var = vector[i];
                System.out.print("Valores del vector: " + vector[i]);
                System.out.println();
                aux = cont;
                cont++;
            }
            else {
                System.out.print("Valores del vector: " + vector[i]);
                System.out.println();
                cont++;
            }
        }
        System.out.println("El valor mayor es " + var 
                + " y ocupa la posición " + aux);
    }
}
