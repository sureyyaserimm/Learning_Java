package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kitle indexini de bularak yazdırınız ( kg/ boy*boy)

        double agirlik=68;
        int boy=160;

        double KitleIndex=agirlik/(boy*boy);
        System.out.println("KitleIndex = " + KitleIndex);
        System.out.println("boyunuz="+boy+" "+"kilonuz=" +agirlik);

        /************/
        double boy2=1.60;
        double KitleIndex2=agirlik/(boy2*boy2);
        System.out.println("KitleIndex2 = " + KitleIndex2);



    }
}
