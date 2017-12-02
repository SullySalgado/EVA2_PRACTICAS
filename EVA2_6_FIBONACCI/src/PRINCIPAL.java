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
        for (int i = 0; i < 10; i++) {
            System.out.print(iFibonacci(i) + "-");
        }
    }

    public static int iFibonacci(int iPosicion) {
        if (iPosicion == 0) {
            return 0;
        } else if (iPosicion == 1) {
            return 1;
        } else {
            return iFibonacci(iPosicion - 1) + iFibonacci(iPosicion - 2);
        }
    }
}
