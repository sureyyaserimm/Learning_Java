package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.

        Scanner read=new Scanner(System.in);
        System.out.println("Write a sentence");
        String sentence=read.nextLine();
        int length=sentence.length();
        String sentence2=sentence.toLowerCase();

        if (sentence2.contains("study") && length>10)
            System.out.println("Yes!");
        else
            System.out.println("No!");




    }
}
