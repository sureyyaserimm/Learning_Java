package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList_Question {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> notes = new ArrayList<>();
        int total = 0;
        String devamMi;


        do {    //notu girecek
            System.out.print("Enter the note.");
            int note = input.nextInt();
            //notları arrayliste at
            notes.add(note);
            //girilen notları topla
            total = total + note;
            //devam etmek istiyor musunuz?
            System.out.println("Would you like to continue?(Y/N)");
            devamMi = input.next();

        }
        while (devamMi.equalsIgnoreCase("Y"));

        //ortalamayı bul
        int ort = total / notes.size();
        System.out.println("ort = " + ort);

        //geçen sayısını bul
        int ortPass = 0;
        for (int i = 0; i < notes.size(); i++) {
            if (notes.get(i) > ort)
                ortPass++;
        }

        System.out.println("ortPass = " + ortPass);

    }
}
/*Scanner input = new Scanner(System.in);
        ArrayList<Integer> notes = new ArrayList<>();
        String answer;
        int total = 0;

        do {
            System.out.print("Enter the note=");
            int note = input.nextInt();
            notes.add(note);
            total = total + note;
            System.out.println("Would you like to continue?(Y/N)");
            answer = input.next();

        }
        while (answer.equalsIgnoreCase("y"));

        int average = 0;
        int averageTotal=0;
        for (int i = 0; i < notes.size(); i++) {
            average = total / notes.size();
            if (notes.get(i) > average)
                averageTotal++;
        }
        System.out.println(notes);
        System.out.println(average);
        System.out.println(averageTotal);
*/
