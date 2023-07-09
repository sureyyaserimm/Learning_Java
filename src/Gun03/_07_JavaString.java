package Gun03;

public class _07_JavaString {
    public static void main(String[] args) {
        String ad="Sureya"; //String kelime veya kelimeleri saklmak için kullanılır.
                            //sınırları " " ile belirlenir.
        String soyad="Serim";

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("ad ve soyad = " + ad +soyad);
        System.out.println("ad ve soyad = " + ad+" " +soyad);
        System.out.println("ad ve soyad = " + ad + "\t" + soyad);
        // +lar burada stringler arasında olduğu için birleştirir.

        String tamAd= "Sureya"+" "+"Serim";
        System.out.println("tamAd = " + tamAd);



    }
}
