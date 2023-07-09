package Gun39._01_OOP_Soru;

public class Kedi extends Hayvan{


    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super( isim, vahsi, dogumTarihi);
    }

    @Override
    public void yiyecek() {
        System.out.println("mama ve balık");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("günde 100 gram");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("10 saat");
    }

    @Override
    public void sesi() {
        System.out.println("miyav");
    }
}
