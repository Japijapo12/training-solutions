package covid;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VaccinationDao {

    private final DataSource dataSource;
    private static final LocalDate MINUS_15_DAY = LocalDate.now().minusDays(15);
    private static final int NUMBER_OF_VACCINATION = 2;

    public VaccinationDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Citizen> selectCitizenByZipToGeneration(String zip) {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * from citizens WHERE zip =? AND last_vaccination < ? AND number_of_vaccination<? ORDER BY age DESC, number_of_vaccination ASC, citizen_name ASC")) {

            stmt.setString(1, zip);
            stmt.setDate(2, Date.valueOf(MINUS_15_DAY));
            stmt.setInt(3, NUMBER_OF_VACCINATION);

            List<Citizen> result = new ArrayList<>();

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Citizen citizen = new Citizen(rs.getString("citizen_name"),
                            rs.getString("zip"),
                            rs.getInt("age"),
                            rs.getString("email"),
                            rs.getString("taj"),
                            rs.getInt("number_of_vaccination"),
                            rs.getDate("last_vaccination").toLocalDate());
                    result.add(citizen);
                }
                return result;

            } catch (SQLException se) {
                throw new IllegalStateException("Wrong statement", se);
            }

        } catch (SQLException se) {
            throw new IllegalStateException("Can not connect", se);
        }

    }

    public String selectByTaj(String taj) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT citizen_name, number_of_vaccination, last_vaccination from citizens WHERE taj =?")) {

            stmt.setString(1, taj);

            return selectByPreparedStatement(stmt);


        } catch (SQLException se) {
            throw new IllegalStateException("Can not connect", se);
        }

    }

    private String selectByPreparedStatement(PreparedStatement stmt) {
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                String name = rs.getString("citizen_name");
                int numberOfVaccination = rs.getInt("number_of_vaccination");
                LocalDate lastVaccination = rs.getDate("last_vaccination").toLocalDate();
                if (lastVaccination == null) {
                    System.out.println(name + " még egy oltást sem kapott.");
                }
                return (name + ", " + numberOfVaccination + ", " + lastVaccination);
            }
            throw new IllegalArgumentException("Not found");

        } catch (SQLException se) {
            throw new IllegalStateException("Can not connect", se);
        }

    }
}
