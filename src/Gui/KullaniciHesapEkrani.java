
package Gui;

import Logic.KullaniciHesapEkraniActions;
import java.awt.*;
import javax.swing.*;

// Butonlara hover olunca fotoğraf değişmiiyor fotoya hover olunca değişiyor düzeltilecek !!

public final class KullaniciHesapEkrani {
   
    JFrame hesapEkraniFrame = null;
    JPanel hesapEkraniPanel = null;
    JLabel cikisIcon = null;
    JLabel hosgeldinizLabel = null;
    JLabel ayarlarIcon = null;
    JLabel adsoyadLabel = null;
    JLabel turklirasiIcon = null;
    JLabel bakiyeLabel = null;
    JLabel paracekIcon = null;
    JButton paracekButton = null;
    JLabel parayatirIcon = null;
    JButton parayatirButton = null;
    JLabel havaleIcon = null;
    JButton havaleButton = null;
    JLabel odemelerIcon = null;
    JButton odemelerButton = null;
    JButton girisButton = null;
    
    
    
    
    KullaniciHesapEkraniActions actions = new KullaniciHesapEkraniActions(this);
    
    public KullaniciHesapEkrani() {
        getKullaniciHesapEkraniPanel().setBackground(new Color(204,204,204));
        getKullaniciHesapEkraniPanel().add(cikisIcon());
        getKullaniciHesapEkraniPanel().add(hosgeldinizLabel());
        getKullaniciHesapEkraniPanel().add(ayarlarIcon());
        getKullaniciHesapEkraniPanel().add(adsoyadLabel());
        getKullaniciHesapEkraniPanel().add(turklirasiIcon());
        getKullaniciHesapEkraniPanel().add(bakiyeLabel());
        getKullaniciHesapEkraniPanel().add(paracekIcon());
        getKullaniciHesapEkraniPanel().add(paracekButton());
        getKullaniciHesapEkraniPanel().add(parayatirIcon());
        getKullaniciHesapEkraniPanel().add(parayatirButton());
        getKullaniciHesapEkraniPanel().add(havaleIcon());
        getKullaniciHesapEkraniPanel().add(havaleButton());
        getKullaniciHesapEkraniPanel().add(odemelerIcon());
        getKullaniciHesapEkraniPanel().add(odemelerButton());
        getKullaniciHesapEkraniFrame().setVisible(true);
    }
    
    public JFrame getKullaniciHesapEkraniFrame() {
        if (hesapEkraniFrame == null) {
            hesapEkraniFrame = new JFrame("Kullanıcı Hesap Ekranı");
            hesapEkraniFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // giriş , ayarlar hariç bu kodu kullanma . 
            hesapEkraniFrame.setResizable(false);
            hesapEkraniFrame.setLocation(500, 220);
            hesapEkraniFrame.setSize(850, 596);
            hesapEkraniFrame.setContentPane(getKullaniciHesapEkraniPanel());
        }
        return hesapEkraniFrame;
    }
    
    public JPanel getKullaniciHesapEkraniPanel() {
        if(hesapEkraniPanel == null) {
            hesapEkraniPanel = new JPanel();
            hesapEkraniPanel.setLayout(null);
            hesapEkraniPanel.setFocusable(true);
        }        
        return hesapEkraniPanel;
    }   
    
    public JLabel cikisIcon() {
        if(cikisIcon == null) {
            cikisIcon= new JLabel();
            cikisIcon.setBounds(20, 20, 48, 48);
            cikisIcon.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/logoutIcon.png")));
            cikisIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
            cikisIcon.addMouseListener(actions);
        }
        return cikisIcon;
    }
        
    public JLabel hosgeldinizLabel()
    {
        if(hosgeldinizLabel == null)
        {
            hosgeldinizLabel = new JLabel();
            hosgeldinizLabel.setText("HOŞGELDİN");
            hosgeldinizLabel.setFont(new Font("Arial", Font.BOLD, 18)); 
            hosgeldinizLabel.setForeground(Color.black);
            hosgeldinizLabel.setBounds(350, 20, 110, 50);
        }
        return hosgeldinizLabel;
    }
    
        public JLabel ayarlarIcon() {
        if(ayarlarIcon == null) {
            ayarlarIcon = new JLabel();
            ayarlarIcon.setBounds(770, 20, 48, 48);
            ayarlarIcon.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/ayarlarIcon.png")));
            ayarlarIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
            ayarlarIcon.addMouseListener(actions);
        }
        return ayarlarIcon;
    }
    
