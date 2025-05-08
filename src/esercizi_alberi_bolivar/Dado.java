/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizi_alberi_bolivar;

/**
 *
 * @author Sergio
 */
public class Dado {
    
    int valore;
    
    public Dado(){
        
        valore =(int)Math.floor(Math.random() * 6) + 1;
    }
    
    @Override
    
    public String toString(){
        
        String s ="s";
        
        return s + valore;
    }
    
    
}
