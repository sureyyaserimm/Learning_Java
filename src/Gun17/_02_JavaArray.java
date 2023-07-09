package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        //for döngüsüyle yapalım
        // Bugun hava cok guzel -> 4

        Scanner input=new Scanner(System.in);
        System.out.println("Write a sentence.");
        String sentence= input.nextLine();

        int blank=0;
        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i)==' ')
                blank++;

        }
        System.out.println("Number of words = " + (blank+1));







    }
}
