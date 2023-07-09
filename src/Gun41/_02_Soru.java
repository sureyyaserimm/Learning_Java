package Gun41;

import Gun39.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Soru {
    public static void main(String[] args) {
        //Canlı dijital saat yapınız.

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("kk:mm:ss");

        while (true){
            LocalTime time=LocalTime.now();
            System.out.print("\r"+time.format(formatter));
            MyFunc.Bekle(1);


        }














    }

}
