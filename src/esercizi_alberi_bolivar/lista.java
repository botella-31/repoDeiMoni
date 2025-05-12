/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizi_alberi_bolivar;

/**
 *
 * @author Sergio
 */
public class lista {
    
    private nodo testa;
    
    public lista(){
        
        testa = null;
    }
    
    public lista (nodo h){
        
        this.testa = h;
    }
    
    public lista (int info){
        
       testa = new nodo(info,null) ;
        
    }
    
    public boolean is_Empty(){
        
        return testa == null;
        
    }
    
    @Override
    
    public String toString(){
        
       String q = "";
       
       if(testa == null){
           return"[] -NULL";
       }
       else return"[] -" +testa+ "";
    }
    
    public void addtesta(int n){
        
        nodo nuovo = new nodo(n);
        
        if(testa == null){
            
            testa = nuovo;
        }else{
            
            nuovo.next = testa;
            testa = nuovo;
        }
            
        }
    }

