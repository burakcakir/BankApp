package Logic;

import java.awt.Component;
import javax.swing.JOptionPane;

public class UyariMesajlari {

    private String uyariMesaji = ""; //Yapılan yanlış işlem sonucunda herhangi bir jLabel'de gösterilen mesajlar için.

    public void uyariMesajiGoster(Component sinif, String uyariMesaji) {
        JOptionPane.showMessageDialog(sinif, uyariMesaji);
    }

    public int onayMesajiGoster(Component currentComponent, String message, String title) {
        int optionType = JOptionPane.YES_NO_OPTION;
        int selected = JOptionPane.showConfirmDialog(currentComponent, message, title, optionType);    
        if(optionType == selected) //eger yes secenegi secilmisse 
            return 1;        
        return -1; //eger no secilmisse
    }

    public String sayiUyarisiAl() {
        this.uyariMesaji = "Yalnızca sayı girilebilir!";
        return uyariMesaji;
    }

}
