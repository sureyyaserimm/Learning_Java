package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> colors=new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        colors.add("RED");

        //Ekrana yazdırma
        System.out.println("colors = " + colors);

        //Ekrana tek tek yazdırma
        for (String eleman:colors) { //sıra garanti değil
            System.out.println("eleman = " + eleman);
        }

        //foreach ile ilgili örnek olsun diye eklendi
//        int[] array={34,5,6,7,8,89,899,77};
//        for (int numbers:array) {
//            System.out.println("numbers = " + numbers);
//        }

        //set'in kendi sırası nasıl ise onun aynısını verir.
        Iterator gosterge= colors.iterator();
        while (gosterge.hasNext()) { //sıradaki eleman varsa
            System.out.println("gosterdigi eleman = " + gosterge.next());
            // .next göstergenin gösterdiği elemanı temsil ediyor.
        }


    }
}
