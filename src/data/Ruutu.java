/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.Image;

/**
 * Ruutu -luokka kuvaa yksittäistä pelin ruutua. Ruutuun voi liittyä tekstiä ja kuvaa, ja ruutu voi myös olla syö tai ei. Mikäli ruutu on syöteruutu ja käytössä, odottaa se käyttäjän syötettä.
 * Mikäli ruudussa on tekstiä ja se on syöteruutu, on siellä jo jokin käyttäjän syöte. Mikäli ruudussa on kuva tai tekstiä, mutta se ei ole syöteruutu, on kyseessä vihjeruutu. Mikäli ruutu on tyhjä ja ei syöteruutu, ei se kuulu peliin ollenkaan.
 */
public class Ruutu {
    /**
     * Sisalto -muuttuja sisältää ruutuun kuuluvan tekstin tai merkin.
     */
    private String sisalto;
    
    /**
     * Ruutuun liittyvä kuva.
     */
    private Image kuva;
    /**
     * Muuttuja syoteRuutu, kertoo onko ruutu syöteruutu vai ei, hyödyllinen määriteltäessä vihjeruutuja tai määriteltäessä erimuotoisia peliruudukkoja.
     */
    private boolean syoteRuutu;
    
    public Ruutu(){
        syoteRuutu = true;
        this.sisalto = "\u0000";
    }
    
    public String getSisalto() {
        return sisalto;
    }

    public void setSisalto(String c) {
        this.sisalto = c;
    }
    
    public Image getKuva(){
        return this.kuva;
    }
    
    public void setKuva(Image kuva){
        this.kuva = kuva;
    }
    
    public void setSyoteRuutu(boolean b){
        syoteRuutu = b;
    }
    
    public boolean getSyoteRuutu(){
        return syoteRuutu;
    }
    
    /**
     * Metodi kertoo onko kyseinen ruutu tyhjä.
     * @return True, jos ruudulla ei ole tekstiä tai kuvaa, muuten false.
     */
    public boolean onkoTyhja(){
        return (this.sisalto.equals("\u0000") && kuva == null);
    }
    
    /** 
     * Tämä metodi asettaa ruudun sisällöksi null-merkin, sekä poistaa mahdolliset kuvat.
     */
    public void tyhjenna() {
        this.sisalto = "\u0000";
        this.kuva = null;
    }
}
