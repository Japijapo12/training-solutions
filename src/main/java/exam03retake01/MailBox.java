package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();

    public List<Mail> getMails() {
        return mails;
        //return new ArrayList<>(mails);
    }


    public void addMail(Mail mail) {
        mails.add(mail);
    }

    public List<Mail> findByCriteria(String criteria) {

        if( criteria.startsWith("to:")) {
            return findByTo(criteria.substring(3));
                }

        else if (criteria.startsWith("from:")) {
            return findByFrom(criteria.substring(5));
        }

        else {
            return findByContent(criteria);
        }
    }




    public List<Mail> findByTo(String to) {
        List<Mail> result = new ArrayList<>();
        for (Mail mail : mails ) {
            for (Contact contact : mail.getTo()) {
                if ( contact.getName().equals(to) || contact.getEmail().equals(to)) {
                    result.add(mail);
                }
            }
        }
        return result;
    }

    public List<Mail> findByFrom(String from) {
        List<Mail> result = new ArrayList<>();
        for (Mail mail : mails) {
            if (mail.getFrom().getName().equals(from) || mail.getFrom().getEmail().equals(from)) {
                result.add(mail);
            }
        }
        return result;
    }

    public List<Mail> findByContent(String criteria) {
        List<Mail> result = new ArrayList<>();
        for (Mail mail : mails) {
            if (mail.match(criteria)) {
                result.add(mail);
            }
        }
        return result;
    }






}


//from:John Doe vagy from:johndoe@example.com - from: előtaggal visszaadja az összes olyan levelet,
// ahol a feladó neve vagy e-mail címe pontosan a from: után szereplő szöveg

/*
to:John Doe vagy to:johndoe@example.com - from: előtaggal visszaadja az összes olyan levelet,
ahol a címzettek között szerepel olyan, akinek a neve vagy e-mail címe pontosan a to: után szereplő szöveg

egyéb esetben visszaadja az összes olyan levelet, amiben szerepel a tárgyban vagy üzenetben a megadott szó
 */

