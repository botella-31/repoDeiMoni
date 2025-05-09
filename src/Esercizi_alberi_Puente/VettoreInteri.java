/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizi_alberi_Puente;
import java.util.Vector;
import java.util.Random;
/**
 *
 * @author shant
 */
public class VettoreInteri {
    
    public void VettoreInteri(){
        
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
    
    
    
    
    
    
    
    
    

