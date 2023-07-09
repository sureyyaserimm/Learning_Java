package Gun39._01_OOP_Soru;

public abstract class Hayvan {

    private final int ID; //finaller için aşağıda setID siliyoruz çünkü finallere değer atanamaz.
    // constructor'ın içinde sayaca eşitleyip zaten değeri otomatik vermiş oluyoruz, tekrardan setID yapmıyoruz.
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;
    private static int sayacID=1;

    abstract public void yiyecek();
    abstract public void yemekMiktari();
    abstract public void gunlukUykuSuresi();
    abstract public void sesi();

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        this.ID=sayacID++; //final oldugu icin setID degil this ID olarak duruyor
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
    }

    public int getID() {
        return ID;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }
    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }
    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        System.out.print("yiyeceği="); yiyecek();
        System.out.print("yemek="); yemekMiktari();
        System.out.print("uyku süresi="); gunlukUykuSuresi();
        System.out.print("sesi="); sesi();
        return "Hayvan{" +
                "ID=" + ID +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                '}';
    }
    public void guzelYaz(){
        System.out.println("ID = " + ID);
        System.out.println("isim = " + isim);
        System.out.println("vahsi = " + vahsi);
        System.out.println("dogumTarihi = " + dogumTarihi);
        System.out.print("yiyeceği="); yiyecek();
        System.out.print("yemek="); yemekMiktari();
        System.out.print("uyku süresi="); gunlukUykuSuresi();
        System.out.print("sesi="); sesi();

    }
}
