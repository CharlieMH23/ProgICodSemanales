/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstapp;

import java.util.Scanner;

public class Numero {
    
    // Constructor de la clase
    public Numero(){
        this.nombreUsuario = "Admin";
    }
    
    public Numero(String pNombreUsuario){
        this.nombreUsuario = pNombreUsuario.toUpperCase();
    }
    
    // Atributo de la clase
    private String nombreUsuario;

    // Propiedades sobre el atributo
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    // Propiedades sobre el atributo
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    // Método de la clase
    public void imprimirNumerosPrimos() {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número límite
        System.out.print("Ingrese el límite: ");
        int limite = scanner.nextInt();

        // Mostrar todos los números primos hasta el límite ingresado
        System.out.println("Números primos hasta " + limite + ":");
        for (int i = 2; i <= limite; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }

        // Cerrar el objeto Scanner
        scanner.nextLine();
        scanner.close(); 
    }
    
    // Método auxiliar para determinar si un número es primo
    private boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}

