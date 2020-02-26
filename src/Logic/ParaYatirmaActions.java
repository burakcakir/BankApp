
package Logic;


import Gui.KullaniciHesapEkrani;
import Gui.ParaYatirmaEkrani;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class ParaYatirmaActions extends Actions{
    
    KullaniciHesapEkrani kullaniciHesapEkrani = null;
    UyariMesajlari uyariMesajlari = null;
    ParaYatirmaEkrani parayatirmaEkrani = null;
    
    public ParaYatirmaActions(ParaYatirmaEkrani parayatirmaEkrani)
    {
        setParaYatirmaEkrani(parayatirmaEkrani);
    }
    
    public void setParaYatirmaEkrani(ParaYatirmaEkrani parayatirmaEkrani)
    {
        this.parayatirmaEkrani = parayatirmaEkrani;
    }
    
    public ParaYatirmaEkrani parayatirmaEkrani()
    {
        if(parayatirmaEkrani == null)
        {
            parayatirmaEkrani = new ParaYatirmaEkrani();
        }
        return parayatirmaEkrani;
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
        
        if(e.getSource() == parayatirmaEkrani().geriLabel())
        {
            kullaniciHesapEkrani();
            parayatirmaEkrani().getParaYatirmaEkraniFrame().setVisible(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == parayatirmaEkrani().parayatirButton())
        {
            //butona tıklanınca ne olcak
        }
    }
    
    
    
}
