/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

import data.Ruudukko;
import java.awt.Image;
import logiikka.Alustaja;
import logiikka.PisteLaskuri;
import logiikka.Tarkastaja;

/**
 *
 * @author Admin
 */
public class PeliHallinnoija {

    private Ruudukko ruudukko;
    private Tarkastaja tarkastaja;
    private Alustaja alustaja;
    private PisteLaskuri pisteLaskuri;

    public PeliHallinnoija() {

    }

    public void uusiPeli() {
        ruudukko = alustaja.luoRuudukko();
        pisteLaskuri.alustaLaskuri();
    }

    public PeliTila tarkistaTila() {
        if (tarkastaja.tarkastaRuudukko(ruudukko)) {
            if (onkoRuudukkoTaynna()) {
                return PeliTila.VALMIS;
            } else {
                return PeliTila.KESKEN;
            }
        } else {
            return PeliTila.VIRHE;
        }
    }

    public boolean annaSyote(String syote, int rivi, int sarake) {
        if (tarkastaja.tarkistaSyote(ruudukko, rivi, sarake, syote)) {
            ruudukko.setRuudunSisalto(syote, rivi, sarake);
            return true;
        } else {
            return false;
        }

    }

    public boolean tyhjennaRuutu(int rivi, int sarake) {
        if (ruudukko.getOnkoSyoteRuutu(rivi, sarake)) {
            ruudukko.tyhjennaRuutu(rivi, sarake);
            return true;
        }
        return false;

    }

    public int getPisteet() {
        return pisteLaskuri.laskePisteet(ruudukko);
    }

    public int getRivienMaara() {
        return ruudukko.getRivit();
    }

    public int getSarakkeidenMaara() {
        return ruudukko.getSarakkeet();
    }

    public String getRuudunSisalto(int rivi, int sarake) {
        return ruudukko.getRuudunSisalto(rivi, sarake);
    }

    public Image getRuudunKuva(int rivi, int sarake) {
        return ruudukko.getKuva(rivi, sarake);
    }

    public boolean onkoRuutuSyoteRuutu(int rivi, int sarake) {
        return ruudukko.getOnkoSyoteRuutu(rivi, sarake);
    }

    /**
     * Tarkistaa onko ruudukko täynnä käymällä sen läpi ja tarkistamalla
     * null-arvot. Mikäli arvoja ei ole, on jokaiseen ruudun ruutuun asetettu
     * jokin arvo, jolloin ruudukko on täynnä.
     *
     * @return True, mikäli taulukon jokaiseen käytössä olevaan ruutuun on
     * annettu jokin syöte.
     */
    public boolean onkoRuudukkoTaynna() {
        for (int i = 0; i < getRivienMaara(); i++) {
            for (int j = 0; j < getSarakkeidenMaara(); j++) {
                if (onkoRuutuSyoteRuutu(i, j) && getRuudunSisalto(i, j).equals("\u0000")) {
                    return false;
                }
            }
        }
        return true;
    }
}
