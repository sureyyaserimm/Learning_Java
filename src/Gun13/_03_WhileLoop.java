package Gun13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        //girilen 20 sayının toplamının sonucunu yazınız.

        Scanner read=new Scanner(System.in);
        int sayac=0;
        int total=0;

                while (sayac<20)
                {
                    System.out.println(sayac+ "Bir sayı yazınız.");
                    int number= read.nextInt();
                    total=total+number;
                    sayac++;

                }

        System.out.println("Total=" +total);







    }
}
