/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo1;

/**
 *
 * @author fvp
 */
public class ClaseHija_Consulta extends ClasePadre_Abstracta {
    
    public void Transacciones(){
        System.out.println("------------------------------------");
        System.out.println("Tu saldo actual es:" + getSaldo());
        System.out.println("------------------------------------");
    }
    
    
    
    
}
