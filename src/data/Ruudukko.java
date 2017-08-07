package data;

import java.awt.Image;
import logiikka.Tarkastaja;

/**
 * Ruudukko-luokka mallintaa pelissä käytettävää ruudukkoa. Ruudukko koostuu kaksiuloitteisesta taulukosta Ruutuja.
 * 
 */
public class Ruudukko {
    private final Ruutu[][] ruudut;
    
    public Ruudukko(int rivienMaara, int sarakkeidenMaara){
        ruudut = new Ruutu[rivienMaara][sarakkeidenMaara];
        for(int i = 0; i < rivienMaara; i++){
            for(int j = 0; j < sarakkeidenMaara; j++){
                ruudut[i][j] = new Ruutu();
            }
        }
    }
    
    public void setRuudunSisalto(String arvo, int rivi, int sarake){
        ruudut[rivi][sarake].setSisalto(arvo);
    }
    
    public String getRuudunSisalto(int rivi, int sarake){
        return ruudut[rivi][sarake].getSisalto();
    }
    
    public void setOnkoSyoteRuutu(boolean b, int rivi, int sarake){
        ruudut[rivi][sarake].setSyoteRuutu(b);
    }
    
    public boolean getOnkoSyoteRuutu(int rivi, int sarake){
        return ruudut[rivi][sarake].getSyoteRuutu();
    }
    
    public int getRivit(){
        return ruudut.length;
    }
    
    public int getSarakkeet(){
        return ruudut[0].length;
    }
    
    public Image getKuva(int rivi, int sarake){
        return ruudut[rivi][sarake].getKuva();
    }
    
    public void setKuva(Image kuva, int rivi, int sarake){
        ruudut[rivi][sarake].setKuva(kuva);
    }
    
    public void tyhjennaRuutu(int rivi, int sarake){
        ruudut[rivi][sarake].tyhjenna();
    }
    
    public boolean onkoRuutuTyhja(int rivi, int sarake){
        return ruudut[rivi][sarake].onkoTyhja();
    }
    
    /**
     * Tarkistaa onko ruutu käytössä. Käytössä oleva ruutu on joko syöteruutu tai siellä on vihjearvoja. Pois käytöstä oleva ruutu on tyhjä, eikä ole syöteruutu.
     * @param rivi 
     * @param sarake
     * @return True jos ruutu on käytössä, false muuten.
     */
    public boolean onkoRuutuKaytossa(int rivi, int sarake){
        return (getOnkoSyoteRuutu(rivi, sarake) || !onkoRuutuTyhja(rivi, sarake));
    }
    
    
}
