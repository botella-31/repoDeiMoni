/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizi_alberi_bolivar;

import java.util.*;
import java.util.Random;





public class VectorFunz {
    
    public void mostravector (Vector V){
        
         System.out.println("\n");
         System.out.println("contenuto : " + V);
          System.out.println("capacità :" + V.capacity());
           System.out.println("n.elementi: " + V.size());
    }
    
    public int somma(Vector V){
        
        int x, somma = 0;
        
        for( x = 0; x < V.size(); x++){
            
            Integer elem = (Integer)V.get(x);
            
            somma = somma + elem.intValue();
        }
        
        return somma;
    }
    
    public int  sommaiter(Vector V){
        
        int somma = 0;
        
        Iterator i = V.iterator();
        
        while (i.hasNext()){
            
            Integer val = (Integer)i.next();
            somma = somma + val.intValue();
        }
        
        return somma;
    }
    
    public void esvector(){
        
        Random random = new Random();
        
        int num;
        
        Vector<Integer> vettore = new Vector<Integer>(3);
        
        mostravector(vettore);
        
       num = 1 + random.nextInt(6);
       
       while (num != 0){
           
           vettore.add(num);
           
           num = random.nextInt(7);
           
       };
       
       mostravector(vettore);
       
       System.out.println("\n");
       
       for(int i = 0; i < vettore.size(); i++)
           
           System.out.println("elemento " + i + ":" + vettore.get(i));
           
           int first = vettore.get(0);
           
           System.out.print("\nprimo : " + first);
           
           System.out.println("- ultimo: " + vettore.get(vettore.size() - 1));
           System.out.println(" somma ciclo for : " +somma(vettore));
           System.out.println("somma (iterator): " + sommaiter(vettore));
       
    }
    
}
