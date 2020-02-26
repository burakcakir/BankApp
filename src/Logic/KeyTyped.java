package Logic;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class KeyTyped {

    public static void sadeceSayiAl(Component currentComponent, JTextField text) //gönderilen textfield'a sadece sayı girilmesini sağlar
    {
        text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char k = e.getKeyChar();
                if (!Character.isDigit(k) && k != KeyEvent.VK_BACK_SPACE) { //k karakteri rakam değilse ve silme tuşuna basılmamışsa
                    e.consume(); //devre disi birak
                    UyariMesajlari uyariMesaji = new UyariMesajlari();
                    uyariMesaji.uyariMesajiGoster(currentComponent, uyariMesaji.sayiUyarisiAl());
                }
            }
        });

    }
}
