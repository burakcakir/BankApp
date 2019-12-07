/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Gui.BasvuruEkrani;
import Gui.GirisEkrani;
import java.awt.event.MouseEvent;

/**
 *
 * @author Emre
 */
public class BasvuruEkraniActions extends Actions {

    BasvuruEkrani basvuruEkrani = null;
    GirisEkrani girisEkrani = null;
    
    public BasvuruEkraniActions(BasvuruEkrani basvuruEkrani) {
        setBasvuruEkrani(basvuruEkrani);
    }

    public void setBasvuruEkrani(BasvuruEkrani basvuruEkrani) {
        this.basvuruEkrani = basvuruEkrani;
    }

    public BasvuruEkrani basvuruEkrani() {
        if(basvuruEkrani == null)
            basvuruEkrani = new BasvuruEkrani();
        return basvuruEkrani;
    }
    
     public GirisEkrani girisEkrani() {
        if(girisEkrani == null)
            girisEkrani = new GirisEkrani();
        return girisEkrani;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        /*Başvuru Ekranı Geri Iconu*/
        if (e.getSource() == basvuruEkrani().geriLabel()) {
            girisEkrani();
            basvuruEkrani().basvuruEkraniFrame().setVisible(false);
        }
        /**/
    }

}
