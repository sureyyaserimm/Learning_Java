package Gun07;

public class _11_StringReplace {
    public static void main(String[] args) {
        //replace: bir string içimdeki karakterleri verilenle değiştirir.

        String text="Merhaba Dunya";

        System.out.println("text = " + text);
        System.out.println("text.replace(a,e) = " + text.replace("a","e"));
        System.out.println("text.replace(ba,de) = " + text.replace("ba","de"));
        System.out.println("text.replace(Dunya,Java) = " + text.replace("Dunya","Java"));
        System.out.println("text.replace(a, ) = " + text.replace("a"," "));


    }
}
