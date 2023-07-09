package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        //girilen iki sayıdan büyük olanının değerini ekrana yazdırınız;
        //eşit ise eşit yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz= ");
        int sayi1= oku.nextInt();
        System.out.print("İkinci sayıyı giriniz= ");
        int sayi2= oku.nextInt();

        if (sayi1>sayi2)
            System.out.println("Büyük sayı= " + sayi1);

        if (sayi1<sayi2)
            System.out.println("Büyük sayı= " + sayi2);

        if (sayi1==sayi2)
            System.out.println("sayi1 sayi2'ye eşit");



    }
}
