package Gun15;

import java.util.Scanner;

public class _00_deneme {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Write a contry name.");
        String country= input.nextLine();
        String str="";

        for (int i = country.length()-1; i >=0 ; i--) {
            str=country.substring(i);
            System.out.println("str = " + str);

        }




    }
        }
