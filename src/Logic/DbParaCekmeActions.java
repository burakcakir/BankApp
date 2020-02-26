package Logic;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbParaCekmeActions extends DatabaseActions {

    public boolean paraCek(double cekilecekMiktar) {

        String query = "UPDATE 'musteriler' SET bakiye = bakiye - ? WHERE musteriNo = ? OR tcNo = ?";
        if (Actions.getDataController().getBakiye() >= cekilecekMiktar && cekilecekMiktar > 0) { //eger hesapta bulunan bakiye cekilecek miktardan buyukse ya da esitse
            try {                                                                                   //ve 0 degilse
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setDouble(1, cekilecekMiktar);
                preparedStatement.setString(2, Actions.getDataController().getMusteriNo());
                preparedStatement.setString(3, Actions.getDataController().getTcNo());
                preparedStatement.executeUpdate();
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(DbParaCekmeActions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
}
