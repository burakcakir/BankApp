package Gui;

import Logic.Actions;
import Logic.HavaleEkraniActions;
import Logic.IPanelAyar;
import Logic.KeyTyped;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HavaleEkrani implements IPanelAyar {

    private JFrame havaleEkraniFrame = null;
    private JPanel havaleEkraniPanel = null;
    private JLabel geriLabel = null;
    private JLabel adSoyadLabel = null;
    private JLabel toplamBakiyeLabel = null;
    private JLabel musteriNoLabel = null;
    private JTextField musteriNoText = null;
    private JLabel gonderilecekTutarLabel = null;
    private JTextField gonderilecekTutarText = null;
    private JButton gonderButton = null;

    HavaleEkraniActions action = new HavaleEkraniActions(this);

    public HavaleEkrani() {
        panelAyarlamalariYap(getHavaleEkraniPanel());
        getAdSoyadLabel().setText("Değerli Müşterimiz " + Actions.getDataController().getAdSoyad());
        getToplamBakiyeLabel().setText("Hesabınızda toplam " + Actions.getDataController().getBakiye() + " TL bakiye bulunmaktadır.");
        getHavaleEkraniFrame().setVisible(true);
    }

    public JFrame getHavaleEkraniFrame() {
        if (havaleEkraniFrame == null) {
            havaleEkraniFrame = new JFrame("Havale Ekranı");
            havaleEkraniFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            havaleEkraniFrame.setResizable(false);
            havaleEkraniFrame.setLocation(650, 320);
            havaleEkraniFrame.setSize(500, 350);
            havaleEkraniFrame.setContentPane(getHavaleEkraniPanel());
        }
        return havaleEkraniFrame;
    }

    public JPanel getHavaleEkraniPanel() {
        if (havaleEkraniPanel == null) {
            havaleEkraniPanel = new JPanel();
            havaleEkraniPanel.setLayout(null);
            havaleEkraniPanel.setFocusable(true);
        }
        return havaleEkraniPanel;
    }

    public JLabel getGeriLabel() {
        if (geriLabel == null) {
            geriLabel = new JLabel();
            geriLabel.setBounds(10, 10, 30, 28);
            geriLabel.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/geriIcon.png")));
            geriLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            geriLabel.addMouseListener(action);
        }
        return geriLabel;
    }

    public JLabel getAdSoyadLabel() {
        if (adSoyadLabel == null) {
            adSoyadLabel = new JLabel();
            adSoyadLabel.setText("Değerli Müşterimiz [Ad Soyad]");
            adSoyadLabel.setFont(getFont(1, 18));
            adSoyadLabel.setForeground(Color.red);
            adSoyadLabel.setBounds(20, 60, 450, 35);
        }
        return adSoyadLabel;
    }

    public JLabel getToplamBakiyeLabel() {
        if (toplamBakiyeLabel == null) {
            toplamBakiyeLabel = new JLabel();
            toplamBakiyeLabel.setText("Hesabınızda Toplam .... TL Bakiye Bulunmaktadır.");
            toplamBakiyeLabel.setFont(getFont(0, 18));
            toplamBakiyeLabel.setForeground(Color.blue);
            toplamBakiyeLabel.setBounds(40, 100, 450, 35);

        }
        return toplamBakiyeLabel;
    }

    public JLabel getMusteriNoLabel() {
        if (musteriNoLabel == null) {
            musteriNoLabel = new JLabel();
            musteriNoLabel.setText("Müşteri Numarası   :");
            musteriNoLabel.setFont(getFont(0, 18));
            musteriNoLabel.setForeground(Color.black);
            musteriNoLabel.setBounds(30, 150, 200, 35);
        }
        return musteriNoLabel;
    }

    public JTextField getMusteriNoText() {
        if (musteriNoText == null) {
            musteriNoText = new JTextField();
            musteriNoText.setFont(getFont(0, 18));
            musteriNoText.setBounds(200, 150, 180, 35);
            KeyTyped.sadeceSayiAl(getHavaleEkraniFrame(), musteriNoText);
        }
        return musteriNoText;
    }

    public JLabel getGonderilecekTutarLabel() {
        if (gonderilecekTutarLabel == null) {
            gonderilecekTutarLabel = new JLabel();
            gonderilecekTutarLabel.setText("Gönderilecek Tutar :");
            gonderilecekTutarLabel.setFont(getFont(0, 18));
            gonderilecekTutarLabel.setForeground(Color.black);
            gonderilecekTutarLabel.setBounds(30, 200, 200, 35);

        }
        return gonderilecekTutarLabel;
    }

    public JTextField getGonderilecekTutarText() {
        if (gonderilecekTutarText == null) {
            gonderilecekTutarText = new JTextField();
            gonderilecekTutarText.setFont(getFont(0, 18));
            gonderilecekTutarText.setBounds(200, 200, 180, 35);
            KeyTyped.sadeceSayiAl(getHavaleEkraniFrame(), gonderilecekTutarText);
        }
        return gonderilecekTutarText;
    }

    public JButton getHavaleButton() {
        if (gonderButton == null) {
            gonderButton = new JButton();
            gonderButton.setText("Gönder");
            gonderButton.setFont(getFont(1, 15));
            gonderButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            gonderButton.setBounds(220, 250, 110, 35);
            gonderButton.addActionListener(action);
        }
        return gonderButton;
    }

    public Font getFont(int style, int size) {
        return new Font("Segoe UI", style, size);
    }

    @Override
    public void panelAyarlamalariYap(JPanel panel) {
        panel.setBackground(new Color(255, 204, 255));
        panel.add(getGeriLabel());
        panel.add(getAdSoyadLabel());
        panel.add(getToplamBakiyeLabel());
        panel.add(getMusteriNoLabel());
        panel.add(getMusteriNoText());
        panel.add(getGonderilecekTutarLabel());
        panel.add(getGonderilecekTutarText());
        panel.add(getHavaleButton());
    }
}
