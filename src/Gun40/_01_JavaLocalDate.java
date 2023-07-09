package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        //LocalDate sadece gün ay yıl bilgisini tutar.

        LocalDate date=LocalDate.now();

        System.out.println("date = " + date);
        System.out.println("date.getYear() = " + date.getYear());
        System.out.println("date.getMonth() = " + date.getMonth());
        System.out.println("date.getMonthValue() = " + date.getMonthValue());
        System.out.println("date.getDayOfMonth() = " + date.getDayOfMonth());
        System.out.println("date.getDayOfWeek() = " + date.getDayOfWeek());
        System.out.println("date.getDayOfWeek().getValue() = " + date.getDayOfWeek().getValue());
        System.out.println("date.getDayOfYear() = " + date.getDayOfYear());

        //kendisindeki hazır formatlara bakalım
        System.out.println("ISO_DATE = " + date.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT = " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG = " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL = " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("\n**********************");
        //Localde aldığm tarihi istediğim ülkenin formatına göre diline göre nasıl gösteririm.
        //örneğin localdeki saati almanyaya göre nasıl gösteririz.

        System.out.println("Full almanya gösterimi = " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));

        //lokalizasyon tanımlaması
        //en-US : American İngilizcesi    ilki dil ikincisi ülkeyi temsil eder.
        //en-UK : ingilitere ingilizcesi
        //fr-CA : canada fransızcası
        //en-CA
        //tr-TR

        Locale [] kullanilabilirLokaller=Locale.getAvailableLocales();

        for (Locale l:kullanilabilirLokaller){

            if (l.getDisplayCountry().toLowerCase().contains("chi")){ //if olmadan aşağıdakileri çalıştırırsan dünyadaki çoğu dil ve ülkeyi bulabilirsin.
                System.out.print("Dil = " + l.getDisplayLanguage());
                System.out.print(",  Ülke = " + l.getDisplayCountry());
                System.out.print(",  " + l.getLanguage());
                System.out.println(" - " + l.getCountry());
            }
        }

        Locale localChinese=new Locale("zh","CN");
        System.out.println("FULL Chinese = " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(localChinese)));

        System.out.println("\n************İstediğim formatta gösterim************");
        System.out.println("date = " + date);

        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("date1 = " + date.format(ozelFormat1));

        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("date2 = " + date.format(ozelFormat2));

        DateTimeFormatter ozelFormat3=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("date3 = " + date.format(ozelFormat3));

        DateTimeFormatter ozelFormat4=DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("date4 = " + date.format(ozelFormat4));

        System.out.println("date UK = " + date.format(ozelFormat3.withLocale(Locale.UK)));

        DateTimeFormatter ozelFormat5=DateTimeFormatter.ofPattern("MMMM dd.MM.yyyy");
        System.out.println("date5 = " + date.format(ozelFormat5));

        System.out.println("\n****************");
        //kendimiz bir tarihi nasıl set edebiliriz, oluşturabiliriz, int sayi=5

        LocalDate localDate=LocalDate.of(2000,5,20);
        LocalDate localDate1=LocalDate.of(1999, Month.MARCH,12);
        System.out.println("localDate = " + localDate);
        System.out.println("localDate1.format(ozelFormat1) = " + localDate1.format(ozelFormat1));

    }
}
