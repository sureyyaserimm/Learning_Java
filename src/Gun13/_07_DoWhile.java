package Gun13;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        //kullanıcı 0 değerini girene kadarki sayıların toplamını bulunuz.
        Scanner read=new Scanner(System.in);
        int number;
        int total=0;

        do { //döngü arası şart başta olmadığından en az bir kere çalışır
            //kontrol sonda
            System.out.println("Write a number.");
            number= read.nextInt();
            total=total+number;
        }while (number!=0);

        System.out.println("total = " + total);





    }
}
