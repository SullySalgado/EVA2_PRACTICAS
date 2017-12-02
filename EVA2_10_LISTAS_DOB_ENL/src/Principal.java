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
        
        ListaDE  ldeMiLista = new ListaDE();
        ldeMiLista.imprimirElementos();
        ldeMiLista.imprimirElementosInv();
        for (int i = 0; i < 10; i++) {
            ldeMiLista.agregarNodo(new Nodo ((int)(Math.random()*100 )+1 ));
        }
        System.out.println("");
        ldeMiLista.imprimirElementos();
        System.out.println("");
        ldeMiLista.imprimirElementosInv();
    }
}
    class Nodo{
        private int iVal;
        private Nodo nPrev;
        private Nodo nSig;
        
        public Nodo(){
        iVal =0;
        nPrev = null;
        nSig = null;
    }
        public Nodo(int iNum){
            iVal = iNum;
            nPrev = null;
            nSig = null;
        }

        public int getiVal() {
            return iVal;
        }

        public void setiVal(int iVal) {
            this.iVal = iVal;
        }

        public Nodo getnPrev() {
            return nPrev;
        }

        public void setnPrev(Nodo nPrev) {
            this.nPrev = nPrev;
        }

        public Nodo getnSig() {
            return nSig;
        }

        public void setnSig(Nodo nSig) {
            this.nSig = nSig;
        }
        
        
    }
    class ListaDE{
        Nodo nini;
        Nodo nFin;
        
        public ListaDE(){
        nini = null;
        nFin = null; 
    }
        
        public ListaDE(Nodo nNodo){
            nini = nNodo;
            nFin = nNodo;
        }
        
        public void agregarNodo(Nodo nNodo){//AGREGAR UN NODO AL FINAL DE LA LISTA 
            if(nini == null){//LISTA VACIA
                nini = nNodo;
                nFin = nNodo;
            }else{
                nFin.setnSig(nNodo);
                nNodo.setnPrev(nFin);
                nFin = nNodo;
            }
        }
         public void imprimirElementos(){
             if(nini == null){
                 System.out.println("la lista esta vacia");
             }else{
                 Nodo nTemp = nini;
                 while(nTemp != null){
                     System.out.print(nTemp.getiVal() + " - ");
                     nTemp = nTemp.getnSig();
                 }
             }
         }
        
        public void imprimirElementosInv(){
            Nodo nTemp = nFin;
            while(nTemp != null){
                System.out.print(nTemp.getiVal()+  " - ");
                nTemp = nTemp.getnPrev();
            }
        }
    }
    

