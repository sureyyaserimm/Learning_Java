package Gun13;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        //kullanıcı 0 değerini girene kadarki sayıların toplamını bulunuz.
        Scanner read=new Scanner(System.in);
        int number;
        int total=0;
        System.out.println("Write a number.");
        number=read.nextInt();

        while (number != 0) {
            System.out.println("Write a number.");
            number= read.nextInt();
            total=total+number;

        }
        System.out.println("total = " + total);







    }
}
