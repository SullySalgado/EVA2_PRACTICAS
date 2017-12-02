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
        System.out.println(iCalcPoten(3,1));
        System.out.println(iCalcPoten(3,2));
        System.out.println(iCalcPoten(3,3));
    }
    public static int iCalcPoten(int iBase , int iPot){
        if (iPot == 1){
            return iBase;
        }else{
        return (iBase * iCalcPoten(iBase , iPot -1));
        }
    }
    
}