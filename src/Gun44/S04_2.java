package Gun44;

public class S04_2 {
    public static void main(String[] args) {
        String kelime;
        String[] kelimeler=new String[2];

        //System.out.println("kelime = " + kelime); //kelimenin karşılığı olmadığı için yazdırmaz. çünküü nesne tipler

        System.out.println("kelimeler = " + kelimeler[0]);
        System.out.println("kelimeler = " + kelimeler[1]);

        kelimeler[1].concat("ismet"); //olmayan bir şeye ekleme yapılmaz.

        //ilkel tipler: long, int, short...
        //referans Tipler:dizi,class,arraylist
        //nesne tipler:String,Integer
    }
}
