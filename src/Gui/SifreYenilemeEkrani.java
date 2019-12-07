package Gui;

import Logic.JTextFieldLimit;
import Logic.KeyTyped;
import Logic.SifreYenilemeActions;
import java.awt.*;
import javax.swing.*;

// çarpıya basınca ayarlar ekranına geri dönmesi ayarlanıcak

public final class SifreYenilemeEkrani {
    
    JFrame SifreYenilemeFrame = null;
    JPanel SifreYenilemePanel = null;
    JLabel geriLabel = null;
    JLabel sifreyenilemeLabel = null;
    JLabel tcnoLabel = null;
    JTextField tcnoTextField = null;
    JLabel guvenliksorusuLabel = null;
    JTextField guvenliksorusuTextField = null;
    JLabel eskisifreLabel = null;
    JTextField eskisifreTextField = null;
    JLabel yenisifreLabel = null;
    JTextField yenisifreTextField = null;
    JLabel yenisifretekrarLabel = null;
    JTextField yenisifretekrarTextField = null;
    JButton sifreyenileButton = null;
    
    
    SifreYenilemeActions actions = new SifreYenilemeActions(this);
    
    public SifreYenilemeEkrani()
    {
        getSifreYenilemePanel().setBackground(new Color(255,204,204));
        getSifreYenilemePanel().add(sifreyenilemeLabel());
        getSifreYenilemePanel().add(geriLabel());
        getSifreYenilemePanel().add(tcnoLabel());
        getSifreYenilemePanel().add(tcnoTextField());
        getSifreYenilemePanel().add( guvenliksorusuLabel());
        getSifreYenilemePanel().add(guvenliksorusuTextField());
        getSifreYenilemePanel().add(eskisifreLabel());
        getSifreYenilemePanel().add(eskisifreTextField());
        getSifreYenilemePanel().add(yenisifreLabel());
        getSifreYenilemePanel().add(yenisifreTextField());
        getSifreYenilemePanel().add(yenisifretekrarLabel());
        getSifreYenilemePanel().add(yenisifretekrarTextField());
        getSifreYenilemePanel().add(sifreyenileButton());
        getSifreYenilemeFrame().setVisible(true);
    }
    
    public JFrame getSifreYenilemeFrame()
    {
        if(SifreYenilemeFrame == null)
        {
            SifreYenilemeFrame = new JFrame("Şifre Değiştirme");
            SifreYenilemeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            SifreYenilemeFrame.setResizable(false);
            SifreYenilemeFrame.setLocation(700, 300);
            SifreYenilemeFrame.setSize(530, 460);
            SifreYenilemeFrame.setContentPane(getSifreYenilemePanel());
        }
        return SifreYenilemeFrame;    
    }
    
    public JPanel getSifreYenilemePanel()
    {
        if(SifreYenilemePanel == null)
        {
            SifreYenilemePanel = new JPanel();
            SifreYenilemePanel.setLayout(null);
            SifreYenilemePanel.setFocusable(true);
        }
        return SifreYenilemePanel;
    }
    
    public JLabel geriLabel()
    {
        if(geriLabel == null)
        {
            geriLabel = new JLabel();
            geriLabel.setBounds(10, 25, 30, 28);
            geriLabel.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/geriIcon.png")));
            geriLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            geriLabel.addMouseListener(actions);            
        }
        return geriLabel;
    }
    
    
    public JLabel sifreyenilemeLabel()
    {
        if(sifreyenilemeLabel == null)
        {
            sifreyenilemeLabel = new JLabel();
            sifreyenilemeLabel.setText("Şifre Yenileme");
            sifreyenilemeLabel.setFont(getFont(1, 24)); // style:bold , size:24
            sifreyenilemeLabel.setForeground(Color.red);
            sifreyenilemeLabel.setBounds(60, 20, 220, 35);             
        }
        return sifreyenilemeLabel;
    }
    
    public JLabel tcnoLabel()
    {
        if(tcnoLabel == null)
        {
            tcnoLabel = new JLabel();
            tcnoLabel.setText("TC Kimlik Numaranız          :");
            tcnoLabel.setFont(getFont(0, 18));
            tcnoLabel.setForeground(Color.black);
            tcnoLabel.setBounds(20, 80, 250, 35);
        }
        return tcnoLabel;
    }
    
