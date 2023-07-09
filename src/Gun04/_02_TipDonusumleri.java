package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {
        byte ogrNot1=98;
        byte ogrNot2=98;
        byte ogrNot3=100;
        byte ogrNot4=98;


        int toplam=ogrNot1; // byte-> int atınca problem cıkmaz (GENISLETME)
        //cunku byte icin hafızadan ayrilan, zaten int e sıgar, veri kaybı ihtimali yok.

        ogrNot1=(byte)toplam; //int -> byte atınca problem cikar (DARALTMA)
        //buyuk hafızaya ayrılmış bir alanı kucuk hafızaya ayrılmış alana atma işlemi var,
        //veri kaybı ihtimali var.

        //java type casting
        //Widening casting (automatically)=converting a smaller type to larger type size
        //byte,short,int,long,float,double
        //Narrowing Casting (manually)=converting a larger type to smaller type size
        //double,float,long,int,short,byte

    }
}
