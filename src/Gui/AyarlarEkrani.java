package Gui;

import Logic.Actions;
import Logic.AyarlarEkraniActions;
import Logic.IPanelAyar;
import Logic.JTextFieldLimit;
import Logic.KeyTyped;
import java.awt.*;
import javax.swing.*;

public class AyarlarEkrani implements IPanelAyar {

    private JFrame ayarlarEkraniFrame = null;
    private JPanel ayarlarEkraniPanel = null;
    private JLabel geriLabel = null;
    private JLabel adSoyadLabel = null;
    private JLabel musteriNoLabel = null;
    private JTextField musteriNoText = null;
    private JLabel telNoLabel = null;
    private JTextField telNoText = null;
    private JLabel telNoDegistirIcon = null;
    private JLabel sifreLabel = null;
    private JTextField sifreText = null;
    private JLabel sifreDegistirIcon = null;
    private AyarlarEkraniActions action = new AyarlarEkraniActions(this);

    public AyarlarEkrani() {
        panelAyarlamalariYap(getAyarlarEkraniPanel());
        getAdSoyadLabel().setText("Değerli Müşterimiz "+Actions.getDataController().getAdSoyad());
        getMusteriNoText().setText(Actions.getDataController().getMusteriNo());
        getTelNoText().setText(Actions.getDataController().getTelNo());      
        getAyarlarEkraniFrame().setVisible(true);
    }

    public JFrame getAyarlarEkraniFrame() {
        if (ayarlarEkraniFrame == null) {
            ayarlarEkraniFrame = new JFrame("Ayarlar");
            ayarlarEkraniFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            ayarlarEkraniFrame.setResizable(false);
            ayarlarEkraniFrame.setLocation(700, 350);
            ayarlarEkraniFrame.setSize(460, 310);
            ayarlarEkraniFrame.setContentPane(getAyarlarEkraniPanel());
        }
        return ayarlarEkraniFrame;
    }

    public JPanel getAyarlarEkraniPanel() {
        if (ayarlarEkraniPanel == null) {
            ayarlarEkraniPanel = new JPanel();
            ayarlarEkraniPanel.setFocusable(true);
            ayarlarEkraniPanel.setLayout(null);
        }
        return ayarlarEkraniPanel;
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
            adSoyadLabel.setText("Sayın [Müşteri Adı Soyadı]");
            adSoyadLabel.setFont(getFont(1, 19));
            adSoyadLabel.setForeground(Color.red);
            adSoyadLabel.setBounds(20, 40, 350, 30);
        }
        return adSoyadLabel;
    }

    public JLabel getMusteriNoLabel() {
        if (musteriNoLabel == null) {
            musteriNoLabel = new JLabel();
            musteriNoLabel.setText("Müşteri Numaranız : ");
            musteriNoLabel.setFont(getFont(0, 16));
            musteriNoLabel.setForeground(Color.black);
            musteriNoLabel.setBounds(20, 90, 160, 30);
        }
        return musteriNoLabel;
    }

    public JTextField getMusteriNoText() {
        if (musteriNoText == null) {
            musteriNoText = new JTextField();
            musteriNoText.setFont(getFont(0, 11));
            musteriNoText.setBounds(200, 90, 170, 30);
            musteriNoText.setEditable(false);
        }
        return musteriNoText;
    }

    public JLabel getTelNoLabel() {
        if (telNoLabel == null) {
            telNoLabel = new JLabel();
            telNoLabel.setText("Telefon Numaranız : ");
            telNoLabel.setFont(getFont(0, 16));
            telNoLabel.setForeground(Color.black);
            telNoLabel.setBounds(20, 140, 160, 30);
        }
        return telNoLabel;
    }

    public JTextField getTelNoText() {
        if (telNoText == null) {
            telNoText = new JTextField();
            telNoText.setFont(getFont(0, 11));
            telNoText.setBounds(200, 140, 170, 30);
            telNoText.setEditable(false);
            KeyTyped.sadeceSayiAl(getAyarlarEkraniFrame(), getTelNoText());
            telNoText.setDocument(new JTextFieldLimit(11));
        }
        return telNoText;
    }

    public JLabel getTelNoDegistirIcon() {
        if (telNoDegistirIcon == null) {
            telNoDegistirIcon = new JLabel();
            telNoDegistirIcon.setBounds(380, 140, 30, 30);
            telNoDegistirIcon.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/degistirIcon.png")));
            telNoDegistirIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
            telNoDegistirIcon.addMouseListener(action);
        }
        return telNoDegistirIcon;
    }

    public JLabel getSifreLabel() {
        if (sifreLabel == null) {
            sifreLabel = new JLabel();
            sifreLabel.setText("Şifreniz                       :");
            sifreLabel.setFont(getFont(0, 16));
            sifreLabel.setForeground(Color.black);
            sifreLabel.setBounds(20, 190, 160, 30);
        }
        return sifreLabel;
    }

    public JTextField getSifreText() {
        if (sifreText == null) {
            sifreText = new JTextField();
            sifreText.setFont(getFont(0, 11));
            sifreText.setBounds(200, 190, 170, 30);
            sifreText.setEditable(false);
            sifreText.setText("**********");
        }
        return sifreText;
    }

    public JLabel getSifreDegistirIcon() {
        if (sifreDegistirIcon == null) {
            sifreDegistirIcon = new JLabel();
            sifreDegistirIcon.setBounds(380, 190, 30, 30);
            sifreDegistirIcon.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/degistirIcon.png")));
            sifreDegistirIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
            sifreDegistirIcon.addMouseListener(action);
        }
        return sifreDegistirIcon;
    }

    public Font getFont(int style, int size) {
        return new Font("Segoe UI", style, size);
    }

    @Override
    public void panelAyarlamalariYap(JPanel panel) {
        panel.setBackground(new Color(204, 255, 204));
        panel.add(getGeriLabel());
        panel.add(getAdSoyadLabel());
        panel.add(getMusteriNoLabel());
        panel.add(getMusteriNoText());
        panel.add(getTelNoLabel());
        panel.add(getTelNoText());
        panel.add(getTelNoDegistirIcon());
        panel.add(getSifreLabel());
        panel.add(getSifreText());
        panel.add(getSifreDegistirIcon());
    }
}
