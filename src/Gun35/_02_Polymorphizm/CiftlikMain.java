package Gun35._02_Polymorphizm;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("karabaş");
        kopek1.ses();
        kopek1.kokladi();

        Kedi kedi1=new Kedi("Kopuk");
        kedi1.ses();
        kedi1.tirmaladi();

        kopekSesi(kopek1);
        kediSesi(kedi1);

        hayvanSesi(kopek1);
        hayvanSesi(kedi1);

        Hayvan hayvan1=new Hayvan("ördek");
        Hayvan hayvan2=new Kopek("kangal");
        Hayvan hayvan3=new Kedi("boncuk");

        System.out.println("--------------");
        hayvan1.ses(); //genel hayvan, ses çıkardı
        hayvan2.ses(); //köpek hayvan, havladı
        hayvan3.ses(); //kei hayvan, miyavladı
        System.out.println("--------------");

        hayvan2.ses(); //kopek de olsa hayvan Referansı sebebiyle metodlar kısıtlı
        // peki bu hayvanı kopek formunu nasıl ortaya çıkartırım
        // tip dönüşümü acaba işime yarar mı?

        ((Kopek)hayvan2).kokladi(); // artık diğer metodları kullanabilirim.
        ((Kedi)hayvan1).tirmaladi();
        // ((int)Math.random()) casting burdaki gibi, tip dönüşümü

        // Setlerden HashSet
        // Maplerden HashMap
        // Listlerden ArrayList

//        Polymorphism -
//        çok formluluk  - Çok çeşitlilik
//        şizofren bir konu
//
//        :  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.


    }
    public static void kopekSesi(Kopek kopek){
        kopek.ses();
    }

    public static void kediSesi(Kedi kedi){
        kedi.ses();
    }

    public static void hayvanSesi(Hayvan hayvan){
        //buraya hem kedi geliyor hem de köpek
        hayvan.ses();

        //bir classın aslında kime ait olduğunu bulma yöntemi
        if(hayvan instanceof Kopek) //hayvan aslında kopek mi
            ((Kopek) hayvan).kokladi();

        if(hayvan instanceof Kedi) //hayvan aslında kedi mi
            ((Kedi) hayvan).tirmaladi();

    }

    //Hayvan classından türettiğimiz-extend yaptığımız için
    // hayvanSesi olarak eklediğimiz methoddan yazdırdığımızda da
    // köpek ve kedi için classlarında Override yaparak yazdığımız
    // özellikleri alarak yazdı.
    // Ama tırmaladı , kokladı gibi kedi, köpek classına özel olarak
    // yazdıklarımızı hayvanSesi methodunda yazdıramayız.

}
