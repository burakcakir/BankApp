package Logic;

public class HesapBilgileri extends DatabaseActions {

    String musteriNo = "";
    int sifre = 0;
    String adSoyad = "", tcNo = "", telNo = "";
    String guvenlikSorusu = "", guvenlikCevap = "";
    double bakiye = 0, elektrikFaturasi = 0, suFaturasi = 0, dogalgazFaturasi = 0, internetFaturasi = 0;

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getGuvenlikSorusu() {
        return guvenlikSorusu;
    }

    public void setGuvenlikSorusu(String guvenlikSorusu) {
        this.guvenlikSorusu = guvenlikSorusu;
    }

    public String getGuvenlikCevap() {
        return guvenlikCevap;
    }

    public void setGuvenlikCevap(String guvenlikCevap) {
        this.guvenlikCevap = guvenlikCevap;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public double getElektrikFaturasi() {
        return elektrikFaturasi;
    }

    public void setElektrikFaturasi(double elektrikFaturasi) {
        this.elektrikFaturasi = elektrikFaturasi;
    }

    public double getSuFaturasi() {
        return suFaturasi;
    }

    public void setSuFaturasi(double suFaturasi) {
        this.suFaturasi = suFaturasi;
    }

    public double getDogalgazFaturasi() {
        return dogalgazFaturasi;
    }

    public void setDogalgazFaturasi(double dogalgazFaturasi) {
        this.dogalgazFaturasi = dogalgazFaturasi;
    }

    public double getInternetFaturasi() {
        return internetFaturasi;
    }

    public void setInternetFaturasi(double internetFaturasi) {
        this.internetFaturasi = internetFaturasi;
    }
}
