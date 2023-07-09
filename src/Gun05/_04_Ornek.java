package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        //Kullanıcıdan adını ve soyadını ayrı ayrı okutarak alıp birlikte ekrana yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("adinizi giriniz= ");
        String ad= oku.next();

        System.out.println("soyadinizi giriniz= ");
        String soyad= oku.next();

        System.out.println("ad = " + ad);
        System.out.println("Soyad = " + soyad);
        System.out.println("Adınız ve Soyadınız = "+ad+" "+soyad);
    }
}
