/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizi_alberi_bolivar;

/**
 *
 * @author Sergio
 */
public class Queue {
    
    private nodo pTesta;
    private nodo pCoda;
    public Queue(){
    pTesta = null;
    pCoda = null;
}

public void enqueue(int dato){
    if (isEmpty()){
    pTesta = new nodo(dato, pTesta);
    pCoda = pTesta;
    } else {
    pCoda.next = new nodo(dato, null);
    pCoda = pCoda.next;
    }
}
    public int dequeue(){
    if (isEmpty())
    return (-1);
    int top = pTesta.getInfo();
    pTesta = pTesta.getnext();
    return top;
}

@Override public String toString(){
    if (pTesta == null)
    return "[]->NULL";
    else
    return "[]->" + pTesta + "";
}

public boolean isEmpty(){
    return pTesta == null;
}

public void makeEmpty(){
    pTesta = null;
    pCoda = null;
}

    
}
