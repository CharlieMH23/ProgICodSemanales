/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package japplicationb;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    static ArrayList<Cliente> ListadoClientes; //Declare
    
    public static void main(String[] args) {
        // TODO code application logic here
        ListadoClientes = new ArrayList<>();
        FrmPrincipal oFrmPrincipal = new FrmPrincipal();
        oFrmPrincipal.setVisible(true);
        oFrmPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
    
}
