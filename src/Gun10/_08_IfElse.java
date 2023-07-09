package Gun10;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123

        Scanner read=new Scanner(System.in);
        System.out.println("Aralarında boşluk bırakarak 3 sayı giriniz");
        String numbers=read.nextLine();

        int blankIndex1=numbers.indexOf(" ");
        int blankIndex2=numbers.lastIndexOf(" ");
        // int blankIndex2=numbers.indexOf(" ",blankIndex1);  //2.boşluğu aramaya verilen yerden sonra başlar.

        int number1=Integer.parseInt(numbers.substring(0,blankIndex1));
        int number2=Integer.parseInt(numbers.substring(blankIndex1+1,blankIndex2));
        int number3=Integer.parseInt(numbers.substring(blankIndex2+1));

        if ((number1+number2+number3)%2==0)
        {System.out.println("Toplam çift");}
        else
        {System.out.println("Toplam tek");}









    }
}
