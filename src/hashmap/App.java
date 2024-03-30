/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap;

/**
 *
 * @author iacop
 */
public class App 
{
    public static void main(String[] args) 
    {
        Magazzino m=new Magazzino();
        Libro a=new Libro ("signore",45);
        Libro b=new Libro ("anello",45);
        Libro c=new Libro ("pippo",48);
        m.aggiungiLibro("scaff1", 1, a);
        m.aggiungiLibro("scaff1", 2, b);
        m.aggiungiLibro("scaff1", 4, c);
        System.out.println("ecco i titoli con i prezzi associati:\n");
        System.out.println(m.getTitoli_prezzo());
        System.out.println("ecco il libro in posizione 2:\n");
        System.out.println(m.getLibro("scaff1", 2));
        System.out.println("ecco quanti libri per ogni genere sono presenti\n");
        System.out.println(m.generi());
        System.out.println("ecco il libro che costa di meno dello scaffale con meno libri\n");
        System.out.println(m.piuIsolato());
    }
    
}
