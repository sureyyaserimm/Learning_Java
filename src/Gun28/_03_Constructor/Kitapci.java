package Gun28._03_Constructor;

import Gun28._02_Constructor.Book;

public class Kitapci {
    public static void main(String[] args) {
        // Book class yazınız.fields: name,publishYear,author.
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructorla oluşturup, mainde yazdırınız.

        Book book1=new Book("Uçurtma Avcisi",2010,"Khalid Huseyni");
        Book book2=new Book("Divan",2013,"Irvin D. Yalom");
        Book book3=new Book("Yüzüklerin Efendisi");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        //bir önceki soruda class'ta yazdığımız metodların hepsini
        // fare sağ tuş-->Generate--->Constructor--->açılan pencerede tanımladığımız classları ekleyebiliriz.
        //fare sağ tuş-->toString--->hepsini aynı anda yazmamızı sağlayan toStringi de otomatik seçebiliriz.

    }
}
