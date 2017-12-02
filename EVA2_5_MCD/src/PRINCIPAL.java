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
        int iDividendo = 180;
        int iDivisor = 48;
        System.out.println("El mcd de " + iDividendo + ", " + iDivisor + " es " + maxCom(iDividendo, iDivisor));

    }

    public static int maxCom(int iDividendo, int iDivisor) {
        if (iDivisor == 0) {
            return iDividendo;

        } else {
            int iResi = (iDividendo % iDivisor);
            return maxCom(iDivisor, iResi);
        }
    }
}
