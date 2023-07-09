package A_Odevler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Odev07_12_08_2DArray_ArrayList {
    public static void main(String[] args) {
        //1-Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        //Bütün 2'leri 6'yla değiştirin.
        //Array'i yazdırınız.

        int[][] array1 = {
                {2, 3, 2},
                {4, 1, 5},
                {7, 2, 5}
        };

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {

                if (array1[i][j] == 2)
                    array1[i][j] = 6;
                System.out.print(array1[i][j] + " ");

            }
            System.out.println();
        }


        //2-Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        //2D array'de olan elemanları toplayınız.
        //toplamı yazdırınız.
        //Sonuç 32 olmalıdır.


        int[][] array2 = {
                {5, 2, 1},
                {10, 2, 3, 6},
                {1, 2}
        };
        int total = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                total = total + array2[i][j];
            }
        }
        System.out.println("total = " + total);


        //3-Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        //[{"new jersey","atlanta","ohio"} ,
        //{"Pittsburgh" ,"ohio","new york","ohio"} ,
        //{"ohio","new york"}]
        //Bütün ohio'ları Florida'yla değiştiriniz.
        //Array'i yazdırınız.


        String[][] array3 = {
                {"new jersey", "atlanta", "ohio"},
                {"Pittsburgh", "ohio", "new york", "ohio"},
                {"ohio", "new york"}
        };

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j].replaceAll("ohio", "Florida") + " ");
            }
            System.out.println();
        }


        //4-Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
        //Store all the elements in one arraylist and print the arraylist
        //Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
        //**Örnek:**
        //```
        //**Girdi:**
        //[
        // [ 1, 2, 3 ],
        // [ 4, 5, 6 ],
        // [ 7, 8, 9 ]
        //]
        //**Çıktı:** [1,2,3,4,5,6,7,8,9]
        //```

        int[][] array4 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        ArrayList<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {

                integerList.add(array4[i][j]);
            }
        }
        System.out.print(integerList);


        //5-ismi getCount() olan bir method oluşturun.
        //Parametre olarak bir String ArayList  ve  bir tane String
        //Return tipi int olmalı.
        //ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        //Örneğin;
        //ArrayList = Orange , Kiwi , Peach , Banana , Orange
        //String Orange:
        //Count = 2 olmalı. (Orange 2 kez yazılmış)

        String[] fruits = {"Orange", "Kiwi", "Peach", "Banana", "Orange"};
        System.out.println(getCount(fruits));
    }

    public static String getCount(String[] fruits) {
        int count = 1;
        String repeat = " ";
        Arrays.sort(fruits);
        for (int i = 1; i < fruits.length; i++) {
            if (fruits[i - 1].equals(fruits[i])) {
                count++;
                repeat = fruits[i];
            }
        }
        return repeat + " " + count + " kez yazıldı";
    }

    //6-getSum() isminde bir method oluşturun.
    //Parametresi ArrayList olmalı
    //Return tipi int olmalı.
    //ArrayList teki tüm sayıları birbiri ile toplayın.
    //return olarak toplam sonucu döndürün.
    //Örneğin;
    //Arraylist = 1,2,3,4,5
    //return 15 olmalı

//    ArrayList<Integer> numbers=new ArrayList<>();
//        Collections.addAll(numbers,1,2,3,4,5);
//        System.out.println("total = " + getSum(numbers));
//
//}
//    public static int getSum(ArrayList<Integer> numbers){
//        int total=0;
//        for (int i = 0; i < numbers.size(); i++) {
//            total=total+numbers.get(i);
//        }
//        return total;
//    }


    //7-getLength() isminde bir method oluşturun.
    //Parametre olarak String ArrayList
    //Return tipi Integer ArrayList
    //ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
    //Tüm elementlerin uzunluğunu döndürün
    //Örneğin;
    //ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
    //Tüm Stringlerin uzunluklarını yazdırın;
    //cevap: 10 ,  8 , 4 , 7 , 6 olmalı


//    ArrayList<String> cityNames = new ArrayList<>();
//        Collections.addAll(cityNames, "New jersey", "New york", "Ohio", "Florida", "Boston");
//
//            System.out.println(getLength(cityNames));
//
//}
//    public static ArrayList<Integer> getLength(ArrayList<String> cityNames) {
//
//        ArrayList<Integer> totalSize = new ArrayList<>();
//        for (int i = 0; i < cityNames.size(); i++) {
//            totalSize.add(cityNames.get(i).length());
//        }
//
//        return totalSize;
//
//    }


    //8-İsmi changelnArraylist() olan bir method oluşturun.
    //Parametre olarak String ArrayList, String s1, String s2
    //   Arraylist'te s1'i s2 olarak değiştirin
    //Return String arrayList
    //Örneğin;
    //Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
    //s1 = blue
    //s2 = yellow
    //Tüm blue 'ları yellow'a dönüştürün.
    //cevap: "yellow" , "red" , "yellow" , "red" , "yellow"

//    ArrayList<String> colors=new ArrayList<>();
//        Collections.addAll(colors,"yellow" , "red" , "blue" , "red" , "blue");
//        System.out.println(changeInArraylist(colors));
//
//}
//    public static ArrayList<String>  changeInArraylist(ArrayList<String> colors){
//        String s1="blue";
//        String s2="yellow";
//        for (int i = 0; i < colors.size(); i++) {
//            if(colors.get(i).equalsIgnoreCase("blue"))
//                colors.set(colors.indexOf(s1),s2);
//        }
//        return colors;
//    }


}