    public JLabel adsoyadLabel()
    {
        if(adsoyadLabel == null)
        {
            adsoyadLabel = new JLabel();
            adsoyadLabel.setText("Müşteri Adı Soyadı");
            adsoyadLabel.setFont(new Font("Cambria Math", Font.PLAIN, 42)); 
            adsoyadLabel.setForeground(Color.red);
            adsoyadLabel.setBounds(245, 80, 500, 50);
            
        }
        return adsoyadLabel;
    }
    
    public JLabel turklirasiIcon() {
        if(turklirasiIcon == null) {
            turklirasiIcon = new JLabel();
            turklirasiIcon.setBounds(290, 180, 124, 124);
            turklirasiIcon.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/turkLirasiIcon.png")));
            turklirasiIcon.addMouseListener(actions);
        }
        return turklirasiIcon;
    }
    
    public JLabel bakiyeLabel()
    {
        if(bakiyeLabel == null)
        {
            bakiyeLabel = new JLabel();
            bakiyeLabel.setText("BAKİYE");
            bakiyeLabel.setFont(new Font("Gungsuh", Font.PLAIN, 36)); 
            bakiyeLabel.setForeground(Color.black);
            bakiyeLabel.setBounds(415, 210, 130, 55);
            
        }
        return bakiyeLabel;
    }
    
    public JLabel paracekIcon()
    {
        if(paracekIcon == null)
        {
            paracekIcon = new JLabel();
            paracekIcon.setBounds(90, 350, 80, 70);
            paracekIcon.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/paraCekIcon2.png")));
            paracekIcon.addMouseListener(actions);
        }
        return paracekIcon;
    }
    
    public JButton paracekButton()
    {
        if(paracekButton == null)
        {
            paracekButton = new JButton();
            paracekButton.setText("Para Çek");
            paracekButton.setFont(new Font("Corbel", Font.BOLD, 18)); 
            paracekButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            paracekButton.setBounds(75, 430, 115 , 35);
            paracekButton.addActionListener(actions);
            
        }
        return paracekButton;
    }
    
    public JLabel parayatirIcon()
    {
        if(parayatirIcon == null)
        {
            parayatirIcon = new JLabel();
            parayatirIcon.setBounds(275, 350, 80, 70);
            parayatirIcon.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/paraYatirIcon2.png")));
            parayatirIcon.addMouseListener(actions);
        }
        return parayatirIcon;
    }
    
    public JButton parayatirButton()
    {
        if(parayatirButton == null)
        {
            parayatirButton = new JButton();
            parayatirButton.setText("Para Yatır");
            parayatirButton.setFont(new Font("Corbel", Font.BOLD, 18)); 
            parayatirButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            parayatirButton.setBounds(260, 430, 115 , 35);
            parayatirButton.addActionListener(actions);
            
        }
        return parayatirButton;
    }    
    
    public JLabel havaleIcon()
    {
        if(havaleIcon == null)
        {
            havaleIcon = new JLabel();
            havaleIcon.setBounds(470, 350, 80, 70);
            havaleIcon.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/havaleIcon2.png")));
            havaleIcon.addMouseListener(actions);            
        }
        return havaleIcon;
    }
    
    public JButton havaleButton()
    {
        if(havaleButton == null)
        {
            havaleButton = new JButton();
            havaleButton.setText("Havale");
            havaleButton.setFont(new Font("Corbel", Font.BOLD, 18)); 
            havaleButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            havaleButton.setBounds(450, 430, 115 , 35);
            havaleButton.addActionListener(actions);
            
        }
        return havaleButton;
    }    
    
    public JLabel odemelerIcon()
    {
        if(odemelerIcon == null)
        {
            odemelerIcon = new JLabel();
            odemelerIcon.setBounds(650, 350, 80, 70);
            odemelerIcon.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/odemelerIcon.png")));
            odemelerIcon.addMouseListener(actions);            
        }
        return odemelerIcon;
    }    
    

    public JButton odemelerButton()
    {
        if(odemelerButton == null)
        {
            odemelerButton = new JButton();
            odemelerButton.setText("Ödemeler");
            odemelerButton.setFont(new Font("Corbel", Font.BOLD, 18)); 
            odemelerButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            odemelerButton.setBounds(630, 430, 115 , 35);
            odemelerButton.addActionListener(actions);
            
        }
        return odemelerButton;
    }        
    
    
    public Font getFont(int style, int size) {
        return new Font("Segoe UI", style, size);
    }
}
