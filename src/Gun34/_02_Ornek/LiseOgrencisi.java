package Gun34._02_Ornek;

public class LiseOgrencisi extends Ogrenci{
    private String brans;

    public LiseOgrencisi(String isim, Tip tipi,String brans) {
        super(isim, tipi);
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

