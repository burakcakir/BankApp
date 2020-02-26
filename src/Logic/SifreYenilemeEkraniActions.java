package Logic;

import Gui.SifreYenilemeEkrani;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class SifreYenilemeEkraniActions extends Actions {

    private DbSifreYenilemeActions dbSifreYenilemeActions = null;
    private String tcNo, guvenlikCevap;
    private int eskiSifre, yeniSifre;

    public SifreYenilemeEkraniActions(SifreYenilemeEkrani sifreYenilemeEkrani) {
        setSifreYenilemeEkrani(sifreYenilemeEkrani);
    }

    public void setSifreYenilemeEkrani(SifreYenilemeEkrani sifreYenilemeEkrani) {
        this.sifreYenilemeEkrani = sifreYenilemeEkrani;
    }

    public DbSifreYenilemeActions getDbSifreYenilemeActions() {
        if (dbSifreYenilemeActions == null) {
            dbSifreYenilemeActions = new DbSifreYenilemeActions();
        }
        return dbSifreYenilemeActions;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);

        if (sourceController().labelSource(sifreYenilemeEkrani().getGeriLabel())) {
            sifreYenilemeEkrani().getSifreYenilemeFrame().setVisible(false);
            if (eskiSifreTextAktifMi()) { //eger kullanici sifremi unuttum ekraninda degilse(eski sifre aktifse)
                ayarlarEkrani();
            } else {
                girisEkrani();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        if (sourceController().buttonSource(sifreYenilemeEkrani().getSifreYenileButton())) {
            if (alanlarDoluMu()) {
                sifreyiYenile();
            } else {
                uyariMesajlari().uyariMesajiGoster(sifreYenilemeEkrani().getSifreYenilemeFrame(), "Tüm Alanlar Dolu Olmak Zorunda");
            }
        }
    }

    public boolean alanlarDoluMu() {
        if (sifreYenilemeEkrani().getTcNoText().getText().trim().equals("")
                || sifreYenilemeEkrani().getGuvenlikCevapText().getText().trim().equals("")
                || sifreYenilemeEkrani().getYeniSifreText().getText().trim().equals("")
                || sifreYenilemeEkrani().getYeniSifreTekrarText().getText().trim().equals("")) {
            return false;
        } else {
            tcNo = sifreYenilemeEkrani().getTcNoText().getText().trim();
            guvenlikCevap = sifreYenilemeEkrani().getGuvenlikCevapText().getText().trim();
            if (eskiSifreTextAktifMi()) { //eski sifre aktifse
                if (!sifreYenilemeEkrani().getEskiSifreText().getText().equals("")) { //eskisifre bos degilse
                    eskiSifre = Integer.valueOf(sifreYenilemeEkrani().getEskiSifreText().getText());
                } else {
                    return false;
                }
            }
            yeniSifre = Integer.valueOf(sifreYenilemeEkrani().getYeniSifreText().getText());
            return true;
        }
    }

    public boolean eskiSifreTextAktifMi() {
        return !(sifreYenilemeEkrani().getEskiSifreText().getBackground() == Color.black); //rengi siyah ise false donecek
    }

    public void sifreyiYenile() {

        if (yeniSifre == Integer.valueOf(sifreYenilemeEkrani().getYeniSifreTekrarText().getText())) { //yeni sifre ve tekrari ayniysa
            if (eskiSifreTextAktifMi()) {
                if (getDbSifreYenilemeActions().sifreyiDegistir(tcNo, guvenlikCevap, eskiSifre, yeniSifre)) {
                    uyariMesajlari().uyariMesajiGoster(sifreYenilemeEkrani().getSifreYenilemeFrame(), "Şifreniz başarıyla değiştirilmiştir.");
                    sifreYenilemeEkrani().getSifreYenilemeFrame().setVisible(false);
                    kullaniciHesapEkrani();
                } else {
                    uyariMesajlari().uyariMesajiGoster(sifreYenilemeEkrani().getSifreYenilemeFrame(), "İşlem başarısız.Bilgilerinizi kontrol ediniz.");
                }
            } else if (!eskiSifreTextAktifMi()) {
                if (getDbSifreYenilemeActions().sifreyiYenile(tcNo, guvenlikCevap, yeniSifre)) {
                    uyariMesajlari().uyariMesajiGoster(sifreYenilemeEkrani().getSifreYenilemeFrame(), "Şifreniz başarıyla yenilenmiştir.");
                    sifreYenilemeEkrani().getSifreYenilemeFrame().setVisible(false);
                    girisEkrani();
                } else {
                    uyariMesajlari().uyariMesajiGoster(sifreYenilemeEkrani().getSifreYenilemeFrame(), "İşlem başarısız.Bilgilerinizi kontrol ediniz.");
                }
            }
        } else {
            uyariMesajlari().uyariMesajiGoster(sifreYenilemeEkrani().getSifreYenilemeFrame(), "Şifreler uyuşmuyor!");
        }
    }

}
