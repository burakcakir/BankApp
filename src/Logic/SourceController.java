package Logic;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SourceController implements ISource { //listener'lari kisa yoldan kontrol etmek icin olusturulan sinif

    private Object source = null;

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getSource() {
        return this.source;
    }

    @Override
    public boolean labelSource(JLabel label) { //kaynagin esit oldugu labeli kontrol etmek icin
        return this.source == label;
    }

    @Override
    public boolean buttonSource(JButton button) {
        return this.source == button;
    }

    @Override
    public boolean textSource(JTextField textField) {
        return this.source == textField;
    }
}
