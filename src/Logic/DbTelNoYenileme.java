package Logic;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbTelNoYenileme extends DatabaseActions {

    public void telNoYenile(String telNo) {
        String query = "UPDATE 'musteriler' SET telNo = ? WHERE  tcNo = ? AND telNo = ? ";

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, telNo);
            preparedStatement.setString(2, Actions.getDataController().getTcNo());
            preparedStatement.setString(3, Actions.getDataController().getTelNo());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DbTelNoYenileme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
