/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizi_alberi_bolivar;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Sergio
 */
public class VettoreIntero {
    
    
     public void VettoreIntero(){
        
      Random random = new Random();
      int x, num, tanti;
      Vector <Integer> mioVet = new Vector<Integer>();
      do{
          
          num = 1 + random.nextInt(9);
          mioVet.add(num);
      }while (num != 5 );
       System.out.println(mioVet);
       tanti = mioVet.size();
       
       for(x = 0; x < tanti; x++)
            System.out.println(mioVet.get(x) + "");
              
              
              
              
              
    } 
    
    
    
    
}
