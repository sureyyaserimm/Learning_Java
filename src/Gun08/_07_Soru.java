package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        //kullanıcının gireceğii 2 sayının birbirine eşit olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz ");
        int sayi1=oku.nextInt();
        System.out.println("sayi1 = " + sayi1);

        System.out.println("İkinci sayıyı giriniz ");
        int sayi2=oku.nextInt();
        System.out.println("sayi2 = " + sayi2);

        System.out.println("sayi1==sayi2 = " + (sayi1==sayi2));

        //2.Yöntem
        boolean esitMi=(sayi1==sayi2);
        System.out.println("esitMi = " + esitMi);




    }
}
