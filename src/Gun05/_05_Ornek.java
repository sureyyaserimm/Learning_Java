package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız 2 tam sayının toplamını yazınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("Ilk sayıyı giriniz= ");
        int sayi1=oku.nextInt();

        System.out.println("2.sayiyi giriniz= ");
        int sayi2= oku.nextInt();

        int Toplam=sayi1+sayi2;

        System.out.println("Toplam = " + Toplam);
    }
}
