package Gun34._03_Ornek;

public class Ogrenci {
    private final int ID;
    private String isim;
    private Tip tipi;
    private static int IDsayac=1;

    public Ogrenci(String isim, Tip tipi, int ID) {
        setIsim(isim);
        setTipi(tipi);
        this.ID=ID;
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

    public Tip getTipi() {
        return tipi;
    }

    public void setTipi(Tip tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ID=" + ID +
                ", isim='" + isim + '\'' +
                ", tipi='" + tipi + '\'' +
                '}';
    }
}
