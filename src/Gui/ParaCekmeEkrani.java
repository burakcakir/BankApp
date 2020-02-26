package Gui;

import Logic.Actions;
import Logic.IPanelAyar;
import Logic.KeyTyped;
import Logic.ParaCekmeEkraniActions;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.*;

public class ParaCekmeEkrani implements IPanelAyar {

    private JFrame paraCekmeEkraniFrame = null;
    private JPanel paraCekmeEkraniPanel = null;
    private JLabel geriLabel = null;
    private JLabel adSoyadLabel = null;
    private JLabel toplamBakiyeLabel = null;
    private JLabel paraCekmeTutari = null;
    private JTextField paraCekmeTutariText = null;
    private JButton paraCekButton = null;
    private ParaCekmeEkraniActions action = new ParaCekmeEkraniActions(this);

    public ParaCekmeEkrani() {
        panelAyarlamalariYap(getParaCekmeEkraniPanel());
        getAdSoyadLabel().setText("Değerli Müşterimiz " + Actions.getDataController().getAdSoyad());
        getToplamBakiyeLabel().setText("Hesabınızda toplam " + Actions.getDataController().getBakiye() + " TL bakiye bulunmaktadır.");
        getParaCekmeEkraniFrame().setVisible(true);
    }

    public JFrame getParaCekmeEkraniFrame() {
        if (paraCekmeEkraniFrame == null) {
            paraCekmeEkraniFrame = new JFrame("Para Çekme Ekranı");
            paraCekmeEkraniFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            paraCekmeEkraniFrame.setResizable(false);
            paraCekmeEkraniFrame.setLocation(700, 320);
            paraCekmeEkraniFrame.setSize(480, 350);
            paraCekmeEkraniFrame.setContentPane(getParaCekmeEkraniPanel());
        }
        return paraCekmeEkraniFrame;
    }

    public JPanel getParaCekmeEkraniPanel() {
        if (paraCekmeEkraniPanel == null) {
            paraCekmeEkraniPanel = new JPanel();
            paraCekmeEkraniPanel.setLayout(null);
            paraCekmeEkraniPanel.setFocusable(true);
        }
        return paraCekmeEkraniPanel;
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
            toplamBakiyeLabel.setBounds(20, 110, 450, 35);
        }
        return toplamBakiyeLabel;
    }

    public JLabel getParaCekmeTutariLabel() {
        if (paraCekmeTutari == null) {
            paraCekmeTutari = new JLabel();
            paraCekmeTutari.setText("Lütfen çekmek istediğiniz tutarı aşağıdaki alana giriniz.");
            paraCekmeTutari.setFont(getFont(0, 18));
            paraCekmeTutari.setForeground(Color.black);
            paraCekmeTutari.setBounds(20, 150, 450, 35);
        }
        return paraCekmeTutari;
    }

    public JTextField getParaCekmeTutariText() {
        if (paraCekmeTutariText == null) {
            paraCekmeTutariText = new JTextField();
            paraCekmeTutariText.setFont(getFont(0, 18));
            paraCekmeTutariText.setBounds(155, 210, 150, 35);
            KeyTyped.sadeceSayiAl(getParaCekmeEkraniFrame(), paraCekmeTutariText);
        }
        return paraCekmeTutariText;
    }

    public JButton getParaCekButton() {
        if (paraCekButton == null) {
            paraCekButton = new JButton();
            paraCekButton.setText("Para Çek");
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
        panel.setBackground(new Color(204, 255, 204));
        panel.add(getGeriLabel());
        panel.add(getAdSoyadLabel());
        panel.add(getToplamBakiyeLabel());
        panel.add(getParaCekmeTutariLabel());
        panel.add(getParaCekmeTutariText());
        panel.add(getParaCekButton());
    }
}
