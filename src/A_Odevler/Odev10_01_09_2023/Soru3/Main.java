package A_Odevler.Odev10_01_09_2023.Soru3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Iphone telefonun hafızası kaç GB olsun?64 GB-128 GB");
        String str1 = scan.nextLine();
        System.out.println("Iphone telefonun ekran ölçüsü kaç inch olsun? 5.5 inch-6.5 inch");
        String str2 = scan.nextLine();

        Apple apple1 = new Apple();
        apple1.options(str1, str2);


        System.out.println("Samsung telefonun hafızası kaç GB olsun?256 GB-512 GB");
        String str3 = scan.nextLine();
        System.out.println("Samsung telefonun ekran ölçüsü kaç inch olsun? 5.5 inch-7.5 inch");
        String str4 = scan.nextLine();

        Samsung samsung1 = new Samsung();
        samsung1.options(str3, str4);


        System.out.println("Toplam Ücret = " + Phone.getSum(Phone.cart) + "$");


    }
}
