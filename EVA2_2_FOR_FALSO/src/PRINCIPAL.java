/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saul_
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 5; i >=1 ; i--) {
            System.out.println("i = "+ i);
        } 
        FalsoFor(10);
        System.out.println("");
        FalsoForUp(1, 5);
    }
    public static void FalsoFor(int iVal){
        System.out.print(iVal+ "-");//ACCION
        if (iVal >1)//CONDICIÓN PARA TERMINAR LA RECURSION
        FalsoFor(iVal-1);//LLAMADA RECURSIVA
    }
    
    public static void FalsoForUp(int iIni, int iFin){
        System.out.print(iIni + "-");
        if(iIni < iFin)
            FalsoForUp(iIni + 1, iFin);
    }
    
}
