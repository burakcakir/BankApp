/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Gui.Ayarlar;
import Gui.GirisEkrani;
import Gui.KullaniciHesapEkrani;
import Gui.ParaCekmeEkranı;
import Gui.ParaYatirmaEkrani;
import Gui.OdemelerEkrani;
import Gui.HavaleEkrani;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Emre
 */
public final class KullaniciHesapEkraniActions extends Actions {

    KullaniciHesapEkrani kullaniciHesapEkrani = null;
    GirisEkrani girisEkrani = null;
    Ayarlar ayarlarEkrani = null;
    UyariMesajlari uyariMesajlari = null;
    ParaCekmeEkranı paracekmeEkrani = null;
    ParaYatirmaEkrani parayatirmaEkrani = null;
    HavaleEkrani havaleEkrani = null;
    OdemelerEkrani odemelerEkrani = null;

    
    public KullaniciHesapEkraniActions(KullaniciHesapEkrani kullaniciHesapEkrani) {
        setKullaniciHesapEkrani(kullaniciHesapEkrani);
    }

    public void setKullaniciHesapEkrani(KullaniciHesapEkrani kullaniciHesapEkrani) {
        this.kullaniciHesapEkrani = kullaniciHesapEkrani;
    }

    public KullaniciHesapEkrani kullaniciHesapEkrani() {
        if (kullaniciHesapEkrani == null) {
            kullaniciHesapEkrani = new KullaniciHesapEkrani();
        }
        return kullaniciHesapEkrani;
    }
    
    public GirisEkrani girisEkrani ()
    {
        if(girisEkrani == null)
        {
            girisEkrani = new GirisEkrani();
        }
        return girisEkrani;
    }
    
    public Ayarlar ayarlarEkrani ()
    {
        if(ayarlarEkrani == null)
        {
            ayarlarEkrani = new Ayarlar();
        }
        return ayarlarEkrani;
    }
   
    public ParaCekmeEkranı paracekmeEkrani()
    {
        if(paracekmeEkrani == null)
        {
            paracekmeEkrani = new ParaCekmeEkranı();
        }
        return paracekmeEkrani;
    }
    
    public ParaYatirmaEkrani parayatirmaEkrani()
    {
        if(parayatirmaEkrani == null)
        {
            parayatirmaEkrani = new ParaYatirmaEkrani();
        }
        return parayatirmaEkrani;
    }
    
    public HavaleEkrani havaleEkrani()
    {
        if(havaleEkrani == null)
        {
            havaleEkrani = new HavaleEkrani();
        }
        return havaleEkrani;
    }
    
    public OdemelerEkrani odemelerEkrani()
    {
        if(odemelerEkrani == null)
        {
            odemelerEkrani = new OdemelerEkrani();
        }
        return odemelerEkrani;
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
         if(e.getSource()== kullaniciHesapEkrani().cikisIcon())
         {
             if(uyariMesajlari().onayMesajiGoster(kullaniciHesapEkrani().getKullaniciHesapEkraniFrame(), "Hesabınızdan çıkış yapmak istiyor musunuz ?", "UYARI") == 1)
             {
                 girisEkrani();
                 kullaniciHesapEkrani().getKullaniciHesapEkraniFrame().setVisible(false);
             }
         }
         
         if(e.getSource() == kullaniciHesapEkrani.ayarlarIcon())
         {
             ayarlarEkrani();
             kullaniciHesapEkrani().getKullaniciHesapEkraniFrame().setVisible(false);
         }

         if(e.getSource() == kullaniciHesapEkrani.parayatirButton())
         {
             //para yatir ekranı yapıldıktan sonra dolcak.
         }
         
         if(e.getSource() == kullaniciHesapEkrani.havaleButton())
         {
             //havale ekranı yapıldıktan sonra dolcak.
         }
         
        if(e.getSource() == kullaniciHesapEkrani.odemelerButton())
        {
             //ödemeler ekranı yapıldıktan sonra dolcak.
        }
         
       
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       if(e.getSource() == kullaniciHesapEkrani().paracekIcon())
       {
           kullaniciHesapEkrani().paracekIcon().setIcon(new ImageIcon(getClass().getResource("/Gui/Image/paraCekIcon.png")));
       }
       
       if(e.getSource() == kullaniciHesapEkrani().parayatirIcon())
       {
           kullaniciHesapEkrani().parayatirIcon().setIcon(new ImageIcon(getClass().getResource("/Gui/Image/paraYatirIcon.png")));
       }
       
       if(e.getSource() == kullaniciHesapEkrani().havaleIcon())
       {
           kullaniciHesapEkrani().havaleIcon().setIcon(new ImageIcon(getClass().getResource("/Gui/Image/havaleIcon.png")));
       }
       
       if(e.getSource() == kullaniciHesapEkrani().odemelerIcon())
       {
           kullaniciHesapEkrani().odemelerIcon().setIcon(new ImageIcon(getClass().getResource("/Gui/Image/odemelerIcon2.png")));
       }
      
    }
    
   
    @Override
    public void mouseExited(MouseEvent e) {
       if(e.getSource() == kullaniciHesapEkrani().paracekIcon())
       {
           kullaniciHesapEkrani().paracekIcon().setIcon(new ImageIcon(getClass().getResource("/Gui/Image/paraCekIcon2.png")));
       }
       
       if(e.getSource() == kullaniciHesapEkrani().parayatirIcon())
       {
           kullaniciHesapEkrani().parayatirIcon().setIcon(new ImageIcon(getClass().getResource("/Gui/Image/paraYatirIcon2.png")));
       }
      
       if(e.getSource() == kullaniciHesapEkrani().havaleIcon())
       {
           kullaniciHesapEkrani().havaleIcon().setIcon(new ImageIcon(getClass().getResource("/Gui/Image/havaleIcon2.png")));
       }
       
       if(e.getSource() == kullaniciHesapEkrani().odemelerIcon())
       {
           kullaniciHesapEkrani().odemelerIcon().setIcon(new ImageIcon(getClass().getResource("/Gui/Image/odemelerIcon.png")));
       }
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         
         
         if(e.getSource() == kullaniciHesapEkrani.paracekButton())
         {
             paracekmeEkrani();
             kullaniciHesapEkrani().getKullaniciHesapEkraniFrame().setVisible(false);
         }
         
         if(e.getSource() == kullaniciHesapEkrani.parayatirButton())
         {
             parayatirmaEkrani();
             kullaniciHesapEkrani.getKullaniciHesapEkraniFrame().setVisible(false);
         }
         
         if(e.getSource() == kullaniciHesapEkrani.havaleButton())
         {
             havaleEkrani();
             kullaniciHesapEkrani().getKullaniciHesapEkraniFrame().setVisible(false);
         }
         
         if(e.getSource() == kullaniciHesapEkrani().odemelerButton())
         {
             odemelerEkrani();
             kullaniciHesapEkrani().getKullaniciHesapEkraniFrame().setVisible(false);
         }
        
    }
    
    
    
    
    
    
}
