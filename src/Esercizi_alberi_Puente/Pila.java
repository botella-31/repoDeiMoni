/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizi_alberi_Puente;

/**
 *
 * @author shant
 */
public class Pila {
   
  
      
   private Nodo pTesta;
   public Pila(){
       pTesta = null;
   }
     public void push(int elemento){
     pTesta = new Nodo(elemento, pTesta);    
     }
     
     
     
     public int pop(){
         if(isEmpty())
             return(-1);
         int top = pTesta.getInfo();
         pTesta = pTesta.getNext();
         return top;
     }
     
     @Override public String toString(){
    if(pTesta == null)
        return "[top]->null";
    else
        return "[top]->" + pTesta + "";
     }
     public boolean isEmpty(){
         return pTesta == null;
     }
     
}
     
     
     

