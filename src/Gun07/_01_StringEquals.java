package Gun07;

public class _01_StringEquals {
    public static void main(String[] args) {
        //equals: 2 stringin (metinin) birbirine eşit olup olmadığını kontrol eder,
        //harflerin büyük ya da küçük olduğu önemlidir, sonuç boolean

        String s1="Merhaba";
        String s2="MERHABA";

        boolean esitMi=s1.equals(s2);  //s1 eşit mi s2ye             Merhaba-MERHABA
        System.out.println("esitMi = " + esitMi);                  //(1.yöntem)
        System.out.println("s1.equals(s2) = " + s1.equals(s2));    //Merhaba-MERHABA

        System.out.println("s1.equals(Merhaba) = " + s1.equals("Merhaba"));   //Merhaba-Merhaba (2.yöntem)



    }
}
