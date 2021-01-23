package exceptions.faults;

public enum ProcessingResult {

    NO_ERROR(0), COMMENT(1),
    WORD_COUNT_ERROR(2),
    VALUE_ERROR(4),
    DATE_ERROR(8),
    VALUE_AND_DATE_ERROR(12);

    private final int code;

    ProcessingResult(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }


}


//Hibakódok:
//• 2: WORDCOUNT_ERROR, azaz a sor nem bontható 3 db , karakterrel elválaszható
//részre.
//• 4: VALUE_ERROR, azaz a második rész nem double szám.
//• 8: DATE_ERROR, azaz a harmadik rész nem yyyy.MM.dd. alakú dátum
//• 12: VALUE_AND_DATE_ERROR: azaz egyszerre van VALUE_ERROR és DATE_ERROR is.

