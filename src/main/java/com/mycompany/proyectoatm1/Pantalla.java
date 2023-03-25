/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoatm1;

/**
 *
 * @author Sheyl
 */
public class Pantalla {
    private String mensaje;
    
    public void mostrarMensaje(String mensaje) {
    System.out.print(mensaje);
    }
    
    public void mostrarMenu() {
        System.out.println("Menu principal");
        System.out.println("1. Ver saldo");
        System.out.println("2. Retirar efectivo");
        System.out.println("3. Depositar fondos");
        System.out.println("4. Salir");
        System.out.println("Escriba una opcion: ");
    }
    
     public void menuRetiro() {
        System.out.println("Menu retiro");
        System.out.println("1. 20");
        System.out.println("2. 40");
        System.out.println("3. 60");
        System.out.println("4. 100");
        System.out.println("5. 200");
        System.out.println("6. Salir");
    }
}
