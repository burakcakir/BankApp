package Logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Actions implements ActionListener, FocusListener, MouseListener {

    @Override
    public void actionPerformed(ActionEvent e) { //kaynaga tiklandiginda gerceklesecek olaylar
    }

    @Override
    public void focusGained(FocusEvent e) { //belirlenen kaynaklara tıklandığında(focuslandığında)  
    }

    @Override
    public void focusLost(FocusEvent e) { //belirlenen kaynak dışında bir kaynaga tıklandığında(focus kaybedildiğinde) 
    }

    @Override
    public void mouseClicked(MouseEvent e) { //belirlenen kaynaga mouse ile tiklandiginda
    }

    @Override
    public void mouseEntered(MouseEvent e) { //belirlenen kaynagin uzerine mouse geldiginde    

    }

    @Override
    public void mouseExited(MouseEvent e) { //belirlenen kaynagin uzerinden mouse ciktiginda  

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
