package Gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        //şu ana kadar,sayilari birbirine çevirdik
        //yazıların rakamlara çevrilmesi, rakamların yazıya çevrilmesi var.

        String ad="Sureya";
        String kelimeSayi="65"; //String halde, toplama gibibir işleme giremez.
        int sayiDeger= Integer.parseInt(kelimeSayi); //sayiya donusur.

        int toplam=sayiDeger+sayiDeger;
        System.out.println("toplam = " + toplam);
         // toplam su anda int yani sayi, bunu String nasıl donusturur
        String strToplam= Integer.toString(toplam); //Stringe donusturur;
        System.out.println("strToplam = " + strToplam);

        //stringe çevirmenin ddiğer yolları
        String a=String.valueOf(toplam);

        a=""+toplam;

        System.out.println(25+30); //sonucu int verir, toplama yapar.
        System.out.println(""+25+30); // sonucu stringdir, 2530 şeklinde yazar

        String b=Boolean.toString(true);
        b=""+true; //true yu yazı olarak yazar.



    }
}
