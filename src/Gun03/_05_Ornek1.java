package Gun03;

public class _05_Ornek1 {
    public static void main(String[] args) {
        //İki kenarı a,b olarak verilen bir dikdörtgenin çevresini ve alanını bulunuz.
        // çarpma: *, x harftir çarpma için kullanılmaz.
        // çevre=a+a+b+b, alan a*b

        int kisaKenar =8;
        int uzunKenar =10;

        int cevre;
         cevre=kisaKenar+ kisaKenar+ uzunKenar+ uzunKenar;

         System.out.println("cevre = " + cevre);

        int alan;
        alan= kisaKenar*uzunKenar;

        System.out.println("alan = " + alan);


    }
}
