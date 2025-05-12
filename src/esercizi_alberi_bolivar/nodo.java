/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizi_alberi_bolivar;

/**
 *
 * @author Sergio
 */
public class nodo {
    
    
    public int info;
    
    public nodo next;
    
    public nodo(){
        
        this.info = 0;
        
        this.next = null;
        
    }
    
    public nodo(int info){
        
        this.info = info;
        
        this.next = null;
                
    }
    
    public nodo(int info, nodo next){
        
        this.info = info;
        
        this.next = next;
    
    }
    
    public int getInfo(){
        
        return info;
    }
    
    public void setinfo(int num){
        
        this.info = num;
    }
    
    public nodo getnext(){
        
        return next;
    }
    
    public void setnext(nodo link){
        
        next = link;
    }
    
    @Override public String toString(){
        
        String q = "[";
        
        if(next != null){
            
            return q + info + "]-" + next;
        }else return q + info + "] - NULL" ;
        
    }
    
    
}
