package A_Odevler;

import java.util.Scanner;

public class Odev04_11_24_Ozel_Sorular {
    public static void main(String[] args) {
        //7- Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.

        Scanner input7=new Scanner(System.in);
        System.out.print("Write a 3 digit number.");
        int number7= input7.nextInt();

        int hundreds=(number7/100)%10;
        int tens=((number7-hundreds)/10)%10;
        int ones=number7%10;

        System.out.println("hundreds = " + hundreds);
        System.out.println("tens = " + tens);
        System.out.println("ones = " + ones);

        //8- Girilen bir sayının kaç basamak olduğunu bulunuz.

        Scanner input8 = new Scanner(System.in);
        System.out.print("Enter a number.");
        int number8 = input8.nextInt();
        int i8 = 0;
        while (number8 > 0){
            number8 /= 10;
            i8++;
        }
        System.out.println("This number is " + i8 + " "+"digit");



        //9- Girilen bir sayının tersi olan sayıyı bulunuz yani 124 girildi ise 421 olan sayı elde edilecek.

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();
        int tersi=0;


        while (sayi > 0) {
            tersi *= 10;
            tersi += sayi % 10;
            sayi /= 10;
        }
        System.out.println("tersi = " + tersi);


        //10- Girilen bir sayının tersi ile aynı olup olmadığını bulunuz. yani simetrik sayı mı?








    }
}
