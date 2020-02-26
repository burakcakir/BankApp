package Logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbDataController extends HesapBilgileri { //kullanici verilerini aldigimiz sinif

    public void verileriAl(String musteriNo_orTc) {
        String query = "SELECT * FROM 'musteriler' WHERE musteriNo = ? OR tcNo = ?";

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, musteriNo_orTc);
            preparedStatement.setString(2, musteriNo_orTc);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                musteriNo = rs.getString("musteriNo");
                sifre = rs.getInt("sifre");
                adSoyad = rs.getString("adSoyad");
                tcNo = rs.getString("tcNo");
                telNo = rs.getString("telNo");
                guvenlikSorusu = rs.getString("guvenlikSorusu");
                guvenlikCevap = rs.getString("guvenlikCevap");
                bakiye = rs.getDouble("bakiye");
                elektrikFaturasi = rs.getDouble("elektrikFaturasi");
                suFaturasi = rs.getDouble("suFaturasi");
                dogalgazFaturasi = rs.getDouble("dogalgazFaturasi");
                internetFaturasi = rs.getDouble("internetFaturasi");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbDataController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
