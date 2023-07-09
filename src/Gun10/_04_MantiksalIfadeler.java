package Gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        //Mantıksal İfadeler
        // && "ve" demektir, || "veya" demektir

        //Girilen sayı pozitif ve tekse ekrana uygun sayı girildi, değilse girilmedi yazdırınız.

        Scanner read=new Scanner(System.in);
        System.out.println("Write a number");
        int number= read.nextInt();

        if (number%2==1 && number>0)
            System.out.println("The appropriate number has been entered");

        else
            System.out.println("The appropriate number hasn't been entered");


    }
}
