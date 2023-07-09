package Gun44;

public class S08 {
    public static void main(String[] args) {
        //çıktı nedir?
        String[] strs= {"A","B"};
        int idx=0;

        for(String s : strs) {
            strs[idx].concat("element" + idx); //burada sadece concat kullanıldığı için bu foreach çalışmaz çünkü atama yapılmıyor..
            idx++;
        }

        for (idx = 0; idx < strs.length; idx++) {
            System.out.print(strs[idx]);

        }
        //CEVAP: AB
    }
}
