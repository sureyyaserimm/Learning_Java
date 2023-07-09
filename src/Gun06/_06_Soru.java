package Gun06;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadı "Sureya Serim"  S.S.  şeklinde yazdırınız.


        Scanner oku=new Scanner(System.in);
        System.out.println("Ad Soyad ");
        String adSoyad= oku.nextLine();

        //Sureya Serim -> S.S. ->S. ->charAt(0)
        //indexof(" ") ->boşluğun indexini veriyor, +1soyadın ilk harfi olur.
        //boşluktan sonraki ilk harf soyadın ilk harfidir.
        char ilkHarf=adSoyad.charAt(0); //S.
        int boslukIndex=adSoyad.indexOf(" ");
        char soyadIlkHarf=adSoyad.charAt(boslukIndex+1); //S.

        System.out.println(ilkHarf+"."+soyadIlkHarf+".");

        //char soyadIlkHarf=adSoyad.charAt(adSoyad.indexOf(" ")+1);








    }
}
