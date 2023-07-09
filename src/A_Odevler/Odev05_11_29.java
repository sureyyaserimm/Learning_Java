package A_Odevler;

import java.util.Scanner;

public class Odev05_11_29 {
    public static void main(String[] args) {

        //1- 0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız. _Not: 0 ve 100 dahildir._
        for (int i = 0; i <=100 ; i+=2) {
                    System.out.println("i = " + i);
                }
        //2- 0 ile 100 arasındaki bütün tek sayıları yazdırabileceğiniz bir kod yazınız.
        for (int i = 1; i <=100 ; i+=2) {
            System.out.println("i = " + i);
        }
        //3- # 100'den 0'a kadar bütün tek sayıları yazdırınız.
        for (int i =99; i > 0 ; i-=2) {
            System.out.println("i = " + i);
        }
        //4- #  İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.
        int total=0;
        for (int i =1; i <= 10 ; i++) {
            total=total+i;
        }
        System.out.println("total = " + total);

        //5-**0 ile 100** arasındaki sayıları kapsayan bir kod yazınız.
        //Bu kod bu sayıların tek mi çift mi olduğunu belirleyebilecek bir kod olmalı.
        //Eğer sayı çift sayıysa;
        //**This number is even and number is 0**
        //Eğer sayı tek sayıysa;
        //**This number is odd and number is 1**
        //yazdırmalıdır.
        //`Sonuç böyle olmalıdır.`

        //This number is even and number is 0
        //This number is odd and number is 1
        //This number is even and number is 2
        //This number is odd and number is 3

        for (int i = 0; i <= 100; i++) {
            if (i%2==0)
                System.out.println("This number is even and number is " + i);
            else
                System.out.println("This number is odd and number is " + i);
        }

        //6-# 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.
        //`Sonuç bu şekilde olmalıdır.`
        //0
        //20
        //40
        //60
        //80
        //100

        for (int i = 0; i <= 100; i++) {
            if (i%4==0 && i%5==0)
                System.out.println("i = " + i);

        }

        //7-Uzunluk ve genişliğini yazan kişinin belirlediği # bütünü oluşturabileceğiniz bir kod yazınız.
        //_örn:
        //_length(uzunluk): 7_
        //_width(genişlik): 5_
        //_Output:_
        //#####
        //#####
        //#####
        //#####
        //#####
        //#####
        //#####
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a length.");
        int length= input.nextInt();
        System.out.println("Enter a width.");
        int width= input.nextInt();

        for (int i = 1; i <=length; i++) {
            for (int j = 1; j <=width ; j++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }

        //8-_Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız._
        //Sonuç böyle olmalıdır.
        //
        //        *
        //      * *
        //    * * *
        //  * * * *
        //* * * * *

        int i,j,k;
        for ( i = 1; i <=5 ; i++) {
            System.out.print(" ");
            for ( j = 0; j <5-i; j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            for ( k = 5; k > j ; k--)
            {   System.out.print(" ");
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //9-_Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız._
        //
        //Sonuç böyle olmalıdır;
        //
        //       *
        //      * *
        //     * * *
        //    * * * *
        //   * * * * *
        int i2,j2,k2;
        for ( i2 = 1; i2 <=5 ; i2++) {
            for ( j2 = 5; j2 > i2; j2--) {
                System.out.print(" ");
            }
            for ( k2 = 0; k2 <j2 ; k2++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        //10- do while loop kullanınız.
        // 0 ile 30 arasındaki bütün çift sayıları yazdırınız.

        int i3=0;
        do {
            if (i3%2==0)
                System.out.println("i = " + i);
            i3++;
        }
        while (i3<=30);


    }
}
