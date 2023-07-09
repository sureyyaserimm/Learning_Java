package Gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // 50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırınız.

        int [] note=new int[50];
        Scanner input=new Scanner(System.in);
        int total=0;

        for (int i=0; i<note.length;i++) {
            System.out.print("Enter the note.");
            note[i] = input.nextInt();
            total = total + note[i];
        }
        int ort = total/ note.length;

        int ortTop=0;

        for (int i=0; i<note.length; i++)
        {
            if (note[i] > ort)
            {
                System.out.println("note=" + note[i]);
                ortTop++;
            }
        }
        System.out.println("ort = " + ort);
        System.out.println("ortTop = " + ortTop);

    }
}
