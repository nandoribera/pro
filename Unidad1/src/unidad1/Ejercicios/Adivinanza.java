/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.Ejercicios;

/**
 *
 * @author ferviu
 */
import java.util.*;

class Adivinanza {

    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        int valor;
        System.out.println("Piensa un numero");
        tcl.nextLine();
        System.out.println("Multiplicalo por 5");
        tcl.nextLine();
        System.out.println("Sumale 6");
        tcl.nextLine();
        System.out.println("Multiplıcalo por 4");
        tcl.nextLine();
        System.out.println("Sumale 9");
        tcl.nextLine();
        System.out.println("Multiplıcalo por 5");
        valor = tcl.nextInt();
        System.out.println("El numero que habıas pensado es: ");
        System.out.println((valor - 165) / 100);
    }
}
