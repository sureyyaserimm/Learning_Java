package Gun30._02_FinalVariables.Ornek1;

public class Vatandas {

    String isim;

    final int TCNo;

    static int sayac=1;

    public Vatandas(String isim) {
        this.isim = isim;
        this.TCNo = sayac++;
    }


    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", TCNo=" + TCNo +
                '}';
    }
}
