
import java.util.Comparator;
import java.util.LinkedList;

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
        
        LinkedList <Persona> llPersonas = new LinkedList();
        llPersonas.add(new Persona("Saul ", "Salgado ", 21, true , 100.00));
        llPersonas.add(new Persona("Saul ", "hernandez ", 19, true , 155.00));
        llPersonas.add(new Persona("Paulina ", "Bolaños ", 18, false , 100.00));
        llPersonas.add(new Persona("David ", "Servando ", 19, true , 200.00));
        llPersonas.add(new Persona("Daniel ", "Renteria ", 20, true , 250.00));
        for (Persona llPersona : llPersonas) {
            System.out.println(" Nombre: " + llPersona.getsNom() + 
                    " Apellido: " + llPersona.getsApe() + 
                    " Edad: " + llPersona.getiEdad() + 
                    " Sexo: "+ llPersona.isbSex() + 
                    " Salario: "+ llPersona.getdSal());
            
            
            
        }
        
        
        Comparator cmCriterioOrden = new Comparator (){ 
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona)o1;
                Persona p2 = (Persona)o2;
                String sApellido1, sApellido2;
                sApellido1 = p1.getsApe();
                sApellido2 = p2.getsApe();
                char c1,c2;
                c1 = sApellido1.charAt(0);//AREGLO
                c2 = sApellido2.charAt(0);
                return c1 - c2;
            }
            
        };

}
}
class Persona {
    private String sNom;
    private String sApe;
    private int iEdad;
    private boolean bSex;
    private double dSal;

    public Persona(String sNom, String sApe, int iEdad, boolean bSex, double dSal) {
        this.sNom = sNom;
        this.sApe = sApe;
        this.iEdad = iEdad;
        this.bSex = bSex;
        this.dSal = dSal;
    }

    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getsApe() {
        return sApe;
    }

    public void setsApe(String sApe) {
        this.sApe = sApe;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public boolean isbSex() {
        return bSex;
    }

    public void setbSex(boolean bSex) {
        this.bSex = bSex;
    }

    public double getdSal() {
        return dSal;
    }

    public void setdSal(double dSal) {
        this.dSal = dSal;
    }

    
    
    
}   

