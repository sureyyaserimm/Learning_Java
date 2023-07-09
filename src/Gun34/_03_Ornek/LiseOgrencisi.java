package Gun34._03_Ornek;

public class LiseOgrencisi extends Ogrenci {
    private String brans;

    private static int LiseIDSayac=1;

    public LiseOgrencisi(String isim, Tip tipi, String brans) {
        super(isim, tipi,LiseIDSayac++);
        setBrans(brans);
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return "LiseOgrencisi{" +
                "brans='" + brans + '\'' +
                "} " + super.toString();
    }
}

