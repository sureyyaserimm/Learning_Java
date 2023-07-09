package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //Girilen bir sayının pozitif, negatif veya 0 olduğunu yazdırınız.

        Scanner read=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int number= read.nextInt();

        if (number>0)
            System.out.println("Positive");
        else
        {if (number<0)
                System.out.println("Negative");
            else
                System.out.println("0");}




    }
}
