package ch22.ex13.coded;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * Vadim Voronov
 * Created: 18-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class UpperCaseDocument extends PlainDocument { // документ
    private boolean upperCase = true;

    public void setUpperCase(boolean flag) {
        upperCase = flag;
    }

    @Override   // вставить строку если надо перевести в UpperCase
    public void insertString(int offset, String str,
                             AttributeSet attSet) throws BadLocationException {
        if (upperCase) {
            str = str.toUpperCase();
        }
        super.insertString(offset, str, attSet);

    }
}
