package Logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbBasvuruActions extends DatabaseActions {

    public void veriEkle(String musteriNo, int sifre, String adSoyad, String tcNo, String telNo,
            String guvenlikSorusu, String guvenlikCevap,
            double bakiye, double elektrikFaturasi, double suFaturasi, double dogalgazFaturasi, double internetFaturasi) {

        String query = "INSERT INTO 'musteriler'(musteriNo,sifre,adSoyad,tcNo,telNo,guvenlikSorusu,guvenlikCevap,"
                + "bakiye,elektrikFaturasi,suFaturasi,dogalgazFaturasi,internetFaturasi)"
                + "VALUES('" + musteriNo + "','" + sifre + "','" + adSoyad + "','" + tcNo + "','" + telNo + "',"
                + "'" + guvenlikSorusu + "','" + guvenlikCevap + "',"
                + "'" + bakiye + "','" + elektrikFaturasi + "','" + suFaturasi + "','" + dogalgazFaturasi + "','" + internetFaturasi + "')";

        try {
            statement = this.connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseActions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean tcNoKontrolEt(String tcNo) {
        String query = "SELECT tcNo FROM 'musteriler' WHERE tcNo = ?";

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, tcNo);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return false; //eger tabloda girilen tcNo ile aynı tcNo bulunursa basvuru gecersiz olacak
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbBasvuruActions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true; //tabloda tcNo olmadigi icin true dondurelim 
    }

    public boolean musteriNoKontrolEt(String musteriNo) { //random verilen musteri numarasinida tabloda varmi diye kontrol etmek icin
        String query = "SELECT musteriNo FROM 'musteriler' WHERE musteriNo = ?";

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, musteriNo);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return false; //musteriNo tabloda var ise false donduruyoruz
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbBasvuruActions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true; //musteriNo tabloda yoksa true donduruyoruz
    }
}
