package Logic;

import Gui.KullaniciHesapEkrani;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class KullaniciHesapEkraniActions extends Actions {

    public KullaniciHesapEkraniActions(KullaniciHesapEkrani kullaniciHesapEkrani) {
        setKullaniciHesapEkrani(kullaniciHesapEkrani);
    }

    public void setKullaniciHesapEkrani(KullaniciHesapEkrani kullaniciHesapEkrani) {
        this.kullaniciHesapEkrani = kullaniciHesapEkrani;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        kullaniciHesapEkrani().getKullaniciHesapEkraniFrame().setVisible(false); //sadece buton actionlari oldugu icin sadece buraya yazalim 

        /*Para Cek Butonu*/
        if (sourceController().buttonSource(kullaniciHesapEkrani().getParaCekButton())) {
            paraCekmeEkrani();
        }

        /*Para Yatir Butonu*/
        if (sourceController().buttonSource(kullaniciHesapEkrani().getParaYatirButton())) {
            paraYatirmaEkrani();
        }

        /*Havale Buton*/
        if (sourceController().buttonSource(kullaniciHesapEkrani().getHavaleButton())) {
            havaleEkrani();
        }
       

        /*Odemeler Buton*/
        if (sourceController().buttonSource(kullaniciHesapEkrani().getOdemelerButton())) {
            odemelerEkrani();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        super.mouseEntered(e);
        iconlariKontrolEt("");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        super.mouseExited(e);
        iconlariKontrolEt("2");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);

        if (sourceController().labelSource(kullaniciHesapEkrani().getCikisIcon())) {
            if (uyariMesajlari().onayMesajiGoster(kullaniciHesapEkrani().getKullaniciHesapEkraniFrame(), "Hesabınızdan çıkış yapmak istiyor musunuz?", "UYARI") == 1) {
                kullaniciHesapEkrani().getKullaniciHesapEkraniFrame().setVisible(false);
                getSingletonMusteri().setMusteriNo_Tc("");
                girisEkrani();
            }
        }
        if (sourceController().labelSource(kullaniciHesapEkrani().getAyarlarIcon())) {
            kullaniciHesapEkrani().getKullaniciHesapEkraniFrame().setVisible(false);
            ayarlarEkrani();
        }
    }

    public void iconlariKontrolEt(String iconNumber) { //iconNumber ayarlamasi yapilarak olusturulmus methoddur
        if (buttonSourceControl(kullaniciHesapEkrani().getParaCekButton())) {
            kullaniciHesapEkrani().getParaCekIcon().setIcon(new ImageIcon(getClass().getResource("/Gui/Image/paraCekIcon" + iconNumber + ".png")));
        }

        if (buttonSourceControl(kullaniciHesapEkrani().getParaYatirButton())) {
            kullaniciHesapEkrani().getParaYatirIcon().setIcon(new ImageIcon(getClass().getResource("/Gui/Image/paraYatirIcon" + iconNumber + ".png")));
        }

        if (buttonSourceControl(kullaniciHesapEkrani().getHavaleButton())) {
            kullaniciHesapEkrani().getHavaleIcon().setIcon(new ImageIcon(getClass().getResource("/Gui/Image/havaleIcon" + iconNumber + ".png")));
        }

        if (buttonSourceControl(kullaniciHesapEkrani().getOdemelerButton())) {
            kullaniciHesapEkrani().getOdemelerIcon().setIcon(new ImageIcon(getClass().getResource("/Gui/Image/odemelerIcon" + iconNumber + ".png")));
        }
    }

    public boolean buttonSourceControl(JButton button) {
        return sourceController().buttonSource(button);
    }
}
