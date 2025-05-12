/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizi_alberi_Puente;

/**
 *
 * @author shant
 */
public class Nodo {


    public int info;

    public Nodo next;
    
    public Nodo(){

        this.info = 0;

        this.next = null;

    }
    

    public Nodo(int info){

        this.info = info;

        this.next = null;

    }

    public Nodo(int info, Nodo next){

        this.info = info;

        this.next = next;

    }

    public int getInfo(){

        return info;
    }

    public void setinfo(int num){

        this.info = num;
    }
    
  public Nodo getNext(){
      return next;
  }  
   public void setNext (Nodo link){
       next = link;
   }
    
    
     

    @Override public String toString(){

        String q = "[";

        if(next != null){

            return q + info + "]->" + next;
        }else return q + info + "]-> NULL" ;

    }
}
  