package EjemploCalculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Calculadora Casio1 = new Calculadora ( 50, 15, "Casio" , "CRD-230"); 
       
       Casio1.suma();
       Casio1.resta();
       Casio1.multiplicacion();
       Casio1.division();
       
       Casio1.setNum1(25);
       Casio1.setNum2(80);
       Casio1.suma();
       System.out.println("Los valores de la calculadora son "+ Casio1.getNum1() + " y " + Casio1.getNum2());
       
       Calculadora Casio2 = new Calculadora ( "Casio" , "CTT-40");
       Calculadora Casio3 = new Calculadora ( );
       
       System.out.println("La marca y modelo de la calculadora Casio2 son "+ Casio2.getMarca() + " y " + Casio2.getModelo());
       Casio2.setNum1(10);
       Casio2.setNum2(2);
       Casio2.suma();
    }
    
}
