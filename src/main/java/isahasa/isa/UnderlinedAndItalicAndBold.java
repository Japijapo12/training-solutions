package isahasa.isa;

import isahasa.HtmlText;

public class UnderlinedAndItalicAndBold extends HtmlText {

    UnderlinedAndItalicAndBold(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        return "<u><i><b>" + getPlainText() + "</u></i></b>";
    }
}
