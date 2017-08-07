/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

import data.Ruudukko;

/**
 *
 * @author Admin
 * 
 * Tarkastaja tarkastaa syötteiden oikeellisuuden sekä sen, onko ruudukko ratkaistu.
 */
public interface Tarkastaja {

    public boolean tarkastaRuudukko(Ruudukko ruudukko);
    
    public boolean tarkistaSyote(Ruudukko ruudukko, int rivi, int sarake, String syote);
    
}
