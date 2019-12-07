
package Gui;
    
import Logic.OdemelerEkraniActions;
import java.awt.*;
import javax.swing.*;

public  final class OdemelerEkrani 
{
    
    JFrame odemelerEkraniFrame = null;
    JPanel odemelerEkraniPanel = null;      
    JLabel geriLabel = null;
    JLabel adsoyadLabel = null;    
    JLabel elektrikfaturasıLabel = null;
    JLabel elektrikborcLabel = null;
    JButton elektrikButton =  null;
    JLabel sufaturasıLabel = null;
    JLabel suborcLabel = null;
    JButton suButton = null;
    JLabel dogalgazfaturasıLabel = null;
    JLabel dogalgazborcLabel = null;
    JButton dogalgazButton = null;
    JLabel internetfaturasıLabel = null;
    JLabel internetborcLabel = null;
    JButton internetButton = null;
    
    OdemelerEkraniActions actions = new OdemelerEkraniActions(this);
    
    public OdemelerEkrani()
    {
        getOdemelerEkraniPanel().setBackground(new Color(204,204,204));
        getOdemelerEkraniPanel().add(geriLabel());
        getOdemelerEkraniPanel().add(adsoyadLabel());
        getOdemelerEkraniPanel().add(elektrikfaturasıLabel());
        getOdemelerEkraniPanel().add(elektrikborcLabel());
        getOdemelerEkraniPanel().add(elektrikButton());
        getOdemelerEkraniPanel().add(sufaturasıLabel());
        getOdemelerEkraniPanel().add(suborcLabel());
        getOdemelerEkraniPanel().add(suButton());
        getOdemelerEkraniPanel().add(dogalgazfaturasıLabel());
        getOdemelerEkraniPanel().add(dogalgazborcLabel());
        getOdemelerEkraniPanel().add(dogalgazButton());
        getOdemelerEkraniPanel().add(internetfaturasıLabel());
        getOdemelerEkraniPanel().add(internetborcLabel());
        getOdemelerEkraniPanel().add(internetButton());
        getOdemelerEkraniFrame().setVisible(true);
    }
    
    public JFrame getOdemelerEkraniFrame()
    {
        if(odemelerEkraniFrame == null)
        {
            odemelerEkraniFrame = new JFrame("Ödemeler Ekranı");
            odemelerEkraniFrame.setResizable(false);
            odemelerEkraniFrame.setLocation(500, 220);
            odemelerEkraniFrame.setSize(600, 400);
            odemelerEkraniFrame.setContentPane(getOdemelerEkraniPanel());   
        }
        return odemelerEkraniFrame;
    }
    
