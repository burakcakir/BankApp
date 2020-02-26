package Logic;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public interface ISource { //kaynaklari belirten interface

    public boolean labelSource(JLabel label);

    public boolean buttonSource(JButton button);

    public boolean textSource(JTextField textField);
}
