
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Arbol miArbol = new Arbol();
        try {
            miArbol.insertarNodo(new Nodo(100));
            miArbol.insertarNodo(new Nodo(101));
            miArbol.insertarNodo(new Nodo(97));
            miArbol.insertarNodo(new Nodo(80));
            miArbol.insertarNodo(new Nodo(115));
            miArbol.insertarNodo(new Nodo(114));
            miArbol.imprimirPoOrden();
            
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

class Nodo {

    private int iVal;
    private Nodo nIzq;
    private Nodo nDer;

    public Nodo() {
        iVal = 0;
        nIzq = null;
        nDer = null;

    }

    public Nodo(int iVal) {
        this.iVal = iVal;
        this.nIzq = null;
        this.nDer = null;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnIzq() {
        return nIzq;
    }

    public void setnIzq(Nodo nIzq) {
        this.nIzq = nIzq;
    }

    public Nodo getnDer() {
        return nDer;
    }

    public void setnDer(Nodo nDer) {
        this.nDer = nDer;
    }

}

    class Arbol {

        private Nodo nRoot;

        public Arbol() {
            nRoot = null;
        }

        public Arbol(Nodo nNodo) {
            nRoot = nNodo;
        }

        public void insertarNodo(Nodo nNodo) throws Exception {
            agregarNodo(nRoot, nNodo);
        }

        public void agregarNodo(Nodo nActual, Nodo nNodo) throws Exception {
            if (nRoot == null) {
                nRoot = nNodo;
            } else {
                if (nNodo.getiVal() < nActual.getiVal()) {//MENOR 
                    if (nActual.getnIzq() == null) {//posicion vacia {null} aqui va
                        nActual.setnIzq(nNodo);

                    } else //AQUI HAY UN NODO
                    {
                        agregarNodo(nActual.getnIzq(), nNodo);
                    }
                } else if (nNodo.getiVal() > nActual.getiVal()) {//MAYOR
                    if (nActual.getnDer() == null) {
                        nActual.setnDer(nNodo);
                    } else {//AQUI HAY UN NODO
                        agregarNodo(nActual.getnDer(), nNodo);
                    }

                } else {//VALORES IGUALES (NO ACEPTAMOS VALORES IGUALES)
                    throw new Exception("NO SE ACEPTAN VALORES REPETIDOS");
                }
            }
        }

        public void imprimirPoOrden() {
            imprimirPostOrden(nRoot);

        }

        public void imprimirPostOrden(Nodo nActual) {
            if (nActual != null) {
                System.out.println(nActual.getiVal() + " ");
                imprimirPostOrden(nActual.getnIzq());
                imprimirPostOrden(nActual.getnIzq());
            }
        }
        
    }
