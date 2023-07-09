package Gun41;

import java.time.LocalDate;

public class _08_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        LocalDate yesterday=today.minusDays(1);

        boolean isAfter=today.isAfter(yesterday); //bugün dünden sonra mı?
        System.out.println("isAfter = " + isAfter);

        boolean isBefore=today.isBefore(yesterday); //bugün dünden önce mi?
        System.out.println("isBefore = " + isBefore);

        boolean isEqual=today.isEqual(yesterday); //bugün düne eşit mi?
        System.out.println("isEqual = " + isEqual);

        boolean isLeapYera=today.isLeapYear(); //bugün artık yıl mı?
        System.out.println("isLeapYera = " + isLeapYera);










    }
}
