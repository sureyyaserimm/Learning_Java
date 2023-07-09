package Gun45;

public class S06 {
    public static void main(String[] args) {
        //bu kodun çıktısı nedir?
        int data[]={2010,2013,2014,2015,2014};
        int key=2014;
        int count=0;

        for (int e:data){
            if(e != key){
                continue;
   //             count++  //continue'dan sonra var olan hiçbir şey çalışmaz, compile error verir.
            }
            //eğer count burada olsaydı cevap "2 Found" olurdu.
        }
        System.out.println(count+" Found");
    }
}
