/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

/**
 *
 * @author ferviu
 */
public class Unidad02Ejercicio14 {
    public static void main(String[] args) {
        boolean a = 25>20 && 13>5;
        boolean b = 10 + 4 < 15 -3 || 2* 5 +1 > 14 -2 *2;
        boolean c = 4 *2 <= 8 || 2 *2 < 5 && 4 > 3 +1;
        boolean d = 10 <= 2 * 5 && 3<4 || ! (8>7) && 3*2 <= 4*2-1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
