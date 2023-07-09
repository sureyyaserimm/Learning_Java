package Gun03;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // Ornek Soru : yarıcapı(r) verilen bir dairenin cevresini ve alanını bulunuz
        // alan= pi*r*r    cevre = 2pi*r     " pi=3.14 "

        double yaricap=4;
        double pi=3.14;

        double alan;
        alan = pi*yaricap*yaricap;

        System.out.println("alan = " + alan);

        double cevre;
        cevre=2*pi*yaricap;
        System.out.println("cevre = " + cevre);

    }
}
