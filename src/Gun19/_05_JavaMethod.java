package Gun19;

public class _05_JavaMethod {

    //burya metod yazılabilir.

    public static void main(String[] args) { //ana metod, diğer metodları buradan çağıracağız
        Math.max(5, 6); // bir şeylerr verilmiş, geriye değer alınıyor.
        Math.random(); // veri almıyor, sadece veri verir.

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        writeHello();
        writeHello();
        writeHello();

    }

    public static void writeHello() {
        System.out.println("Hello World");
    }
    // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
    // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
    // temiz kod için
    //buraya metodlar yazılabilir.
}
