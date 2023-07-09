package Gun33._02_Inheritance;

public class Yilan extends Hayvan{
    private int uzunluk;
    public Yilan(String renk, int kilo, String cinsi,int uzunluk) {
        super(renk, kilo, cinsi);
        this.uzunluk=uzunluk;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    @Override
    public void konustu() {
        System.out.println("tısladı");
    }
}
