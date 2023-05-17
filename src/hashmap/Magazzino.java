/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashmap;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author iacop
 */
public class Magazzino 
{
    HashMap<String, HashMap<Integer, Libro>> libreria=new HashMap<String,HashMap<Integer,Libro>>();

    public boolean aggiungiLibro(String scaffale, Integer posizione, Libro libro)
    {
        
        HashMap<Integer,Libro>scaf=libreria.get(scaffale);
        if(scaf.containsKey(posizione)==true)
        {
            scaf.put(posizione, libro);
            System.out.println("\nlibro aggiunto");
            return true;
        }
            
        else
        {
            System.out.println("\nlibro non aggiunto");
            return false;
        }
    }
    public Libro getLibro(String scaffale, Integer posizione)
    {
        HashMap<Integer,Libro>scaf=libreria.get(scaffale);
        if(scaf.containsKey(posizione))
        {
            return scaf.get(posizione);
        }
        else
        {
            System.out.println("\nlibro non presente");
            return null;
        }
    }
//    HashMap che ha come chiave un prezzo e come valore un elenco (ArrayList) dei
//    titoli dei libri che hanno quel prezzo
    
    public HashMap<Integer,ArrayList<String>> getTitoli_prezzo()
    {
        HashMap<Integer,ArrayList<String>>finale=new HashMap<>();
        
        ArrayList<String>scaffali=(ArrayList<String>) libreria.keySet();
        for(int i=0;i<scaffali.size();i++)
        {
            ArrayList<String>titoli=new ArrayList();
            HashMap<Integer,Libro>scaf=libreria.get(scaffali.get(i));
            ArrayList<Libro>Libri=(ArrayList<Libro>) scaf.values();
            for(int j=0;j<Libri.size();j++)
            {
                titoli.add(Libri.get(j).getTitolo());
                finale.put(Libri.get(j).getPrezzo(), titoli);
            }
            
        }
        return finale;
    }

}
