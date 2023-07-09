package Gun28._04_Constructor;

public class Bankalar {
    public static void main(String[] args) {
        // Bir banka class ı tanımlayınız.
        // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
        // 3 adet constructor ekleyin.
        // toString metodu oluşturun.
        // 3 tane nesne oluşturup mainde yazdırınız.


    Banka b1=new Banka("Ziraat",1861,1863);
    Banka b2=new Banka("Garanti",500);
    Banka b3=new Banka();


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


    }
}
