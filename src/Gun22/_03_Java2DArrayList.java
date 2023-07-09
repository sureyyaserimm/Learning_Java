package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Java2DArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> matNotlari = new ArrayList<>();
        ArrayList<Integer> fizNotlari = new ArrayList<>();
        ArrayList<Integer> kimNotlari = new ArrayList<>();

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
        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);

        // Soru 1:
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 40 50 60
        // Fizik : 30 40
        // Kimya : 70 80 90 100
        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        for (int i = 0; i < notlarListesi.size(); i++) {

            System.out.print(dersler.get(i) + " : ");

            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.print(notlarListesi.get(i).get(i) + "\t");

            }
            System.out.println();
        }

        // Soru 2 :
        // Kullanıcıdan istediği bir dersin  nosunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istedği derse ait notları bir metodda yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.println("Ders No (0-Mat, 1-Fiz, 2-Kim)= ");
        int dersNo = oku.nextInt();

        dersNotlariniYazdir(notlarListesi, dersNo);
        dersOrtVeGecenMikBul(notlarListesi,dersNo);
    }

    public static void dersNotlariniYazdir(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo) {

        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {

            System.out.print(notlarListesi.get(dersNo).get(i) + "\t");
        }
        System.out.println();
    }
    // Soru 3 :
    // Yukarıda verilen derse ait not otlamasını ve geçen sayısını bir metodda yazdırınız.

    public static void dersOrtVeGecenMikBul(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo) {
        int toplam = 0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            toplam+=notlarListesi.get(dersNo).get(i);

        }
        int ort=toplam/notlarListesi.get(dersNo).size();
        int gecenMik=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            if (notlarListesi.get(dersNo).get(i)>=ort)
                gecenMik++;

        }

        System.out.println("ort = " + ort);
        System.out.println("gecenMik = " + gecenMik);

    }

}
