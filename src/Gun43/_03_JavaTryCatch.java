package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Program çalışmaya başladı.");

        try{ //dene,hatanın başladığı yerin üstüne konur
            LocalDate tarih=LocalDate.of(2023, Month.FEBRUARY,30);
        } //hata olduğu zaman programı kırma

        catch (Exception ex)
        //ex isimli değişkende oluşan hataların bilgisi atanıyor
        {//hata olduğunda yapılması istenenler buraya yazılıyor.
            System.out.println("hata oluştu, lütfen tekrar deneyiniz");
            System.out.println("Tüm hata mesajı ="+ex);
            System.out.println("ex.getMessage() = " + ex.getMessage());
            //hata mesajını kendine mail atabilirsin
            //log tutma: program nasıl çalışıyor, hata loglarını harddiske yazabilirsin
        }
        System.out.println("Program bitti");

        try{
            //Java ve Toollarını çalışmaya devam et
            //Konuları öğrenmeye ve çalışmya devam
            //anlamadığın yer mi oldu? kırılmadan devam et.
        }
        catch (Exception ex){
            //hatanın sebebini anla
            //derse daha fazla odaklan
            //gereken vşdeoları izle
            //gruıp çalışması yap
            //öğren ve kırılmadan devam et
            //unutma sen bir söz verdini DEVAM
        }
    }
}
