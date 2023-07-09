package Gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {

        //Escape Characters
        // \n -->yeni satir aciyor, alt satira geciyor
        // \t -->tab tusuna basılmıs gibi bosluk verir
        // \b -->back-space bir karakter geri siler
        // \" -->tırnak yazmak icin kullanılır
        // \\ --> \ yazmak icin kullanılır
        // \r --> satır basina geri ve satiri silip tekrar bastan yazıyormus gibi yapar

        System.out.println("MerhabaDunya");
        System.out.println("Merhaba\nDunya");
        System.out.println("Merhaba\tDunya");
        System.out.println("Merhaba\bDunya");
        System.out.println("Merhaba\"Dunya");
        System.out.println("Merhaba\\Dunya");
        System.out.println("Merhaba\rDunya");

        System.out.println("Merhaba\fDunya");

    }
}

