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
//Calcular e imprimir el producto 1 * 2 * 3 * 4 * 5 * ... * 20.
public class Ejercicio7 {
    public static void main(String[] args) {
        for (int num = 1, multi = 1; num < 20 + 1; num++){
                multi = multi * num;
                System.out.print(num);
                System.out.println(" = " + multi);
            }
        System.out.print(multi);
        }
        
    }
