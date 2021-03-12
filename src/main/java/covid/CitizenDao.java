package covid;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

    public void insertCitizens(List<Citizen> citizens) {

        try (Connection conn = dataSource.getConnection()) {

            insertCitizensByList(conn, citizens);

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect", e);
        }
    }

        public void insertCitizensByList(Connection conn, List<Citizen> citizens) throws SQLException {
            String sql = "Insert into `citizens`(`citizen_name`, `zip`, `age`, `email`, `taj`) values " + "(?,?,?,?,?)";
            for (Citizen citizen : citizens) {
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {

                    stmt.setString(1, citizen.getName());
                    stmt.setString(2, citizen.getZip());
                    stmt.setInt(3, citizen.getAge());
                    stmt.setString(4, citizen.getEmail());
                    stmt.setString(5, citizen.getTaj());
                    stmt.executeUpdate();
                }
             catch(SQLException se){
                    throw new IllegalStateException("Cannot insert", se);
                }
            }
        }
}
