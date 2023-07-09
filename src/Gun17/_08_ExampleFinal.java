package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _08_ExampleFinal {
    public static void main(String[] args) {
        //10 elemanlı bir diziyi random olarak doldurduktan sonra kullanıcının gireceği bir rakamı arattırınız.
        //bu rakam varsa ise indexini , yoksa bulunamadı yazdırınız.

        int [] array=new int[10];
        for (int i = 0; i < array.length ; i++) { //10 elemanlı bir random dizi oluşturma
            array[i]=(int)(Math.random()*11);

        }
        System.out.println( Arrays.toString(array));

        Scanner input=new Scanner(System.in);
        System.out.print(" Aranacak sayı(0-10)=");
        int number= input.nextInt(); //kullanıcının gireceği rakam

        boolean found=false;
        int sayac=0;
        for (int i = 0; i < array.length; i++) { //bir rakamı arattırın.
            if (array[i]==number)
            {
                found=true;
                sayac++;
                System.out.println("var, index= " + i);
            }
        }
         if (!found) {
             System.out.println("Didn't find!");
         }
        System.out.println("total = " + sayac);









    }
}
