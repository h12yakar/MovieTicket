import java.util.Scanner;

public class Sinema {
    int topBiletSay = 0;
    double topTutar = 0;
    Film bilet;

    public Sinema() {
        this.bilet = new Film();
    }

    public Sinema(String filmAdi) {
        Film film = new Film(filmAdi);
    }

    void satis() {
        int secim = 1;
        while (secim == 1) {
            Scanner user_log = new Scanner(System.in);

            System.out.println("Kaç tane bilet almak istiyorsunuz giriniz.");
            int biletSayisi = user_log.nextInt();
            System.out.println("Bilet fiyatı giriniz");
            double biletFiyati = user_log.nextDouble();
            bilet.setDeger(biletSayisi, biletFiyati);

            hesapla(bilet);
            System.out.println("Devam etmek istiyor musunuz?1/0");
            secim = user_log.nextInt();
        }
        yazdir();
    }
    void hesapla(Film film){
        topTutar += film.tutarHesapla();
        topBiletSay += film.getBiletSayisi();

    }
    void yazdir(){
        System.out.println("TOPLAM KASAYA GİREN PARA : " + topTutar);
        System.out.println("TOPLAM SATILAN BİLET : " + topBiletSay);
        System.exit(5);
    }
}
