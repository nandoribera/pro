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
//Imprimir los números impares desde el 1 al 25, ambos inclusive.
public class Ejercicio2 {
    public static void main(String[] args) {

    for (int num = 1; num < 26; num++){
            if (num % 2 == 0){
                num++;
            }
            else{
             System.out.println(num);
             num++;
            }
        }
    }
}
    
    
