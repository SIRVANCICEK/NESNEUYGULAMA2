public class Ogrenci {
    private String ad;
    private String bolum;
    private int girisYili;
    private String ogrNo;
    private double gano;
    private String bolumKodu;

    public Ogrenci(String ad, String bolum) {
        this.ad = ad;
        this.bolum = bolum;
    }
    public Ogrenci(Ogrenci ogrenci){

    }

    public String getAd() {
        return ad;
    }

    public String getBolum() {
        return bolum;
    }

    public double getGano() {
        if (gano < 0 || gano > 4){
            throw new IllegalArgumentException("GEÇERLİ GANO DEĞERİ GİRİLMEDİ!");
        }
        return gano;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }


    public void setGano(double gano) {

        this.gano = gano;
    }

    public Ogrenci(String ad, String bolum, double gano, String bolumKodu, int girisYili) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.gano = gano;
        this.bolumKodu = bolumKodu;
    }

    public void Ogrenci() {
        ad = "";
        bolum = "";
        girisYili = 0;
        ogrNo = "";
        gano = 0.0;
        bolumKodu = "";
    }


    public String ogrenciNoOlustur() {
        String girisSirasi = "001";
        return this.ogrNo = this.girisYili + this.bolumKodu + girisSirasi;
    }

    public double harcHesapla(int dersSayisi) {
        double harc =dersSayisi * 24;
        return harc;
    }

    public double harcHesapla(int dersSayisi, double yil) {
        double harc = dersSayisi * 24 + yil * 48;
        return harc;
    }


}