/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jclaserepo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Geometria {
   
    
    public void RomboGeometrico(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura del rombo: ");
        int altura = scanner.nextInt();

        if (altura % 2 == 0) {
            System.out.println("La altura debe ser un número impar.");
            return;
        }

        int espacios = altura / 2;
        int asteriscos = 1;

        // Imprimir la mitad superior del rombo
        for (int i = 0; i < altura / 2 + 1; i++) {
            
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }

            System.out.println();

            espacios--;
            asteriscos += 2;
        }

        // Imprimir la mitad inferior del rombo
        espacios = 1;
        asteriscos = altura - 2;

        for (int i = 0; i < altura / 2; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }

            System.out.println();

            espacios++;
            asteriscos -= 2;
        }
        
        
        
    }
}
