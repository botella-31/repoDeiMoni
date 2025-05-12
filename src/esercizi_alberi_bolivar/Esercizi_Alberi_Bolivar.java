/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esercizi_alberi_bolivar;
import java.util.Scanner;
/**
 *
 * @author Sergio
 */
public class Esercizi_Alberi_Bolivar {

   
    public static void main(String[] args) {
        
        MAINDADO maindado = new MAINDADO();
        
        VectorFunz mainvector = new VectorFunz();
        
        VettoreIntero mainvetint = new VettoreIntero();
        
        VettoriStringhe mainvetString = new VettoriStringhe();
        
        dimearraylist mainarraylist = new dimearraylist();
        
        Mainnodo mainnodo = new Mainnodo();
        
        MainQueue mainqueue = new MainQueue();
        
        Scanner scan = new Scanner(System.in);
        
        int scelta = scan.nextInt();
        
        switch(scelta){
            
            case 1:
                
                maindado.MainDado();
               
                break;
                
            case 2:
                
                mainvector.esvector();
                
                break;
                
            case 3 :
                
                mainvetint.VettoreIntero();
                
                
                break;
        
            case 4:
                
                mainvetString.vetstring();
                
             break;
             
             
            case 5:
                
                mainarraylist.Dim_ArrayList();
              break;
              
            case 6:
                
             mainnodo.mainnodo();
             
             break;
             
            case 7:
                
                mainqueue.mainqueue();
                
                break;
        
    }
        
    }
    
}
