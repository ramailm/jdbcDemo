import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData extends Base {
    @Override
    public void insertData(City city) throws SQLException {

        Connection con = null;
        DbConnection db = new DbConnection();
        PreparedStatement st = null;
        try {
            con = db.connection();
            String sql = "INSERT INTO city (Name,CountryCode,District,Population) values (?,?,?,?)";
            st = con.prepareStatement(sql);
            st.setString(1, city.name);
            st.setString(2, city.countryCode);
            st.setString(3, city.district);
            st.setInt(4, city.population);
            st.executeUpdate();
            System.out.println("added.");
        } catch (SQLException e) {
            db.showError(e);
        } finally {
            st.close();
            con.close();
        }
    }
}
