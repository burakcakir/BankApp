package Gui;

import Logic.Actions;
import Logic.IPanelAyar;
import Logic.KullaniciHesapEkraniActions;
import Logic.SingletonMusteri;
import java.awt.*;
import javax.swing.*;

public class KullaniciHesapEkrani implements IPanelAyar {

    private JFrame hesapEkraniFrame = null;
    private JPanel hesapEkraniPanel = null;
    private JButton girisButton = null;
    private JLabel cikisIcon = null;
    private JLabel hosgeldinizLabel = null;
    private JLabel ayarlarIcon = null;
    private JLabel adSoyadLabel = null;
    private JLabel turkLirasiIcon = null;
    private JLabel bakiyeLabel = null;
    private JLabel paraCekIcon = null;
    private JButton paraCekButton = null;
    private JLabel paraYatirIcon = null;
    private JButton paraYatirButton = null;
    private JLabel havaleIcon = null;
    private JButton havaleButton = null;
    private JLabel odemelerIcon = null;
    private JButton odemelerButton = null;
    private KullaniciHesapEkraniActions actions = new KullaniciHesapEkraniActions(this);
    private SingletonMusteri singletonMusteri = null;

    public SingletonMusteri getSingletonMusteri() {
        if (singletonMusteri == null) {
            singletonMusteri = SingletonMusteri.getInstance();
        }
        return singletonMusteri;
    }

    public KullaniciHesapEkrani() {
        panelAyarlamalariYap(getKullaniciHesapEkraniPanel());
        Actions.getDataController().verileriAl(getSingletonMusteri().getMusteriNo_Tc());
        getAdSoyadLabel().setText(Actions.getDataController().getAdSoyad());
        getBakiyeLabel().setText(String.valueOf(Actions.getDataController().getBakiye()));
        getKullaniciHesapEkraniFrame().setVisible(true);
    }

    public JFrame getKullaniciHesapEkraniFrame() {
        if (hesapEkraniFrame == null) {
            hesapEkraniFrame = new JFrame("Kullanıcı Hesabı");
            hesapEkraniFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            hesapEkraniFrame.setResizable(false);
            hesapEkraniFrame.setLocation(500, 220);
            hesapEkraniFrame.setSize(850, 596);
            hesapEkraniFrame.setContentPane(getKullaniciHesapEkraniPanel());
        }
        return hesapEkraniFrame;
    }

    public JPanel getKullaniciHesapEkraniPanel() {
        if (hesapEkraniPanel == null) {
            hesapEkraniPanel = new JPanel();
            hesapEkraniPanel.setLayout(null);
            hesapEkraniPanel.setFocusable(true);
        }
        return hesapEkraniPanel;
    }

    public JLabel getCikisIcon() {
        if (cikisIcon == null) {
            cikisIcon = new JLabel();
            cikisIcon.setBounds(20, 20, 48, 48);
            cikisIcon.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/logoutIcon.png")));
            cikisIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
            cikisIcon.addMouseListener(actions);
        }
        return cikisIcon;
    }

    public JLabel getHosgeldinizLabel() {
        if (hosgeldinizLabel == null) {
            hosgeldinizLabel = new JLabel();
            hosgeldinizLabel.setText("HOŞGELDİN");
            hosgeldinizLabel.setFont(new Font("Arial", Font.BOLD, 18));
            hosgeldinizLabel.setForeground(Color.black);
            hosgeldinizLabel.setBounds(370, 20, 110, 50);
        }
        return hosgeldinizLabel;
    }

    public JLabel getAyarlarIcon() {
        if (ayarlarIcon == null) {
            ayarlarIcon = new JLabel();
            ayarlarIcon.setBounds(770, 20, 48, 48);
            ayarlarIcon.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/ayarlarIcon.png")));
            ayarlarIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
            ayarlarIcon.addMouseListener(actions);
        }
        return ayarlarIcon;
    }

    public JLabel getAdSoyadLabel() {
        if (adSoyadLabel == null) {
            adSoyadLabel = new JLabel();
            adSoyadLabel.setText("Müşteri Adı Soyadı");
            adSoyadLabel.setFont(new Font("Cambria Math", Font.PLAIN, 42));
            adSoyadLabel.setForeground(Color.red);
            adSoyadLabel.setBounds(0, 80, 850, 50);
            adSoyadLabel.setHorizontalAlignment(JLabel.CENTER);
        }
        return adSoyadLabel;
    }

