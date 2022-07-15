import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData extends Base {


    @Override
    public void deleteData(int id) throws SQLException {
        Connection con = null;
        DbConnection db = new DbConnection();
        PreparedStatement st = null;
        try {
            con = db.connection();
            String sql = "delete from city where id=?";
            st = con.prepareStatement(sql);
            st.setInt(1, id);
            int result = st.executeUpdate();
            System.out.println("deleted.");
        } catch (SQLException e) {
            db.showError(e);
        } finally {
            st.close();
            con.close();
        }
    }
}
