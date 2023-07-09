package Gun24;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_JavaMap {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        Map<String, String> sozluk = new TreeMap<>();
        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        int secim = 0;

        do {
            //menü çıkacak (1-Ekleme, 2-Düzeltme, 3-Listeleme, 4-Arama)
            System.out.print("MENÜ\n1- EKLEME\n2- Düzeltme\n3- Listeleme\n4- Arama\n5- Silme\n6- Çıkış\nSeçiminiz=");
            //seçim alınacak
            secim = okuInt.nextInt();

            //seçime göre işlem yapılacak
            switch (secim) {
                case 1: //1 i seçti ise ekleme işlemini yap
                    //kelimeyi giriniz
                    System.out.print("Kelime giriniz=");
                    String kelime = okuStr.nextLine();
                    // manasını giriniz
                    System.out.print("Manasını yazınız=");
                    String manasi = okuStr.nextLine();
                    // buna uygun değişkene ekle
                    sozluk.put(kelime, manasi);
                    break;
                case 2: //2 yi seçti ise düzeltme işlemini yap
                    System.out.println("düzeltme seçildi");
                    System.out.println("Düzeltmek istediğiniz kelimeyi giriniz.");
                    String kelime2 = okuStr.nextLine();
                    System.out.println("Kelimenin düzeltilmiş manasını giriniz.");
                    String duzelt = okuStr.nextLine();
                    sozluk.put(kelime2, duzelt);
                    break;

                case 3: //3ü seçerse Listeleme yapacak.

            }

        } while (secim != 6); //çıkış olmadığı sürece devam et

        // TODO : geri kalan menu işlemleri yapılacak
        // TODO :  2.Aşama menulerde yapılacak işlemleri METOD ile yapınız.


    }
    public static void listeleme (String kelime, String manasi) {
        TreeMap<String, String> listeleme = new TreeMap<>();
        System.out.println("kelimeler = " + listeleme.put(kelime, manasi));
            }
}

/*       TreeMap<String, String> sozluk = new TreeMap<>();
        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        String secim;

        do {
            do {
                System.out.print("Aşağıdaki menüden bir numara seçiniz\n");
                System.out.print("1- Ekleme\n" +
                                 "2- Düzeltme \n" +
                                 "3- Listeleme\n" +
                                 "4- Arama\n" +
                                 "5- Silme\n" +
                                 "6- Çıkış\n" +
                                 "Seçiminiz : ");

                secim = okuInt.next();
                if (secim.charAt(0) < 48 || secim.charAt(0) > 55)
                    System.out.println("Hatalı giriş...");
            }while (secim.charAt(0)<48||secim.charAt(0)>55);

            switch (secim) {
                case "1":
                    kelimeGir(sozluk);
                    break;
                case "2":
                    kelimeDuzelt(sozluk);
                    break;
                case "3":
                    listele(sozluk);
                    break;
                case "4":
                    arama(sozluk);
                    break;
                case "5":
                    silme(sozluk);
            }
        } while (!secim.equals("6"));
    }
    public static TreeMap kelimeGir(TreeMap s1) // Sözlüğe Kelime giriş methodu
    {
        Scanner okuStr = new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String klm = okuStr.nextLine();
        System.out.print("Anlamını giriniz: ");
        String anlam = okuStr.nextLine();
        s1.put(basHarfBuyuk(klm), basHarfBuyuk(anlam));

     return s1;
    }
    public static TreeMap kelimeDuzelt(TreeMap s2) // Sözlükte Kelime düzeltme methodu
    {
        Scanner okuStr = new Scanner(System.in);
        System.out.print("Düzeltmek istediğiniz kelimeyi yazın : ");
        String duzeltilecek = okuStr.nextLine();
        System.out.println(duzeltilecek + " " + s2.get(duzeltilecek));
        System.out.print("Bunun yerine gireceginiz kelimeyi giriniz : ");
        String yeniKlm = okuStr.nextLine();
        System.out.print("Anlamını giriniz : ");
        String yeniAnlam = okuStr.nextLine();
        s2.remove(duzeltilecek);
        s2.put(basHarfBuyuk(yeniKlm), basHarfBuyuk(yeniAnlam));
        System.out.print("Düzelttiğiniz kelime başarıyla kaydedildi.\n");
        return s2;
    }
    public static void listele(TreeMap<String,String> s3) // Sözlüğü listeleme Methodu
    {
        for (Map.Entry<String, String> kv : s3.entrySet()) {
            System.out.println(kv.getKey() + " \t= " + kv.getValue());
        }
    }
    public static void arama(TreeMap<String,String> s4) // Sözlükte kelime arama methodu
    {
        Scanner okuStr = new Scanner(System.in);
        System.out.print("Aradığınız kelimeyi giriniz :");
        String arama = okuStr.nextLine();
        arama = basHarfBuyuk(arama);
        for (Map.Entry<String, String> a : s4.entrySet()) {
            if (s4.containsKey(arama))
                System.out.println(a.getKey() + " \t= " + a.getValue());
        }
    }
    public static TreeMap silme(TreeMap s5) // Sözlükten kelime silme methodu
    {
        Scanner okuStr = new Scanner(System.in);
        System.out.print("Silmek istediğiniz kelimeyi giriniz :");
        String sil = okuStr.nextLine();
        System.out.println(s5.get(basHarfBuyuk(sil)) + "\nBu kayıt silindi.");
        s5.remove(basHarfBuyuk(sil));
        return s5;
    }
    public static String basHarfBuyuk(String gelenCumle) //Sözlüğe girilecek kelime ve anlamlarının düzenlenmesi methodu
    {
        String[] kelimeler = gelenCumle.split(" ");
        for (int i = 0; i < kelimeler.length; i++) {
            kelimeler[i]=kelimeler[i].toLowerCase();
            kelimeler[i] = kelimeler[i].toUpperCase().charAt(0) + kelimeler[i].substring(1);
        }
        String donenCumle = "";
        for (int j = 0; j < kelimeler.length; j++)
        {
            donenCumle = donenCumle + kelimeler[j] + " ";
        }
        donenCumle = donenCumle.trim();
        return donenCumle;
    }
}

*/