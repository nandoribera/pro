/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author ferviu
 */
public class Ejercicio4 {
    public static void main (String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("Introduce el primer número:");
        int primerNum = tcl.nextInt();
        
        System.out.println("Introduce el segundo número:");	
        int segundoNum =tcl.nextInt();
        
        int resultado;
        resultado = primerNum + segundoNum;
        System.out.println("La suma es " + primerNum + " + " + segundoNum + 
                " = " + resultado);
        
    }
}
