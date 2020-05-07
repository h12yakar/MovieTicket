public class Film {
    private String filmAdi ;
    private double biletFiyati = 0;
    private int biletSayisi = 0;

    public Film() {
        setFilmAdi("Algoritmalar");
    }

    public Film(String filmAdi){
    }

    public void setDeger(int biletSayisi, double biletFiyati) {
        this.biletFiyati = biletFiyati;
        this.biletSayisi = biletSayisi;
        System.out.println(toString());
    }

    private void setFilmAdi(String filmAdi){
        this.filmAdi = filmAdi;
    }

    public double tutarHesapla(){
        biletFiyati = biletSayisi * biletFiyati;
        if (biletSayisi >= 4){
            biletFiyati = biletFiyati - ((biletFiyati*25)/100);
        }
        return biletFiyati;
    }

    int getBiletSayisi(){
        return biletSayisi;
    }

    public String toString(){
        String string = "Filmin Adı: " + filmAdi+ " Bilet Sayısı: " + biletSayisi + " Bilet Tutarı: " + biletFiyati;
        return string;
    }
}
