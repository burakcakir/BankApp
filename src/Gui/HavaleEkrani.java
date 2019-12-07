
package Gui;

import Logic.HavaleEkraniActions;
import java.awt.*;
import javax.swing.*;

public final class HavaleEkrani {
    
    JFrame havaleEkraniFrame = null;
    JPanel havaleEkraniPanel = null;    
    JLabel geriLabel = null;
    JLabel adsoyadLabel = null;
    JLabel toplambakiyeLabel = null;
    JLabel musterinoLabel = null;
    JTextField musterinoTextField = null;
    JLabel gonderilecektutarLabel = null;
    JTextField gonderilecektutarTextField = null;
    JButton gonderButton = null;
    
    
    HavaleEkraniActions actions = new HavaleEkraniActions(this);
    
    public HavaleEkrani()
    {
        getHavaleEkraniPanel().setBackground(new Color(204,204,204));
        getHavaleEkraniPanel().add(geriLabel());
        getHavaleEkraniPanel().add(adsoyadLabel());
        getHavaleEkraniPanel().add(toplambakiyeLabel());
        getHavaleEkraniPanel().add(musterinoLabel());
        getHavaleEkraniPanel().add(musterinoTextField());
        getHavaleEkraniPanel().add(gonderilecektutarLabel());
        getHavaleEkraniPanel().add(gonderilecektutarTextField());
        getHavaleEkraniPanel().add(gonderButton());
        getHavaleEkraniFrame().setVisible(true);
    }
    
    public JFrame getHavaleEkraniFrame()
    {
        if(havaleEkraniFrame == null)
        {
            havaleEkraniFrame = new JFrame("Havale Ekranı"); 
            havaleEkraniFrame.setResizable(false);
            havaleEkraniFrame.setLocation(500, 220);
            havaleEkraniFrame.setSize(500, 350);
            havaleEkraniFrame.setContentPane(getHavaleEkraniPanel());            
        }
        return havaleEkraniFrame;
    }
    
    public JPanel getHavaleEkraniPanel()
    {
        if(havaleEkraniPanel == null)
        {
            havaleEkraniPanel = new JPanel();
            havaleEkraniPanel.setLayout(null);
            havaleEkraniPanel.setFocusable(true);            
        }
        return havaleEkraniPanel;
    }
 
    public JLabel geriLabel()
    {
        if(geriLabel == null)
        {
            geriLabel = new JLabel();
            geriLabel.setBounds(10, 10, 30, 28);
            geriLabel.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/geriIcon.png")));
            geriLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            geriLabel.addMouseListener(actions);            
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
   
   public JLabel musterinoLabel()
   {
       if(musterinoLabel == null)
       {
           musterinoLabel = new JLabel();
           musterinoLabel.setText("Müşteri Numarası   :");
           musterinoLabel.setFont(getFont(0, 18));
           musterinoLabel.setForeground(Color.black);
           musterinoLabel.setBounds(30, 150, 200, 35);
       }
       return musterinoLabel;
   }
   
   public JTextField musterinoTextField()
   {
       if(musterinoTextField == null)
       {
           musterinoTextField = new JTextField();
           musterinoTextField.setFont(getFont(0, 11));
           musterinoTextField.setBounds(200, 150, 150, 35);
       }
       return musterinoTextField;
   }
    
   public  JLabel gonderilecektutarLabel()
   {
       if(gonderilecektutarLabel == null)
       {
           gonderilecektutarLabel = new JLabel();
           gonderilecektutarLabel.setText("Gönderilecek Tutar :");
           gonderilecektutarLabel.setFont(getFont(0, 18));
           gonderilecektutarLabel.setForeground(Color.black);
           gonderilecektutarLabel.setBounds(30, 200, 200, 35);
           
       }
       return gonderilecektutarLabel;
   }
   
   public JTextField gonderilecektutarTextField()
   {
       if(gonderilecektutarTextField == null)
       {
           gonderilecektutarTextField = new JTextField();
           gonderilecektutarTextField.setFont(getFont(0, 11));
           gonderilecektutarTextField.setBounds(200, 200, 150, 35);
       }
       return gonderilecektutarTextField;
   }
   
   public JButton gonderButton()
   {
       if(gonderButton == null)
       {
            gonderButton  = new JButton();
            gonderButton .setText("Gönder");
            gonderButton .setFont(getFont(1, 15));
            gonderButton .setCursor(new Cursor(Cursor.HAND_CURSOR));
            gonderButton .setBounds(220, 250, 110 ,35);
            gonderButton .addActionListener(actions);             
       }
       return gonderButton;
   }
   
    public Font getFont(int style, int size) {
        return new Font("Segoe UI", style, size);
    }    
   
}
