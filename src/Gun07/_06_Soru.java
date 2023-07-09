package Gun07;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        //Tek seferde girilen bir ad soyadın adını ve soyadını ayırıp ayrı ayrı yazdırınız.


        Scanner oku=new Scanner(System.in);
        System.out.println("Ad Soyad ");
        String adSoyad= oku.nextLine();

        int boslukIndex=adSoyad.indexOf(" ");
        String ad=adSoyad.substring(0,boslukIndex);

        int bosluk2Index=adSoyad.lastIndexOf(" ");
        String ad2=adSoyad.substring(boslukIndex,bosluk2Index);
        String soyad=adSoyad.substring(bosluk2Index+1);


        System.out.println("ad = " + ad);
        System.out.println("ad2 = " + ad2);
        System.out.println("soyad = " + soyad);

    }
}
