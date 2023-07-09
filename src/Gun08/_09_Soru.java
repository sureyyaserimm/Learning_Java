package Gun08;

import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args) {
        //girilen bir cümledeki ilk kelimeyi yazdırınız.

//        Scanner oku=new Scanner(System.in);
//        System.out.println("Bir cümle yazınız.");
//        String cumle=oku.nextLine();
//        int boslukIndex=cumle.indexOf(" ");
//        String ilkKelime=cumle.substring(0,boslukIndex);
//        System.out.println("ilkKelime = " + ilkKelime);


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
