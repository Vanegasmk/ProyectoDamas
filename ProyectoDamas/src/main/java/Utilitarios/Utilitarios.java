package com.utn.utilitarios;

import java.util.Scanner;

public class Utilitarios {

    public static double capturaValorDouble(String pTextoPeticion){
        double valorRetorno = 0;
        boolean continuar = true;
        Scanner otroTeclado = new Scanner(System.in);
        while (continuar == true){
            try{
                System.out.println(pTextoPeticion);
                otroTeclado = new Scanner(System.in);
                valorRetorno = otroTeclado.nextDouble();
                continuar = false;
            }catch (Exception e){
                System.out.println("Valor ingresado incorrecto, debe digitar un valor double!!");
            }
        }
        return valorRetorno;
    }

    public static int capturaValorEntero(String pTextoPeticion){
        int valorRetorno = 0;
        boolean continuar = true;
        Scanner otroTeclado = new Scanner(System.in);
        while (continuar == true){
            try{
                System.out.println(pTextoPeticion);
                otroTeclado = new Scanner(System.in);
                valorRetorno = otroTeclado.nextInt();
                continuar = false;
            }catch (Exception e){
                System.out.println("Valor ingresado incorrecto, debe digitar un valor entero!!");
            }
        }
        return valorRetorno;
    }

    public static String capturaValorString(String pTextoPeticion){
        Scanner otroTeclado = new Scanner(System.in);
        System.out.println(pTextoPeticion);
        String valorRetorno = otroTeclado.nextLine();
        return valorRetorno;
    }
}
