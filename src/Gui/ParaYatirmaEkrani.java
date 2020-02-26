package Gui;

import Logic.Actions;
import Logic.IPanelAyar;
import Logic.KeyTyped;
import Logic.ParaYatirmaEkraniActions;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ParaYatirmaEkrani implements IPanelAyar {

    private JFrame paraYatirmaEkraniFrame = null;
    private JPanel paraYatirmaEkraniPanel = null;
    private JLabel geriLabel = null;
    private JLabel adSoyadLabel = null;
    private JLabel toplamBakiyeLabel = null;
    private JLabel paraYatirmaTutari = null;
    private JTextField paraYatirmaTutariText = null;
    private JButton paraCekButton = null;
    private ParaYatirmaEkraniActions action = new ParaYatirmaEkraniActions(this);

    public ParaYatirmaEkrani() {
        panelAyarlamalariYap(getParaYatirmaEkraniPanel());
        getAdSoyadLabel().setText("Değerli Müşterimiz " + Actions.getDataController().getAdSoyad());
        getToplamBakiyeLabel().setText("Hesabınızda toplam " + Actions.getDataController().getBakiye() + " TL bakiye bulunmaktadır.");
        getParaYatirmaEkraniFrame().setVisible(true);
    }

    public JFrame getParaYatirmaEkraniFrame() {
        if (paraYatirmaEkraniFrame == null) {
            paraYatirmaEkraniFrame = new JFrame("Para Yatırma Ekranı");
            paraYatirmaEkraniFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            paraYatirmaEkraniFrame.setResizable(false);
            paraYatirmaEkraniFrame.setLocation(700, 320);
            paraYatirmaEkraniFrame.setSize(480, 350);
            paraYatirmaEkraniFrame.setContentPane(getParaYatirmaEkraniPanel());
        }
        return paraYatirmaEkraniFrame;
    }

    public JPanel getParaYatirmaEkraniPanel() {
        if (paraYatirmaEkraniPanel == null) {
            paraYatirmaEkraniPanel = new JPanel();
            paraYatirmaEkraniPanel.setLayout(null);
            paraYatirmaEkraniPanel.setFocusable(true);
        }
        return paraYatirmaEkraniPanel;
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
            adSoyadLabel.setBounds(20, 60, 280, 35);
        }
        return adSoyadLabel;
    }

    public JLabel getToplamBakiyeLabel() {
        if (toplamBakiyeLabel == null) {
            toplamBakiyeLabel = new JLabel();
            toplamBakiyeLabel.setText("Hesabınızda Toplam .... TL Bakiye Bulunmaktadır.");
            toplamBakiyeLabel.setFont(getFont(0, 18));
            toplamBakiyeLabel.setForeground(Color.blue);
            toplamBakiyeLabel.setBounds(20, 110, 450, 35);
        }
        return toplamBakiyeLabel;
    }

    public JLabel getParaYatirmaTutariLabel() {
        if (paraYatirmaTutari == null) {
            paraYatirmaTutari = new JLabel();
            paraYatirmaTutari.setText("Lütfen yatırmak istediğiniz tutarı aşağıdaki alana giriniz.");
            paraYatirmaTutari.setFont(getFont(0, 18));
            paraYatirmaTutari.setForeground(Color.black);
            paraYatirmaTutari.setBounds(20, 150, 450, 35);
        }
        return paraYatirmaTutari;
    }

    public JTextField getParaYatirmaTutariText() {
        if (paraYatirmaTutariText == null) {
            paraYatirmaTutariText = new JTextField();
            paraYatirmaTutariText.setFont(getFont(0, 18));
            paraYatirmaTutariText.setBounds(155, 210, 150, 35);
            KeyTyped.sadeceSayiAl(getParaYatirmaEkraniFrame(), paraYatirmaTutariText);
        }
        return paraYatirmaTutariText;
    }

    public JButton getParaYatirButton() {
        if (paraCekButton == null) {
            paraCekButton = new JButton();
            paraCekButton.setText("Para Yatır");
            paraCekButton.setFont(getFont(1, 15));
            paraCekButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            paraCekButton.setBounds(174, 260, 110, 35);
            paraCekButton.addActionListener(action);
        }
        return paraCekButton;
    }

    public Font getFont(int style, int size) {
        return new Font("Segoe UI", style, size);
    }

    @Override
    public void panelAyarlamalariYap(JPanel panel) {
        panel.setBackground(new Color(255, 255, 204));
        panel.add(getGeriLabel());
        panel.add(getAdSoyadLabel());
        panel.add(getToplamBakiyeLabel());
        panel.add(getParaYatirmaTutariLabel());
        panel.add(getParaYatirmaTutariText());
        panel.add(getParaYatirButton());
    }
}
