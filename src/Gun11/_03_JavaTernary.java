package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        //Kullanıcıdan gireceği sayının tek mi çift mi olduğunu yazdırınız.

        Scanner read=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int number= read.nextInt();

        //1.solution
        if (number%2==0)
            System.out.println("Çift");
        else
            System.out.println("Tek");

        //2.solution
        String sonuc= (number%2==0)? "çift" : "tek"; //  ? -> if  : ->else görevi görüyor burda
        System.out.println("sonuc = " + sonuc);

        //3.solution
        System.out.println( ( (number%2==0) ? "çift" : "tek") );




    }
}
