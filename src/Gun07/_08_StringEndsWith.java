package Gun07;

public class _08_StringEndsWith {
    public static void main(String[] args) {
        //Endswith: verilen karakterler ile bitiyor mu
        //sonuc true - false yani boolean

        String text="Merhaba Dünya";

        System.out.println("text.endsWith(ya) = " + text.endsWith("ya"));
        System.out.println("text.endsWith(n) = " + text.endsWith("n"));
        System.out.println("text.endsWith(A) = " + text.endsWith("A"));
        System.out.println("text.endsWith(Dünya) = " + text.endsWith("Dünya"));



    }
}
