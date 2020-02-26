package Logic;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class JTextFieldLimit extends PlainDocument { //textfieldlar'a sinirli sayida karakter gondermek icin

    private int limit;

    public JTextFieldLimit(int limit) {
        super();
        this.limit = limit;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException { //verilen limitin geçerli olması için
        if (str == null) {
            return;
        }

        if ((getLength() + str.length()) <= limit) {
            super.insertString(offset, str, attr);
        }
    }

    public static boolean isMinLimit(JTextField textField) {
        return !(textField.getText().trim().length() < 11); //string boyutu 11'den kucukse false donsun
    }

}
