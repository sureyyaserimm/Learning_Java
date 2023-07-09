package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _09_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        //Kullanıcıdan alınan ve string durumundaki time veya tarih
        //bilgisinin time veya tarih bilgisine çevrilmesi

        long startTime=System.currentTimeMillis(); //kodun performansı

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a time(25 01 2023)=");
        String strDate= input.nextLine();

        //Kullanıcının gireceği formata göre format oluşturduk.
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd MM yyyy");

        //Stringin formatı formata uygun olmalı, .parse ile çevirdik
        LocalDate date=LocalDate.parse(strDate,formatter);

        System.out.println("date.format(formatter) = " + date.format(formatter));

        long finishTime=System.currentTimeMillis();
        System.out.println("gecen süre = " + (finishTime-startTime)+ "ms");
















    }
}
