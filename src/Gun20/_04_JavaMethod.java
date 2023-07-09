package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        //Kullanıcının gireceği 2 sayının toplamını
        //bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1. number.");
        int number1 = input.nextInt();
        System.out.println("Enter 2. number.");
        int number2 = input.nextInt();

        int total = writeTotal(number1, number2);
        System.out.println("total = " + total);

    }

    public static int writeTotal(int n1, int n2) {

        return (n1 + n2);
    }


}
