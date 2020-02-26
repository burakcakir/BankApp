package Logic;

import Gui.BasvuruEkrani;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class BasvuruEkraniActions extends Actions {

    private DbBasvuruActions dbBasvuruActions = null;
    private String adSoyad = "", tcNo = "", telNo = "";
    private String guvenlikSorusu = "", guvenlikCevap = "";
    private String musteriNo;
    private int sifre;
    private double elektrikFaturasi, suFaturasi, dogalgazFaturasi, internetFaturasi;

    public BasvuruEkraniActions(BasvuruEkrani basvuruEkrani) {
        setBasvuruEkrani(basvuruEkrani);
    }

    public void setBasvuruEkrani(BasvuruEkrani basvuruEkrani) {
        this.basvuruEkrani = basvuruEkrani;
    }

    public DbBasvuruActions getDbBasvuruActions() {
        if (dbBasvuruActions == null) {
            dbBasvuruActions = new DbBasvuruActions();
        }
        return dbBasvuruActions;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        /*Başvuru Ekranı Geri Iconu*/
        if (sourceController().labelSource(basvuruEkrani().getGeriLabel())) {
            girisEkrani();
            basvuruEkrani().getBasvuruEkraniFrame().setVisible(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if (sourceController().buttonSource(basvuruEkrani().getBasvurButton())) {

            if (bilgilerDoluMu()) {
                basvuruyuGerceklestir();
            } else {
                uyariMesajlari().uyariMesajiGoster(basvuruEkrani().getBasvuruEkraniFrame(), "Tüm Alanlar Dolu Olmak Zorundadır!");
            }
        }
    }

    public boolean alanlarBosmu() {
        return basvuruEkrani().getAdSoyadText().getText().equals("")
                || basvuruEkrani().getTcNoText().getText().equals("")
                || basvuruEkrani().getTelNoText().getText().equals("")
                || basvuruEkrani().getGuvenlikCevapText().getText().equals("");
    }

    public boolean bilgilerDoluMu() {
        if (!alanlarBosmu()) {
            adSoyad = basvuruEkrani().getAdSoyadText().getText().trim();
            tcNo = basvuruEkrani().getTcNoText().getText();
            telNo = basvuruEkrani().getTelNoText().getText();
            guvenlikSorusu = basvuruEkrani().getGuvenlikSorusuComboBox().getSelectedItem().toString();
            guvenlikCevap = basvuruEkrani().getGuvenlikCevapText().getText().trim();
        }
        return !(adSoyad.trim().equals("") || tcNo.trim().equals("") || telNo.trim().equals("") || guvenlikCevap.trim().equals(""));
    }

    public void randomAta() {
        do {
            musteriNo = String.valueOf(100000 + (int) (Math.random() * 900000)); //100.000 ile 1.000.000 arasindaki sayilar 
        } while (!getDbBasvuruActions().musteriNoKontrolEt(musteriNo)); //uretilen random musteri numarasi tabloda oldugu surece yeniden musteriNo uretecek    
        sifre = 1000 + (int) (Math.random() * 9000);
        elektrikFaturasi = 30 + (int) (Math.random() * 370);
        suFaturasi = 30 + (int) (Math.random() * 370);
        dogalgazFaturasi = 30 + (int) (Math.random() * 370);
        internetFaturasi = 30 + (int) (Math.random() * 370);
    }

    public boolean verileriEkle() {
        randomAta();
        if (getDbBasvuruActions().tcNoKontrolEt(this.tcNo)) { 
            getDbBasvuruActions().veriEkle(musteriNo, sifre, adSoyad, tcNo, telNo, guvenlikSorusu, guvenlikCevap,
                    0, elektrikFaturasi, suFaturasi, dogalgazFaturasi, internetFaturasi);
            return true;
        } else {
            return false;
        }
    }

    public void basvuruyuGerceklestir() {
        if (!JTextFieldLimit.isMinLimit(basvuruEkrani().getTcNoText())) {
            uyariMesajlari().uyariMesajiGoster(basvuruEkrani().getBasvuruEkraniFrame(), "Tc No 11 Haneli Olmalıdır!");
        } else if (!JTextFieldLimit.isMinLimit(basvuruEkrani().getTelNoText())) {
            uyariMesajlari().uyariMesajiGoster(basvuruEkrani().getBasvuruEkraniFrame(), "Tel No 11 Haneli Olmalıdır!");
        } else {
            if (verileriEkle()) {
                uyariMesajlari().uyariMesajiGoster(basvuruEkrani().getBasvuruEkraniFrame(), "Başvurunuzun kabul edilmiştir. "
                        + "\n\nMüşteri Numaranız:" + musteriNo
                        + "\nŞifreniz:" + sifre);
                basvuruEkrani().getBasvuruEkraniFrame().setVisible(false);
                girisEkrani();
            } else {
                uyariMesajlari().uyariMesajiGoster(basvuruEkrani().getBasvuruEkraniFrame(), "Bu T.C. Numaraması ile zaten başvuru yapılmış!");
                textleriBosalt();
            }
        }
    }

    public void textleriBosalt() {
        basvuruEkrani().getAdSoyadText().setText("");
        basvuruEkrani().getTcNoText().setText("");
        basvuruEkrani().getTelNoText().setText("");
        basvuruEkrani().getGuvenlikCevapText().setText("");
    }
}
