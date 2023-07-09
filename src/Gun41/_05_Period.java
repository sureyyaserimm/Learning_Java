package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _05_Period {
    public static void main(String[] args) {
        //Period 2 tarih arasındaki farkı gösterir.
        //LocalDate'ler için kullanılır.

        LocalDate birthday = LocalDate.of(1997, 12, 23);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthday, today);
        System.out.println("age = " + age);

        System.out.println("age.getYears() = " + age.getYears());
        System.out.println("age.getMonths() = " + age.getMonths());
        System.out.println("age.getDays() = " + age.getDays());

        System.out.println("You are " + age.getYears() + " years old.");

        /************************************************/

        Period period3Days = Period.ofDays(3);
        Period period3Months = Period.ofMonths(3);

        System.out.println("period3Months = " + period3Months);
        System.out.println("period3Days = " + period3Days);

        LocalDate threeDaysLater = today.plus(period3Days);
        System.out.println("threeDaysLater = " + threeDaysLater);

        LocalDate threeMonthsLater=threeDaysLater.plusMonths(3);
        System.out.println("threeMonthsLater = " + threeMonthsLater);
        /***************************************************/

        //Kursun bitiş tarihini bulunuz.
        LocalDate kursBaslangic=LocalDate.of(2022,10,31);
        Period kursSure=Period.ofMonths(6);
        LocalDate kursBitis=kursBaslangic.plus(kursSure);

        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());


        Period neKadarSureKaldi=Period.between(today,kursBitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);

        //Kurs ne kadar süredir devam ediyor?
        Period suAnaKAdarDevamSuresi=Period.between(kursBaslangic,today);
        System.out.println("suAnaKAdarDevamSuresi = " + suAnaKAdarDevamSuresi);



    }
}
