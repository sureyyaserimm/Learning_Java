package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //        olduğunu Ternary operatör ile yazdırınız.

        Scanner read=new Scanner(System.in);
        System.out.println("Write a number.");
        int number= read.nextInt();

        System.out.println( ( (number>0) ? "Positive" : (number<0) ? "Negative" : "Zero" ));

        //pozitif olup olmadığını, pozitifse çift olup olmadığını yazdırınız.
        System.out.println( number>0 ? (number%2==0 ? "çift": "tek") : "Negative" );

    }
}
