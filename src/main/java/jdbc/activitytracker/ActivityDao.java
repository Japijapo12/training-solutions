package jdbc.activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {
    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertActivity(Activity activity) {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO activities(start_time, activity_desc, activity_type) VALUES (?,?,?)")) {

            stmt.setTimestamp(1, Timestamp.valueOf((activity.getStartTime())));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();

        } catch (SQLException se) {
            throw new IllegalStateException("Can not insert", se);
        }
    }


    public Activity selectById(long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where id = ?")) {
            stmt.setLong(1, id);
            List<Activity> result = selectByPreparedStatement(stmt);
            if (result.size() == 1) {      //ha egy elemű a lista
                return result.get(0);
            }
            throw new IllegalArgumentException("Not found!");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not connect", se);
        }
    }

    //minden select * -os lekérdezésre fog működni
    private List<Activity> selectByPreparedStatement(PreparedStatement stmt) {
        List<Activity> result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Activity activity = new Activity(rs.getLong("id"), rs.getTimestamp("start_time").toLocalDateTime(), rs.getString("activity_desc"), ActivityType.valueOf(rs.getString("activity_type")));
                result.add(activity);
            }
            return result;
        } catch (SQLException se) {
            throw new IllegalStateException("Wrong statement", se);

        }
    }


    public List<Activity> selectAllActivities() {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities")) {

            return selectByPreparedStatement(stmt);

        } catch (SQLException se) {
            throw new IllegalArgumentException("Connection failed!", se);
        }
    }


    //lekérdetés típus al
    public List<Activity> selectAllActivitiesByType(ActivityType type) {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where activity_type = ?")) {

            stmt.setString(1, type.toString());
            return selectByPreparedStatement(stmt);

        } catch (SQLException se) {
            throw new IllegalStateException("Connection failed!", se);
        }


    }
}
