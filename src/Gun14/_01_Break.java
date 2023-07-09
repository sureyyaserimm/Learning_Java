package Gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        //girilen bir sayının, 2 sayının çarpımına eşit olup olmadığını bulunuz.
        //4 girince 2*2
        //5 girince tam kare değil
        //9 girince 3*3


        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number.");
        int number= input.nextInt();

        int i=0;        //9 girdim
        while (i<number)
        {
            if (i*i==number)  //0*0==9 1*1==9 2*2==9 3*3==9
            {
                System.out.println("This number is tam karedir.");
                break;      //çalıitığında döngüden çıkar, fazladan sayı bakmamak içn
            }
            i++;

        }
        if (i*i==number);




        /* public static void main(String[] args) {
        // girilen bir sayının, 2 aynı sayının carpımına
        // eşit olup olmadığını bulunuz.

        // 4 girdim -> 2*2 bu tam karedir.
        // 5 girdim -> değildir.
        // 9 girdim -> 3*3

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi=oku.nextInt();

        // 5 girildi  , 5 kadar sayıları 1,2,3,4
        // 9 girildi  , 9 kadar sayıları 1,2,3,4,5,6,7,8

        int sayac=0;   // 9 girdim
        boolean tamKare=false;
        while(sayac < sayi)
        {
            System.out.println("sayac = " + sayac);

            if (sayac*sayac==sayi) // 0*0==9, 1*1==9, 2*2==9, 3*3==9
            {
                tamKare=true;
                System.out.print("tam karedir");
                break; // çalıştığında döngüden çıkar
            }

            sayac++;
        }

        if (tamKare == false)
          System.out.println("tam kare değildir");

    }  */

    }
}
