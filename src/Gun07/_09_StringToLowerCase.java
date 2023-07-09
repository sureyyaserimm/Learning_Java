package Gun07;

public class _09_StringToLowerCase {
    public static void main(String[] args) {
        //tolowercade:Stringiküçük harfe çevirir

        String text="Merhaba Dünya";
        System.out.println("text = " + text);
        System.out.println("text.toLowerCase() = " + text.toLowerCase());

        System.out.println("yukarıdaki metin me ya da ME ile başlıyor mu? = " + text.toLowerCase().startsWith("me"));
    }
}
