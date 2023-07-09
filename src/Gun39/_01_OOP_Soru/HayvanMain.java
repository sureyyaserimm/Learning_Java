package Gun39._01_OOP_Soru;

public class HayvanMain {
    public static void main(String[] args) {

        Kedi kedi1 = new Kedi("köpük", false, "01/01/2015");
        System.out.println("kedi1=" + kedi1);

        Kartal kartal1 = new Kartal("kara kartal", true, "01/06/2018");
        System.out.println("kartal=" + kartal1);

        kartal1.guzelYaz();
        kedi1.guzelYaz();

    }
}
