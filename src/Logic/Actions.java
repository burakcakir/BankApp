package Logic;

import Gui.AyarlarEkrani;
import Gui.BasvuruEkrani;
import Gui.GirisEkrani;
import Gui.HavaleEkrani;
import Gui.KullaniciHesapEkrani;
import Gui.OdemelerEkrani;
import Gui.ParaCekmeEkrani;
import Gui.ParaYatirmaEkrani;
import Gui.SifreYenilemeEkrani;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Actions implements ActionListener, FocusListener, MouseListener {

    protected GirisEkrani girisEkrani = null;
    protected BasvuruEkrani basvuruEkrani = null;
    protected KullaniciHesapEkrani kullaniciHesapEkrani = null;
    protected AyarlarEkrani ayarlarEkrani = null;
    protected ParaCekmeEkrani paraCekmeEkrani = null;
    protected ParaYatirmaEkrani paraYatirmaEkrani = null;
    protected HavaleEkrani havaleEkrani = null;
    protected OdemelerEkrani odemelerEkrani = null;
    protected SifreYenilemeEkrani sifreYenilemeEkrani = null;
    protected UyariMesajlari uyariMesajlari = null;
    protected SourceController sourceController = null;
    protected SingletonMusteri singleton = null;
    static DbDataController dataController = null;

    public static DbDataController getDataController() {
        if (dataController == null) {
            dataController = new DbDataController();
        }
        return dataController;
    }

    public GirisEkrani girisEkrani() {
        if (girisEkrani == null) {
            girisEkrani = new GirisEkrani();
        }
        return girisEkrani;
    }

    public BasvuruEkrani basvuruEkrani() {
        if (basvuruEkrani == null) {
            basvuruEkrani = new BasvuruEkrani();
        }
        return basvuruEkrani;
    }

    public KullaniciHesapEkrani kullaniciHesapEkrani() {
        if (kullaniciHesapEkrani == null) {
            kullaniciHesapEkrani = new KullaniciHesapEkrani();
        }
        return kullaniciHesapEkrani;
    }

    public AyarlarEkrani ayarlarEkrani() {
        if (ayarlarEkrani == null) {
            ayarlarEkrani = new AyarlarEkrani();
        }
        return ayarlarEkrani;
    }

    public ParaCekmeEkrani paraCekmeEkrani() {
        if (paraCekmeEkrani == null) {
            paraCekmeEkrani = new ParaCekmeEkrani();
        }
        return paraCekmeEkrani;
    }

    public ParaYatirmaEkrani paraYatirmaEkrani() {
        if (paraYatirmaEkrani == null) {
            paraYatirmaEkrani = new ParaYatirmaEkrani();
        }
        return paraYatirmaEkrani;
    }

    public HavaleEkrani havaleEkrani() {
        if (havaleEkrani == null) {
            havaleEkrani = new HavaleEkrani();
        }
        return havaleEkrani;
    }

    public OdemelerEkrani odemelerEkrani() {
        if (odemelerEkrani == null) {
            odemelerEkrani = new OdemelerEkrani();
        }
        return odemelerEkrani;
    }

    public SifreYenilemeEkrani sifreYenilemeEkrani() {
        if (sifreYenilemeEkrani == null) {
            sifreYenilemeEkrani = new SifreYenilemeEkrani();
        }
        return sifreYenilemeEkrani;
    }

    public UyariMesajlari uyariMesajlari() {
        if (uyariMesajlari == null) {
            uyariMesajlari = new UyariMesajlari();
        }
        return uyariMesajlari;
    }

    public SourceController sourceController() {
        if (sourceController == null) {
            sourceController = new SourceController();
        }
        return sourceController;
    }

    public SingletonMusteri getSingletonMusteri() {
        if (singleton == null) {
            singleton = SingletonMusteri.getInstance();
        }
        return singleton;
    }

    @Override
    public void actionPerformed(ActionEvent e) { //kaynaga tiklandiginda gerceklesecek olaylar     
        sourceController().setSource(e.getSource());
    }

    @Override
    public void focusGained(FocusEvent e) { //belirlenen kaynaklara tıklandığında(focuslandığında)  
        sourceController().setSource(e.getSource());
    }

    @Override
    public void focusLost(FocusEvent e) { //belirlenen kaynak dışında bir kaynaga tıklandığında(focus kaybedildiğinde) 
        sourceController().setSource(e.getSource());
    }

    @Override
    public void mouseClicked(MouseEvent e) { //belirlenen kaynaga mouse ile tiklandiginda
        sourceController().setSource(e.getSource());
    }

    @Override
    public void mouseEntered(MouseEvent e) { //belirlenen kaynagin uzerine mouse geldiginde    
        sourceController().setSource(e.getSource());
    }

    @Override
    public void mouseExited(MouseEvent e) { //belirlenen kaynagin uzerinden mouse ciktiginda  
        sourceController().setSource(e.getSource());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        sourceController().setSource(e.getSource());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        sourceController().setSource(e.getSource());
    }
}
