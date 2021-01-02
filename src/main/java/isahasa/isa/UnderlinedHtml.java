package isahasa.isa;

import isahasa.HtmlText;

public class UnderlinedHtml extends HtmlText {

    UnderlinedHtml(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        return "<u>" + getPlainText() + "</u>";
    }
}
