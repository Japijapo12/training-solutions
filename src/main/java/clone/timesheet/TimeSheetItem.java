package clone.timesheet;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeSheetItem {

    private String employee;
    private String project;
    private LocalDateTime from;
    private LocalDateTime to;

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }

    public TimeSheetItem(TimeSheetItem timeSheetItem) {
        employee = timeSheetItem.employee;
        project = timeSheetItem.project;
        from = timeSheetItem.from;
        to = timeSheetItem.to;
    }

    public static TimeSheetItem withDifferentDay(TimeSheetItem timeSheetItem, LocalDate localDate) {  //hívja a copy konstruktort

        TimeSheetItem newTimeSheet= new TimeSheetItem(timeSheetItem);

        newTimeSheet.from = LocalDateTime.of(localDate, newTimeSheet.from.toLocalTime());  //csak a time rész
        newTimeSheet.to = LocalDateTime.of(localDate, newTimeSheet.to.toLocalTime());

        return newTimeSheet;
    }

    public String getEmployee() {
        return employee;
    }

    public String getProject() {
        return project;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    //Átjárás a típusok között LocalDate localDate = localDateTime.toLocalDate(); jegyzet 301. oldal
}


/*TimeSheetItem klónozása (clone)
A clone.timesheet.TimeSheetItem osztály tartalmazza, hogy egy alkalmazott mikor,
min dolgozott. Van egy employee, project, from és egy to attribútuma.
Legyen egy konstruktora, mely ezekkel az adatokkal inicializálja. Azonban legyen egy
copy konstruktora is, mely paraméterül kap egy TimeSheetItem példányt, és annak
adatait átmásolja az új példányba.
Legyen egy statikus withDifferentDay(TimeSheetItem, LocalDate) metódusa is, mely
lemásolja a paraméterként átadott bejegyzést, azonban a from és to attribútumokban
szereplő dátumokat kicseréli a másodikként megadott napra, de az időket érintetlenül
hagyja. Ez a statikus metódus hívja a copy konstruktort.
*/
