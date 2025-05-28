/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strutturedati;

/**
 *
 * @author asocc
 */
public class StruttureDati {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] cars = {"Fiat", "Volvo", "Opel"};
        
        System.out.println("Lunghezza array: " + cars.length);
        
        for(int i = 0; i<cars.length; i++){
            
            System.out.println("Posizione cars[" + i + "] -->"+ cars[i]);
        }
        
        //ArrayStatici[] rubrica = new ArrayStatici[5];
        
           ArrayStatici[] rubrica = {new ArrayStatici("Pablo","Endez"), new ArrayStatici("Puente","Shantel") };

                for(int i = 0; i<rubrica.length; i++){
            
            System.out.println("Posizione rubrica[" + i + "] -->"+ rubrica[i].nome +" ---- " + rubrica[i].cognome);
        }
        

        
    }
    
}
