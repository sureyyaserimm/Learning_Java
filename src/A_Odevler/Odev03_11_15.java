package A_Odevler;

public class Odev03_11_15 {
    public static void main(String[] args) {
        //SORU-1 **I love java** olan bir String oluşturun.
        // Bu cümlenin toplam karakter sayısını yazdırın.

        String sentence="I love Java";

        int length= sentence.length();

        System.out.println("length = " + length);
        System.out.println("sentence.length= " + sentence.length());

        //SORU-2**Sprint planning** olan bir String oluşturun.
        //Bu dizenin _toplam karakter sayısını_ yazdırın.

        String sentence2="Sprint planning";
        int length2= sentence2.length();

        System.out.println("length2 = " + length2);

        //SORU-3**apple** olan bir String oluşturun.
        //String'in _içinde_ **app** olup olmadığını **doğrula**.

        String word="apple";

        boolean varMi=word.contains("app");
        System.out.println("varMi = " + varMi);

        //SORU-4**orange** kelimesinden oluşan bir String oluşturun.
        // String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.

        String word1="orange";
        boolean isEqual=word.equals(word1);
        System.out.println("isEqual = " + isEqual);

        //SORU-5**apple**  olan  bir String oluşturun.
        //String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
        //_Büyük harf veya küçük harf önemli değildir._

        String word2="apple";
        boolean isEqual1=word.equalsIgnoreCase(word2);
        System.out.println("isEqual = " + isEqual1);

        //SORU-6**Florida** kelimesinden bir String oluşturun.
        //Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın. 
        
        String word3="Florida";
        System.out.println("word3.indexOf(o) = " + word3.indexOf("o"));

        //SORU-7**Thank you** olan bir String oluşturun.
        //Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.

        String sentence3="Thank you";
        System.out.println("sentence3.indexOf(y) = " + sentence3.indexOf("y"));

        //SORU-8**Main method** oluşturun.
        //**Mouse** değerinde bir String oluştur.
        //Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.

        String word4="Mouse";
        char character3=word4.charAt(2);
        System.out.println("character3 = " + character3);

        //SORU-9**paper** olan bir String oluşturun.
        //String'i _büyük harfe_ çevirin ve yazdırın.
        //örn: apple > APPLE
        
        String word5="paper";
        System.out.println("word5.toUpperCase() = " + word5.toUpperCase());

        //SORU-10**OraNge** olan bir String oluşturun.
        //String'i _küçük harfe_ çevirin ve yazdırın.
        //örn: APPLE > apple
        
        String word6="OraNge";
        System.out.println("word6.toLowerCase() = " + word6.toLowerCase());

        //SORU-11**New Jersey** olan bir String oluşturun.
        // String'i _büyük harfe_ çevirin ve yazdırın

        String word7="New Jersey";
        System.out.println("word7.toUpperCase() = " + word7.toUpperCase());

        //SORU-12**New York** olan bir String oluşturun.
        // String'i _küçük harfe_ çevirin ve yazdırın.

        String word8="New York";
        System.out.println("word8.toLowerCase() = " + word8.toLowerCase());

        //SORU-13**PADDLE** olan bir String oluşturun.
        //String'i _küçük harfe_ çevirin ve yazdırın.
        
        String word9="PADDLE";
        System.out.println("word9.toLowerCase() = " + word9.toLowerCase());


    }
}
