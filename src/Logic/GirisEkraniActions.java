package Logic;

import Gui.BasvuruEkrani;
import Gui.GirisEkrani;
import Gui.KullaniciHesapEkrani;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;

public final class GirisEkraniActions extends Actions {

    GirisEkrani girisEkrani = null;
    BasvuruEkrani basvuruEkrani = null;
    KullaniciHesapEkrani kullaniciHesapEkrani = null;

    /*Giriş Ekranı*/
    public GirisEkraniActions(GirisEkrani girisEkrani) {
        setGirisEkrani(girisEkrani);
    }

    public void setGirisEkrani(GirisEkrani girisEkrani) {
        this.girisEkrani = girisEkrani;
    }

    public GirisEkrani girisEkrani() {
        if (girisEkrani == null) {
            girisEkrani = new GirisEkrani();
        }
        return girisEkrani;
    }
    /**/
    
    public BasvuruEkrani basvuruEkrani() {
        if (basvuruEkrani == null) {
            basvuruEkrani = new BasvuruEkrani();
        }
        return basvuruEkrani;
    }

    public KullaniciHesapEkrani kullaniciHesapEkrani() {
        if (kullaniciHesapEkrani == null) {
            kullaniciHesapEkrani = new KullaniciHesapEkrani();
        }
        return kullaniciHesapEkrani;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        /*Giriş Ekranı Giriş Button*/
        if(e.getSource() == girisEkrani().girisButton()) { //giriş butonuna tıklanmışsa
            kullaniciHesapEkrani();
            girisEkrani().getGirisEkraniFrame().setVisible(false);
        }
        /**/
        
        /*Giriş Ekranı Başvur Button*/
        if(e.getSource() == girisEkrani().basvuruButton()) {
            basvuruEkrani();
            girisEkrani().getGirisEkraniFrame().setVisible(false);
        }
        /**/
    }

    @Override
    public void focusGained(FocusEvent e) {
        /*Giriş Ekranı Müşteri No Text*/
        if(e.getSource() == girisEkrani().musteriNo_TcNoText()) {
            if(girisEkrani().musteriNo_TcNoText().getText().trim().equals("T.C. No / Müşteri No"))
                girisEkrani().musteriNo_TcNoText().setText("");
            else 
                girisEkrani().musteriNo_TcNoText().setForeground(Color.gray);
        }
        /**/
        
        /*Giriş Ekranı Şifre Text*/
        if(e.getSource() == girisEkrani().sifreText()) {
            if(girisEkrani().sifreText().getText().trim().equals("**********"))
                girisEkrani().sifreText().setText("");
            else 
                girisEkrani().sifreText().setForeground(Color.gray);
        }
        /**/
    }

    @Override
    public void focusLost(FocusEvent e) {
        /*Giriş Ekranı Müşteri No Text*/
        if(e.getSource() == girisEkrani().musteriNo_TcNoText()) {
            if(girisEkrani().musteriNo_TcNoText().getText().trim().equals("")) {
                girisEkrani().musteriNo_TcNoText().setText("T.C. No / Müşteri No");
                girisEkrani().musteriNo_TcNoText().setForeground(Color.gray);
            }
            else 
                girisEkrani().musteriNo_TcNoText().setForeground(Color.black);
            
        }
        /**/
        
        /*Giriş Ekranı Şifre Text*/
        if(e.getSource() == girisEkrani().sifreText()) {
            if(girisEkrani().sifreText().getText().trim().equals("")) {
                girisEkrani().sifreText().setText("**********");
                girisEkrani().sifreText().setForeground(Color.gray);
            }
            else 
                girisEkrani().sifreText().setForeground(Color.black);
        }
        /**/       
    }
    
    

    
}
