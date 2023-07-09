package A_Odevler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Odev09_12_13_Sets_2DArrayList {
    public static void main(String[] args) {
//        1-Create a method totalCount()
//        totalCount() isminde bir method oluşturun.
//        Parametresi  'Integer Hashset' olmalı
//        HashSetteki eleman sayısını alın.
//        totalCount'u döndürün.
//        _**Örnek:**_
//                hashset ; 4,2,3,1,7
//        cevap: 5

//        HashSet<Integer> hs1 = new HashSet<>();
//        System.out.println(totalCount(hs1));;
//        hs1.add(4);
//        hs1.add(2);
//        hs1.add(3);
//        hs1.add(1);
//        hs1.add(7);
//    }
//
//    public static int totalCount(HashSet<Integer> hs1) {
//
//        return hs1.size();



//        2-changeSet() isminde bir method oluşturun.
//        Parametre olarak bir String HashSet   ve  iki String
//        return hashset olmalı
//        Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
//**ÖRNEK:**
//        hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
//        String 1 = **banana**
//        String 2 = **peach**
//**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"

//        HashSet<String> fruit = new HashSet<>();
//        fruit.add("banana");
//        fruit.add("strawberry");
//        fruit.add("kiwi");
//        fruit.add("pineapple");
//        System.out.println(fruit);
//
//        String f1="banana";
//        String f2="peach";
//        System.out.println(changeSet(fruit,f1,f2));;
//    }
//
//    public static HashSet<String> changeSet(HashSet<String> fruits,String f1,String f2) {
//
//        if(fruits.contains(f1)){
//            fruits.remove(f1);
//            fruits.add(f2);
//        }
//        return fruits;


//        3-commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
//        return tipi arraylist olmalı.
//**ÖRNEĞİN:**
//        İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
//        İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
//        Ortak değerleri ArrayListe ekleyiniz.
//        çıktı:  "Germany" , "Brazil" ,"USA"
//        ArrayListi yazdırınız.

//        HashSet<String> countries=new HashSet<>();
//        Collections.addAll(countries,"Germany" , "England" , "South Africa" , "Brazil" , "USA");
//        HashSet<String> countries2=new HashSet<>();
//        Collections.addAll(countries2,"Germany" , "China" , "France" , "Brazil" , "USA");
//
//        commonValues(countries,countries2);
//
//    }
//    public static void commonValues(HashSet<String> c1,HashSet<String> c2){
//
//        ArrayList<String> common=new ArrayList<>();
//
//        common.addAll(c1);
//        common.retainAll(c2);
//        System.out.println(common);



//        4-removing() isminde bir method oluşturun.
//        Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
//                Eğer Stringler LinkedHashset 'in içinde varsa, sil.
//        Return tipi linkedhashset
//                Örneğin,
//        linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
//        String 1= Germany
//        String 2 = USA
//                **Germany ve USA 'i sil.**
//        Set'i döndür.


//        LinkedHashSet<String> countries = new LinkedHashSet<>();
//        Collections.addAll(countries,"Germany" , "France" , "USA" , "Canada" , "Mexico" , "Brazil");
//        String c1="Germany";
//        String c2="USA";
//
//        System.out.println(removing(countries,c1,c2));
//    }
//    public static LinkedHashSet removing(LinkedHashSet countries,String c1,String c2){
//        if(countries.contains(c1) && countries.contains(c2))
//            countries.remove(c1);
//        countries.remove(c2);
//        return countries;



//        5- 2D ArrayList
//        Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
//        Store all the elements in one arraylist and print the arraylist
//        Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
//                **Örnek:**
//**Girdi:**
//[
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
//]
//**Çıktı:** [1,2,3,4,5,6,7,8,9]


//        int[][] array={
//                {1, 2, 3 },
//                { 4, 5, 6 },
//                {7, 8, 9}
//        } ;
//
//        ArrayList<Integer> numbers=new ArrayList<>();
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                numbers.add(array[i][j]);
//            }
//        }
//        System.out.print(numbers);
//    }






//        Özel Soru:
//        6- Bir HashSet i mainde tanımlayınız. Daha Sonra bir fonksiyonda
//        random olarak toplamı 10 tane olacak şekilde 1 den 20 e kadar olan
//        sayılarla doldurunuz. Set i main de yazdırınız.

        HashSet<Integer> numbers=new HashSet<>();

        System.out.println(random(numbers));
    }

    public static HashSet<Integer> random(HashSet<Integer> numbers){

        while (numbers.size()<10) {
            int rndm=(int)(Math.random()*21);
            numbers.add(rndm);
        }

        return numbers;
    }



}
