/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo1;
import java.util.Scanner;
/**
 *
 * @author fvp
 */
public abstract class ClasePadre_Abstracta {
    
    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);
    
    public void Operaciones(){
        try{
        int bandera = 0;
        int seleccion =0;
        do{
            do{
                System.out.println("Por favor seleccione una opcion:");
                System.out.println("      1. Consulta de saldo.");
                System.out.println("      2. Retiro de efectivo.");
                System.out.println("      3. Deposito de efectivo.");
                System.out.println("      4. salir de sistema.");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("------------------------------------");
                    System.out.println("Opcion no disponible, vuleva a intentar por favor.");
                    System.out.println("------------------------------------");
                }
            }while(bandera == 0 );
            
            if( seleccion == 1){
                ClasePadre_Abstracta objetoClase = new ClaseHija_Consulta();
                objetoClase.Transacciones();
            }else if (seleccion == 2){
                ClasePadre_Abstracta objetoClase = new ClaseHija_Retiro();
                objetoClase.Transacciones();
            }else if (seleccion == 3){
                ClasePadre_Abstracta objetoClase = new ClaseHija_Deposito();
                objetoClase.Transacciones();
            }else if (seleccion == 4){
                System.out.println("----------------------------");
                System.out.println("Gracias!, vuelva pronto!");
                System.out.println("----------------------------");
                bandera=2;
            }
        }while(bandera !=2 );
    
    }catch(Exception e){
            System.out.println("DIGITE UN VALIDOR VALIDO "+ e);
    }finally{
            System.out.println("Su transaccion ha sido exitosa");
        }
    }
    
    public void Retiro(){
        retiro = entrada.nextInt();
        
    }
    
    public void Deposito(){
        deposito = entrada.nextInt();
        
    }
    
    public abstract void Transacciones();
    
    
    //Metodos Getter y Setter
    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
}
