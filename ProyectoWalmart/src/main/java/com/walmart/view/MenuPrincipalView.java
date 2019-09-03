package com.walmart.view;

import java.util.Scanner;

public class MenuPrincipalView {
    
     private static Scanner scanner = new Scanner(System.in);
     
     
    public static void main(String[] args) {
        System.out.println("**********************************WALMART**********************************");
        System.out.println("***********Bienvenidos");
        System.out.println("");
        System.out.println("(presione ENTER PARA CONTINUAR)");
        scanner.nextLine();
        if (true) {
            System.out.println("*****************MENU PRINCIPAL*****************");
            System.out.println("-----------------INGRESE UNA OPCION:");
            System.out.println("1.....Agregar Producto");
            System.out.println("2.....Mostrar producto ");
            System.out.println("3.....Modificar producto");
            System.out.println("4.....EliminarProducto");
            System.out.println("5.....Generar reporte");
            System.out.println("6.....Salir");
            System.out.println("************************************************");    
        }
    }
}
