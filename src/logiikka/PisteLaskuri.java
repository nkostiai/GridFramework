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
 */
public abstract class PisteLaskuri {
    private Ajastin ajastin;
    
    public PisteLaskuri(){
        ajastin = new Ajastin();
    }
    
    public void alustaLaskuri(){
        ajastin.aloitaAjastin();
    }
    
    public abstract int laskePisteet(Ruudukko ruudukko);
    
}
