package Gun39;

public class MyFunc {
    public static void Bekle(int sn)
    {
        try {
            Thread.sleep(1000*sn); // ms beklediği 1000 milisaniye 1 saniyedir.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
