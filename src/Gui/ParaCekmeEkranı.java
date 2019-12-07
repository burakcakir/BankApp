
package Gui;


import Logic.ParaCekmeEkranıActions;
import java.awt.*;
import javax.swing.*;


public final class ParaCekmeEkranı {
    
    JFrame ParaCekmeEkraniFrame = null;
    JPanel ParaCekmeEkraniPanel = null;
    JLabel geriLabel = null;
    JLabel adsoyadLabel = null;
    JLabel toplambakiyeLabel = null;
    JLabel paracekmetutariLabel = null;
    JTextField paracekmetutariTextField = null;
    JButton paracekButton = null;
    
    
    ParaCekmeEkranıActions actions = new ParaCekmeEkranıActions(this);    
    
    public ParaCekmeEkranı()
    {
        getParaCekmeEkraniPanel().setBackground(new Color(204,204,204));
        getParaCekmeEkraniPanel().add(geriLabel());
        getParaCekmeEkraniPanel().add(adsoyadLabel());
        getParaCekmeEkraniPanel().add(toplambakiyeLabel());
        getParaCekmeEkraniPanel().add(paracekmetutariLabel());
        getParaCekmeEkraniPanel().add(paracekmetutariTextField());
        getParaCekmeEkraniPanel().add(paracekButton());
        getParaCekmeEkraniFrame().setVisible(true);
    }
    
    
    public JFrame getParaCekmeEkraniFrame() {
        if (ParaCekmeEkraniFrame == null) {
            ParaCekmeEkraniFrame = new JFrame("Para Çekme Ekranı");
            ParaCekmeEkraniFrame.setResizable(false);
            ParaCekmeEkraniFrame.setLocation(500, 220);
            ParaCekmeEkraniFrame.setSize(500 , 350);
            ParaCekmeEkraniFrame.setContentPane(getParaCekmeEkraniPanel());
        }
        return ParaCekmeEkraniFrame;
    }    
    
    public JPanel getParaCekmeEkraniPanel() {
        if(ParaCekmeEkraniPanel == null) {
            ParaCekmeEkraniPanel = new JPanel();
            ParaCekmeEkraniPanel.setLayout(null);
            ParaCekmeEkraniPanel.setFocusable(true);
        }        
        return ParaCekmeEkraniPanel;
    }       
    
   public JLabel geriLabel() {
        if(geriLabel == null) {
            geriLabel = new JLabel();
            geriLabel.setBounds(10, 10, 30, 28);
            geriLabel.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/geriIcon.png")));
            geriLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            geriLabel.addMouseListener(actions); // tıklayınca bir tane daha para cekme ekranı açıyor
        }
        return geriLabel;
    }    
   
   public JLabel adsoyadLabel()
   {
       if(adsoyadLabel == null)
       {
           adsoyadLabel = new JLabel();
           adsoyadLabel.setText("Değerli Müşterimiz [Ad Soyad]");
           adsoyadLabel.setFont(getFont(1, 18));
           adsoyadLabel.setForeground(Color.red);
           adsoyadLabel.setBounds(20, 60, 280, 35);                  
       }
       return adsoyadLabel;
   }
   
   public JLabel toplambakiyeLabel()
   {
        if(toplambakiyeLabel == null)
        {
            toplambakiyeLabel = new JLabel();
            toplambakiyeLabel.setText("Hesabınızda Toplam .... TL Bakiye Bulunmaktadır.");
            toplambakiyeLabel.setFont(getFont(0, 18));
            toplambakiyeLabel.setForeground(Color.blue);
            toplambakiyeLabel.setBounds(40, 100, 450, 35);            
        }
        return toplambakiyeLabel;
   }
   
   public JLabel paracekmetutariLabel()
   {
       if(paracekmetutariLabel == null)
       {
           paracekmetutariLabel = new JLabel();
           paracekmetutariLabel.setText("Lütfen çekmek istediğiniz tutarı aşağıdaki alana giriniz.");
           paracekmetutariLabel.setFont(getFont(0, 18));
           paracekmetutariLabel.setForeground(Color.black);
           paracekmetutariLabel.setBounds(20, 140, 450, 35);
       }
       return paracekmetutariLabel;
   }
   
   public JTextField paracekmetutariTextField()
   {
       if(paracekmetutariTextField == null)
       {
            paracekmetutariTextField = new JTextField();
            paracekmetutariTextField.setFont(getFont(0, 11));
            paracekmetutariTextField.setBounds(150, 180, 150, 35);
       }
       return paracekmetutariTextField;
   }
   
   public JButton paracekButton()
   {
       if(paracekButton == null)
       {
            paracekButton = new JButton();
            paracekButton.setText("Para Çek");
            paracekButton.setFont(getFont(1, 15));
            paracekButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            paracekButton.setBounds(170, 230, 110 ,35);
            paracekButton.addActionListener(actions);           
       }
       return paracekButton;
   }
   
   
    public Font getFont(int style, int size) {
        return new Font("Segoe UI", style, size);
    }
    
}
