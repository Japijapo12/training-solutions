package isahasa.isa;

import isahasa.HtmlText;

public class ItalicAndBoldHtml extends HtmlText {

    public ItalicAndBoldHtml(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        return "<i><b>" + super.getPlainText() + "</i></b>";
    }
}
