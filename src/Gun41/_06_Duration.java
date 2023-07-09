package Gun41;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _06_Duration {
    public static void main(String[] args) {
        //Duration: hem LocalTime için hem de LocalDateTime için kullanılıyor.

        //LocalTime
        LocalTime dersBaslagic=LocalTime.of(19,0,0);
        LocalTime dersBitis=LocalTime.of(22,0,0);

        Duration gunlukDersSuresi=Duration.between(dersBaslagic,dersBitis);
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi);

        System.out.println("Farkın saat hali = " + gunlukDersSuresi.toHours());
        System.out.println("Farkın dakika hali = " + gunlukDersSuresi.toMinutes());
        System.out.println("Farkın milisaniye hali = " + gunlukDersSuresi.toMillis());

        //LocalDateTime  ***2 Tarih-saat arasındaki fark ***
        LocalDateTime from=LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to=LocalDateTime.now();
        Duration duration1=Duration.between(from,to);
        System.out.println("duration1 = " + duration1);
        System.out.println("duration1.toDays() = " + duration1.toDays());















    }
}
