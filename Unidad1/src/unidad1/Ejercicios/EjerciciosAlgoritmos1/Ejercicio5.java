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
//Imprimir los números 100, 95, 90, 85, ..., 20
public class Ejercicio5 {
    public static void main(String[] args) {
        for (int num = 100; num > 20 - 1; num = num - 5){
            System.out.println(num);
        }
    }
}
