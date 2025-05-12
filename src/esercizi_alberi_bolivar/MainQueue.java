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
public class MainQueue {
    
    public void mainqueue(){
    Queue miacoda = new Queue();
    
    
        System.out.println(" C: " + miacoda);
        System.out.println("\n accodo 4 element:");
        miacoda.enqueue(11);
        miacoda.enqueue(22);
        miacoda.enqueue(33);
        miacoda.enqueue(44);
        System.out.println(" C: " + miacoda);
        System.out.println("\n tolgo due element:");
        miacoda.dequeue();
        miacoda.dequeue();
        System.out.println(" C: " + miacoda);

    
    }
    
}
