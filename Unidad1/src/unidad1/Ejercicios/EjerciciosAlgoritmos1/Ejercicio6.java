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
//Calcular e imprimir la suma 1 + 2 + 3 + 4 + 5 + ... + 50.
public class Ejercicio6 {
    public static void main(String[] args) {
        for (int num = 1, cont = 1, suma = 0; cont < 50 + 1; num++){
            if (cont == 50){
                suma = suma + num;
                System.out.print(num);
                System.out.println(" = " + suma);
                cont++;
            }
            else {
            System.out.print(num + " + ");
            suma = suma + num;
            cont++;
            }
        } 
    }
}
