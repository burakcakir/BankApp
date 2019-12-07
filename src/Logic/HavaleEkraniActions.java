
package Logic;

import Gui.KullaniciHesapEkrani;
import Gui.HavaleEkrani;
import Logic.UyariMesajlari;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class HavaleEkraniActions extends Actions{
    
    KullaniciHesapEkrani kullaniciHesapEkrani = null;
    UyariMesajlari uyariMesajlari = null;
    HavaleEkrani havaleEkrani = null;
     
     
    public HavaleEkraniActions(HavaleEkrani havaleEkrani)
    {
        setHavaleEkrani(this.havaleEkrani);
    }
    
    public void setHavaleEkrani(HavaleEkrani havaleEkrani)
    {
        this.havaleEkrani = havaleEkrani;
    }
    
    public HavaleEkrani havaleEkrani()
    {
        if(havaleEkrani == null)
        {
            havaleEkrani = new HavaleEkrani();
        }
        return havaleEkrani;
    }
    
    public UyariMesajlari uyariMesajlari()
    {
     if(uyariMesajlari == null)
     {
         uyariMesajlari = new UyariMesajlari();
     }
        return uyariMesajlari;
    }

    public KullaniciHesapEkrani kullaniciHesapEkrani()
    {
        if(kullaniciHesapEkrani == null)
        {
            kullaniciHesapEkrani = new KullaniciHesapEkrani();
        }
        return kullaniciHesapEkrani;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == havaleEkrani().geriLabel())
        {
            kullaniciHesapEkrani();
            havaleEkrani().getHavaleEkraniFrame().setVisible(false);
            
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == havaleEkrani().gonderButton())
        {
            // havalede gönder e basınca ne olacakj 
        }
        
    }

    
    
}
