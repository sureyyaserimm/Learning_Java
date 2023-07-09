package Gun11;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        Scanner read=new Scanner(System.in);
        System.out.println("Otoparkta geçirilen saati yazınız.");
        int time=read.nextInt();

        if (time<=3)
            System.out.println("Total amount is $10" + " " +time + "hours");
        else
        {if (time<=5 )
            System.out.println("Total amount is $15" + " " +time + "hours");

            else
            System.out.println("Total amount is $20"+  " " +time + "hours"); }






    }
}
