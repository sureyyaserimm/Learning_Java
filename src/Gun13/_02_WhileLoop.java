package Gun13;

public class _02_WhileLoop {
    public static void main(String[] args) {
        //Ekrana 5 kez Merhaba yazdırınız.

        int sayac=0;
        while (sayac<5) //iken yap: şartı yazıyoruz, dönme şartı
        {
           //her döndükçe yapılacaklar
            System.out.println(sayac+ "." + "Hello!");

            sayac++; //1,2,3,4,5

        }
        System.out.println("Program is done!");


    }
}
