/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia7P44Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite los grados celsius a modificar: ");
        int temperatura = leer.nextInt();
        
        double fahrenheit = 32 +(9 * temperatura/ 5);
        
        System.out.println("La temperatura de grados Fahrenheit es: " + fahrenheit);
    }
}