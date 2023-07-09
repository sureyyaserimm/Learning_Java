package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        //Kullanıcıdan Adını ve soyadını alarak ekrana yazdırınız.

        Scanner okuyucu=new Scanner(System.in); //okuma işlemini yapacak olan degisken tanımlandı.
        System.out.print("Adinizi ve soyadinizi giriniz=");//ekrana neyin girilecegini yazdık bilgilendirme
        String adSoyad= okuyucu.nextLine(); //okuma islemi bu noktada yapılıyor
        System.out.println("adSoyad = " + adSoyad); //verinin gercekten okunabildigini tekrar
        // ekrana yazdırarak kontrol ettim


        
        
        
    }
}