    public JLabel getTurkLirasiIcon() {
        if (turkLirasiIcon == null) {
            turkLirasiIcon = new JLabel();
            turkLirasiIcon.setBounds(290, 180, 124, 124);
            turkLirasiIcon.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/turkLirasiIcon.png")));
            turkLirasiIcon.addMouseListener(actions);
        }
        return turkLirasiIcon;
    }

    public JLabel getBakiyeLabel() {
        if (bakiyeLabel == null) {
            bakiyeLabel = new JLabel();
            bakiyeLabel.setText("BAKİYE");
            bakiyeLabel.setFont(new Font("Gungsuh", Font.PLAIN, 36));
            bakiyeLabel.setForeground(Color.black);
            bakiyeLabel.setBounds(435, 210, 200, 55);

        }
        return bakiyeLabel;
    }

    public JLabel getParaCekIcon() {
        if (paraCekIcon == null) {
            paraCekIcon = new JLabel();
            paraCekIcon.setBounds(90, 350, 80, 70);
            paraCekIcon.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/paraCekIcon2.png")));
        }
        return paraCekIcon;
    }

    public JButton getParaCekButton() {
        if (paraCekButton == null) {
            paraCekButton = new JButton();
            paraCekButton.setText("Para Çek");
            paraCekButton.setFont(new Font("Corbel", Font.BOLD, 18));
            paraCekButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            paraCekButton.setBounds(75, 430, 115, 35);
            paraCekButton.addActionListener(actions);
            paraCekButton.addMouseListener(actions);
        }
        return paraCekButton;
    }

    public JLabel getParaYatirIcon() {
        if (paraYatirIcon == null) {
            paraYatirIcon = new JLabel();
            paraYatirIcon.setBounds(275, 350, 80, 70);
            paraYatirIcon.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/paraYatirIcon2.png")));
        }
        return paraYatirIcon;
    }

    public JButton getParaYatirButton() {
        if (paraYatirButton == null) {
            paraYatirButton = new JButton();
            paraYatirButton.setText("Para Yatır");
            paraYatirButton.setFont(new Font("Corbel", Font.BOLD, 18));
            paraYatirButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            paraYatirButton.setBounds(260, 430, 115, 35);
            paraYatirButton.addActionListener(actions);
            paraYatirButton.addMouseListener(actions);
        }
        return paraYatirButton;
    }

    public JLabel getHavaleIcon() {
        if (havaleIcon == null) {
            havaleIcon = new JLabel();
            havaleIcon.setBounds(470, 350, 80, 70);
            havaleIcon.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/havaleIcon2.png")));
        }
        return havaleIcon;
    }

    public JButton getHavaleButton() {
        if (havaleButton == null) {
            havaleButton = new JButton();
            havaleButton.setText("Havale");
            havaleButton.setFont(new Font("Corbel", Font.BOLD, 18));
            havaleButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            havaleButton.setBounds(450, 430, 115, 35);
            havaleButton.addActionListener(actions);
            havaleButton.addMouseListener(actions);
        }
        return havaleButton;
    }

    public JLabel getOdemelerIcon() {
        if (odemelerIcon == null) {
            odemelerIcon = new JLabel();
            odemelerIcon.setBounds(650, 350, 80, 70);
            odemelerIcon.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/odemelerIcon2.png")));
        }
        return odemelerIcon;
    }

    public JButton getOdemelerButton() {
        if (odemelerButton == null) {
            odemelerButton = new JButton();
            odemelerButton.setText("Ödemeler");
            odemelerButton.setFont(new Font("Corbel", Font.BOLD, 18));
            odemelerButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            odemelerButton.setBounds(630, 430, 115, 35);
            odemelerButton.addActionListener(actions);
            odemelerButton.addMouseListener(actions);
        }
        return odemelerButton;
    }

    public Font getFont(int style, int size) {
        return new Font("Segoe UI", style, size);
    }

    @Override
    public void panelAyarlamalariYap(JPanel panel) {
        panel.setBackground(new Color(204, 204, 204));
        panel.add(getCikisIcon());
        panel.add(getHosgeldinizLabel());
        panel.add(getAyarlarIcon());
        panel.add(getAdSoyadLabel());
        panel.add(getTurkLirasiIcon());
        panel.add(getBakiyeLabel());
        panel.add(getParaCekIcon());
        panel.add(getParaCekButton());
        panel.add(getParaYatirIcon());
        panel.add(getParaYatirButton());
        panel.add(getHavaleIcon());
        panel.add(getHavaleButton());
        panel.add(getOdemelerIcon());
        panel.add(getOdemelerButton());
    }

}
