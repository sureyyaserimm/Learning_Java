package A_Odevler;

import java.util.Arrays;

public class Odev06_12_01 {
    public static void main(String[] args) {
        //1-Bu String'i oluşturun. "Removes white space from both ends of a string"
        //String'deki kelime sayısını yazdırınız.
        String sentence1= "Removes white space from both ends of a string";
        int blank=0;
        for (int i = 0; i < sentence1.length(); i++)
        {
            if (sentence1.charAt(i)==' ')
                blank++;
        }

        System.out.println("Total of the words = " + (blank+1));


        //2-Bir String oluşturun : "Hello World"
        //Stringi tersten yazdırın ve print edin.
        //_Cevap böyle olmalı :  "dlroW olleH"_

        String sentence2="Hello World";
        String reverse="";
        int length=sentence2.length();
        for (int i = length-1; i >=0 ; i--) {
            reverse=reverse+sentence2.charAt(i);
        }
        System.out.println("reverse = " + reverse);


        //3-İnt Array oluştur ve elemanları   : 25,30,30,35,100
        //Array in elemanlarının toplamını yazdır.
        //Cevap 220 olmalı.
        int [] array3={25,30,30,35,100};
        int total=0;
        for (int i = 0; i < array3.length; i++) {
            total=total+array3[i];
        }
        System.out.println("total = " + total);


        //4-int Array oluşturun.
        //elemanları : 13, 15,14,16,16
        //Arrayin elemanlarını yazdırın.

        int [] array4={13,15,14,16,16};
        for (int i = 0; i < array4.length; i++) {
            System.out.println("array = " + array4[i]);

        }

        //5-String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
        //Array'daki eleman sayısını yazdırınız.
        //Cevap 4 olmalı.

        String [] array5={"new jersey" , "new york", "boston","California"};
        for (int i = 0; i < array5.length; i++) {
            System.out.println("array5 = " + array5[i]);
        }
        System.out.println("array5 = " + array5.length);


        //6-String Array (Dizi) oluşturunuz.
        // elemanları : Apple, Orange , Babana, Kiwi
        //Array'leri tüm elemanları yazdırınız.

        String [] array6={"Apple", "Orange" , "Banana","Kiwi"};
        for (int i = 0; i < array6.length; i++) {
            System.out.println("array6 = " + array6[i]);
        }


        //7-int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        //Array'in ortalamasını alınız.

        int [] array7={12, 14 , 21 ,23 , 10 ,4};
        int total7=0;

        for (int i = 0; i < array7.length; i++) {
            total7=total7+array7[i];
        }
        int ort=total7/array7.length;
        System.out.println("ort = " + ort);


        //8-int Array oluşturun ve elemanları : 5,6,8,12,14,19
        //Eğer sayı çiftse topla, tekse çıkar.
        //**Örneğin:**
        // **-5 + 6 + 8 + 12 + 14 - 19 = 16**
        //Toplamlarını yazdırın.

        int [] array8={5,6,8,12,14,19};
        int total8=0;
        for (int i = 0; i < array8.length; i++) {

            if (array8[i]%2==0)
                total=total+array8[i];
            else
                total=total-array8[i];
        }
        System.out.println("total = " + total8);


        //9-int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int [] array9={15,25,22,18,30};
        Arrays.sort(array9);
        System.out.println("array9 = " + Arrays.toString(array9));
        System.out.println("array9 = " + array9[array9.length-2]);


        //10-int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //En küçük (minimum) sayıyı yazdırınız.

        int [] array10={14 , 19 , 5 , 21};
        Arrays.sort(array10);
        System.out.println("array9 = " + Arrays.toString(array10));
        System.out.println("min value = " + array10[0]);



        //11-int Array oluşturun ve elemanları : 12,2,5,15,8
        //En büyük değeri yazdırınız.

        int [] array11={12,2,5,15,8};
        Arrays.sort(array11);
        System.out.println("array11 = " + Arrays.toString(array11));

        System.out.println("max value = " + array11[array11.length-1]);


        //12-String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin.
        //Loops (döngüler) kullanın.

        String [] array12={"Apple" , "Orange" , "Banana" , "Pineapple"};

        for (int i = 0; i < array12.length; i++) {
            if(array12[i].equals("Apple"))
                System.out.println(true);
        }


        //13-Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        //$ işaretlerini kaldırın ve sayıları toplayın.
        //Sayıların toplamını yazdırın.

        String array13="$12 $23 $10 $2 $5 $2";
        String [] numbers=array13.split(" ");
        int total13=0;
        for (int i = 0; i < numbers.length; i++) {

            numbers[i]=numbers[i].replace("$","");
            total=total+Integer.parseInt(numbers[i]);
        }

        System.out.println("total = " + total13);



    }
}
