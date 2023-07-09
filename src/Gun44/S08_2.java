package Gun44;

public class S08_2 {
    public static void main(String[] args) {
        //çıktı nedir?
        String[] strs= {"A","B"};
        int idx=0;

        for(String s : strs) {
            strs[idx]=strs[idx].concat("element" + idx); //burada strs[idx] eşitlemeyi sağladığımız için bu foreach çalışır.
            idx++;
        }

        for (idx = 0; idx < strs.length; idx++) {
            System.out.print(strs[idx]);

        }
        // CEVAP : Aelement0 Belement1
    }
}
