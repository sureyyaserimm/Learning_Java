package Gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {
        //ReplaceAll : replace gibi çalışır farkı Kriter(Regex) verilebiliyor.
        //regex: regular expression/düzenli ifadeler
        //TODO: regex olarak neler yazılabiliyor googledan araştırılacak
        String text="Merhaba Dünya123";

        System.out.println("text = " + text);
        System.out.println("abn --> _ = " + text.replaceAll("[abn]","_"));
        //a veya b veya n'leri _ yapar

        System.out.println("[A-Z] -- > _  = " + text.replaceAll("[A-Z]","_"));
        //A dan Zye kadarki bütün büyük harfleri _ yapar

        System.out.println("[A-Z] -- > _  = " + text.replaceAll("[^A-Z]","_"));
        //A dan Zye kadarkiler dışındaki her şeyi _ yapar

        System.out.println("text.replaceAll(\"[0-9]\",\"\") = " + text.replaceAll("[0-9]",""));
        //rakamları sil

        System.out.println("0-9 dışındakiler ->"+text.replaceAll("[^0-9]",""));
        //rakam dışındakileri sil   123





    }
}
