package Gui;

import Logic.BasvuruEkraniActions;
import Logic.JTextFieldLimit;
import Logic.KeyTyped;
import java.awt.*;
import javax.swing.*;

public  class BasvuruEkrani {

    JFrame basvuruEkraniFrame = null;
    JPanel basvuruEkraniPanel = null;
    JLabel kisiselbilgilerLabel = null;
    JLabel geriLabel = null;
    JLabel adsoyadLabel = null;
    JTextField adsoyadTextField = null;
    JLabel tcnoLabel = null;
    JTextField tcnoTextField = null;
    JLabel telnoLabel = null;
    JTextField telnoTextField = null;
    JLabel guvenlikLabel = null;
    JLabel guvenliksorusuLabel = null;
    JComboBox guvenliksorusuComboBox = null;
    JLabel guvenliksorucevapLabel = null;
    JTextField guvenliksorucevapTextField = null;
    JButton basvur = null;
    
    
    BasvuruEkraniActions action = new BasvuruEkraniActions(this);
    
    public BasvuruEkrani() {
        basvuruEkraniPanel().setBackground(new Color(208,204,204));
        basvuruEkraniPanel().add(geriLabel());
        basvuruEkraniPanel.add(kisiselbilgilerLabel());
        basvuruEkraniPanel.add(adsoyadlabel());
        basvuruEkraniPanel.add(adsoyadTextField());
        basvuruEkraniPanel.add(tcnoLabel());
        basvuruEkraniPanel.add(tcnoTextField());
        basvuruEkraniPanel.add(telnoLabel());
        basvuruEkraniPanel.add(telnoTextField());
        basvuruEkraniPanel.add(guvenlikLabel());
        basvuruEkraniPanel.add(guvenliksorusuLabel());
        basvuruEkraniPanel.add(guvenliksorusuComboBox());
        basvuruEkraniPanel.add(guvenliksorucevapLabel());
        basvuruEkraniPanel.add(guvenliksorucevapTextField());
        basvuruEkraniPanel.add(basvur());
        basvuruEkraniFrame().setVisible(true);
    }

    public JFrame basvuruEkraniFrame() {
        if (basvuruEkraniFrame == null) {
            basvuruEkraniFrame = new JFrame("Başvuru Ekranı");
            basvuruEkraniFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //pencereyi hicbir sekilde kapatamaz
            basvuruEkraniFrame.setResizable(false); //pencere boyutu ayarlanamaz
            //basvuruEkraniFrame.setSize(500,483);
            basvuruEkraniFrame.setSize(500,500);
            basvuruEkraniFrame.setLocation(700, 300);
            basvuruEkraniFrame.setContentPane(basvuruEkraniPanel());
        }
        return basvuruEkraniFrame;
    }
    
    public JPanel basvuruEkraniPanel() {
        if(basvuruEkraniPanel == null) {
            basvuruEkraniPanel = new JPanel();
            basvuruEkraniPanel.setLayout(null);
        }
        return basvuruEkraniPanel;
    }
    
    public JLabel geriLabel() {
        if(geriLabel == null) {
            geriLabel = new JLabel();
            geriLabel.setBounds(10, 10, 30, 28);
            geriLabel.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/geriIcon.png")));
            geriLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            geriLabel.addMouseListener(action);
        }
        return geriLabel;
    }
    
    public JLabel kisiselbilgilerLabel()
    {
        if(kisiselbilgilerLabel == null)
        {
            kisiselbilgilerLabel = new JLabel();
            kisiselbilgilerLabel.setText("Kişisel Bilgiler ");
            kisiselbilgilerLabel.setFont(getFont(1, 11)); // style:bold , size:19
            kisiselbilgilerLabel.setForeground(Color.red);
            kisiselbilgilerLabel.setBounds(50, 70, 80, 20);
        }
        return kisiselbilgilerLabel;
    }
    
    public JLabel adsoyadlabel()
    {
        if(adsoyadLabel == null)
        {
            adsoyadLabel = new JLabel();
            adsoyadLabel.setText("Ad Soyad                          :");
            adsoyadLabel.setFont(getFont(0, 11)); // style:bold , size:19
            adsoyadLabel.setForeground(Color.black);
            adsoyadLabel.setBounds(50,110,150,20);
            
        }
        return adsoyadLabel;
    }
    
    public JTextField adsoyadTextField()
    {
        if(adsoyadTextField == null)
        {
            adsoyadTextField = new JTextField();
            adsoyadTextField.setFont(getFont(0, 11));
            adsoyadTextField.setBounds(200,110, 200, 20);
        }
        return adsoyadTextField;
    }
    
