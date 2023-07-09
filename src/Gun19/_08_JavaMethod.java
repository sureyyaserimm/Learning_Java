package Gun19;

import java.util.Arrays;

public class _08_JavaMethod {
    public static void main(String[] args) {
        // mainde 20 elemanlı bir diziyi tanımlayınız, daha sonra bir fonksiyona
        // göndererek random 100 e kadar olan sayılarla dodurunuz. ve aynı fonksiyonda
        // yazdırınız.

        int [] array=new int[20];

        diziDoldurYazdir(array);
    }
public static void diziDoldurYazdir(int[] numbers)
    {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=(int)(Math.random()*100);
        }
        System.out.println("Numbers = " + Arrays.toString(numbers));
    }


}
