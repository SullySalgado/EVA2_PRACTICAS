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
        Nodo nObj1 = new Nodo();
        nObj1.iVal = 100;
                
        Nodo nObj2 = new Nodo();
        nObj2.iVal = 200;
        
        Nodo nObj3 = new Nodo();
        nObj3.iVal = 300;
        
        //vincularlos
        //obj1 --> obj2 --> obj3
        nObj1.nsig = nObj2;
        nObj2.nsig = nObj3;
        
      /*System.out.println(nObj1.iVal);
        System.out.println(nObj2.iVal);
        System.out.println(nObj3.iVal);*/
        
        Nodo nMover = nObj1;
        while (nMover != null) {
            System.out.println(nMover.iVal);
            nMover = nMover.nsig;
            
        }
    }
    
    
}
class Nodo{
        public int iVal;
        public Nodo nsig;
        public Nodo (){
            nsig = null;
        }
    }