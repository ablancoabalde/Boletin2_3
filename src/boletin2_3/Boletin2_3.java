
package boletin2_3;

import java.util.Scanner;

public class Boletin2_3 {

    public static void main(String[] args) {
        
        float Euro, Cdollar, dolar;
        Scanner entradaTeclado = new Scanner (System.in); //Creación de un objeto Scanner
        
        System.out.println ("Por favor introduzca Euros");    
        Euro=entradaTeclado.nextFloat();//Invocamos un método sobre un objeto Scanner
           
        System.out.println ("Por favor introduzca valor dollar");   

        Cdollar = entradaTeclado.nextFloat(); //Cuando metemos un valor Float por teclado, metemos , en lugar de .
     
        System.out.println ("Sus euros " + Euro * Cdollar);    
        
    }
    
}
