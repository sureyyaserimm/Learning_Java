package Gun10;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner read=new Scanner(System.in);
        System.out.println("Write a number");
        int number= read.nextInt();


        if (number%2!=0)
          System.out.println("This number is odd!");

        else
        {System.out.println("This number is even!"); }





    }
}
