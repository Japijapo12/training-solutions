package covid;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CitizenDao {

    private final DataSource dataSource;

    public CitizenDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertCitizen(Citizen citizen) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("insert into citizens(citizen_name, zip, age, email, taj) values (?,?,?,?,?)")) {
            stmt.setString(1, citizen.getName());
            stmt.setString(2, citizen.getZip());
            stmt.setInt(3, citizen.getAge());
            stmt.setString(4, citizen.getEmail());
            stmt.setString(5, citizen.getTaj());

            stmt.executeUpdate();

        } catch (SQLException se) {
            throw new IllegalStateException("Cannot insert", se);
        }
    }

    public List<Citizen> insertCitizens(List<Citizen> citizens) {
        if (citizens.isEmpty()) {
            throw new IllegalArgumentException("Citizens list cannot be empty");
        }
        try (Connection conn = dataSource.getConnection()) {
            return insertCitizensByList(conn, citizens);
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect", e);
        }
    }

        public List<Citizen> insertCitizensByList(Connection conn, List<Citizen> citizens) throws SQLException {
            String sql = "Insert into `citizens`(`citizen_name`, `zip_code`, `age`, `email`, `taj`) values" + "(?,?,?,?,?),".repeat(citizens.size());
            sql = sql.substring(0, sql.length() - 1);
            List<Citizen> result = new ArrayList<>();

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                for (Citizen citizen : citizens) {
                    stmt.setString(1, citizen.getName());
                    stmt.setString(2, citizen.getZip());
                    stmt.setInt(3, citizen.getAge());
                    stmt.setString(4, citizen.getEmail());
                    stmt.setString(5, citizen.getTaj());
                }

                    stmt.executeUpdate();

                    return result;

            }  catch (SQLException se) {
                throw new IllegalStateException("Cannot insert", se);
            }
        }
}
