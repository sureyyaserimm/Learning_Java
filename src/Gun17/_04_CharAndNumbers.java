package Gun17;

public class _04_CharAndNumbers {
    public static void main(String[] args) {
        //A -> bilgisayar saklarken A
//
//        Harf ve rakam eşleştirme tablosuna ASCII tablosu
//        0 - >
//        1 - >
//
//        (char)65  -> A
//
//
//        65 -> A
//        66 -> B
//
//
//
//        97 -> a
//        98 -> b
//
//        ....
//        ...
//        255 ->



        int number=65;
        System.out.println("number = " + number);

        char letter=(char)number;
        System.out.println("letter = " + letter);


        number=97;
        letter=(char)number;
        System.out.println("letter = " + letter);




        for (int i = 0; i <= 255; i++) {
            letter=(char)i;
            System.out.println(i+".letter = " + letter);
        }

    }
}
