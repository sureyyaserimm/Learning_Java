package Gun13;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {
        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner read=new Scanner(System.in);
        String letter="";

        do {
            System.out.println("Write a letter.");
            letter= read.nextLine();
            if (!letter.equalsIgnoreCase("x"))
                System.out.println("Program is working.");

        }while (!letter.equalsIgnoreCase("x"));
        System.out.println("Program is done!");


    }
}
