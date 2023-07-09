package Gun06;

public class _03_StringCharAt {
    public static void main(String[] args) {
        //istenilen noktadaki karakteri verir
        //karakterlerin sırası 0dan başlar ve buna index denir

                  //0123456789 10 11 12 karakter
        String cumle="Merhaba Dunya";  //lenght 13 ama karakterlerin odası 0-12 dahil

        char ilkharf=cumle.charAt(0);  //0 indexteki karakteri verir
        System.out.println("ilkharf = " + ilkharf);
    }
}

