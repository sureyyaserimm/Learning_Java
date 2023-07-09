package Gun34._03_Ornek;

public class IlkOgrencisi extends Ogrenci {

    private String kulup;
    private static int IlkIDSayac=1;

    public IlkOgrencisi(String isim, Tip tipi, String kulup) {
        super(isim, tipi, IlkIDSayac++);
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
