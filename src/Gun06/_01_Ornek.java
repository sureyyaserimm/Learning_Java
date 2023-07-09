package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
     //kullaıcıdan cadde sokak postakodu(int) ve ülke şeklinde adres bilgisi olarak
        //yazdırınız.

        Scanner read=new Scanner(System.in);  //String okumalari icin
        Scanner read2=new Scanner(System.in); //Int okumalari icin

        System.out.print("What is your street name?= ");
        String street=read.nextLine();

        System.out.print("What is your square name?= ");
        String square=read.nextLine();

        System.out.print("What is your post code?= ");
        int postCode= read.nextInt();

        System.out.print("What is your country name?= ");
        String country=read.nextLine();

        System.out.println("Your address= " +street+" "+square+" "+postCode+" "+country);



    }
}
