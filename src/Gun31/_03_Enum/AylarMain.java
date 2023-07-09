package Gun31._03_Enum;

public class AylarMain {
    public static void main(String[] args) {

        // ayın kaç gün sürdüğünü metod gerekiyor
        // ayın türkçe yazılışı metod gerekiyor
        // ayın gerçek sıra nosu metod gerekiyor

        // Java diyorki bu şekilde tek bir kelime veya
        // sayı olan degerleri olacaksa, sana bir kolaylık

        Aylar ay=Aylar.AGUSTOS;

        System.out.println("ay = " + ay);
        System.out.println("ayNo="+ay.ayNo);
        System.out.println("ay.gunMiktar = " + ay.gunMiktar);
        System.out.println("ay.ayAd = " + ay.ayAd);
        //enumda yazdığımız her şeyi burdaki foreach'le yazdırıyoruz.
        for (Aylar a:Aylar.values()){
            System.out.println(a.ayNo+" "+a.gunMiktar+" "+a.ayAd);
        }







    }
}
