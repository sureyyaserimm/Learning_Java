package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        //Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        //toplama için T, çıkarma için Ç, çarpma için P, bölme için B
        //harflerini aiarak isteğe uygun olan işlemi yaptırıp sonucu yazdırınız.

        Scanner read=new Scanner(System.in);
        System.out.println("1 sayı giriniz");
        int number1= read.nextInt();
        System.out.println("2.sayıyı giriniz");
        int number2= read.nextInt();


        System.out.println("Toplama icin T");
        System.out.println("Çıkarma icin Ç");
        System.out.println("Çarpma icin P");
        System.out.println("Bölme icin B");
        System.out.println("Hangi işlemi yapmak istersiniz?");
        Scanner read2=new Scanner(System.in);
        String islem=read2.nextLine();

        int T=(number1+number2);
        int C=(number1-number2);
        int P=(number1*number2);
        int B=(number1/number2);

        //merdivenli if, ladder if
         if (islem.equalsIgnoreCase("T"))
            System.out.println("Toplam = " + T);
        else
            if (islem.equalsIgnoreCase("Ç"))
                System.out.println("Farkı = " + C);
            else
                if(islem.equalsIgnoreCase("P"))
                    System.out.println("Çarpımı = " + P);
                else
                    if(islem.equalsIgnoreCase("B"))
                     System.out.println("Bölümü= " + B);
                    else
                        System.out.println("Lütfen uygun bir harf giriniz!");







    }
}
