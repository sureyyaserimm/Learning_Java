package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Example {
    public static void main(String[] args) {
        //10 elemanlı bir diziyi random olarak doldurduktan sonra kullanıcının gireceği bir rakamı arattırınız.
        //bu rakam varsa ise indexini yazdırınız.

        int [] array=new int[10];
        for (int i = 0; i < array.length ; i++) { //10 elemanlı bir random dizi oluşturma
            array[i]=(int)(Math.random()*11);

        }
        System.out.println( Arrays.toString(array));

        Scanner input=new Scanner(System.in);
        System.out.print(" Aranacak sayı(0-10)=");
        int number= input.nextInt(); //kullanıcının gireceği rakam

        for (int i = 0; i < args.length; i++) { //bir rakamı arattırın.
            if (array[i]==number)
                System.out.println("var ve = " + i+".indexte");

        }








    }
}
