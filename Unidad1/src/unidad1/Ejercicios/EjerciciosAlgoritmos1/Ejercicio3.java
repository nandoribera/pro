/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.Ejercicios.EjerciciosAlgoritmos1;

/**
 *
 * @author nando
 */
//Imprimir los números pares desde el 40 hasta el 60, ambos inclusive.
public class Ejercicio3 {
    public static void main(String[] args) {
        for (int num = 40; num < 60+1; num++){
            if (num % 2 == 0){
                System.out.println(num);
                num++;
            }
            else {
                num++;
            }
        }
    }
    
}
