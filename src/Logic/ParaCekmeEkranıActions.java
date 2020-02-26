package Logic;

import Gui.Ayarlar;
import Gui.GirisEkrani;
import Gui.KullaniciHesapEkrani;
import Gui.ParaCekmeEkranı;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public final class ParaCekmeEkranıActions extends Actions{
    
    ParaCekmeEkranı paracekmeEkrani = null;
    GirisEkrani girisEkrani = null;
    Ayarlar ayarlarEkrani = null;
    UyariMesajlari uyariMesajlari = null;
    KullaniciHesapEkrani kullaniciHesapEkrani = null;
    
    public ParaCekmeEkranıActions(ParaCekmeEkranı paracekmeEkrani) {
        setParaCekmeEkranı(paracekmeEkrani);
    }
    
    public void setParaCekmeEkranı(ParaCekmeEkranı paracekmeEkrani) {
        this.paracekmeEkrani = paracekmeEkrani;
    }    
    
    public ParaCekmeEkranı paracekmeEkrani() {
        if (paracekmeEkrani == null) {
            paracekmeEkrani = new ParaCekmeEkranı();
        }
        return paracekmeEkrani;
    }    
    
    public KullaniciHesapEkrani kullaniciHesapEkrani()
    {
        if(kullaniciHesapEkrani == null)
        {
            kullaniciHesapEkrani = new KullaniciHesapEkrani();
        }
        return kullaniciHesapEkrani;
    }
    
    public UyariMesajlari uyariMesajlari()
    {
     if(uyariMesajlari == null)
     {
         uyariMesajlari = new UyariMesajlari();
     }
        return uyariMesajlari;
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == paracekmeEkrani().geriLabel()) {
            kullaniciHesapEkrani();
            paracekmeEkrani().getParaCekmeEkraniFrame().setVisible(false);
        }
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == paracekmeEkrani().paracekButton())
        {

        }
        
        
    }
    
    
    
    
    
    
}
