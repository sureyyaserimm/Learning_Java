package Gun35._03_Polymorphism;

public class OrtakOzellikler {
    private String ad;
    private String soyad;
    private String gorevi;

    public OrtakOzellikler(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    @Override
    public String toString() {
        return "OrtakOzellikler{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorevi='" + gorevi + '\'' +
                '}';
    }

    public static void kimlikYaz(OrtakOzellikler ortak) {

        {
            System.out.println("*****Kimlik Belgesi*****");
            System.out.println("ad=" + ortak.getAd());
            System.out.println("soyad=" + ortak.getSoyad());
            System.out.println("görevi=" + ortak.getGorevi());

        }
        if (ortak instanceof Ogrenci)
            System.out.println("Ogrenci şubesi=" + ((Ogrenci) ortak).getSubesi());
        else if (ortak instanceof Calisan)
            System.out.println("Çalışan departmanı=" + ((Calisan) ortak).getDepartmani());

    }
}
