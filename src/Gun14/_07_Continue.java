package Gun14;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        //Kullanıcıdan 5 sayı isteyiniz, bu sayılardan 6-10 arası hariç diğerlerini toplayınız.

        Scanner input=new Scanner(System.in);

        int total=0;
        for (int i=0; i<5; i++) {
            System.out.println("Enter a number.");
            int number=input.nextInt();

            if (number>6 && number<10)
                continue; //çalıştığı anda kendinden sonra gelen komutları pas geçirir.

            total=total+number;
            System.out.println("number = " + number);

        }

              //BREAK ve CONTINUE
        //Döngüleri etkiler
        //if şartı ile çalışır
        //Break döngüyü kırar.
        //Continue ise sadece o adımı
        //pass geçirir.döngü devam eder


    }
}
