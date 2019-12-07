package Gui;

import Logic.GirisEkraniActions;
import java.awt.*;
import javax.swing.*;

public final class GirisEkrani {

    JFrame girisEkraniFrame = null;
    JPanel girisEkraniPanel = null;
    JButton girisButton = null;
    JLabel hosgeldinizLabel = null;
    JTextField musteriNo_TcNoText = null;
    JPasswordField sifreText = null;
    JLabel basvuruSoruLabel = null;
    JButton basvuruButton = null;
    
    GirisEkraniActions action = new GirisEkraniActions(this);

    public GirisEkrani() {
        getGirisEkraniPanel().setBackground(new Color(255, 204, 204));
        getGirisEkraniPanel().add(girisButton());
        getGirisEkraniPanel().add(hosgeldinizLabel());
        getGirisEkraniPanel().add(musteriNo_TcNoText());
        getGirisEkraniPanel().add(sifreText());
        getGirisEkraniPanel().add(basvuruSoruLabel());
        getGirisEkraniPanel().add(basvuruButton());
        getGirisEkraniFrame().setVisible(true);
    }

    public JFrame getGirisEkraniFrame() {
        if (girisEkraniFrame == null) {
            girisEkraniFrame = new JFrame("Giriş Ekranı");
            girisEkraniFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            girisEkraniFrame.setResizable(false); // HEPSİNDE FALSE OLUCAK
            girisEkraniFrame.setLocation(700, 300); // konum 
            girisEkraniFrame.setSize(457, 370); // boyut
            girisEkraniFrame.setContentPane(getGirisEkraniPanel());
        }
        return girisEkraniFrame;
    }

    public JPanel getGirisEkraniPanel() {
        if (girisEkraniPanel == null) {
            girisEkraniPanel = new JPanel();
            girisEkraniPanel.setLayout(null);
            girisEkraniPanel.setFocusable(true);
        }
        return girisEkraniPanel;
    }

    public JLabel hosgeldinizLabel() {
        if (hosgeldinizLabel == null) {
            hosgeldinizLabel = new JLabel();
            hosgeldinizLabel.setText("DİJİTAL BANKAYA HOŞGELDİNİZ");
            hosgeldinizLabel.setFont(getFont(1, 19)); // style:bold , size:19
            hosgeldinizLabel.setForeground(Color.red);
            hosgeldinizLabel.setBounds(80, 10, 350, 30); // nasıl bulucam ??
        }
        return hosgeldinizLabel;
    }

    public JTextField musteriNo_TcNoText() {
        if (musteriNo_TcNoText == null) {
            musteriNo_TcNoText = new JTextField();
            musteriNo_TcNoText.setText("T.C. No / Müşteri No");
            musteriNo_TcNoText.setFont(getFont(0, 15));
            musteriNo_TcNoText.setBounds(100, 75, 250, 40);
            musteriNo_TcNoText.setForeground(new Color(153, 153, 153));
            musteriNo_TcNoText.addFocusListener(action);
        }
        return musteriNo_TcNoText;
    }

    public JPasswordField sifreText() {
        if (sifreText == null) {
            sifreText = new JPasswordField();
            sifreText.setText("**********");
            sifreText.setBounds(100, 150, 250, 40);
            sifreText.setForeground(new Color(153, 153, 153));
            sifreText.addFocusListener(action);
        }
        return sifreText;
    }

    public JButton girisButton() {
        if (girisButton == null) {
            girisButton = new JButton();
            girisButton.setFont(getFont(0, 15));
            girisButton.setText("Giriş");
            girisButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            girisButton.setBounds(160, 210, 120, 30);
            girisButton.addActionListener(action);
        }
        return girisButton;
    }

    public JLabel basvuruSoruLabel() {
        if (basvuruSoruLabel == null) {
            basvuruSoruLabel = new JLabel();
            basvuruSoruLabel.setText("Hala bankamızın müşterisi değil misiniz?");
            basvuruSoruLabel.setFont(getFont(0, 16)); // style:bold , size:19
            basvuruSoruLabel.setForeground(Color.blue);
            basvuruSoruLabel.setBounds(5, 250, 350, 30);
        }
        return basvuruSoruLabel;
    }

    public JButton basvuruButton() {
        if (basvuruButton == null) {
            basvuruButton = new JButton();
            basvuruButton.setText("Başvur");
            basvuruButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            basvuruButton.setBounds(20, 285, 100, 30);
            basvuruButton.addActionListener(action);
        }
        return basvuruButton;
    }

    public Font getFont(int style, int size) {
        return new Font("Segoe UI", style, size);
    }
}
