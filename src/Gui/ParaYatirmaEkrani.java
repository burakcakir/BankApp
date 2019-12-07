/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Logic.ParaYatirmaActions;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author burak
 */
public final class ParaYatirmaEkrani {
    
    JFrame ParaYatirmaEkraniFrame = null;
    JPanel ParaYatirmaEkraniPanel = null;
    JLabel geriLabel = null;
    JLabel adsoyadLabel = null;
    JLabel toplambakiyeLabel = null;
    JLabel parayatirmatutariLabel = null;
    JTextField parayatirmatutariTextField = null;
    JButton parayatirButton = null;    
    
    ParaYatirmaActions actions = new ParaYatirmaActions(this);
    
    public  ParaYatirmaEkrani()
    {
        getParaYatirmaEkraniPanel().setBackground(new Color(204,204,204));
        getParaYatirmaEkraniPanel().add(geriLabel());
        getParaYatirmaEkraniPanel().add(adsoyadLabel());
        getParaYatirmaEkraniPanel().add(toplambakiyeLabel());
        getParaYatirmaEkraniPanel().add(parayatirmatutariLabel());
        getParaYatirmaEkraniPanel().add(parayatirmatutariTextField());
        getParaYatirmaEkraniPanel().add(parayatirButton());
        getParaYatirmaEkraniFrame().setVisible(true);
    }
    
    public JFrame getParaYatirmaEkraniFrame()
    {
        if(ParaYatirmaEkraniFrame == null)
        {
            ParaYatirmaEkraniFrame = new JFrame("Para Yatırma Ekranı");
            ParaYatirmaEkraniFrame.setResizable(false);
            ParaYatirmaEkraniFrame.setLocation(500, 220);
            ParaYatirmaEkraniFrame.setSize(500, 350);
            ParaYatirmaEkraniFrame.setContentPane(getParaYatirmaEkraniPanel());            
        }
        return ParaYatirmaEkraniFrame;
    }
    
    public JPanel getParaYatirmaEkraniPanel()
    {
        if(ParaYatirmaEkraniPanel == null)
        {
            ParaYatirmaEkraniPanel = new JPanel();
            ParaYatirmaEkraniPanel.setLayout(null);
            ParaYatirmaEkraniPanel.setFocusable(true);            
        }
        return ParaYatirmaEkraniPanel;
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
   
   public JLabel parayatirmatutariLabel()
   {
       if(parayatirmatutariLabel == null)
       {
           parayatirmatutariLabel = new JLabel();
           parayatirmatutariLabel.setText("Lütfen yatırmak istediğiniz tutarı aşağıdaki alana giriniz.");
           parayatirmatutariLabel.setFont(getFont(0, 18));
           parayatirmatutariLabel.setForeground(Color.black);
           parayatirmatutariLabel.setBounds(20, 140, 450, 35);
       }
       return parayatirmatutariLabel;
   }
   
   public JTextField parayatirmatutariTextField()
   {
       if(parayatirmatutariTextField == null)
       {
            parayatirmatutariTextField = new JTextField();
            parayatirmatutariTextField.setFont(getFont(0, 11));
            parayatirmatutariTextField.setBounds(150, 180, 150, 35);          
       }
       return parayatirmatutariTextField;
   }
   
   public JButton parayatirButton()
   {
       if(parayatirButton == null)
       {
            parayatirButton = new JButton();
            parayatirButton.setText("Para Yatır");
            parayatirButton.setFont(getFont(1, 15));
            parayatirButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            parayatirButton.setBounds(170, 230, 110 ,35);
            parayatirButton.addActionListener(actions);            
       }
       return parayatirButton;
   }
   
    
    public Font getFont(int style, int size) {
        return new Font("Segoe UI", style, size);
    } 
   
}
