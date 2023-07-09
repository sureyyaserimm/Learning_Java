package Gun28._02_Constructor;

public class Kitapci {
    public static void main(String[] args) {
        // Book class yazınız.fields: name,publishYear,author.
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructorla oluşturup, mainde yazdırınız.

        Book book1=new Book("Uçurtma Avcisi",2010,"Khalid Huseyni");
        Book book2=new Book("Divan",2013,"Irvin D. Yalom");
        Book book3=new Book("Yüzüklerin Efendisi");
        Book book4=new Book();
        book4.name="Sevme Sanatı";
        book4.author="Erich Fromm";


        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);


    }
}
