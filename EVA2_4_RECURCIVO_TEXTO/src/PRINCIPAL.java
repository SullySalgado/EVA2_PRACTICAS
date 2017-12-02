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
        
       /* for (int i = 0; i <= 10; i++) {
            System.out.println("cadena: "+ cadenaRecursiva(i));
        }
        for (int i = 9; i >= 1; i--) {
               System.out.println("cadena: "+ cadenaRecursiva(i)); 
            }
        */
       int iNum =6;
       int iNum2 = 1;
       while(iNum2 <= iNum ){
           
           System.out.println("cadena: "+ cadenaRecursiva(iNum2));
           iNum2++;
       }
       
       while(iNum > 1 ){
           System.out.println("cadena: "+ cadenaRecursiva(iNum-1));
           iNum--;
       }
    }
    public static String cadenaRecursiva(int iNum){
            if (iNum > 1){
                return " * " + cadenaRecursiva(iNum-1) ;
            }else{
                return "*";
            }
        }
    
}
