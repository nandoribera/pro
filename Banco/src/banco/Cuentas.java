/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ferviu
 */
public class Cuentas {

    ArrayList<CCuenta> cuentas = new ArrayList();
    Scanner tcl = new Scanner(System.in);
    private int total;

    public CCuenta buscarCuenta() {
        System.out.println("Introduce el número de cuenta");
        tcl.nextLine();
        String cuenta = tcl.nextLine();
        if (posCuentaNombre(cuenta) != null) {
            return posCuentaNombre(cuenta);
        } else if (posCuenta(cuenta) != null) {
            return posCuenta(cuenta);
        } else {
            return null;
        }
    }

    public CCuenta posCuentaNombre(String nombre) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNombre().equals(nombre)) {
                return cuentas.get(i);
            }
        }

        return null;
    }

    public CCuenta posCuenta(String cuenta) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getCuenta().equals(cuenta)) {
                return cuentas.get(i);
            }
        }
        return null;
    }

    public void nuevaCuenta() {
        Boolean repetida = false, ctrl = true;
        CCuenta nueva = new CCuenta();
        System.out.println("Creando nueva cuenta...");
        //Control nombre repetido
        do {
            try {
                ctrl = true;
                System.out.println("introduce el nombre: ");
                nueva.setNombre(tcl.nextLine());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                ctrl = false;
            }
        } while (!ctrl);

        //Control cuenta repetida
        do {
            //control número de cuenta
            do {
                try {
                    ctrl = true;
                    System.out.println("Introduce el número de cuenta: ");
                    nueva.setCuenta(tcl.nextLine());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    ctrl = false;
                }
            }while (!ctrl);

                for (int i = 0; i < cuentas.size(); i++) {
                    if (cuentas.get(i).getCuenta().equals(nueva.getCuenta())) {
                        System.out.println("Cuenta repetida");
                    } else {
                        repetida = false;
                    }
                }
        }while (repetida);
                //Control saldo
                do {
                    try {
                        ctrl = true;
                        System.out.println("Introduce el saldo: ");
                        nueva.setSaldo(tcl.nextDouble());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        ctrl = false;
                    }
                }while (!ctrl);
                    //control tipo Interes
                    do {
                        try {
                            ctrl = true;
                            System.out.println("Introduce el tipo de interés: ");
                            nueva.setTipoInteres(tcl.nextDouble());
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            ctrl = false;

                        }
                    } while (!ctrl);

                    cuentas.add(nueva);
                    System.out.println("Cuenta añadida");
                    total = total + 1;
                }
    
    public void modificarCuenta() {
        boolean ctrl = true;
        int opcion = -1;
        int i = -1;
        System.out.println("¿Que cuenta quieres modificar?");
        CCuenta nueva = new CCuenta();
        nueva = this.buscarCuenta();
        System.out.println("Cuenta encontrada");
        System.out.println(nueva.toString());
        
        do
        {
            System.out.println("== == == == MODIFICAR CUENTA == == == == ==");
            System.out.println("\n1. Saldo");
            System.out.println("2. Tipo de interes");
            System.out.println("0. Salir\n");
            System.out.println("Elige una opcion: ");
            opcion=tcl.nextInt();
            
            switch(opcion) {
                case 1:
                //saldo
                do{
                    try{
                        ctrl = true;
                        System.out.println("Introduce el saldo: ");
                        nueva.setSaldo(tcl.nextDouble());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        ctrl = false;
                    }
                }while (!ctrl);
                i=cuentas.indexOf(nueva);
                cuentas.set(i, nueva);
                break;
                case 2:
                //Tipo de interés
                do{
                    try{
                        ctrl = true;
                        System.out.println("Introduce el tipo de interés: ");
                        nueva.setTipoInteres(tcl.nextDouble());
                    }catch(Exception e) {
                        System.out.println(e.getMessage());
                        ctrl = false;
                    }
                } while(!ctrl);
                i=cuentas.indexOf(nueva);
                cuentas.set(i, nueva);
                case 0:
                    System.out.println("Volviendo al menú principal");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 0);
    }
        public void anularCuenta(){
            CCuenta nueva = new CCuenta();
            int opcion = -1;
            int i = -1;
            nueva = this.buscarCuenta();
            System.out.println(nueva.toString());
            
            do {
            System.out.println("== == == == CONFIRMACION == == == ==");
            System.out.println("\n1. Borrar");
            System.out.println("0. Salir\n");
            System.out.println("Elige una opcion:");
            opcion=tcl.nextInt();
            
            switch(opcion) {
                case 1:
                    i = cuentas.indexOf(nueva);
                    cuentas.remove(i);
                    System.out.println("Cuenta borrada!!!");
                    opcion = 0;
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
            } while (opcion != 0);
            total = total -1;
        }
        
        public void consultarCuenta(){
            CCuenta nueva = new CCuenta();
            nueva = this.buscarCuenta();
            System.out.println(nueva.toString());
        }
        
        public void verCuenta(){
            CCuenta nueva = new CCuenta();
            int i = cuentas.indexOf(tcl);
            nueva = cuentas.get(i);
            nueva.toString();
        }
        
        public void visualizarCuentas(){
            CCuenta nueva = new CCuenta();
            for (int i = 0; i < cuentas.size(); i++) {
                System.out.println(cuentas.get(i));
            }
        }
}
