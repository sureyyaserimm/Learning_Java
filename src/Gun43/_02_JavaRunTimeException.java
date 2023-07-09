package Gun43;

import java.util.Scanner;

public class _02_JavaRunTimeException {
    public static void main(String[] args) {

        System.out.println("Program başladı.");

        for (int i = 0; i < 3; i++) {


            try { //hata bölgesini try{} ile aldık
                Scanner oku = new Scanner(System.in);

                System.out.println("Sayi1=");
                int sayi1 = oku.nextInt();

                System.out.println("Sayi2=");
                int sayi2 = oku.nextInt();

                int bolum = sayi1 / sayi2;
                System.out.println("bolum = " + bolum);

            } catch (Exception hata) {
                //hata mesajlarını hata isimli Exception cinsinden değişkene attım.
                System.out.println("hata.getMessage() = " + hata.getMessage());
                System.out.println("Lütfen tekrar deneyiniz.");
                i--;
            }
        }

        System.out.println("Program bitti");
    }
}
