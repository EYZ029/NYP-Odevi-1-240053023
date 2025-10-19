package paket1;

public class PodcastYayini {
    String baslik;
    String sunucu;
    int sureSaniye;
    String yayinTarihi;
    int dinlenmeSayisi;

    public PodcastYayini(String baslik, String sunucu, int sureSaniye, String yayinTarihi, int dinlenmeSayisi){
        this.baslik = baslik;
        this.sunucu = sunucu;
        this.sureSaniye = sureSaniye;
        this.yayinTarihi = yayinTarihi;
        this.dinlenmeSayisi = dinlenmeSayisi;
    }

    public String sureyiDakikaCinsindenGetir(){
        int dakika = sureSaniye / 60;
        int saniye = sureSaniye % 60;
        return dakika + "dakika " + saniye + "saniye";
    }

    public void dinle(){
        dinlenmeSayisi++;
        System.out.println("Podcast Dilendi. Şıradaki şarkı" + dinlenmeSayisi);
    }

    public void yayinBilgiGoster(){
        System.out.println("baslik nedir: " + baslik);
        System.out.println("sunucu kimdir: " + sunucu);
        System.out.println("Süre: " + sureSaniye);
        System.out.println("Yayin Tarihi: " + yayinTarihi);
        System.out.println("Dinlenme Sayisi: " + dinlenmeSayisi);
    }

    public static void main(String[] args){
        PodcastYayini podcast1 = new PodcastYayini("Yapay Zeka Sohbetleri", "Ahmet Yılmaz", 350, "2025-10-19", 120);
        PodcastYayini podcast2 = new PodcastYayini("Bilim Günlüğü", "Elif Demir", 420, "2025-09-12", 85);
        PodcastYayini podcast3 = new PodcastYayini("Tarih Konuşmaları", "Mehmet Kaya", 600, "2025-08-01", 200);


        System.out.println("========================================");
        podcast1.yayinBilgiGoster();
        System.out.println(podcast1.sureyiDakikaCinsindenGetir());
        podcast1.dinle();
        System.out.println("========================================");
        podcast2.yayinBilgiGoster();
        System.out.println(podcast2.sureyiDakikaCinsindenGetir());
        podcast2.dinle();
        System.out.println("========================================");
        podcast3.yayinBilgiGoster();
        System.out.println(podcast3.sureyiDakikaCinsindenGetir());
        podcast3.dinle();
    }
}



