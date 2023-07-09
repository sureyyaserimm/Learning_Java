package Gun30._02_FinalVariables.Ornek1;

public class NufusMudurlugu {
    public static void main(String[] args) {

        Vatandas v1=new Vatandas("ismet");
        Vatandas v2=new Vatandas("Nazmiye");
        Vatandas v3=new Vatandas("Nurhayat");

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        //v1.TCNo=456;
        //final değişkenlerine sadece bir kez veri atanabilir
        //ya tanımlarken ya Contructor ile

        final double pi=3.14;
       // pi=5; final olarak tanımlandığı için değerini değiştiremedik.
       // Math.PI; javada pi sayısı tanımlanırken de final kullanılmış.

    }
}
//final:değer atandıktan sonra değiştirilmeyi engelliyor.
//bu sebeple hem sabit değerler için hem de sonradan değişmesini istemediğimiz değerler için kullanılır.
//static sayac ise her yeni nesne oluşturulduğunda yeni artan değer almasını sağlıyor.