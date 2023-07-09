package A_Odevler;

import java.util.Arrays;
import java.util.Scanner;

public class Odev08_12_08_Metodlar {
    public static void main(String[] args) {
        //1-Ismi **randomNum** olan bir method oluşturun.
        //Parametre olarak **int max** almalı.
        //Bu method, 0 ile max arasında random bir değer döndürmelidir.
        //Random numarayı döndürünüz.

        System.out.println(randomNum(5));
    }

    public static int randomNum(int max) {
        int maxRandom = (int) (Math.random() * max);

        return maxRandom;


        //2-"OrtaKelime" isminden bir method oluşturun.
        //Bu method String'i parametre olarak almalı.
        //Cümle veya dizelerde ortada bulunan kelimeleri bulmalı
        //Ortadaki kelimeyi return yapınız.
        //Örnek: Ben Java'yı seviyorum.
        //print : Java'yı
        //Örnek2
        //Java'yı kolayca öğreniyorum.
        //print: kolayca

//        Scanner input = new Scanner(System.in);
//        System.out.println("Write a sentence.");
//        String sentence = input.nextLine();
//
//        System.out.println("middle word is="+middleWord(sentence));
//
//    }
//
//    public static String middleWord(String sentence) {
//        int firstBlank = sentence.indexOf(" ");
//        int lastBlank = sentence.lastIndexOf(" ");
//
//        return sentence.substring(firstBlank + 1, lastBlank);
//    }



        //3-reverseString isminde bir method oluşturun.
        //Bu method bir String'i parametre olarak alsın.
        //Ve bu method, girilen String'i tersten yazsın.
        //Terste yazılmış halini yazdırınız.
        //Örn: String = "Java'yı Seviyorum."
        //Print: .muroyiveS ıy'avaJ


//        Scanner input=new Scanner(System.in);
//        System.out.println("Write a sentence.");
//        String sentence=input.nextLine();
//        reverseString(sentence);
//
//    }
//
//    public static void reverseString(String sentence){
//        for (int i = sentence.length()-1; i >= 0; i--) {
//            System.out.print(sentence.charAt(i));
//        }



        //4- adı  reverseWord olan bir method oluşturun
        //Bu methodun String olarak bir parametresi olmalıdır
        //Ve bu cümledeki kelimelerle tersine çevirmeli
        //Ters halini yazdırın.
        //Örnek 1 :
        //Dize: Java yazın
        //dönüş şöyle olmalıdır:  yazın Java

//        Scanner input=new Scanner(System.in);
//        System.out.println("Write a sentence.");
//        String sentence=input.nextLine();
//        reverseWord(sentence);
//
//    }
//
//    public static void reverseWord(String sentence){
//        String[] newSentence=sentence.split(" ");
//        for (int i = newSentence.length-1; i >= 0; i--) {
//            if(i!=0)
//                System.out.print(newSentence[i]+" ");
//            else
//                System.out.print(newSentence[i]);
//        }



        //5-EvenOddNums isminde bir method oluşturun.
        //Bu yöntem String olan bir parametreyi kabul etsin.
        //Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
        //Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
        //toplam sonucu yazdırın.
        //**İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**
        //For example Örnek:
        //String =  "6678421312"
        //6+6-7+8+4+2-1-3-1+2
        //sonuç 16 olmalı

//        String nums = "6678421312";
//        EvenoddsNums(nums);
//    }
//
//    public static void EvenoddsNums(String nums) {
//        long number = Long.parseLong(nums);
//        int total = 0;
//        do {
//            if ((number % 10) % 2 == 0)
//                total += (number % 10);
//            else
//                total -= (number % 10);
//            number /= 10;
//        } while (number > 0);
//
//
//        System.out.println(total);
//    }



        //6- Girilen bir diziyi tersten yazdıran bir metod yazınız.

//        String[] array={"J","a","v","a","M","e","t","h","o","d","s"};
//        reverseArray(array);
//    }
//    public static void reverseArray(String[] array){
//        for (int i = array.length-1; i >= 0; i--) {
//            System.out.print(array[i]);
//        }
//    }


        //7-powerOfThree isminde bir method oluşturun.
        //Parametre olarak int
        //Return tipi boolean
        //Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        //**Örnek 1:**
        //**Girdi:** 27
        //**Çıktı:** true
        //Açıklama: 3*3*3 =27
        //Sonuç= true

//        System.out.println(powerOfThree(readNumber()));
//    }
//    public static boolean powerOfThree(int number) {
//        for (int i = 3; i <= number; i*=3) {
//
//            if (number==i)
//                return true;
//        }
//        return false;
//    }
//    public static int readNumber(){
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter a number.");
//        return input.nextInt();
//    }



        //8-`append adında bir method oluşturun.`
        //`Parametre olarak iki int array  oluşturun.`
        // ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
        // Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
        //Bunu döndürmelidir:
        // {2, 4, 6, 1, 2, 3, 4, 5}.


//        int[] array1={2, 4, 6};
//        int[] array2={1, 2, 3, 4, 5};
//
//        System.out.println(Arrays.toString(append(array1,array2)));
//    }
//
//    public static int[] append (int[] array1,int[] array2){
//
//        int[] array3=new int[array1.length+array2.length];
//
//        for (int i = 0; i < array1.length; i++) {
//            array3[i]=array1[i];
//        }
//        int index=0;
//        for (int i = 0; i < array2.length; i++) {
//            array3[i]=array2[index];
//            index++;
//        }
//        return array3;
//    }



        //9-**isUnique** adında bir method oluşturun.
        //Parametre olarak int array alır.
        // ve bu dizideki değerlerin benzersiz olup olmadığını gösteren bir boolean değeri döndürür (benzerlik yoksa true, var ise false).
        //örneğin, list isminde bir array'imiz varsa,
        //int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        //Bu listede yinelenen eleman olmadığı için sonuç true dönmelidir.
        //int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
        //Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.

//        int[] list1={3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
//        int[] list2 = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
//        System.out.println(isUnique(list1));
//        System.out.println(isUnique(list2));
//
//    }
//
//    public static boolean isUnique(int[] array){
//        for (int i = 0; i < array.length ; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (i != j && array[i] == array[j])
//                    return false;
//            }
//        }
//        return true;
//    }
//}








    }
}
