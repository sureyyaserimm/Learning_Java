package Gun30;

public class GununSorusu {

    int a;
    static int b=0;

        void artir(){
            a++;
            b++;
        }


    public static void main(String[] args) {
        GununSorusu gs1=new GununSorusu();
        gs1.a=5;

        GununSorusu gs2=new GununSorusu();
        gs2.a=7;


        //a'nın değeri kaç? burda iki farklı a değeri olduğu için her a değeri için ayrı bir cevap olur.
        //gs1'deki a=5, gs2'deki a=7'dir.
        System.out.println("gs1.a = " + gs1.a); //5
        System.out.println("gs2.a = " + gs2.a); //7

        //Soru=b'nin değeri kaçtır= tek bir değeri vardır, o da 0.
        System.out.println("b = " + GununSorusu.b); //0

        gs1.artir(); //a=6, b=1
        gs2.artir(); //a=7,b=2

        System.out.println("gs1.a = " + gs1.a);
        System.out.println("gs2.a = " + gs2.a);
        System.out.println("GununSorusu.b = " + GununSorusu.b);


    }
}
