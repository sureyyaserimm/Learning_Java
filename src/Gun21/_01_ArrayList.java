package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // dizi, array : boyut sayısı belli, sonradan değiştirilemez
        int[] dizi = new int[5]; // Array 5 elemanlı boyutu sonradan değiştirelimiyor

        // Boyutu dinamik olsun, eleman ekledikçe uzasın, sildikçe kısalsın
        // ArrayList : boyutunu başta vermene gerek bile yok, boyutu başlangıçta 0
        // eleman ekledikçe artar, sildikçe kısalır.

        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Double> doble = new ArrayList<>();

        ArrayList<String> names = new ArrayList<>();
        System.out.println("names = " + names);

        names.add("Ahmet"); //uzunluk 1
        names.add("Mehmet"); //uzunluk 2
        names.add("Ali"); //uzunluk 3
        names.add("Mahmut"); //uzunluk 4


        System.out.println("names = " + names);
        System.out.println("names.size() = " + names.size()); //length yerine size dizinin uzunulğunu verir.

        names.add(1, "Muhammed"); //burda ilk yazdığın rakam hangi indexe yazacağını gösterir. 1.indexe muhammed yazdırır.
        System.out.println("names = " + names);

        names.set(1, "Zafer"); //1 nolu indexteki elemanı buraya yazdığımız elemanla değiştirir.
        System.out.println("names = " + names);

        boolean IsThere = names.contains("Metin"); //var mı?
        System.out.println("IsThere = " + IsThere); //true

        names.remove("Metin"); //değere göre siler,büyük-küçük harf duyarlılığı var, eğer birden fazla varsa ilkini siler.
        System.out.println("names = " + names);


        names.remove(1); //rakam verildiğinde index kabul ediyor ve ona göre siliyor.
        System.out.println("names = " + names);
        //eğer ArrayListimiz integerdan oluşuyorsa ve içinde 1 varsa onu silmek için remove(Object(1)) diye göstermemiz gerekiyor.

        int indexOfAynur = names.indexOf("Aynur");
        System.out.println("indexOfAynur = " + indexOfAynur);

        String firstWord = names.get(0); //verilen indexdeki değeri verir.
        System.out.println("firstWord = " + firstWord);

        for (int i = 0; i < names.size(); i++) { //eğer birden fazla aynur ismi kullanılmışsa ve onu silmek istiyorsak önce get ile hepsini buluruz sonra remove ile sileriz.
            if (names.get(i).equalsIgnoreCase("aynur")) ;
            names.remove(i);
        }

        names.clear();//her şeyi siler
        System.out.println("names = " + names);


    }

}
