/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Emre
 */
public class KeyTyped {

    public static void sadeceSayiAl(Component sinif, JTextField text) //gönderilen textfield'a sadece sayı girilmesini sağlar
    {
        text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char k = e.getKeyChar();
                if (!Character.isDigit(k) && k != KeyEvent.VK_BACK_SPACE) { //k karakteri rakam değilse ve silme tuşuna basılmamışsa
                    e.consume(); //devre disi birak
                    UyariMesajlari uyariMesaji = new UyariMesajlari();
                    uyariMesaji.uyariMesajiGoster(sinif, uyariMesaji.sayiUyarisiAl());
                }
            }
        });

    }
}
