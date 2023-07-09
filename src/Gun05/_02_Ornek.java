package Gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        //Girilen bir adı ekrana yazdırınız.
        Scanner okuyucu=new Scanner(System.in);

        System.out.println("adinizi giriniz=");
        String ad=okuyucu.next(); // next ekrandan bir kelime okur.

        System.out.println("ad = " + ad);

        /*
        okuyucu.next(); -> bir kelime okur
        okuyucu.nextline(); ->satırın tümünü oku

        okuyucu.nextInt(); -> Int degeri okumak için
        okuyucu.nextShort(); -> short degeri okumak icin
        okuyucu.nextByte(); ->byte degeri okumak icin
        okuyucu.nextLong(); -> long degeri okumak icin

        okuyucu.nextFloat(); -> float degeri okumak icin
        okuyucu.nextDouble(); ->double degeri okumak icin
        okuyucu.nextBoolean(); ->boolen degeri okumak icin

       */
    }
}
