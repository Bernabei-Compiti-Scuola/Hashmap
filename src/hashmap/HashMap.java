/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap;

/**
 *
 * @author iacop
 */
public class HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Magazzino m=new Magazzino();
        Libro a=new Libro ("signore",45);
        Libro b=new Libro ("anello",45);
        Libro c=new Libro ("pippo",48);
        m.aggiungiLibro("scaff1", 1, a);
        m.aggiungiLibro("scaff1", 2, b);
        m.aggiungiLibro("scaff1", 4, c);
        System.out.println(m.getTitoli_prezzo());
        
    }
    
}
