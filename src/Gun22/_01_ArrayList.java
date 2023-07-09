package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralarken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(5);
        numbers.add(456);
        numbers.add(45);
        numbers.add(3);

        System.out.println("numbers = " + numbers);

        //Sıralama işlemi
        Collections.sort(numbers);
        System.out.println("numbers = " + numbers);

        //Tersine çevir
        Collections.reverse(numbers);
        System.out.println("numbers = " + numbers);

        //Max-min eleman bulma
        System.out.println("max = " + Collections.max(numbers));
        System.out.println("min = " + Collections.min(numbers));

        //Bütün elemanları set etme
        Collections.fill(numbers, 0);
        System.out.println("numbers = " + numbers);

        //replace
        Collections.replaceAll(numbers, 0, 5); //0'lara 5 atadı
        System.out.println("numbers = " + numbers);

        //ekleme
        Collections.addAll(numbers,1,2,3,4); //ArrayListe yazılan elemanları ekledi.
        System.out.println(numbers);

        //tanımlarken değer atama
        int[] array = {2, 3, 4, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
        System.out.println("list = " + list);
        ArrayList<String> strList = new ArrayList<>(Arrays.asList( "ali", "can", "ece", "tan") );
        System.out.println("strList = " + strList);

        ArrayList<Integer> list2=new ArrayList<>();
        Collections.addAll(list2,2,3,4,5,6,67);
        System.out.println("list2 = " + list2);

        //diziyi direkt Arraylise'e nasıl atarım

        Integer[]array2={2,3,4,5};
        ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(array2));
        System.out.println("list3 = " + list3);


    }
}
