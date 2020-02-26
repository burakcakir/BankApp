package Logic;

import Gui.HavaleEkrani;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class HavaleEkraniActions extends Actions {

    private DbHavaleActions dbHavaleActions = null;

    public HavaleEkraniActions(HavaleEkrani havaleEkrani) {
        setHavaleEkrani(havaleEkrani);
    }

    public void setHavaleEkrani(HavaleEkrani havaleEkrani) {
        this.havaleEkrani = havaleEkrani;
    }

    public DbHavaleActions getDbHavaleActions() {
        if (dbHavaleActions == null) {
            dbHavaleActions = new DbHavaleActions();
        }
        return dbHavaleActions;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        String musteriNo = havaleEkrani().getMusteriNoText().getText();
        double gonderilecekMiktar = 0.0; //NumberFormatException hatasi almamak icin

        if (sourceController().buttonSource(havaleEkrani().getHavaleButton())) {

            if (!havaleEkrani().getGonderilecekTutarText().getText().equals("") && !havaleEkrani().getMusteriNoText().getText().equals("")) {
                gonderilecekMiktar = Double.valueOf(havaleEkrani().getGonderilecekTutarText().getText());
                if (uyariMesajlari().onayMesajiGoster(havaleEkrani().getHavaleEkraniFrame(),
                        musteriNo + " nolu hesaba " + gonderilecekMiktar + " TL gönderilecektir.\nOnaylıyor musunuz?", "UYARI") == 1) //if -> YES
                {
                    havaleGerceklestir(musteriNo, gonderilecekMiktar);
                }
            } else {
                uyariMesajlari().uyariMesajiGoster(havaleEkrani().getHavaleEkraniFrame(), "Tüm Alanlar Dolu Olmak Zorundadır!");
            }

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);

        if (sourceController().labelSource(havaleEkrani().getGeriLabel())) {
            havaleEkrani().getHavaleEkraniFrame().setVisible(false);
            kullaniciHesapEkrani().getKullaniciHesapEkraniFrame().setVisible(true);
        }
    }

    public void havaleGerceklestir(String musteriNo, double gonderilecekMiktar) {

        if (getDbHavaleActions().havaleGerceklestir(musteriNo, gonderilecekMiktar)) {
            getDbHavaleActions().bakiyeAzalt(gonderilecekMiktar); //aktif olan hesaptan bakiyeyi azaltir
            havaleEkrani().getHavaleEkraniFrame().setVisible(false);
            if (uyariMesajlari().onayMesajiGoster(havaleEkrani().getHavaleEkraniFrame(),
                    "Hesabınızdan " + musteriNo + " müşteri no'lu hesaba "
                    + gonderilecekMiktar + " TL gönderilmiştir.\nBaşka işlem yapmak istiyor musunuz?", "UYARI") == 1) {
                kullaniciHesapEkrani();
            } else {
                girisEkrani();
            }
        } else if (gonderilecekMiktar == 0) {
            uyariMesajlari().uyariMesajiGoster(havaleEkrani().getHavaleEkraniFrame(), "Göndereceğiniz tutar 1 TL ve katları olmalıdır!");
        } else { //havale gerceklesmemisse
            uyariMesajlari().uyariMesajiGoster(havaleEkrani().getHavaleEkraniFrame(), "İşlem başarısız!\nLütfen girdiğiniz bilgileri kontrol edin!");
        }

    }
}
