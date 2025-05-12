/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizi_alberi_Puente;

/**
 *
 * @author shant
 */
public class mainPila {
    public void mainPila(){
        
     Pila pTesta1 = new Pila();
     System.out.println("P:"+pTesta1);
     System.out.println("\n inserisco tre elementi:");   
     System.out.println("push(11)");   
     pTesta1.push(11);
     System.out.println("push(22)");
     pTesta1.push(22);
     System.out.println("push(33)");
     pTesta1.push(33);
     System.out.println("P:"+ pTesta1);
     System.out.println("\n rimozione di un elemento:");   
      pTesta1.pop();
      System.out.println("P:"+ pTesta1);
    }
    
}
