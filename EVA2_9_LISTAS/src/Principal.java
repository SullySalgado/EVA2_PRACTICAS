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
        Lista miLista = new Lista();
        miLista.imprimirNodos();
        /*miLista.agregarNodo(new Nodo(15));
        miLista.imprimirNodos();
        System.out.println("");
        miLista.agregarNodo(new Nodo(150));
        miLista.imprimirNodos();
        System.out.println("");
        miLista.agregarNodo(new Nodo(100));
        miLista.imprimirNodos();
        System.out.println("");
        miLista.agregarNodo(new Nodo(50));
        miLista.imprimirNodos();
        System.out.println("");
        miLista.agregarNodo(new Nodo(40));
        miLista.imprimirNodos();
        System.out.println("");
        miLista.agregarNodo(new Nodo(30));
        miLista.imprimirNodos();
        System.out.println("");
        miLista.agregarNodo(new Nodo(20));
        miLista.imprimirNodos();
        miLista.vaciarLista();
        System.out.println("");
        miLista.imprimirNodos();*/
        
        miLista.agregarNodoMejorado(new Nodo(45));
        
        System.out.println("Cantidad de Nodos: " + miLista.contarElementos());
        for (int i = 0; i < 1000000; i++) {
            int iVal = (int) (Math.random() * 1000) + 1;
            miLista.agregarNodoMejorado(new Nodo(iVal));
        }
        System.out.println("");
    }

}

class Nodo {

    public int ivalor;
    private Nodo nSig;

    public Nodo() {  //constructor default
        ivalor = 0;
        nSig = null;
    }

    public Nodo(int iVal) {
        ivalor = iVal;
        nSig = null;
    }

    public Nodo(int iVal, Nodo nNod) {
        ivalor = iVal;
        nSig = nNod;
    }

    public int getIvalor() {
        return ivalor;
    }

    public void setIvalor(int ivalor) {
        this.ivalor = ivalor;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

}

class Lista {
    
    private Nodo nIni;
    private Nodo nFin;

    public Lista() {
        nIni = null;

    }

    public Lista(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;
        
    }

    //AGREGAR NODOS LOS COLOCA AL FINAL DE LA LISTA
    public void agregarNodo(Nodo nNodo) {//NO VOLVER A USAR JAMAS!!!!!
        //MOVERNOS AL FINAL DE LA LISTA
        Nodo nTemp = nIni;
        if (nIni == null) {
            nIni = nNodo;
        } else {
            while (nTemp.getnSig() != null) {
                nTemp = nTemp.getnSig();
            }
            nTemp.setnSig(nNodo);
        }

    }

    public void agregarNodoMejorado(Nodo nNodo) {
        if (nIni == null) {
            nIni = nNodo; //CUANDO LA LISTA ESTA VACIA
            nFin = nNodo;
        } else {
            nFin.setnSig(nNodo);
            nFin = nNodo;
        }
    }

    //IMPRIMIR NODOS
    public void imprimirNodos() {
        //MOVERNOS AL FINAL DE LA LISTA
        Nodo nTemp = nIni;
        if (nIni == null) {
            System.out.println("LISTA VACIA");
        } else {
            while (nTemp != null) {
                System.out.print(nTemp.getIvalor() + " - ");
                nTemp = nTemp.getnSig();
            }
        }

    }

    //VACIAR LISTA --> ALMENOS PARA JAVA, SIMPLEMENTE nIni
    public void vaciarLista() {
        nIni = null;
        nFin = null;
    }

    //CONTAR LOS ELEMENTOS DE LA LISTA
    int iCont = 0;
    public int contarElementos() {
        
        //MOVERNOS AL FINAL DE LA LISTA
        Nodo nTemp = nIni;
        if (nIni == null) {
            System.out.println("LISTA VACIA");
        } else {
            while (nTemp != null) {
                System.out.print(nTemp.getIvalor() + " - ");
                nTemp = nTemp.getnSig();
                iCont++;
            }

        }
        return iCont;
    }

    public int valorEn(int iPos) throws Exception {
        //VERIFICAR QUE LA POSICION SEA MENOR AL TAMAÑO DEL ARREGLO
        int iVal = 0;
        if ((iPos < contarElementos()) && (iPos >= 0)) {
            Nodo nTemp = nIni;
            for (int i = 0; i <= iPos; i++) {
                nTemp = nTemp.getnSig();
            }
            iVal = nTemp.getIvalor();
        } else {
            throw new Exception("la posicion no es valida");
        }
        return iVal;
    }
}
