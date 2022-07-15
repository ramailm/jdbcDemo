import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData extends Base{

    @Override
    public void updateData(int newPop, int id) throws SQLException {
        Connection con = null;
        DbConnection db = new DbConnection();
        PreparedStatement st = null;

        try {
            con = db.connection();
            String sql = "update city set population=? where id=?";
            st = con.prepareStatement(sql);
            st.setInt(1,newPop);
            st.setInt(2,id); //
            int result  = st.executeUpdate();
            System.out.println("updated.");
        } catch (SQLException e) {
            db.showError(e);
        }finally {
            st.close();
            con.close();
        }

    }
}
