/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author ferviu
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int operacion = -1;
        Cuentas cuenta = new Cuentas();
        
        do{
        
        System.out.println("=========== BANCO UNIVERSAL ==========");
        System.out.println("1.Alta de Cuentas \n"
                + "2. Consulta de una Cuenta \n"
                + "3. Modificar Cuentas \n"
                + "4. Anular cuentas \n"
                + "5. Listado de cuentas \n"
                + "0. Salir");
            System.out.println("Selecciona una opción: ");
            operacion = tcl.nextInt();
            
        switch (operacion) {
            case 1:
                cuenta.nuevaCuenta();
                break;
            case 2:
               cuenta.consultarCuenta();
               break;
            case 3:
                cuenta.modificarCuenta();
                break;
            case 4:
                cuenta.anularCuenta();
                break;
            case 5:
                cuenta.visualizarCuentas();
                break;
            case 0:
                System.out.println("Saliendo del programa");
            default:
                System.out.println("Opción incorrecta");
                break;
        }
        
        } while(operacion !=0);
    }
    
}
