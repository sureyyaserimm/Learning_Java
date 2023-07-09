package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        //Kullanıcının 2 kez gireceği şifresinin AYNI veya DEĞİL şeklinde cevaplayınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Şifrenizi giriniz=");
        String kulSifre1= oku.next();

        System.out.print("Şifrenizi doğrulayınız=");
        String kulSifre2= oku.next();

        boolean esitMi=kulSifre1.equals(kulSifre2); //bunu yazmazsak da olur

        if (kulSifre1.equals(kulSifre2))
            System.out.println("AYNI");

        if (!kulSifre1.equals(kulSifre2))
            System.out.println("AYNI DEĞİL");

    }
}
