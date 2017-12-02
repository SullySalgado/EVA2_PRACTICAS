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
        
        System.out.println(iSumDig(505));

    }
    
    public static int iSumDig (int iNum ){
        if (iNum == 0){
         return 0;
        }else{
            return iSumDig(iNum/10) + (iNum%10);
        }
    }
}
