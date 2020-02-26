package Gui;

import Logic.AyarlarActions;
import java.awt.*;
import javax.swing.*;


// çarpıya basınca kullanıcıhesap ekranına dönmesi lazım ayarlanıcak.

public final class Ayarlar {
    
    JFrame AyarlarFrame = null;
    JPanel AyarlarPanel = null;
    JLabel adsoyadLabel = null;
    JLabel musterinoLabel = null;
    JTextField musterinoTextField = null;
    JLabel telnoLabel = null;
    JTextField telnoTextField = null;
    JLabel telnodegistirIcon = null;
    JLabel sifrenizLabel = null;
    JTextField sifrenizTextField = null;
    JLabel sifredegistirIcon = null;
    
    AyarlarActions actions = new AyarlarActions(this);
    
    public Ayarlar()
    {
        getAyarlarPanel().setBackground(new Color(255,204,204));
        getAyarlarPanel().add(adsoyadLabel());
        getAyarlarPanel().add(musterinoLabel());
        getAyarlarPanel().add(musterinoTextField());
        getAyarlarPanel().add(telnoLabel());
        getAyarlarPanel().add(telnoTextField());
        getAyarlarPanel().add(telnodegistirIcon());
        getAyarlarPanel().add(sifrenizLabel());
        getAyarlarPanel().add(sifrenizTextField());
        getAyarlarPanel().add(sifredegistirIcon());
        getAyarlarFrame().setVisible(true);
    }

    public JFrame getAyarlarFrame()
    {
        if(AyarlarFrame == null)
        {
            AyarlarFrame = new JFrame("Ayarlar");
            AyarlarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            AyarlarFrame.setResizable(false);
            AyarlarFrame.setLocation(700, 300);
            AyarlarFrame.setSize(460, 310);
            AyarlarFrame.setContentPane(getAyarlarPanel());
        }
        return AyarlarFrame;
    }

    public JPanel getAyarlarPanel()
    {
        if(AyarlarPanel == null)
        {
            AyarlarPanel = new JPanel();
            AyarlarPanel.setLayout(null);
            AyarlarPanel.setFocusable(true);
        }
        return AyarlarPanel;
    }
    
    public JLabel adsoyadLabel()
    {
        if(adsoyadLabel == null)
        {
            adsoyadLabel = new JLabel();
            adsoyadLabel.setText("Sayın[Müşteri Adı Soyadı]");
            adsoyadLabel.setFont(getFont(1, 24)); 
            adsoyadLabel.setForeground(Color.red);
            adsoyadLabel.setBounds(20, 20, 350, 30);         
        }
        return adsoyadLabel;
    }
    
    public JLabel musterinoLabel()
    {
        if(musterinoLabel == null)
        {
            musterinoLabel  = new JLabel();
            musterinoLabel .setText("Müşteri Numaranız : ");
            musterinoLabel .setFont(getFont(1, 18)); 
            musterinoLabel .setForeground(Color.black);
            musterinoLabel .setBounds(20, 70, 200, 30);       
        }
        return musterinoLabel;
    }
    
    public JTextField musterinoTextField()
    {
        if(musterinoTextField == null)
        {
            musterinoTextField = new JTextField();
            musterinoTextField.setFont(getFont(0, 11));
            musterinoTextField.setBounds(200,70, 170, 30);
        }
        return musterinoTextField;
    }
    
    public JLabel telnoLabel()
    {
        if(telnoLabel == null)
        {
            telnoLabel  = new JLabel();
            telnoLabel .setText("Telefon Numaranız : ");
            telnoLabel .setFont(getFont(1, 18)); 
            telnoLabel .setForeground(Color.black);
            telnoLabel .setBounds(20, 120, 200, 30);       
        }
        return telnoLabel;
    }    
    
    public JTextField telnoTextField()
    {
        if(telnoTextField == null)
        {
            telnoTextField = new JTextField();
            telnoTextField.setFont(getFont(0, 11));
            telnoTextField.setBounds(200,120, 170, 30);
            
        }
        return telnoTextField;
    }
    
    public JLabel telnodegistirIcon()
    {
        if(telnodegistirIcon == null)
        {
            telnodegistirIcon = new JLabel();
            telnodegistirIcon.setBounds(380, 120, 30, 30);
            telnodegistirIcon.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/degistirIcon.png")));
            telnodegistirIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
            telnodegistirIcon.addMouseListener(actions);            
        }
        return telnodegistirIcon;
    }
    
    public JLabel sifrenizLabel()
    {
        if(sifrenizLabel ==  null)
        {
            sifrenizLabel = new JLabel();
            sifrenizLabel.setText("Şifreniz                     :");
            sifrenizLabel.setFont(getFont(1, 18)); 
            sifrenizLabel.setForeground(Color.black);
            sifrenizLabel.setBounds(20, 170, 200, 30);  
        }
        return sifrenizLabel;
    }
    
    public JTextField sifrenizTextField()
    {
        if(sifrenizTextField == null)
        {
            sifrenizTextField  = new JTextField();
            sifrenizTextField.setFont(getFont(0, 11));
            sifrenizTextField.setBounds(200,170, 170, 30);           
        }
        return sifrenizTextField;
    }
    
    public JLabel sifredegistirIcon()
    {
        if(sifredegistirIcon == null)
        {
            sifredegistirIcon = new JLabel();
            sifredegistirIcon.setBounds(380, 170, 30, 30);
            sifredegistirIcon.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/degistirIcon.png")));
            sifredegistirIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
            sifredegistirIcon.addMouseListener(actions);                   
        }
        return sifredegistirIcon;
    }
    
    
    
    public Font getFont(int style, int size) {
        return new Font("Segoe UI", style, size);
    }
    
}
