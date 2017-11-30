/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad6strings;

import java.util.Scanner;

/**
 *
 * @author ferviu
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("Escribe tu nombre: ");
        String nombre = tcl.nextLine();
        System.out.println("Escribe tu primer apellido: ");
        String primerApellido = tcl.nextLine();
        System.out.println("Escribe tu segundo apellido: ");
        String segundoApellido = tcl.nextLine();
        
        String nombreCompleto = nombre +" "+ primerApellido + " " + segundoApellido;
        
        System.out.println("");
        System.out.println("Nombre tal cual se introduce: ");
        System.out.println(nombreCompleto);
        
        System.out.println("");
        System.out.println("**************************");
        System.out.println("Nombre en minúsculas: ");
        System.out.println(nombreCompleto.toLowerCase());
        
        System.out.println("");
        System.out.println("**************************");
        System.out.println("Nombre en mayúsculas: ");
        System.out.println(nombreCompleto.toUpperCase());
        
        System.out.println("");
        System.out.println("**************************");
        System.out.println("Longitud de la cadena: ");
        System.out.println(nombreCompleto.length());
        
        System.out.println("");
        System.out.println("**************************");
        System.out.println("Dos primeros carácteres de la cadena: ");
        char car1 = nombreCompleto.charAt(0);
        char car2 = nombreCompleto.charAt(1);
        System.out.print(car1);
        System.out.println(car2);
        
        System.out.println("");
        System.out.println("**************************");
        System.out.println("Dos últimos carácteres de la cadena: ");
        char car3 = nombreCompleto.charAt(nombreCompleto.length()-1);
        char car4 = nombreCompleto.charAt(nombreCompleto.length()-2);
        System.out.print(car4);
        System.out.println(car3);
        
        System.out.println("");
        System.out.println("**************************");
        System.out.println("Número de ocurrencias del último carácter: ");
         char car;
         car = nombreCompleto.charAt(nombreCompleto.length()-1);
         int cont = 0;
         for(int i = 0; i < nombreCompleto.length(); i++){
             if (car == nombreCompleto.charAt(i)){
                 cont++;
             } 
         }
        System.out.print(cont);
        System.out.println();
         
        System.out.println("");
         System.out.println("**************************");
         System.out.println("La cadena con todas las ocurrencias del " +
         "primer carácter en mayúsculas");
         car = nombreCompleto.charAt(0);
         String aux = nombreCompleto.toLowerCase();
         for(int i = 0; i < nombreCompleto.length(); i++){
             if (car == nombreCompleto.charAt(i)){
                 System.out.print(Character.toUpperCase(car));
             }
             else {    
                 System.out.print(aux.charAt(i));
             }
         }
         System.out.println();
         
         System.out.println("");
         System.out.println("**************************");
         System.out.println("La cadena con tres asteriscos por delante y "
                 + "por detrás");
         
         System.out.print("**** " + nombreCompleto + " ****");
         System.out.println();
         
         System.out.println("");
         System.out.println("**************************");
         System.out.println("La cadena invertida");
         StringBuilder builder = new StringBuilder(nombreCompleto);
         String reverse = builder.reverse().toString();
         System.out.println(reverse);
    }
        
   
    
}
