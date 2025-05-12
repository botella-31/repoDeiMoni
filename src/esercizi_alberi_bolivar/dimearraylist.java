/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizi_alberi_bolivar;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class dimearraylist {
    
    
    
    
    
    
     public void Dim_ArrayList(){
    
    ArrayList vet = new ArrayList();
    
    vet.add(1);
    vet.add("array list");
    vet.add(5);
    vet.add(7.5);
    
    System.out.println(vet);
    
    int n1 = (Integer) vet.get(0);
    String s = (String) vet.get(1);
    Integer numInt = (Integer) vet.get(2);
    Double numDou = (Double) vet.get(3);
     int n2 = numInt.intValue();
    double n3 = numDou.doubleValue();
    
        System.out.println("["+n1+","+n2+","+n3+"]");

}
    
}
