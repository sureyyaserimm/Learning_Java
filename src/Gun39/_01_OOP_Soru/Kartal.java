package Gun39._01_OOP_Soru;

public class Kartal extends Hayvan{

    public Kartal( String isim, boolean vahsi, String dogumTarihi) {
        super( isim, vahsi, dogumTarihi);
    }

    @Override
    public void yiyecek() {
        System.out.println("et yer");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("günlük 1 kilo");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("günde 8 saat");
    }

    @Override
    public void sesi() {
        System.out.println("ciyak, fiyuu");
    }
}
