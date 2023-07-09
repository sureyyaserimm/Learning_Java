package Gun20;

public class _06_JavaMethod {
    public static void main(String[] args) {
        int s1 = 45;
        int s2 = 4;
        int s3 = 67;
        int s4 = 23;

        int sonuc1 = toplamBul("ahmet",s1, s2);
        int sonuc2 = toplamBul("mehmet", s1, s2, s3);
        int sonuc3 = toplamBul("ali",s1, s2, s3, s4);
        //parametreler aynı tip sadece miktarları farklı
        //bu tip durumlar için bir kolaylık sağlanmış.

        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);

    }
    //... ile ilgili kural var
    //1-bir metodda parametre olarak sadece 1 tane olabilir.
    //2-Her zaman son parametre olmalı
    //gelen kaç sayı olursa olsun hepsini al dizi şeklinde metoda al
    public static int toplamBul(String names, int... numbers) { //kaç sayı gelirse gelsin onları dizi şeklinde alıyor.
        //yukarıda int olarak tanımlanan dizide başta string varsa public içinde de ilk sting yazılır.sıraları birbiriyle aynı olmalı.
        int total = 0;
        System.out.println("names = " + names);

        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];

        }

        return total;

    }
}
