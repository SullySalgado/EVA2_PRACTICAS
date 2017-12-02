/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saul_
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(sEliminarLetra("xkxfx"));
        System.out.println(sEliminarLetra(""));
        System.out.println(sEliminarLetra("fgkkf"));

    }

    public static String sEliminarLetra(String sPalabra) {
        if ("".equals(sPalabra)) {
            return "";
        } 
            if (sPalabra.charAt(0) == 'x') {
                return sEliminarLetra(sPalabra.substring(1));
                
            }
            
                return sPalabra.charAt(0) + sEliminarLetra(sPalabra.substring(1));
    }
}
    
