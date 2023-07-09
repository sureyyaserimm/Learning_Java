package Gun16;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.
        // TODO : gunun sorusu : bir döngü ile 5 tane buldurunuz
        // fakat bir bulduğunu tekrar bulmasın.


        String[] tv={"trt","atv","kanald","fox","haberturk"}; //01234

        int rndword=(int) (Math.random()* tv.length);  //5e kadar 5 dahil değil

        System.out.println("tv = " + tv[rndword]);



        for (int i = 0; i < tv.length; i++) {
            if(tv[i].equals(tv[rndword]))
            System.out.println(tv[rndword]);
        }


    }
}
