package Logic;

import Gui.ParaYatirmaEkrani;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class ParaYatirmaEkraniActions extends Actions {

    private DbParaYatirmaActions dbParaYatirmaActions = null;
    private double yatirilacakMiktar = 0.0;

    public ParaYatirmaEkraniActions(ParaYatirmaEkrani paraYatirmaEkrani) {
        setParaYatirmaEkrani(paraYatirmaEkrani);
    }

    public void setParaYatirmaEkrani(ParaYatirmaEkrani paraYatirmaEkrani) {
        this.paraYatirmaEkrani = paraYatirmaEkrani;
    }

    public DbParaYatirmaActions getDbParaYatirmaActions() {
        if (dbParaYatirmaActions == null) {
            dbParaYatirmaActions = new DbParaYatirmaActions();
        }
        return dbParaYatirmaActions;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        if (sourceController().buttonSource(paraYatirmaEkrani().getParaYatirButton())) {

            if (!paraYatirmaEkrani().getParaYatirmaTutariText().getText().equals("")) {
                yatirilacakMiktar = Double.valueOf(paraYatirmaEkrani().getParaYatirmaTutariText().getText());
                if (uyariMesajlari().onayMesajiGoster(paraYatirmaEkrani().getParaYatirmaEkraniFrame(),
                        "Toplam " + yatirilacakMiktar + " TL hesabınıza tanımlanacaktır.",
                        "Onaylıyor musunuz?") == 1) { //eger onaylarsa
                    paraYatir(yatirilacakMiktar);
                }
            } else {
                uyariMesajlari().uyariMesajiGoster(paraYatirmaEkrani().getParaYatirmaEkraniFrame(), "Bir Tutar Girmelisiniz!");
            }

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);

        if (sourceController().labelSource(paraYatirmaEkrani().getGeriLabel())) {
            paraYatirmaEkrani().getParaYatirmaEkraniFrame().setVisible(false);
            kullaniciHesapEkrani();
        }
    }

    public void paraYatir(double yatirilacakMiktar) {
        if (getDbParaYatirmaActions().paraYatir(yatirilacakMiktar)) {
            paraYatirmaEkrani().getParaYatirmaEkraniFrame().setVisible(false);
            if (uyariMesajlari().onayMesajiGoster(paraYatirmaEkrani().getParaYatirmaEkraniFrame(),
                    "Hesabınıza " + yatirilacakMiktar + " TL tanımlanmıştır.\nBaşka işlem yapmak istiyor musunuz?", "Onay") == 1) {
                kullaniciHesapEkrani();
            } else {
                girisEkrani();
            }
        } else if (yatirilacakMiktar == 0) {
            uyariMesajlari().uyariMesajiGoster(paraYatirmaEkrani().getParaYatirmaEkraniFrame(), "Yatıracağınız miktar 1 TL ve katları olmalıdır.");
        } else {
            uyariMesajlari().uyariMesajiGoster(paraYatirmaEkrani().getParaYatirmaEkraniFrame(), "Tek seferde 5000 TL ve altını yatırabilirsiniz!");
        }
    }
}