    public JLabel tcnoLabel()
    {
        if(tcnoLabel == null)
        {
            tcnoLabel = new JLabel();
            tcnoLabel.setText("T.C Kimlik Numarası         :");
            tcnoLabel.setFont(getFont(0, 11)); // style:bold , size:19
            tcnoLabel.setForeground(Color.black);
            tcnoLabel.setBounds(50, 160, 150, 20);
        }
        return tcnoLabel;
    }
    
    public JTextField tcnoTextField()
    {
        if(tcnoTextField == null)
        {
            tcnoTextField = new JTextField();
            tcnoTextField.setFont(getFont(0, 11));
            tcnoTextField.setBounds(200,160, 200, 20);
            KeyTyped.sadeceSayiAl(basvuruEkraniFrame, tcnoTextField);
            tcnoTextField.setDocument(new JTextFieldLimit(11));
            
        }
        return tcnoTextField;
    }
    
    public JLabel telnoLabel()
    {
        if(telnoLabel == null)
        {
            telnoLabel = new JLabel();
            telnoLabel.setText("Telefon Numarası            :");
            telnoLabel.setFont(getFont(0, 11)); // style:bold , size:19
            telnoLabel.setForeground(Color.black);
            telnoLabel.setBounds(50, 210, 150, 20);
        }
        return telnoLabel;
    }
    
    public JTextField telnoTextField()
    {
        if(telnoTextField == null)
        {
            telnoTextField = new JTextField();
            telnoTextField.setFont(getFont(0, 11));
            telnoTextField.setBounds(200,210, 200, 20);
            KeyTyped.sadeceSayiAl(basvuruEkraniFrame, telnoTextField);
            telnoTextField.setDocument(new JTextFieldLimit(11));
            
        }
        return telnoTextField;
    }
    
    public JLabel guvenlikLabel()
    {
        if(guvenlikLabel == null)
        {
            guvenlikLabel = new JLabel();
            guvenlikLabel.setText("Güvenlik Bilgileri ");
            guvenlikLabel.setFont(getFont(1, 11)); // style:bold , size:19
            guvenlikLabel.setForeground(Color.red);
            guvenlikLabel.setBounds(50, 260, 100, 20);
            
        }
        return guvenlikLabel;
    }
    
    public JLabel guvenliksorusuLabel()
    {
        if(guvenliksorusuLabel == null)
        {
            guvenliksorusuLabel = new JLabel();
            guvenliksorusuLabel.setText("Güvenlik Sorusu               :");
            guvenliksorusuLabel.setFont(getFont(0, 11)); // style:bold , size:19
            guvenliksorusuLabel.setForeground(Color.black);
            guvenliksorusuLabel.setBounds(50, 310, 150, 20);
        }
        return guvenliksorusuLabel;
    }
    
    
    public JComboBox guvenliksorusuComboBox()
    {
        if(guvenliksorusuComboBox == null)
        {
            guvenliksorusuComboBox = new JComboBox();
            guvenliksorusuComboBox.setBounds(200,310,200,20);
            guvenliksorusuComboBox.setModel(new DefaultComboBoxModel(new String [] { "İlk evcil hayvanınızın adı nedir?", "En sevdiğiniz nesne nedir?", "İlkokul öğretmeninizin soyadı nedir?"}));
            guvenliksorusuComboBox.setFont(getFont(0, 11));
        }
        return guvenliksorusuComboBox;
    }
    
    
    public JLabel guvenliksorucevapLabel()
    {
        if(guvenliksorucevapLabel == null)
        {
            guvenliksorucevapLabel = new JLabel();
            guvenliksorucevapLabel.setText("Güvenlik Sorusu Cevabı   :");
            guvenliksorucevapLabel.setFont(getFont(0, 11));
            guvenliksorucevapLabel.setForeground(Color.black);
            guvenliksorucevapLabel.setBounds(50, 360, 200, 20);
        }
        return guvenliksorucevapLabel;
    }
    
    public JTextField guvenliksorucevapTextField()
    {
        if(guvenliksorucevapTextField == null)
        {
            guvenliksorucevapTextField = new JTextField();
            guvenliksorucevapTextField.setFont(getFont(0, 11));
            guvenliksorucevapTextField.setBounds(200,360, 200, 20);
            
        }
        return guvenliksorucevapTextField;
    }
    
        public JButton basvur() {
        if (basvur == null) {
            basvur = new JButton();
            basvur.setText("Başvur");
            basvur.setFont(getFont(0, 11));
            basvur.setCursor(new Cursor(Cursor.HAND_CURSOR));
            basvur.setBounds(255, 420, 90,25);
            basvur.addActionListener(action);
        }
        return basvur;
    }
    
    
     public Font getFont(int style, int size) {
        return new Font("Segoe UI", style, size);
    }
    
}
