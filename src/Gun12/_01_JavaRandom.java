package Gun12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        //0-5 arası gibi sayılar ürettik, hep sıfırdan başladı
        //4-9 arası nasıl üretirdim?
        //yöntem şu: önce aralık kadar normal üret 9-4 yani 0-5 arası
        //üretilmiş olan sayıya min ekle, üretilmiş sayı+4
        //(int)(Math.random()*(min-max))+min;


        Scanner read=new Scanner(System.in);
        System.out.println("min");
        int min= read.nextInt();

        System.out.println("max");
        int max= read.nextInt();

        int rndSayi=(int)(Math.random()*(min-max))+min;
        System.out.println("rndSayi = " + rndSayi);




    }
}
