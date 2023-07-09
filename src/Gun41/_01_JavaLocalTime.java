package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _01_JavaLocalTime {
    public static void main(String[] args) {
        //LocalTime:Tarih bilgisi içermez sadece saat dakika saniye nano saniye içerir.

        LocalTime time=LocalTime.now();
        System.out.println("time = " + time);

        System.out.println("time.getHour() = " + time.getHour());
        System.out.println("time.getMinute() = " + time.getMinute());
        System.out.println("time.getSecond() = " + time.getSecond());
        System.out.println("time.getNano() = " + time.getNano());

        //kendimize ozel format
        DateTimeFormatter of1=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("time1 = " + time.format(of1));

        DateTimeFormatter of2=DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("time2 = " + time.format(of2));

        DateTimeFormatter of3=DateTimeFormatter.ofPattern("k:mm");
        System.out.println("time3 = " + time.format(of3));

        /************************/
        LocalTime time1=LocalTime.of(7,34,45);
        System.out.println("time4 = " + time1.format(of3));

















    }
}
