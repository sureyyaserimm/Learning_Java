package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _07_ZonedDateTime {
    public static void main(String[] args) {
        //Başka zaman bölgelerinin (Time Zone) zaman bilgisini alma

        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println("zdt = " + zdt);

        Set<String> zamanBolgeleri= ZoneId.getAvailableZoneIds();

        for (String z:zamanBolgeleri){
            if (z.toLowerCase().contains("ıst"))
                System.out.println("z = " + z);
        }

        ZoneId zoneIdIstanbul=ZoneId.of("Europe/Istanbul");
        ZonedDateTime zonedIstanbul=ZonedDateTime.now(zoneIdIstanbul);
        System.out.println("zonedIstanbul = " + zonedIstanbul);

        ZoneId zoneIdLondon=ZoneId.of("Europe/London");
        ZonedDateTime zonedLondon=ZonedDateTime.now(zoneIdLondon);
        System.out.println("zonedLondon = " + zonedLondon);











    }
}
