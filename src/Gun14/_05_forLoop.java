package Gun14;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        //Girilen bir sayıya kadar olan sayıların çarpımını giriniz.
        //2.bölüm:çarpımın değeri 10000 geçtiğinde işlem sonlansın.


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        int number = input.nextInt();
        int total = 1; //eğer büyük sayı gireceksen long, o da olmazsa double kullan!


        for (int i = 1; i <= number; i++) //i'yi 0dan başlatırsan sonuç hep 0 çıkar!!
        { total = total * i;


        if (total >= 10000) {
            System.out.println("Total is bigger than 10.000!");
            break;
        }
    }
        System.out.println("total = " + total);




    }
}
