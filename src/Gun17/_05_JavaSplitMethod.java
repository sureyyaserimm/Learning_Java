package Gun17;

import java.util.Scanner;

public class _05_JavaSplitMethod {
    public static void main(String[] args) {

        //Split:bir Stringi parçalara ayırmaya yarar.

        //kullanıcıdan alacağınız bir cümleri kelimelerine göre alt alta yazdırınız.

        Scanner input=new Scanner(System.in);
        System.out.println("Write a sentence.");
        String sentence=input.nextLine();

        String[] words=sentence.split(" ");

        for (int i = 0; i < sentence.length(); i++) {
            System.out.println("words = " + words[i]);

        }

    }
}
