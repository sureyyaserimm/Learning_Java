package Gun41;

import Gun39.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _03_Odev {
    public static void main(String[] args) {
        //TODO : // Alınan saati geriye doğru saniye saniye saydırınız.

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("kk:mm:ss");

        while (true){
            LocalTime time=LocalTime.now();
            System.out.print("\r"+time.format(formatter));
            MyFunc.Bekle(-1);


        }



    }

}
