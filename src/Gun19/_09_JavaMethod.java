package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız.

        Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println(i + "number=");
            array[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(array));

        writeSmallest(array);
        writeBiggest(array);
        writeAverage(array);
    }

    public static void writeSmallest(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("smallest= " + numbers[0]);
    }

    public static void writeBiggest(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("smallest= " + numbers[numbers.length - 1]);
    }

    public static void writeAverage(int[] numbers) {
        int total = 0;
        int average;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }
        average = total / numbers.length;
        System.out.println(average);

    }
}
