/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashmap;

/**
 *
 * @author iacop
 */
public class Libro 
{
    private String titolo;
    private int prezzo;

    public Libro(String titolo, int prezzo) {
        this.titolo = titolo;
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
    
    
}
