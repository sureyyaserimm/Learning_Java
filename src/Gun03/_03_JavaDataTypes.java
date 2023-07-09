package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {
        int sayi; //hafızada int kadar yer ayırıyor, sadece sayı atılabiliyor.
        // tam sayılarda default INT

        //tam sayılar
        byte byteDeger = 7; //-128 127
        short shortDeger = 1645;  // -32000 ... 32000
        int intDeger = 250000;
        long longDeger = 115113213165665121L;

        //ondalıklı sayılar
        //ondalıklı sayılarda default DOUBLE dır
        double doubleDeger=3.1465465113165464; // noktadan sonra 16 haneye duyarlıdır.
        float floatDeger = 3.1474454F;  //noktadan sonra 7 haneye duyarlıdır.

        //karakter ve karakterler
        char basHarf = 'A';  //bir tane karakter saklayabilir
        String isim = "sureya";  //kelime veya cümle saklayabailir

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim);

    }
}
