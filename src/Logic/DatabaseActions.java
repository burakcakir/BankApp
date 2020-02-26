package Logic;

import java.io.File;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DatabaseActions extends JOptionPane {

    protected Connection connection = null;
    protected Statement statement = null;
    protected PreparedStatement preparedStatement = null;

    private String filePath = "C:/sqlite/";
    private String fileName = "musteriler";
    private String fileExtension = ".db";

    public DatabaseActions() {
        File file = new File("C:\\sqlite");
        if (!file.exists()) { //dosya yoksa
            file.mkdir(); //dosyayi olustur
        }

        String url = "jdbc:sqlite://" + filePath + fileName + fileExtension;

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Beklenmedik Bir Hata Oluştu");
        }
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Bağlantı Kurulamadı");
            }
        }
    }

    public void createTable() {
        String query = "CREATE TABLE IF NOT EXISTS 'musteriler'"
                + "('id' INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "'musteriNo' TEXT NOT NULL,"
                + "'sifre' INTEGER NOT NULL,"
                + "'adSoyad' TEXT NOT NULL,"
                + "'tcNo' TEXT NOT NULL,"
                + "'telNo' TEXT NOT NULL,"
                + "'guvenlikSorusu' TEXT NOT NULL,"
                + "'guvenlikCevap' TEXT NOT NULL,"
                + "'bakiye' DOUBLE,"
                + "'elektrikFaturasi' DOUBLE,"
                + "'suFaturasi' DOUBLE,"
                + "'dogalgazFaturasi' DOUBLE,"
                + "'internetFaturasi' DOUBLE)";

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseActions.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
}
