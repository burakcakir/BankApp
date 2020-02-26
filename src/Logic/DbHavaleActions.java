package Logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbHavaleActions extends DatabaseActions {

    private String musteriNo = "";
    
    public boolean havaleGerceklestir(String musteriNo, double gonderilecekMiktar) {
        String query = "UPDATE 'musteriler' SET bakiye = bakiye + ? WHERE musteriNo = ?";

        musteriNoKontrolEt(musteriNo);
        if (gonderilecekMiktar <= Actions.getDataController().getBakiye() //gönderilecek miktar bulunan bakiyeden büyük olmalıdır.
                && gonderilecekMiktar > 0 //ve 0'dan büyük olmalıdır
                && musteriNo.equals(this.musteriNo)) { //ve müşteri no tabloda olmalıdır
            try {
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setDouble(1, gonderilecekMiktar);
                preparedStatement.setString(2, musteriNo);
                preparedStatement.executeUpdate();
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(DbHavaleActions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public void bakiyeAzalt(double gonderilecekMiktar) {
        String query = "UPDATE 'musteriler' SET bakiye = bakiye - ? WHERE musteriNo = ? OR tcNo = ?";

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDouble(1, gonderilecekMiktar);
            preparedStatement.setString(2, Actions.getDataController().musteriNo);
            preparedStatement.setString(3, Actions.getDataController().tcNo);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DbHavaleActions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void musteriNoKontrolEt(String musteriNo) {
        String query = "SELECT musteriNo FROM 'musteriler' WHERE musteriNo = ?";

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, musteriNo);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                this.musteriNo = rs.getString("musteriNo");
            }           
        } catch (SQLException ex) {
            Logger.getLogger(DbHavaleActions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