    public JTextField tcnoTextField()
    {
        if(tcnoTextField == null)
        {
            tcnoTextField = new JTextField();
            tcnoTextField.setFont(getFont(0, 11));
            tcnoTextField.setBounds(250,80, 200, 35);
            KeyTyped.sadeceSayiAl(SifreYenilemeFrame, tcnoTextField);
            tcnoTextField.setDocument(new JTextFieldLimit(11));
        }
        return tcnoTextField;        
    }
    
    public JLabel guvenliksorusuLabel()
    {
        if( guvenliksorusuLabel == null)
        {
            guvenliksorusuLabel = new JLabel();
            guvenliksorusuLabel.setText("Güvenlik Sorusu Cevabınız :");
            guvenliksorusuLabel.setFont(getFont(0, 18));
            guvenliksorusuLabel.setForeground(Color.black);
            guvenliksorusuLabel.setBounds(20, 140, 250, 35);
        }
        return guvenliksorusuLabel;
    }
    
    public JTextField guvenliksorusuTextField()
    {
        if(guvenliksorusuTextField == null)
        {
            guvenliksorusuTextField = new JTextField();
            guvenliksorusuTextField.setFont(getFont(0, 11));
            guvenliksorusuTextField.setBounds(250, 140, 200, 35);
        }
        return guvenliksorusuTextField;
    }
    
    public JLabel eskisifreLabel()
    {
        if(eskisifreLabel == null)
        {
            eskisifreLabel = new JLabel();
            eskisifreLabel.setText("Eski Şifreniz                        :");
            eskisifreLabel.setFont(getFont(0, 18));
            eskisifreLabel.setForeground(Color.black);
            eskisifreLabel.setBounds(20, 200, 250, 35);
        }
        return eskisifreLabel;
    }
    
    public JTextField eskisifreTextField()
    {
        if(eskisifreTextField == null)
        {
            eskisifreTextField = new JTextField();
            eskisifreTextField.setFont(getFont(0, 11));
            eskisifreTextField.setBounds(250, 200, 200, 35);
        }
        return eskisifreTextField;
    }
    
    public JLabel yenisifreLabel()
    {
        if(yenisifreLabel == null)
        {
            yenisifreLabel = new JLabel();
            yenisifreLabel.setText("Yeni Şifreniz                        :");
            yenisifreLabel.setFont(getFont(0, 18));
            yenisifreLabel.setForeground(Color.black);
            yenisifreLabel.setBounds(20, 260, 250, 35);
        }
        return yenisifreLabel;
    }
    
    public JTextField yenisifreTextField()
    {
        if(yenisifreTextField == null)
        {
            yenisifreTextField = new JTextField();
            yenisifreTextField.setFont(getFont(0, 11));
            yenisifreTextField.setBounds(250, 260, 200, 35);
        }
        return yenisifreTextField;
    }
    
        public JLabel yenisifretekrarLabel()
    {
        if(yenisifretekrarLabel == null)
        {
            yenisifretekrarLabel = new JLabel();
            yenisifretekrarLabel.setText("Yeni Şifreniz Tekrar             :");
            yenisifretekrarLabel.setFont(getFont(0, 18));
            yenisifretekrarLabel.setForeground(Color.black);
            yenisifretekrarLabel.setBounds(20, 320, 250, 35);
        }
        return yenisifretekrarLabel;
    }
        
    public JTextField yenisifretekrarTextField()
    {
        if(yenisifretekrarTextField == null)
        {
            yenisifretekrarTextField = new JTextField();
            yenisifretekrarTextField.setFont(getFont(0, 11));
            yenisifretekrarTextField.setBounds(250, 320, 200, 35);
        }
        return yenisifretekrarTextField;
    }        
    
        public JButton sifreyenileButton() {
        if (sifreyenileButton == null) {
            sifreyenileButton = new JButton();
            sifreyenileButton.setText("Şifre Yenile");
            sifreyenileButton.setFont(getFont(1, 16));
            sifreyenileButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            sifreyenileButton.setBounds(300, 380, 130,35);
            sifreyenileButton.addActionListener(actions);
        }
        return sifreyenileButton;
    }    
    
    
     public Font getFont(int style, int size) {
        return new Font("Segoe UI", style, size);
    }
    
    
}
