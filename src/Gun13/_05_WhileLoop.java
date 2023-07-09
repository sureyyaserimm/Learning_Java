package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        //100e kadar olan sayıların toplamını bulunuz.

        Scanner read=new Scanner(System.in);
        int i=0;  // int sayac=0; sayaca i diyoruz
        int total=0;

        while (i<=100) {

            total = total + i;
            i++;
        }
        System.out.println("total = " + total);


    }
}
