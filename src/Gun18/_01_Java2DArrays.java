package Gun18;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        int sayi=0; //1 tane sayı
        int []dizi=new int[100]; //100 sayı

        int [] ders1Notlari=new int[50]; //50 kişilik sınıfın 1.ders notları
        int [] ders2Notlari=new int[50]; //50 kişilik sınıfın 2.ders notları
        int [] ders3Notlari=new int[50]; //50 kişilik sınıfın 3.ders notları  0-49 arası index ddeğişiyor

        int [] [] tumDersNotlari=new int[3][50];    //3 tane ders 50 tane öğrenci, 150 tane sayı
                                                    //3satır 50 sütun
                                                    //her satır 50 sayı,50 sütun
                                                    //0.satır,1.satır,2.satır....
                                                    //satir=0,1,2 sütun:0,1,2,....,49

        ders1Notlari[0]=80; //tek boyutlu dizinin ilk(0) elemanına 80 değerini atadım
        tumDersNotlari[0][0]=80; //2boyutlu dizide 0.satırın 0.sütununa 80 değeri atandı

        System.out.println("tumDersNotlari[0][0] = " + tumDersNotlari[0][0]);
        Scanner input=new Scanner(System.in);
        tumDersNotlari[0][0]=input.nextInt();







    }
}
