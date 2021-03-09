package covid;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ZipDao {

    private final DataSource dataSource;

    public ZipDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String selectCityByZip(String zip) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from cities where zip = ?")) {
            stmt.setString(1, zip);

            List<Zip> result = selectByPreparedStatement(stmt);
            if (!result.isEmpty()) {
            return result.get(0).getCity();
            }
            throw new IllegalArgumentException("Nincs ilyen település");

        } catch (SQLException se) {
            throw new IllegalStateException("Can not connect", se);
        }
    }

    private List<Zip> selectByPreparedStatement(PreparedStatement stmt) {
        List<Zip> result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Zip zip = new Zip(rs.getString("zip"), rs.getString("city"), rs.getString("city_part"));
                result.add(zip);
            }
            return result;
        } catch (SQLException se) {
            throw new IllegalStateException("Wrong statement", se);

        }
    }


}
