package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        //Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini ekrana yazdırınız.
        // Ternary operatör ile yapınız.

        Scanner read=new Scanner(System.in);
        System.out.println("Write a number.");
        int number= read.nextInt();

        //1.solution
        int result=(number>50) ? 1 : 0;
        System.out.println("result = " + result);

        //2.solution
        System.out.println( ( (number>=50) ? 1 : 0) );





    }
}
