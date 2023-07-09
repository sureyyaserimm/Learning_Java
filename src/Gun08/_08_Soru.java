package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        //girilen bir sayının tek sayı olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayi= oku.nextInt();
        int kalan=sayi % 2;  //bölümden kalan 1'e eşitse tektir, bu yüzden modül kullanılır
        System.out.println("tek mi? " + (kalan==1));

        //2.yöntem
        System.out.println("(tek mi?= " + (sayi%2==1));

        //3.yöntem
        System.out.println("(tek mi? " + (sayi%2 != 0));
        //negatif girilme ihtimali sebebiyle en doğru yöntem budur.

    }
}
