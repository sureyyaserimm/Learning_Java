package Gun47;

public class S01 {
    public static void main(String[] args) {
        //bu kodun çıktısı nedir?
        String[][] chs = new String[2][];
        chs[0]=new String[2];
        chs[1]=new String[5];
        int i=97;

        for (int a = 0; a < chs.length; a++) { //2
            for (int b = 0; b < chs.length; b++) { //2
                chs[a][b] = "" + i; //i yi otomatik stringe çeviriyor.
                //00 -> 97 , 01 -> 98
                //10 -> 99, 11 -> 100
                i++;
            }
        }
        for (String[] ca : chs){
            for (String c : ca){
                System.out.println(c + " ");
            }
            System.out.println();
        }
    }
}
//cevap:
// 97 98
// 99 100 null null null
