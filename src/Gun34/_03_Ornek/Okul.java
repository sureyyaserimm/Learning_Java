package Gun34._03_Ornek;

public class Okul {
    public static void main(String[] args) {

        LiseOgrencisi liseOgrencisi1=new LiseOgrencisi("ismet temur", Tip.LISE,"MF");
        LiseOgrencisi liseOgrencisi2=new LiseOgrencisi("ahmet yılmaz", Tip.LISE,"TM");
        IlkOgrencisi ilkOgrencisi1=new IlkOgrencisi("ayse bayrak", Tip.ILK,"santranç");


        System.out.println("liseOgrencisi1 = " + liseOgrencisi1);
        System.out.println("liseOgrencisi2 = " + liseOgrencisi2);
        System.out.println("ilkOgrencisi1 = " + ilkOgrencisi1);


    }
}
