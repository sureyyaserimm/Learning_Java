package Gun17;

import java.util.Arrays;

public class _06_JavaArrayMethods {
    public static void main(String[] args) {
    String[] names={"ahmet","zeynep","roman","yasin","cihan"};

    //diziyi String olarak direkt yazdırır.
        System.out.println("Names = " + Arrays.toString(names));

    //diziyi sıralama
        Arrays.sort(names); //alfabetik olarak sıralama yapar.
        System.out.println("names = " + Arrays.toString(names));

    //diziler eşit mi?
        int[] a={1,8,3,54};
        int[] b={1,8,3,54};
        int[] c={1,8,2,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); //true
        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,c)); //false

        Arrays.sort(c); //c'yi küçükten büyüğe sıraladık.
        System.out.println(Arrays.toString(c));
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c));

        //contains gibi çalışır, varsa pozitif yoksa negatif değer gösterir.
        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b,3));
        Arrays.sort(b); //ancak sıralanmış dizilerde doğru sonuç verir
        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b,3));




    }
}
