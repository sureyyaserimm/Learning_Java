package Gun32._03_Encapsulation;

import java.util.Scanner;

public class Kampus {
    public static void main(String[] args) {

        Scanner inputStr = new Scanner(System.in);
        System.out.print("Okul adını yazınız=");
        String okulAd = inputStr.nextLine();
        Scanner inputInt = new Scanner(System.in);
        System.out.print("Okulun kontenjanını yazınız=");
        int kontenjan = inputInt.nextInt();
        Okul yeniOkul = new Okul("Kabataş okulu", 3);

        int ogrenciID = 1;

        do {
            System.out.print("Öğrencinin adını yazınız.");
            String ad = inputStr.nextLine();
            System.out.print("Öğrencinin soyadını yazınız.");
            String soyad = inputStr.nextLine();
            System.out.print("Öğrencinin yaşını yazınız=");
            int yas = inputInt.nextInt();

            if (yas > 15) {
                System.out.println("Lütfen yaşı 15'ten küçük bir öğrenci giriniz.");
                continue;
            }

            Ogrenci ogrenci = new Ogrenci(ogrenciID, ad, soyad, yas);
            ogrenci.setID(ogrenciID);
            ogrenciID++;

            yeniOkul.ogrenciEkle(ogrenci);

        } while (yeniOkul.getOgrenciler().size() < yeniOkul.getKontenjan());

        System.out.println(yeniOkul.getOkulAd() + "okuluna eklenen öğrenciler:");
        for (Ogrenci ogrenci : yeniOkul.getOgrenciler()) {
            System.out.println("ID:" + ogrenci.getID() + " Ad:" + ogrenci.getAd()
                    + " Soyad:" + ogrenci.getSoyad());
        }


    }
}
