package Gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        int sayi=5; //tek bir rakam tutabilen bir değişken
        int[] dizi=new int[20]; //20 adet sayı saklayabilen bir değişken, uzunluğu sabit
        int [][] tablo=new int[20][2]; //20x2lik sayı saklayabilen değişken, sabit uzunluklu

        ArrayList<Integer> liste=new ArrayList<>(); //İstenildği kadar sayı eklenebilen, uzunluğu değişken

        //bir sınıf bu sınıfta 20 kişi var ve bunların 3 dersi olsun.Öğrencilerin bu 3 derse ait notlarını
        //nasıl bir değişkende saklayabilirim?
        ArrayList<Integer> matNotlari=new ArrayList<>();
        ArrayList<Integer> fizNotlari=new ArrayList<>();
        ArrayList<Integer> kimNotlari=new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        //Arraylist'in ArrayList'ini nasıl yaparım?
        ArrayList<ArrayList<Integer> >notlarListesi=new ArrayList<>();
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);

        notlarListesi.get(0); //mat notları
        int matBirNot= notlarListesi.get(0).get(0); //mat notlarının ilki demek
        System.out.println("matBirNot = " + matBirNot);

        System.out.println("notlarListesi = " + notlarListesi.get(0)); //mat notları
        System.out.println("notlarListesi = " + notlarListesi.get(1)); //fiz notları
        System.out.println("notlarListesi = " + notlarListesi.get(2)); //kim notları

        //yukardkinin yerine bir for döngüsünü nasıl kullanırız?
        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println("notlarListesi.get("+i+") = " + notlarListesi.get(i));
        }

        /* *************satır sütun yazdırma**** */
        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) { //notlar[i].length
                System.out.print(notlarListesi.get(i).get(j)+"\t"); //notlar[i][j]

            }
            System.out.println();
        }










    }
}
