/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

import data.Ruudukko;

/**
 * Alustajan tehtävänä on alustaa pelissä käytettävä ruudukko. 
 * 
 */
public abstract class Alustaja {
    private int rivit, sarakkeet;
    
    
    /**
     * alustaRuudukon tehtävänä on ottaa vastaan luotu ruudukon instanssi ja asettaa se pelin vaatimaan alkutilaan.
     * Vastaanotettava ruudukko on annetun kokoinen tyhjiä ruutuja täynnä oleva ruudukko.
     * @param ruudukko
     * @return Alustettu ruudukko
     */
    protected abstract Ruudukko alustaRuudukko(Ruudukko ruudukko);
    
    /**
     * Asettaa tarvittavan ruudukko-olion koon. Toteutus riippuu implementoitavasta pelistä.
     *
     */
    protected abstract void asetaKoko();
    
    /**
     * Tekee aloitustoimenpiteet, luo ruudukosta instanssin, alustaa sen ja palauttaa kutsujalle.
     * @return Alustettu ruudukko
     */
    public Ruudukko luoRuudukko(){
        asetaKoko();
        Ruudukko ruudukko = new Ruudukko(rivit, sarakkeet);
        return alustaRuudukko(ruudukko);
    }
    
}
