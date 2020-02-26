package Logic;

import Gui.ParaCekmeEkrani;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class ParaCekmeEkraniActions extends Actions {

    DbParaCekmeActions dbParaCekmeActions = null;
    private double cekilecekMiktar = 0.0;

    public ParaCekmeEkraniActions(ParaCekmeEkrani paraCekmeEkrani) {
        setParaCekmeEkrani(paraCekmeEkrani);
    }

    public void setParaCekmeEkrani(ParaCekmeEkrani paraCekmeEkrani) {
        this.paraCekmeEkrani = paraCekmeEkrani;
    }

    public DbParaCekmeActions getDbParaCekmeActions() {
        if (dbParaCekmeActions == null) {
            dbParaCekmeActions = new DbParaCekmeActions();
        }
        return dbParaCekmeActions;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        if (sourceController().buttonSource(paraCekmeEkrani().getParaCekButton())) {

            if (!paraCekmeEkrani().getParaCekmeTutariText().getText().equals("")) {
                this.cekilecekMiktar = Double.valueOf(paraCekmeEkrani().getParaCekmeTutariText().getText());
                if (uyariMesajlari().onayMesajiGoster(paraCekmeEkrani().getParaCekmeEkraniFrame(),
                        "Toplam " + cekilecekMiktar + " TL hesabınızdan\nçekilecektir.",
                        "Onaylıyor musunuz?") == 1) { //eger onaylarsa
                    paraCek(cekilecekMiktar);
                }
            } else {
                uyariMesajlari().uyariMesajiGoster(paraCekmeEkrani().getParaCekmeEkraniFrame(), "Bir Tutar Girmelisiniz!");
            }

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);

        if (sourceController().labelSource(paraCekmeEkrani().getGeriLabel())) {
            paraCekmeEkrani().getParaCekmeEkraniFrame().setVisible(false);
            kullaniciHesapEkrani();
        }
    }

    public void paraCek(double cekilecekMiktar) {
        if (getDbParaCekmeActions().paraCek(cekilecekMiktar)) {
            paraCekmeEkrani().getParaCekmeEkraniFrame().setVisible(false);
            if (uyariMesajlari().onayMesajiGoster(paraCekmeEkrani().getParaCekmeEkraniFrame(),
                    "Hesabınızdan " + cekilecekMiktar + " TL çekilmiştir.\nBaşka işlem yapmak istiyor musunuz?", "Onay") == 1) {
                kullaniciHesapEkrani(); //kullanici baska islem yapacaksa
            } else {
                girisEkrani(); //baska islem yapmayacaksa
            }
        } else if (cekilecekMiktar == 0) {
            uyariMesajlari().uyariMesajiGoster(paraCekmeEkrani().getParaCekmeEkraniFrame(), "Çekeceğiniz miktar 1 TL ve katları olmalıdır.");
        } else {
            uyariMesajlari().uyariMesajiGoster(paraCekmeEkrani().getParaCekmeEkraniFrame(), "Hesabınızda bulunan toplam bakiyeden fazla tutar çekemezsiniz!");
        }
    }
}
