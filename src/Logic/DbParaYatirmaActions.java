package Logic;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbParaYatirmaActions extends DatabaseActions {

    public boolean paraYatir(double yatirilacakMiktar) {
        String query = "UPDATE 'musteriler' SET bakiye = bakiye + ? WHERE musteriNo = ? OR tcNo = ?";

        if (yatirilacakMiktar <= 5000.0 && yatirilacakMiktar > 0) { //Tek seferde 5000 TL ve alti yatirilabilir
            try {
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setDouble(1, yatirilacakMiktar);
                preparedStatement.setString(2, Actions.getDataController().getMusteriNo());
                preparedStatement.setString(3, Actions.getDataController().getTcNo());
                preparedStatement.executeUpdate();
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(DbParaYatirmaActions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
}
