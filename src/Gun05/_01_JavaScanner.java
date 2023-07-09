package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {

        //tipi     adı     ilk degeri      işlem tamam  bu adımı çalıştır
        int        sayi     =0                   ;

        Scanner okuyucu = new Scanner(System.in);
      //tipi      adi     yeni okuyucu(klavyeden-konsoldan)

        System.out.print("Sayi giriniz=");
        sayi = okuyucu.nextInt(); //kursor bekliyor sayı girişi için
        //rakam girilip entera tıklayıncca değeri alıp sayıya atıyor.

        System.out.print("sayi = " + sayi);
    }
}
