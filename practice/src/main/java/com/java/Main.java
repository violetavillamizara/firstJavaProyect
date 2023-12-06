package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 0;
        int accion=0;
        do {
            System.out.println("Sistema Bancario");
            System.out.println("1. para depósitos");
            System.out.println("2. para retiros");
            System.out.println("3. para ver saldo");
            System.out.println("4. para salir");
            System.out.println("seleccione un numero para la accion: ");
            accion = scanner.nextInt();
             
            if (accion==1){
                System.out.println("Cuanto desea depositar?");
                int deposito = scanner.nextInt();
                if (deposito!=0){
                    saldo=saldo+deposito;
                    System.out.println("Su saldo ahora es: " + saldo);
                }
            }
            else if (accion==2){
                System.out.println("Cuantto desea retirar?");
                int retiro = scanner.nextInt();
                if (saldo>=retiro){
                    System.out.println("retiraste "+ retiro);
                    saldo=saldo-retiro;
                    System.out.println("Su saldo ahora es:"+ saldo);
                } else {
                    System.out.println("No tienes suficiente saldo");
                }
            }
            else if (accion==3){
                System.out.println("Su saldo actual es: " + saldo);
            }
            else {
                System.out.println("saliste");
            }

            
        } while(accion!=4);
    scanner.close();
    }
}