package Gun41;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _04_JavaLocalDateTime {
    public static void main(String[] args) {

        //LocalDateTime hem tarih hem de saat bilgisini tutar.

        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        System.out.println("localDateTime.getYear() = " + localDateTime.getYear());
        System.out.println("localDateTime.getMonth() = " + localDateTime.getMonth());
        System.out.println("localDateTime.getMonthValue() = " + localDateTime.getMonthValue());
        System.out.println("localDateTime.getDayOfYear() = " + localDateTime.getDayOfYear());
        System.out.println("localDateTime.getDayOfMonth() = " + localDateTime.getDayOfMonth());
        System.out.println("localDateTime.getDayOfWeek() = " + localDateTime.getDayOfWeek());
        System.out.println("localDateTime.getDayOfWeek().getValue() = " + localDateTime.getDayOfWeek().getValue());
        System.out.println("localDateTime.getHour() = " + localDateTime.getHour());
        System.out.println("localDateTime.getMinute() = " + localDateTime.getMinute());
        System.out.println("localDateTime.getSecond() = " + localDateTime.getSecond());
        System.out.println("localDateTime.getNano() = " + localDateTime.getNano());

        System.out.println("ISO_DATE_TIME = " + localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("SHORT = " + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

        //özel formatta istediğimiz gibi yazdırma
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");
        System.out.println("localDateTime = " + localDateTime.format(formatter));


    }
}
