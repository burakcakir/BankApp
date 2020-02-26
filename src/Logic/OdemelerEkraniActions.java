package Logic;

import Gui.OdemelerEkrani;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class OdemelerEkraniActions extends Actions {

    DbOdemelerActions dbOdemelerActions = null;

    public OdemelerEkraniActions(OdemelerEkrani odemelerEkrani) {
        setOdemelerEkrani(odemelerEkrani);
    }

    public void setOdemelerEkrani(OdemelerEkrani odemelerEkrani) {
        this.odemelerEkrani = odemelerEkrani;
    }

    public DbOdemelerActions getDbOdemelerActions() {
        if (dbOdemelerActions == null) {
            dbOdemelerActions = new DbOdemelerActions();
        }
        return dbOdemelerActions;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        if (sourceController().buttonSource(odemelerEkrani().getElektrikOdeButton())) {
            double elektrikFaturasi = Actions.getDataController().getElektrikFaturasi();
            borcuOde("Elektrik", elektrikFaturasi, "elektrikFaturasi");
        }

        if (sourceController().buttonSource(odemelerEkrani().getSuOdeButton())) {
            double suFaturasi = Actions.getDataController().getSuFaturasi();
            borcuOde("Su", suFaturasi, "suFaturasi");
        }

        if (sourceController().buttonSource(odemelerEkrani().getDogalgazOdeButton())) {
            double dogalgazFaturasi = Actions.getDataController().getDogalgazFaturasi();
            borcuOde("Doğalgaz", dogalgazFaturasi, "dogalgazFaturasi");
        }

        if (sourceController().buttonSource(odemelerEkrani().getInternetOdeButton())) {
            double internetFaturasi = Actions.getDataController().getInternetFaturasi();
            borcuOde("İnternet", internetFaturasi, "internetFaturasi");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);

        if (sourceController().labelSource(odemelerEkrani().getGeriLabel())) {
            odemelerEkrani().getOdemelerEkraniFrame().setVisible(false);
            kullaniciHesapEkrani().getKullaniciHesapEkraniFrame().setVisible(true);
        }
    }

    public void borcuOde(String faturaIsmi, double faturaTutari, String faturaCesidi) {
        /**/
        if (uyariMesajlari().onayMesajiGoster(odemelerEkrani().getOdemelerEkraniFrame(),
                "Ödeyeceğiniz " + faturaIsmi + " faturası tutarı toplam " + faturaTutari + " TL'dir.", "Onaylıyor musunuz?") == 1) {
            if (getDbOdemelerActions().faturayiOde(faturaCesidi, faturaTutari)) { //fatura ödenebilmişse
                odemelerEkrani().getOdemelerEkraniFrame().setVisible(false);
                if (uyariMesajlari().onayMesajiGoster(odemelerEkrani().getOdemelerEkraniFrame(),
                        faturaIsmi + " faturası borcunuz ödenmiştir.\nBaşka işlem yapmak istiyor musunuz?", "UYARI") == 1) {
                    kullaniciHesapEkrani();
                } else {
                    girisEkrani();
                }
            } else { //fatura ödenememişse
                uyariMesajlari().uyariMesajiGoster(odemelerEkrani().getOdemelerEkraniFrame(),
                        faturaIsmi + " faturasını ödeyebilmeniz için yeterli bakiyeniz bulunmamaktadır!");
            }
        }
    }

}
