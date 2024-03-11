public class Main {
    public static void main(String[] args) {
        Ogrenci[] ogrenciler = {new Ogrenci(null, null, 0.0, "104", 1973),
                new Ogrenci("Gökhan", "Bilgisayar Müh", 0.0, "104", 1985),
                new Ogrenci("Ayşe", "Makine Müh", 0.0, "104", 1985),
                new Ogrenci("Elif", "Elektrik-Elektronik Müh", 1.98, "104", 2020),
        };


        System.out.println("\nÖğrencilerin Bilgileri");
        System.out.println("OGR-1 " + ogrenciler[0].getAd() + " " + ogrenciler[0].getBolum() + " " + ogrenciler[0].ogrenciNoOlustur() + " " + ogrenciler[0].getGano());
        System.out.println("OGR-2 " + ogrenciler[1].getAd() + " " + ogrenciler[1].getBolum() + " " + ogrenciler[1].ogrenciNoOlustur() + " " + ogrenciler[1].getGano());
        System.out.println("OGR-3 " + ogrenciler[2].getAd() + " " + ogrenciler[2].getBolum() + " " + ogrenciler[2].ogrenciNoOlustur() + " " + ogrenciler[2].getGano());
        System.out.println("OGR-4 " + ogrenciler[3].getAd() + " " + ogrenciler[3].getBolum() + " " + ogrenciler[3].ogrenciNoOlustur() + " " + ogrenciler[3].getGano());
        System.out.println("3. öğrencinin ödeyeceği harç : " + ogrenciler[2].harcHesapla(20));
        System.out.println("4. öğrencinin ödeyeceği harç : " + ogrenciler[3].harcHesapla(20, 10));
    }
}