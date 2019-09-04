package com.walmart.view;

import java.util.Scanner;

public class MenuPrincipalView {
    
    private Scanner scanner = new Scanner(System.in);
    private String tecla;
    private String textoConsola;
    private int opcion;
    private int opcion2;
    
    
    public void MenuBienvenidos(){
        System.out.println("********************************************************************************************************");
        System.out.println("");
        System.out.println("I8,        8        ,8I              88                                                       ");
        System.out.println("`8b       d8b       d8'              88                                                ,d     ");
        System.out.println(" \"8,     ,8\"8,     ,8\"               88                                                88     ");
        System.out.println("  Y8     8P Y8     8P    ,adPPYYba,  88  88,dPYba,,adPYba,   ,adPPYYba,  8b,dPPYba,  MM88MMM  ");
        System.out.println("  `8b   d8' `8b   d8'    \"\"     `Y8  88  88P'   \"88\"    \"8a  \"\"     `Y8  88P'   \"Y8    88     ");
        System.out.println("   `8a a8'   `8a a8'     ,adPPPPP88  88  88      88      88  ,adPPPPP88  88            88     ");
        System.out.println("    `8a8'     `8a8'      88,    ,88  88  88      88      88  88,    ,88  88            88,    ");
        System.out.println("     `8'       `8'       `\"8bbdP\"Y8  88  88      88      88  `\"8bbdP\"Y8  88            \"Y888  ");
        System.out.println("");
        System.out.println("********************************************************************************************************");
        System.out.println("");
        System.out.println("***********************************presione ENTER para continuar******************************");
        tecla = scanner.nextLine(); 
        while(tecla.equals("")){
            tecla = " ";
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n"); // deja espacios entre el mensaje de bienvenida y el menu principal
            menuPrincipal();
        }
    }
    
    
    
    public void menuPrincipal() {
        
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("______  _                                   _      _             ");
            System.out.println("| ___ \\(_)                                 (_)    | |            ");
            System.out.println("| |_/ / _   ___  _ __  __   __  ___  _ __   _   __| |  ___   ___ ");
            System.out.println("| ___ \\| | / _ \\| '_ \\ \\ \\ / / / _ \\| '_ \\ | | / _` | / _ \\ / __|");
            System.out.println("| |_/ /| ||  __/| | | | \\ V / |  __/| | | || || (_| || (_) |\\__ \\");
            System.out.println("\\____/ |_| \\___||_| |_|  \\_/   \\___||_| |_||_| \\__,_| \\___/ |___/");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("-----------------INGRESE UNA OPCION:");
            System.out.println("1.....Agregar Producto");
            System.out.println("2.....Mostrar producto ");
            System.out.println("3.....Modificar producto");
            System.out.println("4.....EliminarProducto");
            System.out.println("5.....Generar reporte");
            System.out.println("6.....Salir");
            System.out.println("************************************************");    
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Desea regresar al menu principal?");
                    System.out.println("");
                    System.out.println("1: SI // 2 o cualquier otra tecla: NO");
                    opcion2=scanner.nextInt();
                    break;

                case 2:
                    System.out.println("Desea regresar al menu principal?");
                    System.out.println("");
                    System.out.println("1: SI // 2 o cualquier otra tecla: NO");
                    opcion2=scanner.nextInt();
                    break;

                case 3:
                    System.out.println("Desea regresar al menu principal?");
                    System.out.println("");
                    System.out.println("1: SI // 2 o cualquier otra tecla: NO");
                    opcion2=scanner.nextInt();
                    break;

                case 4:
                    System.out.println("Desea regresar al menu principal?");
                    System.out.println("");
                    System.out.println("1: SI // 2 o cualquier otra tecla: NO");
                    opcion2=scanner.nextInt();
                    break;

                case 5:
                    System.out.println("Desea regresar al menu principal?");
                    System.out.println("");
                    System.out.println("1: SI // 2 o cualquier otra tecla: NO");
                    opcion2=scanner.nextInt();
                    break;

                case 6:

                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
                    System.out.println("Desea regresar al menu principal?");
                    System.out.println("");
                    System.out.println("1: SI // 2 o cualquier otra tecla: NO");
                    opcion2=scanner.nextInt();
                    break;
            }
        } while (opcion2== 1);
        
    }
}
