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
public class MAINDADO {
    
    public void MainDado(){
        
        GiocoDadi gioco = new GiocoDadi();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nStatico : due dadi");
        Dado vettore1[] = new Dado[2];
        
        gioco.Lanciadadi(vettore1);
        
        System.out.print("\n quanti lanci desideri fare");
        int numLanci = scan.nextInt();
        
        System.out.print("Dinamico : " +numLanci + "dadi");
        
        Dado vettore2[] = new Dado[numLanci];
        
        gioco.Lanciadadi(vettore2);
        
    }
    
}
