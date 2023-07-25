/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jappsemana11;


import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class Main {

  
    
    public static ArrayList<String> ListaVentas;
    public static ArrayList<Cliente> ListadoClientes;
    
    public static void main(String[] args) {
       MainFrame oFrame = new MainFrame();
       oFrame.setVisible(true);
       oFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
       ListaVentas = new ArrayList<>();
       ListadoClientes = new ArrayList<Cliente>();
    }
    
}
