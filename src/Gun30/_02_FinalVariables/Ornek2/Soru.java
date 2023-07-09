package Gun30._02_FinalVariables.Ornek2;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
        // Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.
        // mainde kullanıcıdan gun, saat, dakika alarak toplam
        // saniyeyi bulunuz.

        int gun=0;
        int saat=0;
        int dakika=0;

        Scanner input=new Scanner(System.in);
        System.out.print("Gun="); gun=input.nextInt();
        System.out.print("Saat="); saat=input.nextInt();
        System.out.print("Dakika="); dakika=input.nextInt();

        //1.Yöntem
        int toplamSaniye=
                gun
                *Sabitler.gundekiSaat
                *Sabitler.saattekiDakika
                *Sabitler.dakikadakiSaniye+
                        saat
                *Sabitler.saattekiDakika
                *Sabitler.dakikadakiSaniye+
                        dakika
                *Sabitler.dakikadakiSaniye;

        System.out.println("Toplam Saniye="+toplamSaniye);

        //2.Yöntem
        System.out.println("Toplam Saniye="
                + Sabitler.hesapla(gun, saat, dakika));



    }
}
