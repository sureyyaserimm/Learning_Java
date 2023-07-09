package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        //// Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        //ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        //bütünlemeye kaldınız şeklinde yazdırınız.


        Scanner read=new Scanner(System.in);
        System.out.println("Write your first note");
        int firstNote= read.nextInt();
        System.out.println("Write your second note");
        int secondNote= read.nextInt();

        double ort=(firstNote+secondNote)/2;
        if (ort>=60)
        { System.out.println("You passed!");
          System.out.println("Congratulations!"); }

        else

        {System.out.println("You failed!Try your chance at make-up exam!");}

        // süslü parantez kuralı: sadece bir satır(;) çalışacak ise zorunlu değil,birden fazla ise zorunlu.
        // her zaman koyulabilir, bir mahsuru yoktur.





    }
}
