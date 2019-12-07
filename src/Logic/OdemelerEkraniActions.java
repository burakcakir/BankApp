
package Logic;

import Gui.KullaniciHesapEkrani;
import Gui.OdemelerEkrani;
import Logic.UyariMesajlari;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class OdemelerEkraniActions extends  Actions 
{
    
    KullaniciHesapEkrani kullaniciHesapEkrani = null;
    UyariMesajlari uyariMesajlari = null;
    OdemelerEkrani odemelerEkrani = null;
    
    public OdemelerEkraniActions(OdemelerEkrani odemelerEkrani)
    {
        setOdemelerEkrani(this.odemelerEkrani);
    }
     
    public void setOdemelerEkrani(OdemelerEkrani odemelerEkrani)
    {
        this.odemelerEkrani = this.odemelerEkrani;
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
        
        if(e.getSource() == odemelerEkrani().geriLabel())
        {
            kullaniciHesapEkrani();
            odemelerEkrani().getOdemelerEkraniFrame().setVisible(false);
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == odemelerEkrani().elektrikButton())
        {
            // elektrik öde tılanınca
        }
        
        if(e.getSource() == odemelerEkrani().dogalgazButton())
        {
            // doğal gaz öde tıklanınca
        }
        
        if(e.getSource() == odemelerEkrani().suButton())
        {
            // su ödeme tıklayınca
        }
        
        if(e.getSource() == odemelerEkrani().internetButton())
        {
            //internet öde tıklanınca
        }
        
    }
    
    
    
    
    
}
