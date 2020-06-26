/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo1;

import javax.swing.JOptionPane;

/**
 *
 * @author fvp
 */
public class Repo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //JOptionPane.showMessageDialog(null,"Hola en Github!");
        //JOptionPane.showMessageDialog(null,"Modificado desde Github!"); //modificado por Allen Viquez
        
        ClasePadre_Abstracta objeto = new ClaseHija_Consulta();
        objeto.setSaldo(500);
        objeto.Operaciones();
        
    }
    
}
