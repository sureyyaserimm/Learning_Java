package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_ArrayList_Question {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye atayarak yazdırınız.

        Scanner input = new Scanner(System.in);
        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Number=");
            array[i] = input.nextInt();
        }

        System.out.println("array = " + Arrays.toString(array));

        ArrayList<Integer> odds = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                odds.add(array[i]);

        }

        System.out.println("odds = " + odds);

        //2.solution
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number");
            array[i] = input.nextInt();

            if (array[i] % 2 != 0)
                odds.add(array[i]);

        }
        //MY SOLUTION!!!!
        //ArrayList<Integer> numbers = new ArrayList<>();
        //        System.out.println(odds(numbers));
        //
        //    }
        //
        //    public static ArrayList<Integer> odds(ArrayList<Integer> numbers) {
        //        Scanner input = new Scanner(System.in);
        //        for (int i = 0; i < 6; i++) {
        //            System.out.println("Enter a number.");
        //            int writeNumber = input.nextInt();
        //            if (writeNumber % 2 == 1)
        //                numbers.add(writeNumber);
        //
        //        }
        //        return numbers;
        //    }


    }
}
