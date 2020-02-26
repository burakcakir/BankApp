package Gui;

import Logic.GirisEkraniActions;
import Logic.IPanelAyar;
import Logic.JTextFieldLimit;
import Logic.KeyTyped;
import java.awt.*;
import javax.swing.*;

public final class GirisEkrani implements IPanelAyar {

    private JFrame girisEkraniFrame = null;
    private JPanel girisEkraniPanel = null;
    private JButton girisButton = null;
    private JLabel hosgeldinizLabel = null;
    private JTextField musteriNo_TcNoText = null;
    private JPasswordField sifreText = null;
    private JLabel basvuruSoruLabel = null;
    private JButton basvuruButton = null;
    private JLabel sifremiUnuttumLabel = null;
    private GirisEkraniActions action = new GirisEkraniActions(this);

    public GirisEkrani() {
        panelAyarlamalariYap(getGirisEkraniPanel());
        getGirisEkraniFrame().setVisible(true);
    }

    public JFrame getGirisEkraniFrame() {
        if (girisEkraniFrame == null) {
            girisEkraniFrame = new JFrame("Giriş");
            girisEkraniFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            girisEkraniFrame.setResizable(false);
            girisEkraniFrame.setLocation(700, 300);
            girisEkraniFrame.setSize(457, 370);
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

    public JLabel getHosgeldinizLabel() {
        if (hosgeldinizLabel == null) {
            hosgeldinizLabel = new JLabel();
            hosgeldinizLabel.setText("YATIR BANK'A HOŞGELDİNİZ");
            hosgeldinizLabel.setFont(getFont(1, 19)); 
            hosgeldinizLabel.setForeground(Color.red);
            hosgeldinizLabel.setBounds(80, 10, 350, 30);
        }
        return hosgeldinizLabel;
    }

    public JTextField getMusteriNo_TcNoText() {
        if (musteriNo_TcNoText == null) {
            musteriNo_TcNoText = new JTextField();
            musteriNo_TcNoText.setText("T.C. No / Müşteri No");
            musteriNo_TcNoText.setFont(getFont(0, 15));
            musteriNo_TcNoText.setBounds(100, 75, 250, 40);
            musteriNo_TcNoText.setForeground(new Color(153, 153, 153));
            KeyTyped.sadeceSayiAl(getGirisEkraniFrame(), getMusteriNo_TcNoText());
            musteriNo_TcNoText.addFocusListener(action);
        }
        return musteriNo_TcNoText;
    }

    public JPasswordField getSifreText() {
        if (sifreText == null) {
            sifreText = new JPasswordField();
            sifreText.setText("**********");
            sifreText.setBounds(100, 150, 250, 40);
            sifreText.setForeground(new Color(153, 153, 153));
            KeyTyped.sadeceSayiAl(getGirisEkraniFrame(), getSifreText());
            sifreText.addFocusListener(action);
        }
        return sifreText;
    }

    public JButton getGirisButton() {
        if (girisButton == null) {
            girisButton = new JButton();
            girisButton.setFont(getFont(0, 15));
            girisButton.setText("Giriş");
            girisButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            girisButton.setBounds(160, 220, 120, 30);
            girisButton.addActionListener(action);
        }
        return girisButton;
    }

    public JLabel getSifremiUnuttumLabel() {
        if (sifremiUnuttumLabel == null) {
            sifremiUnuttumLabel = new JLabel();
            sifremiUnuttumLabel.setText("Şifreni mi unuttun?");
            sifremiUnuttumLabel.setFont(getFont(1, 14));
            sifremiUnuttumLabel.setBounds(100, 190, 130, 30);
            sifremiUnuttumLabel.setForeground(Color.black);
            sifremiUnuttumLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            sifremiUnuttumLabel.addMouseListener(action);
        }
        return sifremiUnuttumLabel;
    }

    public JLabel getBasvuruSoruLabel() {
        if (basvuruSoruLabel == null) {
            basvuruSoruLabel = new JLabel();
            basvuruSoruLabel.setText("Hala bankamızın müşterisi değil misiniz?");
            basvuruSoruLabel.setFont(getFont(0, 16));
            basvuruSoruLabel.setForeground(Color.blue);
            basvuruSoruLabel.setBounds(5, 250, 350, 30);
        }
        return basvuruSoruLabel;
    }

    public JButton getBasvuruButton() {
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

    @Override
    public void panelAyarlamalariYap(JPanel panel) {
        panel.setBackground(new Color(255, 204, 204));
        panel.add(getHosgeldinizLabel());
        panel.add(getMusteriNo_TcNoText());
        panel.add(getSifreText());
        panel.add(getGirisButton());
        panel.add(getSifremiUnuttumLabel());
        panel.add(getBasvuruSoruLabel());
        panel.add(getBasvuruButton());
    }
}
