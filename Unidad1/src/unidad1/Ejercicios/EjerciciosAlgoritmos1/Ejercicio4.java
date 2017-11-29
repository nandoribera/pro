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
//Imprimir los números 48, 52, 56, ..., 120.
public class Ejercicio4 {
    public static void main(String[] args) {
        for (int num = 48; num < 120+1; num = num + 4){
            System.out.println(num);
        }
    }
}
