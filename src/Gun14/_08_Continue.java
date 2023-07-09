package Gun14;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.

        Scanner input=new Scanner(System.in);
        System.out.println("write a word.");
        String word=input.nextLine();
        //1.solution   burda boşluklarla birlikte yazar
        for(int i=0; i<word.length();i++)
        {
            System.out.println(word.charAt(i));

        }
        //2.solution    burda ise boşluk görünce continue ile devam eder yani boşlukları yazmadan ilerler.
        for(int i=0; i<word.length();i++) {
            if (word.charAt(i) == ' ')
                continue;
            System.out.println(word.charAt(i));
        }


    }
}
