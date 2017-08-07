/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

/**
 *
 * @author Admin
 */
public class Ajastin {
    private long aloitusAika;
   
    public void aloitaAjastin(){
        aloitusAika = System.nanoTime();
    }
    
    public long kulunutAika(){
        return System.nanoTime() - aloitusAika;
    }
}
