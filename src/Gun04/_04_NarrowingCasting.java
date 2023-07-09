package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        double oran=3.2;
        int sayi=5;
         sayi=(int)oran;

         //burda daha büyük bir alandan daha küçük alana geçildiği için challenger patlar.
         //eger bilerek bu dönüşümü yapıyorsan parante iiçine yazıp belirtmen gerekiyor.

        System.out.println("sayi = " + sayi);
        //Example1
        byte kisaKenar=5;
        byte uzunKenar=7;

        byte cevre=(byte) (kisaKenar+kisaKenar+uzunKenar+uzunKenar);
        System.out.println("cevre = " + cevre);
                //eşitliğin 2.tarafında toplam INT durumunda,(int->byte) fakat bizim toplamı byte olarak yapmak
                //istediğimizi parantez içinde göstermemiz gerekiyor.
        int cevre2= kisaKenar+kisaKenar+uzunKenar+uzunKenar;
        System.out.println("cevre2 = " + cevre2);
    }
}
