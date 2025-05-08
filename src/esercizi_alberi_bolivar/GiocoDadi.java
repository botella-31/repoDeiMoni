/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizi_alberi_bolivar;
import java.util.Scanner;
/**
 *
 * @author Sergio
 */
public class GiocoDadi {
    
    public void Lanciadadi(Dado vett[]){
        
        
        
        for(int i = 0; i < vett.length; i++ ){
             vett[i] = new Dado();
        }
        
        System.out.print("\ndadi vettore:");
        
        for(int o = 0; o < vett.length ; o++){
            
            System.out.print(vett[o] + " ");
        }
    }
    
}
