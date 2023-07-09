package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //Girilen bir öğrencinin notuna göre 50den büyük ve eşitse geçtiniz, değilse kaldınız yazdırınız.

        Scanner read=new Scanner(System.in);
        System.out.println("Write the student's point");
        int studentPoint= read.nextInt();

        //.1.solution
        if (studentPoint>=50)
            System.out.println("You passed!");
        {System.out.println("Congratulations");}

        if (studentPoint<50);
        System.out.println("You failed!");

        //2.solution

        if (studentPoint>=50)
        {   System.out.println("You passed!");
            System.out.println("Congratulations"); }

        else
        {System.out.println("You failed!"); }




    }
}
