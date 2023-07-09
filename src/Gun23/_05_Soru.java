package Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class _05_Soru {
    public static void main(String[] args) {
        // 10 elamanlı bir diziyi random(10(dahil) a kadar olan sayılarla
        // doldurduktan, tekrarlı değerleri almayacak şekilde yeni bir
        // diziye atınız.

        Integer [] array=new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i]= (int)(Math.random()*11);
        }
        System.out.println("array = " + Arrays.toString(array));

        //1.solution
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            hs.add(array[i]);
        }
        System.out.println("hs = " + hs);

        //2.solution
        HashSet<Integer> hs2=new HashSet<>(Arrays.asList(array));
        System.out.println("hs2 = " + hs2);

        //3.solution
        HashSet<Integer> hs3=new HashSet<>();
        Collections.addAll(hs3,array);
        System.out.println("hs3 = " + hs3);

    }
}
