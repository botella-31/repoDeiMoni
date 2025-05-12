/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Esercizi_alberi_Puente;
import java.util.Scanner;
/**
 *
 * @author shant
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      Dim_ArrayList ArrayList = new Dim_ArrayList();
      mainPila Pila = new mainPila();
      VettoreDin_Stringhe Stringhe = new VettoreDin_Stringhe();
     VettoreInteri Interi = new VettoreInteri ();
     
      Scanner  scan = new Scanner(System.in); 
      int scelta = scan.nextInt();
       
       
       switch(scelta){
        
        case 1: 
        
       ArrayList.Dim_ArrayList();
        
        break;
        
        case 2:
            
        Pila.mainPila();
        
        break;
        
        case 3:
            
        Stringhe.VettoreDin_Stringhe();
        
        break;
        
        case 4:
            
         Interi.VettoreInteri();
         
         break;
        
        
        
        
    }
        
       
       
       
       
    }
    
    
    
    
}
