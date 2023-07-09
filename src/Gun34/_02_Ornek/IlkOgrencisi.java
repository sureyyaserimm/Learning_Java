package Gun34._02_Ornek;

public class IlkOgrencisi extends Ogrenci{

    private String kulup;

    public IlkOgrencisi(String isim, Tip tipi,String kulup) {
        super(isim, tipi);
        setKulup(kulup);
    }

    public String getKulup() {
        return kulup;
    }

    public void setKulup(String kulup) {
        this.kulup = kulup;
    }

    @Override
    public String toString() {
        return "IlkOgrencisi{" +
                "kulup='" + kulup + '\'' +
                "} " + super.toString();
    }
}
