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
public class Mainnodo {
    
    
    public void mainnodo(){
        
        
        Scanner scan = new Scanner(System.in);
            
        System.out.println("\n");
        
        System.out.println("lista 1 = new lista();");
        
        lista mialista = new lista();
        
        System.out.println("vuota  :"+mialista);
        
        mialista.addtesta(5);
        mialista.addtesta(8);
        
        System.out.println("due nodi: " + mialista);
    }
    
    
}
