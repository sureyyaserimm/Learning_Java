package Gun20;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        //kullanıcının gireceği bir sayıya kadarki sayıların çarpımını bir fonksiyonda buldurup
        // bunun sonucunu mainde tek mi çift mi olduğunu yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        int number = input.nextInt();
        int carpim = faktoriyel(number);
        System.out.println("carpim = " + carpim);

        if (carpim%2==0)
            System.out.println("odd");
        else
            System.out.println("even");

    }

    public static int faktoriyel(int number)
    {
    int carpim = 1;
        for(int i = 1;i<=number;i++)
    {
        carpim = i * carpim;
    }
        return carpim;
}


 }