    public JPanel getOdemelerEkraniPanel()
    {
        if(odemelerEkraniPanel == null)
        {
            odemelerEkraniPanel = new JPanel();
            odemelerEkraniPanel.setLayout(null);
            odemelerEkraniPanel.setFocusable(true);    
        }
        return odemelerEkraniPanel;
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
   
   public JLabel elektrikfaturasıLabel()
   {
       if(elektrikfaturasıLabel == null)
       {
           elektrikfaturasıLabel = new JLabel();
           elektrikfaturasıLabel.setText("Toplam Elektrik Faturası Borcunuz ");
           elektrikfaturasıLabel.setFont(getFont(1, 18));
           elektrikfaturasıLabel.setForeground(Color.black);
           elektrikfaturasıLabel.setBounds(20, 100, 450, 35);
       }
       return elektrikfaturasıLabel;
   }
   
   public JLabel elektrikborcLabel()
   {
       if(elektrikborcLabel == null)
       {
           elektrikborcLabel = new JLabel();
           elektrikborcLabel.setText("DENEME");
           elektrikborcLabel.setFont(getFont(1, 15));
           elektrikborcLabel.setForeground(Color.black);
           elektrikborcLabel.setBounds(350, 100, 150, 35);
       }
       return elektrikborcLabel;
   }
   
   public JButton elektrikButton()
   {
       if(elektrikButton == null)
       {
            elektrikButton = new JButton();
            elektrikButton.setText("Öde");
            elektrikButton.setFont(getFont(1, 15));
            elektrikButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            elektrikButton.setBounds(430, 100, 75 ,35);
            elektrikButton.addActionListener(actions);    
       }
       return elektrikButton;
   }
   
   public JLabel sufaturasıLabel()
   {
       if(sufaturasıLabel == null)
       {
           sufaturasıLabel = new JLabel();
           sufaturasıLabel.setText("Toplam Su Faturası Borcunuz ");
           sufaturasıLabel.setFont(getFont(1, 18));
           sufaturasıLabel.setForeground(Color.black);
           sufaturasıLabel.setBounds(20, 150, 450, 35);
       }
       return sufaturasıLabel;
   }   
   
      public JLabel suborcLabel()
   {
       if(suborcLabel == null)
       {
           suborcLabel = new JLabel();
           suborcLabel.setText("DENEME");
           suborcLabel.setFont(getFont(1, 15));
           suborcLabel.setForeground(Color.black);
           suborcLabel.setBounds(350, 150, 150, 35);
       }
       return suborcLabel;
   }
   
   public JButton suButton()
   {
       if(suButton == null)
       {
            suButton = new JButton();
            suButton.setText("Öde");
            suButton.setFont(getFont(1, 15));
            suButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            suButton.setBounds(430, 150, 75 ,35);
            suButton.addActionListener(actions);    
       }
       return suButton;
   }


   public JLabel dogalgazfaturasıLabel()
   {
       if(dogalgazfaturasıLabel == null)
       {
          dogalgazfaturasıLabel = new JLabel();
          dogalgazfaturasıLabel.setText("Toplam Doğal Gaz Faturası Borcunuz ");
          dogalgazfaturasıLabel.setFont(getFont(1, 18));
          dogalgazfaturasıLabel.setForeground(Color.black);
          dogalgazfaturasıLabel.setBounds(20, 200, 450, 35);
       }
       return dogalgazfaturasıLabel;
   }   
   
      public JLabel dogalgazborcLabel()
   {
       if(dogalgazborcLabel == null)
       {
           dogalgazborcLabel = new JLabel();
           dogalgazborcLabel.setText("DENEME");
           dogalgazborcLabel.setFont(getFont(1, 15));
           dogalgazborcLabel.setForeground(Color.black);
           dogalgazborcLabel.setBounds(350, 200, 150, 35);
       }
       return dogalgazborcLabel;
   }
   
   public JButton dogalgazButton()
   {
       if(dogalgazButton == null)
       {
            dogalgazButton = new JButton();
            dogalgazButton.setText("Öde");
            dogalgazButton.setFont(getFont(1, 15));
            dogalgazButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            dogalgazButton.setBounds(430, 200, 75 ,35);
            dogalgazButton.addActionListener(actions);    
       }
       return dogalgazButton;
   }


   public JLabel internetfaturasıLabel()
   {
       if(internetfaturasıLabel == null)
       {
          internetfaturasıLabel = new JLabel();
          internetfaturasıLabel.setText("Toplam İnternet Faturası Borcunuz ");
          internetfaturasıLabel.setFont(getFont(1, 18));
          internetfaturasıLabel.setForeground(Color.black);
          internetfaturasıLabel.setBounds(20, 250, 450, 35);
       }
       return internetfaturasıLabel;
   }   
   
      public JLabel internetborcLabel()
   {
       if(internetborcLabel == null)
       {
           internetborcLabel  = new JLabel();
           internetborcLabel .setText("DENEME");
           internetborcLabel .setFont(getFont(1, 15));
           internetborcLabel .setForeground(Color.black);
           internetborcLabel .setBounds(350, 250, 150, 35);
       }
       return internetborcLabel ;
   }
   
   public JButton internetButton()
   {
       if(internetButton == null)
       {
            internetButton = new JButton();
            internetButton.setText("Öde");
            internetButton.setFont(getFont(1, 15));
            internetButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            internetButton.setBounds(430, 250, 75 ,35);
            internetButton.addActionListener(actions);    
       }
       return internetButton;
   }
   

   
    public Font getFont(int style, int size) {
        return new Font("Segoe UI", style, size);
    }     
    
}
