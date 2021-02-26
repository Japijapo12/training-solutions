package jdbc.activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;

public class ActivityTrackerMain {

    public static void main(String[] args) {

        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not connect", se);
        }


        Activity activity = new Activity( LocalDateTime.of(2020, 1, 24, 8, 0), "Biking", ActivityType.BIKING);
        Activity activity2 = new Activity(LocalDateTime.of(2021, 2, 25, 9, 10), "Hiking", ActivityType.HIKING);
        Activity activity3 = new Activity( LocalDateTime.of(2021, 3, 26, 10, 21), "Running", ActivityType.RUNNING);


//        atm.insertActivity(dataSource,activity);
//        atm.insertActivity(dataSource,activity2);
//        atm.insertActivity(dataSource,activity3);

//minden teszteset előtt lefuttatni
        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        ActivityDao activityDao = new ActivityDao(dataSource);

        //System.out.println(activityDao.selectById(3));
        //System.out.println(activityDao.selectAllActivities());

       // System.out.println(activityDao.selectAllActivitiesByType(ActivityType.RUNNING));


    }

}

