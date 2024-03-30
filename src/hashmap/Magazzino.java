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
    HashMap<String, HashMap<Integer, Libro>> libreria = new HashMap<String, HashMap<Integer, Libro>>();

    // Metodo per aggiungere un libro al magazzino in una specifica posizione di uno scaffale
    public boolean aggiungiLibro(String scaffale, Integer posizione, Libro libro)
    {
        HashMap<Integer, Libro> scaf = libreria.get(scaffale);
        if (scaf.containsKey(posizione) == true) 
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

    // Metodo per ottenere un libro dal magazzino in una specifica posizione di uno scaffale
    public Libro getLibro(String scaffale, Integer posizione) 
    {
        HashMap<Integer, Libro> scaf = libreria.get(scaffale);
        if (scaf.containsKey(posizione)) 
        {
            return scaf.get(posizione);
        } 
        else 
        {
            System.out.println("\nlibro non presente");
            return null;
        }
    }

    // Metodo per ottenere un HashMap che associa ad ogni prezzo una lista di titoli dei libri con quel prezzo
    public HashMap<Integer, ArrayList<String>> getTitoli_prezzo() 
    {
        HashMap<Integer, ArrayList<String>> finale = new HashMap<>();

        ArrayList<String> scaffali = (ArrayList<String>) libreria.keySet();
        
        for (int i = 0; i < scaffali.size(); i++) 
        {
            ArrayList<String> titoli = new ArrayList();
            HashMap<Integer, Libro> scaf = libreria.get(scaffali.get(i));
            ArrayList<Libro> Libri = (ArrayList<Libro>) scaf.values();
            for (int j = 0; j < Libri.size(); j++) 
            {
                titoli.add(Libri.get(j).getTitolo());
                finale.put(Libri.get(j).getPrezzo(), titoli);
            }
        }
        return finale;
    }

    // Metodo per ottenere un HashMap che associa ad ogni genere il numero di libri presenti in magazzino
    public HashMap<String, Integer> generi() 
    {
        HashMap<String, Integer> finale = new HashMap<>();
        // Ottiene tutti i generi dei libri presenti in magazzino
        ArrayList<String> scaffali = (ArrayList<String>) libreria.keySet();
        // Per ogni scaffale, ottiene tutti i libri e aggiunge il genere al conteggio
        for (int i = 0; i < scaffali.size(); i++) 
        {
            HashMap<Integer, Libro> scaf = libreria.get(scaffali.get(i));
            ArrayList<Libro> Libri = (ArrayList<Libro>) scaf.values();
            // Per ogni libro, aggiunge il genere al conteggio
            for (int j = 0; j < Libri.size(); j++) 
            {
                if (finale.containsKey(Libri.get(j).getGenere()) == false)
                    finale.put(Libri.get(j).getGenere(), 1);
                else
                    finale.put(Libri.get(j).getGenere(), finale.get(Libri.get(j).getGenere() + 1));
            }
        }
        return finale;
    }
    
    public Libro piuIsolato()
    {
        String scaffaleMenoLibri = null;
        // Inizializza il numero minimo di libri a il valore massimo di un intero
        int minLibri = Integer.MAX_VALUE;

        // Trova lo scaffale con meno libri
        for (int i=0; i<libreria.size(); i++)
        {
            HashMap<Integer, Libro> scaf = libreria.get(i);
            if (scaf.size() < minLibri) 
            {
                minLibri = scaf.size();
                scaffaleMenoLibri = (String) libreria.keySet().toArray()[i];
            }
        }

        // Trova il libro meno costoso nello scaffale con meno libri
        if (scaffaleMenoLibri != null) 
        {
            HashMap<Integer, Libro> scaf = libreria.get(scaffaleMenoLibri);
            Libro libroMenoCostoso = null;
            int minPrezzo = Integer.MAX_VALUE;

            for (int i=0; i<scaf.size(); i++)
            {
                Libro libro = scaf.get(i);
                int prezzo = libro.getPrezzo();
                if (prezzo < minPrezzo) 
                {
                    minPrezzo = prezzo;
                    libroMenoCostoso = libro;
                }
            }
            return libroMenoCostoso;
        }
        return null;
    }
}
