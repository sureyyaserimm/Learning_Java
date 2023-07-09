package Gun07;

public class _10_StringToUpperCase {
    public static void main(String[] args) {
        //ToUpperCase: stringi büyük harfe çevirir.

        String text="Merhaba Dünya";

        System.out.println("Orijinal hali = " + text);
        System.out.println("text.toUpperCase() = " + text.toUpperCase());

        System.out.println("me veya ME ile başlıyor mu?" + text.toUpperCase().startsWith("ME"));

        System.out.println("text = " + text);



    }
}
