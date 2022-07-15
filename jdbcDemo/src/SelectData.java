import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SelectData extends Base {
    @Override
    public void selectData() throws SQLException {
        Connection con = null;
        DbConnection db = new DbConnection();
        Statement st = null;
        ResultSet rs;

        try {
            con = db.connection();
            st = con.createStatement();
            rs = st.executeQuery("select * from city");
            ArrayList<City> cities = new ArrayList<>();
            while (rs.next()) {
                cities.add(new City(rs.getString("Name"),
                        rs.getString("CountryCode"),
                        rs.getString("District"),
                        rs.getInt("Population")));
            }

            int id = 1;
            for (City city : cities) {
                System.out.println(id + " " + city.name + " " + city.countryCode + " " + city.district + " " + city.population);
                id++;
            }

        } catch (SQLException e) {
            db.showError(e);//throw new RuntimeException(e);
        } finally {
            st.close();
            con.close();
        }
    }
}
