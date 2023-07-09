package Gun19;

import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {

        oddOrEven(55);
        oddOrEven(60);

        oddOrEvenRead();
    }

    public static void oddOrEven(int number) {
        if (number % 2 == 0)
            System.out.println("odd");
        else
            System.out.println("even");
    }

    public static void oddOrEvenRead() { //sayıyı dışardan alıp sayının tek ya da çift olduğunu öğrenmek için
        //aşağıdaki oddoreven yerine yukarda yazdığımız işlemi de yazmalıyız. eğer önceden böyle bir komut girdiysek
        //tekrar yazmamıza gerek kalmaz. metodları birbiri içinde kullanabiliriz, gerekli yerlerde.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        int number = input.nextInt();

        oddOrEven(number);
    }

}
