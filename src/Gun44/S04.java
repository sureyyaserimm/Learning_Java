package Gun44;

public class S04 {
    public static void main(String[] args) {
        //bu kodun çıktısı nedir?

        String[] strs=new String[2];
        int idx=0;

        for(String s : strs) {
            strs[idx].concat("element" + idx);
            idx++;
        }

        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);

        }

        //Error veriyor çünkü Stringlerin karşılığı olan bir eleman olmadığı için concat yapılamıyor. olmayan bir şeye ekleme yapılmaz.
    }
}
