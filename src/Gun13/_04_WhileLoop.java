package Gun13;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        //girilen 20 sayıdan sadece pozitif olanları toplayınız.

        Scanner read=new Scanner(System.in);
        int sayac=0;
        int total=0;

        while (sayac<20)
        {
            System.out.println("Bir sayı giriniz.");
            int number=read.nextInt();
            if (number>0)
                total=total+number;
                    sayac++;

        }
        System.out.println("Total = " + total);





    }
}
